package com.netease.music.ui.page.adapter;

import android.content.Context;

import androidx.recyclerview.widget.RecyclerView;

import com.netease.lib_api.model.playlist.DailyRecommendPlayListBean;
import com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter;
import com.netease.lib_api.model.playlist.MainRecommendPlayListBean;
import com.netease.music.R;
import com.netease.music.data.config.TYPE;
import com.netease.music.databinding.ItemDiscoverGedanBinding;
import com.netease.music.ui.page.discover.square.detail.SongListDetailActivity;

public class RecommendPlayListAdapter extends SimpleDataBindingAdapter<MainRecommendPlayListBean.ResultBean, ItemDiscoverGedanBinding> {


    public RecommendPlayListAdapter(Context context) {
        super(context, R.layout.item_discover_gedan, DiffUtils.getInstance().getRecommendPlayListItemCallback());
        setOnItemClickListener((item, position) -> SongListDetailActivity.startActivity(context, TYPE.PLAYLIST_ID, item.getId(), item.getCopywriter()));
    }

    @Override
    protected void onBindItem(ItemDiscoverGedanBinding binding, MainRecommendPlayListBean.ResultBean item, RecyclerView.ViewHolder holder) {
        binding.setItem(item);
    }
}