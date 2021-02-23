package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateVideoDetailBindingImpl extends DelegateVideoDetailBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

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
        sViewsWithIds.put(R.id.ll_video_detail_comment, 24);
        sViewsWithIds.put(R.id.ll_video_collect, 25);
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
    private final android.view.View.OnClickListener mCallback35;
    @Nullable
    private final android.view.View.OnClickListener mCallback36;
    @Nullable
    private final android.view.View.OnClickListener mCallback32;
    @Nullable
    private final android.view.View.OnClickListener mCallback33;
    @Nullable
    private final android.view.View.OnClickListener mCallback34;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateVideoDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 34, sIncludes, sViewsWithIds));
    }
    private DelegateVideoDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 6
            , (com.google.android.material.appbar.AppBarLayout) bindings[22]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[23]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[8]
            , (android.widget.ImageView) bindings[26]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[27]
            , (android.widget.LinearLayout) bindings[14]
            , (android.widget.LinearLayout) bindings[15]
            , (android.widget.LinearLayout) bindings[25]
            , (android.widget.LinearLayout) bindings[24]
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
        this.ivVideoDetailCollect.setTag(null);
        this.ivVideoDetailPraise.setTag(null);
        this.llSingerFollow.setTag(null);
        this.llSingerFollowed.setTag(null);
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
        mCallback35 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback36 = new com.netease.music.generated.callback.OnClickListener(this, 5);
        mCallback32 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback33 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback34 = new com.netease.music.generated.callback.OnClickListener(this, 3);
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
            setVm((com.netease.music.ui.state.VideoDetailViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.VideoDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy Proxy) {
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
                return onChangeVmIsFollowed((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmVideo((androidx.databinding.ObservableField<com.netease.lib_api.model.mv.VideoBean.Data>) object, fieldId);
            case 3 :
                return onChangeVmIsSubscribed((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeVmCommentAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter>) object, fieldId);
            case 5 :
                return onChangeVmIsParised((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIsFollowed(androidx.databinding.ObservableBoolean VmIsFollowed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmVideo(androidx.databinding.ObservableField<com.netease.lib_api.model.mv.VideoBean.Data> VmVideo, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsSubscribed(androidx.databinding.ObservableBoolean VmIsSubscribed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCommentAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter> VmCommentAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsParised(androidx.databinding.ObservableBoolean VmIsParised, int fieldId) {
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
        com.netease.music.ui.state.VideoDetailViewModel vm = mVm;
        java.lang.String vmVideoPraisedcount = null;
        androidx.databinding.ObservableBoolean VmIsFollowed1 = null;
        int vmVideoPlaytime = 0;
        java.lang.String vmVideoCommentcount = null;
        com.netease.lib_api.model.mv.VideoBean.Creator vmVideoCreator = null;
        com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;
        java.lang.String searchUtilGetCorresPondingStringVmVideoPlaytimeJavaLangString = null;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        android.graphics.drawable.Drawable vmIsSubscribedIvVideoDetailCollectAndroidDrawableIcCollectedIvVideoDetailCollectAndroidDrawableIcCollect = null;
        boolean vmIsSubscribedGet = false;
        androidx.databinding.ObservableField<com.netease.lib_api.model.mv.VideoBean.Data> vmVideo = null;
        java.lang.String vmVideoSubscribeCount = null;
        java.lang.String vmVideoCreatorNickname = null;
        java.lang.String searchUtilGetCorresPondingStringVmVideoPlaytime = null;
        android.graphics.drawable.Drawable vmIsParisedIvVideoDetailPraiseAndroidDrawableIcPariseRedIvVideoDetailPraiseAndroidDrawableIcParise = null;
        com.netease.lib_api.model.mv.VideoBean.Data vmVideoGet = null;
        androidx.databinding.ObservableBoolean vmIsSubscribed = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseSectionQuickAdapter> vmCommentAdapter = null;
        boolean VmLoadingVisible1 = false;
        java.lang.String vmVideoSharecount = null;
        boolean vmIsFollowedGet = false;
        androidx.databinding.ObservableBoolean vmIsParised = null;
        java.lang.String vmVideoTitle = null;
        java.lang.String vmVideoCreatorAvatarurl = null;
        boolean vmLoadingVisibleGet = false;
        boolean vmIsParisedGet = false;
        com.chad.library.adapter.base.BaseSectionQuickAdapter vmCommentAdapterGet = null;

        if ((dirtyFlags & 0x17fL) != 0) {


            if ((dirtyFlags & 0x141L) != 0) {

                    if (vm != null) {
                        // read vm.isFollowed
                        VmIsFollowed1 = vm.isFollowed;
                    }
                    updateRegistration(0, VmIsFollowed1);


                    if (VmIsFollowed1 != null) {
                        // read vm.isFollowed.get()
                        vmIsFollowedGet = VmIsFollowed1.get();
                    }


                    // read !vm.isFollowed.get()
                    vmIsFollowed = !vmIsFollowedGet;
            }
            if ((dirtyFlags & 0x142L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        vmLoadingVisible = vm.loadingVisible;
                    }
                    updateRegistration(1, vmLoadingVisible);


                    if (vmLoadingVisible != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = vmLoadingVisible.get();
                    }


                    // read !vm.loadingVisible.get()
                    VmLoadingVisible1 = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x144L) != 0) {

                    if (vm != null) {
                        // read vm.video
                        vmVideo = vm.video;
                    }
                    updateRegistration(2, vmVideo);


                    if (vmVideo != null) {
                        // read vm.video.get()
                        vmVideoGet = vmVideo.get();
                    }


                    if (vmVideoGet != null) {
                        // read vm.video.get().praisedcount
                        vmVideoPraisedcount = vmVideoGet.getPraisedcount();
                        // read vm.video.get().playtime
                        vmVideoPlaytime = vmVideoGet.getPlaytime();
                        // read vm.video.get().commentcount
                        vmVideoCommentcount = vmVideoGet.getCommentcount();
                        // read vm.video.get().creator
                        vmVideoCreator = vmVideoGet.getCreator();
                        // read vm.video.get().subscribeCount
                        vmVideoSubscribeCount = vmVideoGet.getSubscribeCount();
                        // read vm.video.get().sharecount
                        vmVideoSharecount = vmVideoGet.getSharecount();
                        // read vm.video.get().title
                        vmVideoTitle = vmVideoGet.getTitle();
                    }


                    // read SearchUtil.getCorresPondingString(vm.video.get().playtime)
                    searchUtilGetCorresPondingStringVmVideoPlaytime = com.netease.music.util.SearchUtil.getCorresPondingString(vmVideoPlaytime);
                    if (vmVideoCreator != null) {
                        // read vm.video.get().creator.nickname
                        vmVideoCreatorNickname = vmVideoCreator.getNickname();
                        // read vm.video.get().creator.avatarurl
                        vmVideoCreatorAvatarurl = vmVideoCreator.getAvatarurl();
                    }


                    // read (SearchUtil.getCorresPondingString(vm.video.get().playtime)) + ("次观看")
                    searchUtilGetCorresPondingStringVmVideoPlaytimeJavaLangString = (searchUtilGetCorresPondingStringVmVideoPlaytime) + ("次观看");
            }
            if ((dirtyFlags & 0x148L) != 0) {

                    if (vm != null) {
                        // read vm.isSubscribed
                        vmIsSubscribed = vm.isSubscribed;
                    }
                    updateRegistration(3, vmIsSubscribed);


                    if (vmIsSubscribed != null) {
                        // read vm.isSubscribed.get()
                        vmIsSubscribedGet = vmIsSubscribed.get();
                    }
                if((dirtyFlags & 0x148L) != 0) {
                    if(vmIsSubscribedGet) {
                            dirtyFlags |= 0x400L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                    }
                }


                    // read vm.isSubscribed.get() ? @android:drawable/ic_collected : @android:drawable/ic_collect
                    vmIsSubscribedIvVideoDetailCollectAndroidDrawableIcCollectedIvVideoDetailCollectAndroidDrawableIcCollect = ((vmIsSubscribedGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivVideoDetailCollect.getContext(), R.drawable.ic_collected)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivVideoDetailCollect.getContext(), R.drawable.ic_collect)));
            }
            if ((dirtyFlags & 0x150L) != 0) {

                    if (vm != null) {
                        // read vm.commentAdapter
                        vmCommentAdapter = vm.commentAdapter;
                    }
                    updateRegistration(4, vmCommentAdapter);


                    if (vmCommentAdapter != null) {
                        // read vm.commentAdapter.get()
                        vmCommentAdapterGet = vmCommentAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x160L) != 0) {

                    if (vm != null) {
                        // read vm.isParised
                        vmIsParised = vm.isParised;
                    }
                    updateRegistration(5, vmIsParised);


                    if (vmIsParised != null) {
                        // read vm.isParised.get()
                        vmIsParisedGet = vmIsParised.get();
                    }
                if((dirtyFlags & 0x160L) != 0) {
                    if(vmIsParisedGet) {
                            dirtyFlags |= 0x1000L;
                    }
                    else {
                            dirtyFlags |= 0x800L;
                    }
                }


                    // read vm.isParised.get() ? @android:drawable/ic_parise_red : @android:drawable/ic_parise
                    vmIsParisedIvVideoDetailPraiseAndroidDrawableIcPariseRedIvVideoDetailPraiseAndroidDrawableIcParise = ((vmIsParisedGet) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivVideoDetailPraise.getContext(), R.drawable.ic_parise_red)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivVideoDetailPraise.getContext(), R.drawable.ic_parise)));
            }
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgVideoDetailBack, mCallback32);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivVideoDetailCollect, mCallback34);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivVideoDetailPraise, mCallback33);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llSingerFollow, mCallback35);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llSingerFollowed, mCallback36);
        }
        if ((dirtyFlags & 0x144L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.ivSingerAvatar, vmVideoCreatorAvatarurl);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSingerName, vmVideoCreatorNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailCollectCount, vmVideoSubscribeCount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailCommentCount, vmVideoCommentcount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailPlaytime, searchUtilGetCorresPondingStringVmVideoPlaytimeJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailPraiseCount, vmVideoPraisedcount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailShareCount, vmVideoSharecount);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailTitle, vmVideoTitle);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvVideoDetailToolbarTitle, vmVideoTitle);
        }
        if ((dirtyFlags & 0x148L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.setImageRes(this.ivVideoDetailCollect, vmIsSubscribedIvVideoDetailCollectAndroidDrawableIcCollectedIvVideoDetailCollectAndroidDrawableIcCollect);
        }
        if ((dirtyFlags & 0x160L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.setImageRes(this.ivVideoDetailPraise, vmIsParisedIvVideoDetailPraiseAndroidDrawableIcPariseRedIvVideoDetailPraiseAndroidDrawableIcParise);
        }
        if ((dirtyFlags & 0x141L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llSingerFollow, vmIsFollowed);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llSingerFollowed, vmIsFollowedGet);
        }
        if ((dirtyFlags & 0x142L) != 0) {
            // api target 1

            this.mboundView31.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView31.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvVideoComment, VmLoadingVisible1);
        }
        if ((dirtyFlags & 0x150L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvVideoComment, vmCommentAdapterGet, androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.TRUE));
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
                com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeSubscribeStatus();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeSubscribeStatus();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.back();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.parise();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.video.VideoDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.collect();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.isFollowed
        flag 1 (0x2L): vm.loadingVisible
        flag 2 (0x3L): vm.video
        flag 3 (0x4L): vm.isSubscribed
        flag 4 (0x5L): vm.commentAdapter
        flag 5 (0x6L): vm.isParised
        flag 6 (0x7L): vm
        flag 7 (0x8L): proxy
        flag 8 (0x9L): null
        flag 9 (0xaL): vm.isSubscribed.get() ? @android:drawable/ic_collected : @android:drawable/ic_collect
        flag 10 (0xbL): vm.isSubscribed.get() ? @android:drawable/ic_collected : @android:drawable/ic_collect
        flag 11 (0xcL): vm.isParised.get() ? @android:drawable/ic_parise_red : @android:drawable/ic_parise
        flag 12 (0xdL): vm.isParised.get() ? @android:drawable/ic_parise_red : @android:drawable/ic_parise
    flag mapping end*/
    //end
}