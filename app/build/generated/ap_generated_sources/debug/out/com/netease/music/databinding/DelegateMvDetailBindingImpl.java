package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateMvDetailBindingImpl extends DelegateMvDetailBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(34);
        sIncludes.setIncludes(3, 
            new String[] {"delegate_normal_loading"},
            new int[] {17},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar_video_detail, 18);
        sViewsWithIds.put(R.id.rl_toolbar_video_detail, 19);
        sViewsWithIds.put(R.id.rl_item_video_group, 20);
        sViewsWithIds.put(R.id.videoplayer, 21);
        sViewsWithIds.put(R.id.appbar_video_detail, 22);
        sViewsWithIds.put(R.id.collapsing_toolbar_layout, 23);
        sViewsWithIds.put(R.id.iv_video_detail_praise, 24);
        sViewsWithIds.put(R.id.iv_video_detail_collect, 25);
        sViewsWithIds.put(R.id.iv_video_detail_comment, 26);
        sViewsWithIds.put(R.id.iv_video_detail_share, 27);
        sViewsWithIds.put(R.id.rl_singer, 28);
        sViewsWithIds.put(R.id.tv_singer_alias, 29);
        sViewsWithIds.put(R.id.tv_item_search_user_follow, 30);
        sViewsWithIds.put(R.id.tv_item_search_user_followed, 31);
        sViewsWithIds.put(R.id.scroll_view, 32);
        sViewsWithIds.put(R.id.rv_video_related, 33);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView3;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView31;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback11;
    @Nullable
    private final android.view.View.OnClickListener mCallback12;
    @Nullable
    private final android.view.View.OnClickListener mCallback9;
    @Nullable
    private final android.view.View.OnClickListener mCallback8;
    @Nullable
    private final android.view.View.OnClickListener mCallback10;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateMvDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private DelegateMvDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.appbar.AppBarLayout) bindings[22]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[23]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[24]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[8]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.RelativeLayout) bindings[28]
            , (android.widget.RelativeLayout) bindings[19]
            , (androidx.recyclerview.widget.RecyclerView) bindings[16]
            , (androidx.recyclerview.widget.RecyclerView) bindings[33]
            , (androidx.core.widget.NestedScrollView) bindings[32]
            , (androidx.appcompat.widget.Toolbar) bindings[18]
            , (android.widget.TextView) bindings[30]
            , (android.widget.TextView) bindings[31]
            , (android.widget.TextView) bindings[29]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[2]
            , (com.netease.lib_video.videoplayer.CustomJzVideoView) bindings[21]
            );
        this.imgVideoDetailBack.setTag(null);
        this.ivSingerAvatar.setTag(null);
        this.llSingerFollow.setTag(null);
        this.llSingerFollowed.setTag(null);
        this.llVideoCollect.setTag(null);
        this.llVideoDetailComment.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[17];
        setContainedBinding(this.mboundView31);
        this.rvVideoComment.setTag(null);
        this.tvSingerName.setTag(null);
        this.tvVideoDetailCollectCount.setTag(null);
        this.tvVideoDetailCommentCount.setTag(null);
        this.tvVideoDetailPlaytime.setTag(null);
        this.tvVideoDetailPraiseCount.setTag(null);
        this.tvVideoDetailShareCount.setTag(null);
        this.tvVideoDetailTitle.setTag(null);
        this.tvVideoDetailToolbarTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback11 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback12 = new com.netease.music.generated.callback.OnClickListener(this, 5);
        mCallback9 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback8 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback10 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        mboundView31.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView31.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.MvDetailViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.MvDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView31.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmArtistPic((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmMvData((androidx.databinding.ObservableField<com.netease.lib_api.model.mv.MvBean.MvDetailBean>) object, fieldId);
            case 2 :
                return onChangeVmIsFollowed((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeVmArtistName((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmCommentAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter<com.netease.lib_api.model.playlist.PlayListCommentEntity,com.chad.library.adapter.base.viewholder.BaseViewHolder>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmArtistPic(androidx.databinding.ObservableField<java.lang.String> VmArtistPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmMvData(androidx.databinding.ObservableField<com.netease.lib_api.model.mv.MvBean.MvDetailBean> VmMvData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsFollowed(androidx.databinding.ObservableBoolean VmIsFollowed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmArtistName(androidx.databinding.ObservableField<java.lang.String> VmArtistName, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCommentAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter<com.netease.lib_api.model.playlist.PlayListCommentEntity,com.chad.library.adapter.base.viewholder.BaseViewHolder>> VmCommentAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
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
        boolean vmIsFollowed = false;
        androidx.databinding.ObservableField<java.lang.String> vmArtistPic = null;
        com.netease.music.ui.state.MvDetailViewModel vm = mVm;
        androidx.databinding.ObservableField<com.netease.lib_api.model.mv.MvBean.MvDetailBean> vmMvData = null;
        androidx.databinding.ObservableBoolean VmIsFollowed1 = null;
        com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        java.lang.String vmArtistNameGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmArtistName = null;
        java.lang.String vmMvDataLikeCount = null;
        java.lang.String vmMvDataName = null;
        com.netease.lib_api.model.mv.MvBean.MvDetailBean vmMvDataGet = null;
        java.lang.String searchUtilGetCorresPondingStringVmMvDataPlayCountJavaLangString = null;
        java.lang.String vmMvDataCommentCount = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter<com.netease.lib_api.model.playlist.PlayListCommentEntity,com.chad.library.adapter.base.viewholder.BaseViewHolder>> vmCommentAdapter = null;
        java.lang.String vmArtistPicGet = null;
        java.lang.String vmMvDataShareCount = null;
        long vmMvDataPlayCount = 0;
        boolean VmLoadingVisible1 = false;
        boolean vmIsFollowedGet = false;
        java.lang.String searchUtilGetCorresPondingStringVmMvDataPlayCount = null;
        java.lang.String vmMvDataSubCount = null;
        boolean vmLoadingVisibleGet = false;
        com.chad.library.adapter.base.BaseSectionQuickAdapter<com.netease.lib_api.model.playlist.PlayListCommentEntity,com.chad.library.adapter.base.viewholder.BaseViewHolder> vmCommentAdapterGet = null;

        if ((dirtyFlags & 0x17fL) != 0) {


            if ((dirtyFlags & 0x141L) != 0) {

                    if (vm != null) {
                        // read vm.artistPic
                        vmArtistPic = vm.artistPic;
                    }
                    updateRegistration(0, vmArtistPic);


                    if (vmArtistPic != null) {
                        // read vm.artistPic.get()
                        vmArtistPicGet = vmArtistPic.get();
                    }
            }
            if ((dirtyFlags & 0x142L) != 0) {

                    if (vm != null) {
                        // read vm.mvData
                        vmMvData = vm.mvData;
                    }
                    updateRegistration(1, vmMvData);


                    if (vmMvData != null) {
                        // read vm.mvData.get()
                        vmMvDataGet = vmMvData.get();
                    }


                    if (vmMvDataGet != null) {
                        // read vm.mvData.get().likeCount
                        vmMvDataLikeCount = vmMvDataGet.getLikeCount();
                        // read vm.mvData.get().name
                        vmMvDataName = vmMvDataGet.getName();
                        // read vm.mvData.get().commentCount
                        vmMvDataCommentCount = vmMvDataGet.getCommentCount();
                        // read vm.mvData.get().shareCount
                        vmMvDataShareCount = vmMvDataGet.getShareCount();
                        // read vm.mvData.get().playCount
                        vmMvDataPlayCount = vmMvDataGet.getPlayCount();
                        // read vm.mvData.get().subCount
                        vmMvDataSubCount = vmMvDataGet.getSubCount();
                    }


                    // read SearchUtil.getCorresPondingString(vm.mvData.get().playCount)
                    searchUtilGetCorresPondingStringVmMvDataPlayCount = com.netease.music.util.SearchUtil.getCorresPondingString(vmMvDataPlayCount);


                    // read (SearchUtil.getCorresPondingString(vm.mvData.get().playCount)) + ("次观看")
                    searchUtilGetCorresPondingStringVmMvDataPlayCountJavaLangString = (searchUtilGetCorresPondingStringVmMvDataPlayCount) + ("次观看");
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.isFollowed
                        VmIsFollowed1 = vm.isFollowed;
                    }
                    updateRegistration(2, VmIsFollowed1);


                    if (VmIsFollowed1 != null) {
                        // read vm.isFollowed.get()
                        vmIsFollowedGet = VmIsFollowed1.get();
                    }


                    // read !vm.isFollowed.get()
                    vmIsFollowed = !vmIsFollowedGet;
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        vmLoadingVisible = vm.loadingVisible;
                    }
                    updateRegistration(3, vmLoadingVisible);


                    if (vmLoadingVisible != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = vmLoadingVisible.get();
                    }


                    // read !vm.loadingVisible.get()
                    VmLoadingVisible1 = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.artistName
                        vmArtistName = vm.artistName;
                    }
                    updateRegistration(4, vmArtistName);


                    if (vmArtistName != null) {
                        // read vm.artistName.get()
                        vmArtistNameGet = vmArtistName.get();
                    }
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (vm != null) {
                        // read vm.commentAdapter
                        vmCommentAdapter = vm.commentAdapter;
                    }
                    updateRegistration(5, vmCommentAdapter);


                    if (vmCommentAdapter != null) {
                        // read vm.commentAdapter.get()
                        vmCommentAdapterGet = vmCommentAdapter.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgVideoDetailBack, mCallback8);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llSingerFollow, mCallback11);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llSingerFollowed, mCallback12);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llVideoCollect, mCallback10);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llVideoDetailComment, mCallback9);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.ivSingerAvatar, vmArtistPicGet);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llSingerFollow, vmIsFollowed);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llSingerFollowed, vmIsFollowedGet);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            this.mboundView31.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView31.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvVideoComment, VmLoadingVisible1);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvVideoComment, vmCommentAdapterGet, androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.TRUE));
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSingerName, vmArtistNameGet);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailCollectCount, vmMvDataSubCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailCommentCount, vmMvDataCommentCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailPlaytime, searchUtilGetCorresPondingStringVmMvDataPlayCountJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailPraiseCount, vmMvDataLikeCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailShareCount, vmMvDataShareCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailTitle, vmMvDataName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailToolbarTitle, vmMvDataName);
        }
        executeBindingsOn(mboundView31);
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
                com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.subArtist();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.subArtist();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.parise();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.video.mv.MvDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.collectMv();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.artistPic
        flag 1 (0x2L): vm.mvData
        flag 2 (0x3L): vm.isFollowed
        flag 3 (0x4L): vm.loadingVisible
        flag 4 (0x5L): vm.artistName
        flag 5 (0x6L): vm.commentAdapter
        flag 6 (0x7L): vm
        flag 7 (0x8L): proxy
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}