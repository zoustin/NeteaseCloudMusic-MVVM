package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateRadioDeatailBindingImpl extends DelegateRadioDeatailBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 15);
        sViewsWithIds.put(R.id.iv_background_cover, 16);
        sViewsWithIds.put(R.id.toolbar, 17);
        sViewsWithIds.put(R.id.rl_toolbar_gedan_detail, 18);
        sViewsWithIds.put(R.id.tv_gedan_detail_toolbar_title, 19);
        sViewsWithIds.put(R.id.rl_play, 20);
        sViewsWithIds.put(R.id.ll_magicindicator, 21);
        sViewsWithIds.put(R.id.tv_gap, 22);
        sViewsWithIds.put(R.id.tv_radio_info_dj, 23);
        sViewsWithIds.put(R.id.tv_radio_info_xiangqing, 24);
        sViewsWithIds.put(R.id.tv_radio_info_sortt, 25);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback47;
    @Nullable
    private final android.view.View.OnClickListener mCallback44;
    @Nullable
    private final android.view.View.OnClickListener mCallback45;
    @Nullable
    private final android.view.View.OnClickListener mCallback46;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateRadioDeatailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 26, sIncludes, sViewsWithIds));
    }
    private DelegateRadioDeatailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.appbar.AppBarLayout) bindings[15]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[16]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.LinearLayout) bindings[21]
            , (net.lucode.hackware.magicindicator.MagicIndicator) bindings[6]
            , (android.widget.RelativeLayout) bindings[20]
            , (android.widget.RelativeLayout) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[14]
            , (androidx.appcompat.widget.Toolbar) bindings[17]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[25]
            , (android.widget.TextView) bindings[24]
            , (androidx.viewpager.widget.ViewPager) bindings[7]
            );
        this.imgRadioDetailBack.setTag(null);
        this.ivBackgroundRadioDetail.setTag(null);
        this.ivRadioInfoImg.setTag(null);
        this.magicRadioIndicator.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvHotComment.setTag(null);
        this.rvRadioProgram.setTag(null);
        this.tvRadioDetailSubscrib.setTag(null);
        this.tvRadioDetailSubscribed.setTag(null);
        this.tvRadioDetailTitle.setTag(null);
        this.tvRadioInfoDesc.setTag(null);
        this.tvRadioInfoName.setTag(null);
        this.tvRadioInfoRcmd.setTag(null);
        this.tvRadioInfoSort.setTag(null);
        this.viewPager.setTag(null);
        setRootTag(root);
        // listeners
        mCallback47 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback44 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback45 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback46 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
        }
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.RadioDetailViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.RadioDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmProgramList((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjProgramBean.ProgramsBean>>) object, fieldId);
            case 1 :
                return onChangeVmCurrentItem((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeVmIsSub((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeVmIndicatorTitle((androidx.databinding.ObservableField<java.lang.CharSequence[]>) object, fieldId);
            case 4 :
                return onChangeVmHotCommentAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 5 :
                return onChangeVmProgramAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 6 :
                return onChangeVmRadio((androidx.databinding.ObservableField<com.netease.lib_api.model.dj.DjDetailBean.DjRadioBean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmProgramList(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjProgramBean.ProgramsBean>> VmProgramList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCurrentItem(androidx.databinding.ObservableInt VmCurrentItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSub(androidx.databinding.ObservableBoolean VmIsSub, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIndicatorTitle(androidx.databinding.ObservableField<java.lang.CharSequence[]> VmIndicatorTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmHotCommentAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmHotCommentAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmProgramAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmProgramAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmRadio(androidx.databinding.ObservableField<com.netease.lib_api.model.dj.DjDetailBean.DjRadioBean> VmRadio, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }

    @Override
    protected void executeBindings() {
        long dirtyFlags = 0;
        synchronized(this) {
            dirtyFlags = mDirtyFlags;
            mDirtyFlags = 0;
        }
        java.lang.String vmRadioDjDescription = null;
        com.netease.lib_api.model.dj.DjDetailBean.DjRadioBean.DjBean vmRadioDj = null;
        java.lang.String vmRadioDjNickname = null;
        com.netease.music.ui.state.RadioDetailViewModel vm = mVm;
        java.lang.String vmRadioDjSignature = null;
        java.lang.String vmRadioPicUrl = null;
        java.lang.String vmRadioName = null;
        java.lang.String searchUtilGetCorresPondingStringVmRadioSubCountJavaLangString = null;
        java.lang.String vmRadioDjAvatarUrl = null;
        com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;
        com.netease.lib_api.model.dj.DjDetailBean.DjRadioBean vmRadioGet = null;
        java.lang.String searchUtilGetCorresPondingStringVmRadioSubCount = null;
        java.lang.CharSequence[] vmIndicatorTitleGet = null;
        boolean vmIsSubGet = false;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjProgramBean.ProgramsBean>> vmProgramList = null;
        androidx.databinding.ObservableInt vmCurrentItem = null;
        androidx.databinding.ObservableBoolean vmIsSub = null;
        java.lang.String vmIsSubJavaLangStringJavaLangString = null;
        int vmCurrentItemGet = 0;
        androidx.databinding.ObservableField<java.lang.CharSequence[]> vmIndicatorTitle = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmHotCommentAdapter = null;
        android.graphics.drawable.Drawable vmIsSubTvRadioDetailSubscribAndroidDrawableBorderRadioSubscribedTvRadioDetailSubscribAndroidDrawableBgRoundRed = null;
        java.lang.String vmRadioCategory = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmProgramAdapter = null;
        int vmRadioSubCount = 0;
        java.util.List<com.netease.lib_api.model.dj.DjProgramBean.ProgramsBean> vmProgramListGet = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmHotCommentAdapterGet = null;
        androidx.databinding.ObservableField<com.netease.lib_api.model.dj.DjDetailBean.DjRadioBean> vmRadio = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmProgramAdapterGet = null;

        if ((dirtyFlags & 0x2ffL) != 0) {


            if ((dirtyFlags & 0x281L) != 0) {

                    if (vm != null) {
                        // read vm.programList
                        vmProgramList = vm.programList;
                    }
                    updateRegistration(0, vmProgramList);


                    if (vmProgramList != null) {
                        // read vm.programList.get()
                        vmProgramListGet = vmProgramList.get();
                    }
            }
            if ((dirtyFlags & 0x28aL) != 0) {

                    if (vm != null) {
                        // read vm.currentItem
                        vmCurrentItem = vm.currentItem;
                        // read vm.indicatorTitle
                        vmIndicatorTitle = vm.indicatorTitle;
                    }
                    updateRegistration(1, vmCurrentItem);
                    updateRegistration(3, vmIndicatorTitle);


                    if (vmCurrentItem != null) {
                        // read vm.currentItem.get()
                        vmCurrentItemGet = vmCurrentItem.get();
                    }
                    if (vmIndicatorTitle != null) {
                        // read vm.indicatorTitle.get()
                        vmIndicatorTitleGet = vmIndicatorTitle.get();
                    }
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (vm != null) {
                        // read vm.isSub
                        vmIsSub = vm.isSub;
                    }
                    updateRegistration(2, vmIsSub);


                    if (vmIsSub != null) {
                        // read vm.isSub.get()
                        vmIsSubGet = vmIsSub.get();
                    }
                if((dirtyFlags & 0x284L) != 0) {
                    if(vmIsSubGet) {
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                    }
                    else {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                    }
                }


                    // read vm.isSub.get() ? "已订阅" : "订阅"
                    vmIsSubJavaLangStringJavaLangString = ((vmIsSubGet) ? ("已订阅") : ("订阅"));
                    // read vm.isSub.get() ? @android:drawable/border_radio_subscribed : @android:drawable/bg_round_red
                    vmIsSubTvRadioDetailSubscribAndroidDrawableBorderRadioSubscribedTvRadioDetailSubscribAndroidDrawableBgRoundRed = ((vmIsSubGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvRadioDetailSubscrib.getContext(), R.drawable.border_radio_subscribed)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(tvRadioDetailSubscrib.getContext(), R.drawable.bg_round_red)));
            }
            if ((dirtyFlags & 0x290L) != 0) {

                    if (vm != null) {
                        // read vm.hotCommentAdapter
                        vmHotCommentAdapter = vm.hotCommentAdapter;
                    }
                    updateRegistration(4, vmHotCommentAdapter);


                    if (vmHotCommentAdapter != null) {
                        // read vm.hotCommentAdapter.get()
                        vmHotCommentAdapterGet = vmHotCommentAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (vm != null) {
                        // read vm.programAdapter
                        vmProgramAdapter = vm.programAdapter;
                    }
                    updateRegistration(5, vmProgramAdapter);


                    if (vmProgramAdapter != null) {
                        // read vm.programAdapter.get()
                        vmProgramAdapterGet = vmProgramAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x2c0L) != 0) {

                    if (vm != null) {
                        // read vm.radio
                        vmRadio = vm.radio;
                    }
                    updateRegistration(6, vmRadio);


                    if (vmRadio != null) {
                        // read vm.radio.get()
                        vmRadioGet = vmRadio.get();
                    }


                    if (vmRadioGet != null) {
                        // read vm.radio.get().dj
                        vmRadioDj = vmRadioGet.getDj();
                        // read vm.radio.get().picUrl
                        vmRadioPicUrl = vmRadioGet.getPicUrl();
                        // read vm.radio.get().name
                        vmRadioName = vmRadioGet.getName();
                        // read vm.radio.get().category
                        vmRadioCategory = vmRadioGet.getCategory();
                        // read vm.radio.get().subCount
                        vmRadioSubCount = vmRadioGet.getSubCount();
                    }


                    if (vmRadioDj != null) {
                        // read vm.radio.get().dj.description
                        vmRadioDjDescription = vmRadioDj.getDescription();
                        // read vm.radio.get().dj.nickname
                        vmRadioDjNickname = vmRadioDj.getNickname();
                        // read vm.radio.get().dj.signature
                        vmRadioDjSignature = vmRadioDj.getSignature();
                        // read vm.radio.get().dj.avatarUrl
                        vmRadioDjAvatarUrl = vmRadioDj.getAvatarUrl();
                    }
                    // read SearchUtil.getCorresPondingString(vm.radio.get().subCount)
                    searchUtilGetCorresPondingStringVmRadioSubCount = com.netease.music.util.SearchUtil.getCorresPondingString(vmRadioSubCount);


                    // read (SearchUtil.getCorresPondingString(vm.radio.get().subCount)) + ("已订阅")
                    searchUtilGetCorresPondingStringVmRadioSubCountJavaLangString = (searchUtilGetCorresPondingStringVmRadioSubCount) + ("已订阅");
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgRadioDetailBack, mCallback45);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivRadioInfoImg, mCallback46);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvRadioDetailSubscrib, mCallback44);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvRadioInfoName, mCallback47);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForView(this.ivBackgroundRadioDetail, vmRadioPicUrl, (android.graphics.drawable.Drawable)null);
            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.ivRadioInfoImg, vmRadioDjAvatarUrl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioDetailSubscribed, searchUtilGetCorresPondingStringVmRadioSubCountJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioDetailTitle, vmRadioName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioInfoDesc, vmRadioDjDescription);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioInfoName, vmRadioDjNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioInfoRcmd, vmRadioDjSignature);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioInfoSort, vmRadioCategory);
        }
        if ((dirtyFlags & 0x28aL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.TabPageBindingAdapter.initTabAndPage(this.magicRadioIndicator, vmIndicatorTitleGet, vmCurrentItemGet);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvHotComment, vmHotCommentAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvRadioProgram, vmProgramListGet);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvRadioProgram, vmProgramAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setBackGround(this.tvRadioDetailSubscrib, vmIsSubTvRadioDetailSubscribAndroidDrawableBorderRadioSubscribedTvRadioDetailSubscribAndroidDrawableBgRoundRed);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioDetailSubscrib, vmIsSubJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setCurrentItem(this.viewPager, vmCurrentItemGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.userInfo();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeSubStatus();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.back();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.userInfo();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.programList
        flag 1 (0x2L): vm.currentItem
        flag 2 (0x3L): vm.isSub
        flag 3 (0x4L): vm.indicatorTitle
        flag 4 (0x5L): vm.hotCommentAdapter
        flag 5 (0x6L): vm.programAdapter
        flag 6 (0x7L): vm.radio
        flag 7 (0x8L): vm
        flag 8 (0x9L): proxy
        flag 9 (0xaL): null
        flag 10 (0xbL): vm.isSub.get() ? "已订阅" : "订阅"
        flag 11 (0xcL): vm.isSub.get() ? "已订阅" : "订阅"
        flag 12 (0xdL): vm.isSub.get() ? @android:drawable/border_radio_subscribed : @android:drawable/bg_round_red
        flag 13 (0xeL): vm.isSub.get() ? @android:drawable/border_radio_subscribed : @android:drawable/bg_round_red
    flag mapping end*/
    //end
}