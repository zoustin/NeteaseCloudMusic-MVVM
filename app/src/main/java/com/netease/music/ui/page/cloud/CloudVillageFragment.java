package com.netease.music.ui.page.cloud;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.kunminx.architecture.ui.page.BaseFragment;
import com.kunminx.architecture.ui.page.DataBindingConfig;
import com.netease.lib_api.model.user.UserEventBean;
import com.netease.music.BR;
import com.netease.music.R;
import com.netease.music.ui.state.CloudVillageFragmentViewModel;
import com.scwang.smart.refresh.layout.api.RefreshLayout;
import com.scwang.smart.refresh.layout.listener.OnLoadMoreListener;
import com.scwang.smart.refresh.layout.listener.OnRefreshListener;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;

/**
 * 云村 Fragment
 */
public class CloudVillageFragment extends BaseFragment implements OnRefreshListener, OnLoadMoreListener {

    private CloudVillageFragmentViewModel mViewModel;

    @Override
    protected void initViewModel() {
        mViewModel = getFragmentViewModel(CloudVillageFragmentViewModel.class);
    }

    @Override
    protected DataBindingConfig getDataBindingConfig() {
        return new DataBindingConfig(R.layout.delegate_friend, BR.vm, mViewModel)
                .addBindingParam(BR.refreshListener, this)
                .addBindingParam(BR.loadMoreListener, this);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel.eventRequest.getEventLiveData().observe(this, mainEventBean -> {
            //移除无用的数据
            mViewModel.adapter.set(new EventAdapter(getContext(), removeInvalidData(mainEventBean.getEvent())));
            //停止显示加载动画
            mViewModel.loadingVisible.set(false);
        });

    }

    @Override
    public void onResume() {
        super.onResume();
        mViewModel.eventRequest.requestUserEventData();
    }

    //默认都加载成功
    @SuppressLint("CheckResult")
    @Override
    public void onLoadMore(@NonNull RefreshLayout refreshLayout) {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(aLong -> mViewModel.reloadState.set(true));
    }

    @SuppressLint("CheckResult")
    @Override
    public void onRefresh(@NonNull RefreshLayout refreshLayout) {
        Observable.timer(2, TimeUnit.SECONDS)
                .subscribe(aLong -> mViewModel.reloadState.set(true));
    }

    private List<UserEventBean.EventsBean> removeInvalidData(List<UserEventBean.EventsBean> data) {
        List<UserEventBean.EventsBean> newD = data;
        if (data == null) {
            return newD = new ArrayList<>();
        }
        Iterator<UserEventBean.EventsBean> it = newD.iterator();
        while (it.hasNext()) {
            UserEventBean.EventsBean bean = it.next();
            if (bean.getUser().getUserId() == 0) {
                it.remove();
            }
        }
        return newD;
    }
}
