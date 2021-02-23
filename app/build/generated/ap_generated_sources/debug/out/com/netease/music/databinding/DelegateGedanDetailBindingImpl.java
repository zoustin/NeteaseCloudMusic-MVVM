package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateGedanDetailBindingImpl extends DelegateGedanDetailBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(35);
        sIncludes.setIncludes(16, 
            new String[] {"delegate_normal_loading"},
            new int[] {23},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar_gedan_detail, 24);
        sViewsWithIds.put(R.id.collapsing_toolbar_layout, 25);
        sViewsWithIds.put(R.id.rl_gedan_detail_img, 26);
        sViewsWithIds.put(R.id.tv_gedan_detail_title, 27);
        sViewsWithIds.put(R.id.toolbar_gedan_detail, 28);
        sViewsWithIds.put(R.id.rl_toolbar_gedan_detail, 29);
        sViewsWithIds.put(R.id.iv_gedan_detail_search, 30);
        sViewsWithIds.put(R.id.iv_gedan_detail_more, 31);
        sViewsWithIds.put(R.id.ll_play_header, 32);
        sViewsWithIds.put(R.id.tv_gedan_detaill_all_play, 33);
        sViewsWithIds.put(R.id.iv_gedan_detail_collect_status, 34);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView16;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback55;
    @Nullable
    private final android.view.View.OnClickListener mCallback56;
    @Nullable
    private final android.view.View.OnClickListener mCallback54;
    @Nullable
    private final android.view.View.OnClickListener mCallback53;
    @Nullable
    private final android.view.View.OnClickListener mCallback57;
    @Nullable
    private final android.view.View.OnClickListener mCallback58;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateGedanDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private DelegateGedanDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 17
            , (com.google.android.material.appbar.AppBarLayout) bindings[24]
            , (com.google.android.material.appbar.CollapsingToolbarLayout) bindings[25]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[7]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[31]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.ImageView) bindings[30]
            , (android.widget.LinearLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.LinearLayout) bindings[20]
            , (android.widget.LinearLayout) bindings[32]
            , (android.widget.RelativeLayout) bindings[26]
            , (android.widget.RelativeLayout) bindings[16]
            , (android.widget.RelativeLayout) bindings[29]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.appcompat.widget.Toolbar) bindings[28]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[19]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[27]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[33]
            );
        this.imgGedanDetailBack.setTag(null);
        this.ivGedanDetailAlbumTag.setTag(null);
        this.ivGedanDetailAvatarImg.setTag(null);
        this.ivGedanDetailImg.setTag(null);
        this.ivGedanDetailImgBack.setTag(null);
        this.ivGedanDetailImgCover.setTag(null);
        this.ivGedanDetailPlaynum.setTag(null);
        this.llGedanDetailComment.setTag(null);
        this.llGedanSubscribe.setTag(null);
        this.llGedanSubscribed.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView16 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[23];
        setContainedBinding(this.mboundView16);
        this.rlPlayHeader.setTag(null);
        this.rvGedanDetailNormal.setTag(null);
        this.tvGedanDetailAvatarName.setTag(null);
        this.tvGedanDetailCollectCount.setTag(null);
        this.tvGedanDetailCollectCount1.setTag(null);
        this.tvGedanDetailCommentCount.setTag(null);
        this.tvGedanDetailDesc.setTag(null);
        this.tvGedanDetailPlaynum.setTag(null);
        this.tvGedanDetailShareCount.setTag(null);
        this.tvGedanDetailSongNum.setTag(null);
        this.tvGedanDetailToolbarReason.setTag(null);
        this.tvGedanDetailToolbarTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback55 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback56 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback54 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback53 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback57 = new com.netease.music.generated.callback.OnClickListener(this, 5);
        mCallback58 = new com.netease.music.generated.callback.OnClickListener(this, 6);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x80000L;
        }
        mboundView16.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView16.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.SonglistDeatilViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.SonglistDeatilViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20000L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x40000L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView16.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmShareCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmType((androidx.databinding.ObservableField<com.netease.music.data.config.TYPE>) object, fieldId);
            case 2 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 3 :
                return onChangeVmBackgroundImgRadis((androidx.databinding.ObservableInt) object, fieldId);
            case 4 :
                return onChangeVmCoverImgUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmIsCollected((androidx.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeVmSongCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 7 :
                return onChangeVmBackgroundImgUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeVmBackgroundCoverImgRadis((androidx.databinding.ObservableInt) object, fieldId);
            case 9 :
                return onChangeVmPlayCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 10 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 11 :
                return onChangeVmCreator((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 12 :
                return onChangeVmCollectCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 13 :
                return onChangeVmCreatorImgUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 14 :
                return onChangeVmCommentCount((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 15 :
                return onChangeVmDesc((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 16 :
                return onChangeVmReason((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmShareCount(androidx.databinding.ObservableField<java.lang.String> VmShareCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmType(androidx.databinding.ObservableField<com.netease.music.data.config.TYPE> VmType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBackgroundImgRadis(androidx.databinding.ObservableInt VmBackgroundImgRadis, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCoverImgUrl(androidx.databinding.ObservableField<java.lang.String> VmCoverImgUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIsCollected(androidx.databinding.ObservableBoolean VmIsCollected, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSongCount(androidx.databinding.ObservableField<java.lang.String> VmSongCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBackgroundImgUrl(androidx.databinding.ObservableField<java.lang.String> VmBackgroundImgUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBackgroundCoverImgRadis(androidx.databinding.ObservableInt VmBackgroundCoverImgRadis, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPlayCount(androidx.databinding.ObservableField<java.lang.String> VmPlayCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x400L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCreator(androidx.databinding.ObservableField<java.lang.String> VmCreator, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x800L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCollectCount(androidx.databinding.ObservableField<java.lang.String> VmCollectCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCreatorImgUrl(androidx.databinding.ObservableField<java.lang.String> VmCreatorImgUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCommentCount(androidx.databinding.ObservableField<java.lang.String> VmCommentCount, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDesc(androidx.databinding.ObservableField<java.lang.String> VmDesc, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8000L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmReason(androidx.databinding.ObservableField<java.lang.String> VmReason, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10000L;
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
        boolean vmReasonJavaLangString = false;
        androidx.databinding.ObservableField<java.lang.String> vmShareCount = null;
        com.netease.music.ui.state.SonglistDeatilViewModel vm = mVm;
        boolean vmIsCollectedGet = false;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        java.lang.String vmCommentCountGet = null;
        java.lang.String vmCoverImgUrlGet = null;
        java.lang.String vmTypeTYPEALBUMJavaLangStringVmCreatorVmCreator = null;
        java.lang.String vmCreatorGet = null;
        java.lang.String vmDescGet = null;
        boolean vmIsCollected = false;
        androidx.databinding.ObservableField<com.netease.music.data.config.TYPE> vmType = null;
        java.lang.String searchUtilGetCorresPondingStringVmCollectCount = null;
        boolean VmReasonJavaLangString1 = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        androidx.databinding.ObservableInt vmBackgroundImgRadis = null;
        androidx.databinding.ObservableField<java.lang.String> vmCoverImgUrl = null;
        java.lang.String vmReasonGet = null;
        androidx.databinding.ObservableBoolean VmIsCollected1 = null;
        androidx.databinding.ObservableField<java.lang.String> vmSongCount = null;
        boolean vmTypeTYPEPLAYLIST = false;
        java.lang.String vmSongCountGet = null;
        boolean vmTypeTYPEALBUM = false;
        java.lang.String searchUtilGetCorresPondingStringVmPlayCount = null;
        java.lang.String javaLangStringVmSongCountJavaLangString = null;
        androidx.databinding.ObservableField<java.lang.String> vmBackgroundImgUrl = null;
        java.lang.String vmPlayCountGet = null;
        androidx.databinding.ObservableInt vmBackgroundCoverImgRadis = null;
        androidx.databinding.ObservableField<java.lang.String> vmPlayCount = null;
        boolean vmLoadingVisibleGet = false;
        int vmBackgroundImgRadisGet = 0;
        java.lang.String javaLangStringSearchUtilGetCorresPondingStringVmCollectCount = null;
        java.lang.String javaLangStringVmCreator = null;
        int vmBackgroundCoverImgRadisGet = 0;
        com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;
        java.lang.String javaLangStringSearchUtilGetCorresPondingStringVmCollectCountJavaLangString = null;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        java.lang.String vmBackgroundImgUrlGet = null;
        java.lang.String vmShareCountGet = null;
        androidx.databinding.ObservableField<java.lang.String> vmCreator = null;
        androidx.databinding.ObservableField<java.lang.String> vmCollectCount = null;
        java.lang.String javaLangStringVmSongCount = null;
        java.lang.String vmCreatorImgUrlGet = null;
        com.netease.music.data.config.TYPE vmTypeGet = null;
        java.lang.String vmCollectCountGet = null;
        boolean VmLoadingVisible1 = false;
        androidx.databinding.ObservableField<java.lang.String> vmCreatorImgUrl = null;
        androidx.databinding.ObservableField<java.lang.String> vmCommentCount = null;
        androidx.databinding.ObservableField<java.lang.String> vmDesc = null;
        java.lang.String vmTypeKey = null;
        androidx.databinding.ObservableField<java.lang.String> vmReason = null;

        if ((dirtyFlags & 0xbffffL) != 0) {


            if ((dirtyFlags & 0xa0001L) != 0) {

                    if (vm != null) {
                        // read vm.shareCount
                        vmShareCount = vm.shareCount;
                    }
                    updateRegistration(0, vmShareCount);


                    if (vmShareCount != null) {
                        // read vm.shareCount.get()
                        vmShareCountGet = vmShareCount.get();
                    }
            }
            if ((dirtyFlags & 0xa0802L) != 0) {

                    if (vm != null) {
                        // read vm.type
                        vmType = vm.type;
                    }
                    updateRegistration(1, vmType);


                    if (vmType != null) {
                        // read vm.type.get()
                        vmTypeGet = vmType.get();
                    }

                if ((dirtyFlags & 0xa0002L) != 0) {

                        // read vm.type.get() == TYPE.PLAYLIST
                        vmTypeTYPEPLAYLIST = (vmTypeGet) == (com.netease.music.data.config.TYPE.PLAYLIST);
                        if (vmTypeGet != null) {
                            // read vm.type.get().key
                            vmTypeKey = vmTypeGet.getKey();
                        }
                }

                    // read vm.type.get() == TYPE.ALBUM
                    vmTypeTYPEALBUM = (vmTypeGet) == (com.netease.music.data.config.TYPE.ALBUM);
                if((dirtyFlags & 0xa0802L) != 0) {
                    if(vmTypeTYPEALBUM) {
                            dirtyFlags |= 0x200000L;
                    }
                    else {
                            dirtyFlags |= 0x100000L;
                    }
                }
            }
            if ((dirtyFlags & 0xa0004L) != 0) {

                    if (vm != null) {
                        // read vm.adapter
                        vmAdapter = vm.adapter;
                    }
                    updateRegistration(2, vmAdapter);


                    if (vmAdapter != null) {
                        // read vm.adapter.get()
                        vmAdapterGet = vmAdapter.get();
                    }
            }
            if ((dirtyFlags & 0xa0088L) != 0) {

                    if (vm != null) {
                        // read vm.backgroundImgRadis
                        vmBackgroundImgRadis = vm.backgroundImgRadis;
                    }
                    updateRegistration(3, vmBackgroundImgRadis);


                    if (vmBackgroundImgRadis != null) {
                        // read vm.backgroundImgRadis.get()
                        vmBackgroundImgRadisGet = vmBackgroundImgRadis.get();
                    }
            }
            if ((dirtyFlags & 0xa0010L) != 0) {

                    if (vm != null) {
                        // read vm.coverImgUrl
                        vmCoverImgUrl = vm.coverImgUrl;
                    }
                    updateRegistration(4, vmCoverImgUrl);


                    if (vmCoverImgUrl != null) {
                        // read vm.coverImgUrl.get()
                        vmCoverImgUrlGet = vmCoverImgUrl.get();
                    }
            }
            if ((dirtyFlags & 0xa0020L) != 0) {

                    if (vm != null) {
                        // read vm.isCollected
                        VmIsCollected1 = vm.isCollected;
                    }
                    updateRegistration(5, VmIsCollected1);


                    if (VmIsCollected1 != null) {
                        // read vm.isCollected.get()
                        vmIsCollectedGet = VmIsCollected1.get();
                    }


                    // read !vm.isCollected.get()
                    vmIsCollected = !vmIsCollectedGet;
            }
            if ((dirtyFlags & 0xa0040L) != 0) {

                    if (vm != null) {
                        // read vm.songCount
                        vmSongCount = vm.songCount;
                    }
                    updateRegistration(6, vmSongCount);


                    if (vmSongCount != null) {
                        // read vm.songCount.get()
                        vmSongCountGet = vmSongCount.get();
                    }


                    // read ("(共") + (vm.songCount.get())
                    javaLangStringVmSongCount = ("(共") + (vmSongCountGet);


                    // read (("(共") + (vm.songCount.get())) + ("首)")
                    javaLangStringVmSongCountJavaLangString = (javaLangStringVmSongCount) + ("首)");
            }
            if ((dirtyFlags & 0xa0188L) != 0) {

                    if (vm != null) {
                        // read vm.backgroundImgUrl
                        vmBackgroundImgUrl = vm.backgroundImgUrl;
                    }
                    updateRegistration(7, vmBackgroundImgUrl);


                    if (vmBackgroundImgUrl != null) {
                        // read vm.backgroundImgUrl.get()
                        vmBackgroundImgUrlGet = vmBackgroundImgUrl.get();
                    }

                if ((dirtyFlags & 0xa0088L) != 0) {
                }
            }
            if ((dirtyFlags & 0xa0180L) != 0) {

                    if (vm != null) {
                        // read vm.backgroundCoverImgRadis
                        vmBackgroundCoverImgRadis = vm.backgroundCoverImgRadis;
                    }
                    updateRegistration(8, vmBackgroundCoverImgRadis);


                    if (vmBackgroundCoverImgRadis != null) {
                        // read vm.backgroundCoverImgRadis.get()
                        vmBackgroundCoverImgRadisGet = vmBackgroundCoverImgRadis.get();
                    }
            }
            if ((dirtyFlags & 0xa0200L) != 0) {

                    if (vm != null) {
                        // read vm.playCount
                        vmPlayCount = vm.playCount;
                    }
                    updateRegistration(9, vmPlayCount);


                    if (vmPlayCount != null) {
                        // read vm.playCount.get()
                        vmPlayCountGet = vmPlayCount.get();
                    }


                    // read SearchUtil.getCorresPondingString(vm.playCount.get())
                    searchUtilGetCorresPondingStringVmPlayCount = com.netease.music.util.SearchUtil.getCorresPondingString(vmPlayCountGet);
            }
            if ((dirtyFlags & 0xa0400L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        vmLoadingVisible = vm.loadingVisible;
                    }
                    updateRegistration(10, vmLoadingVisible);


                    if (vmLoadingVisible != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = vmLoadingVisible.get();
                    }


                    // read !vm.loadingVisible.get()
                    VmLoadingVisible1 = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0xa1000L) != 0) {

                    if (vm != null) {
                        // read vm.collectCount
                        vmCollectCount = vm.collectCount;
                    }
                    updateRegistration(12, vmCollectCount);


                    if (vmCollectCount != null) {
                        // read vm.collectCount.get()
                        vmCollectCountGet = vmCollectCount.get();
                    }


                    // read SearchUtil.getCorresPondingString(vm.collectCount.get())
                    searchUtilGetCorresPondingStringVmCollectCount = com.netease.music.util.SearchUtil.getCorresPondingString(vmCollectCountGet);


                    // read ("收藏(") + (SearchUtil.getCorresPondingString(vm.collectCount.get()))
                    javaLangStringSearchUtilGetCorresPondingStringVmCollectCount = ("收藏(") + (searchUtilGetCorresPondingStringVmCollectCount);


                    // read (("收藏(") + (SearchUtil.getCorresPondingString(vm.collectCount.get()))) + (")")
                    javaLangStringSearchUtilGetCorresPondingStringVmCollectCountJavaLangString = (javaLangStringSearchUtilGetCorresPondingStringVmCollectCount) + (")");
            }
            if ((dirtyFlags & 0xa2000L) != 0) {

                    if (vm != null) {
                        // read vm.creatorImgUrl
                        vmCreatorImgUrl = vm.creatorImgUrl;
                    }
                    updateRegistration(13, vmCreatorImgUrl);


                    if (vmCreatorImgUrl != null) {
                        // read vm.creatorImgUrl.get()
                        vmCreatorImgUrlGet = vmCreatorImgUrl.get();
                    }
            }
            if ((dirtyFlags & 0xa4000L) != 0) {

                    if (vm != null) {
                        // read vm.commentCount
                        vmCommentCount = vm.commentCount;
                    }
                    updateRegistration(14, vmCommentCount);


                    if (vmCommentCount != null) {
                        // read vm.commentCount.get()
                        vmCommentCountGet = vmCommentCount.get();
                    }
            }
            if ((dirtyFlags & 0xa8000L) != 0) {

                    if (vm != null) {
                        // read vm.desc
                        vmDesc = vm.desc;
                    }
                    updateRegistration(15, vmDesc);


                    if (vmDesc != null) {
                        // read vm.desc.get()
                        vmDescGet = vmDesc.get();
                    }
            }
            if ((dirtyFlags & 0xb0000L) != 0) {

                    if (vm != null) {
                        // read vm.reason
                        vmReason = vm.reason;
                    }
                    updateRegistration(16, vmReason);


                    if (vmReason != null) {
                        // read vm.reason.get()
                        vmReasonGet = vmReason.get();
                    }


                    // read vm.reason.get() == ""
                    vmReasonJavaLangString = (vmReasonGet) == ("");


                    // read !vm.reason.get() == ""
                    VmReasonJavaLangString1 = !vmReasonJavaLangString;
            }
        }
        // batch finished

        if ((dirtyFlags & 0x300000L) != 0) {

                if (vm != null) {
                    // read vm.creator
                    vmCreator = vm.creator;
                }
                updateRegistration(11, vmCreator);


                if (vmCreator != null) {
                    // read vm.creator.get()
                    vmCreatorGet = vmCreator.get();
                }

            if ((dirtyFlags & 0x200000L) != 0) {

                    // read ("歌手: ") + (vm.creator.get())
                    javaLangStringVmCreator = ("歌手: ") + (vmCreatorGet);
            }
        }

        if ((dirtyFlags & 0xa0802L) != 0) {

                // read vm.type.get() == TYPE.ALBUM ? ("歌手: ") + (vm.creator.get()) : vm.creator.get()
                vmTypeTYPEALBUMJavaLangStringVmCreatorVmCreator = ((vmTypeTYPEALBUM) ? (javaLangStringVmCreator) : (vmCreatorGet));
        }
        // batch finished
        if ((dirtyFlags & 0x80000L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgGedanDetailBack, mCallback56);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivGedanDetailAvatarImg, mCallback53);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llGedanDetailComment, mCallback55);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llGedanSubscribe, mCallback57);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llGedanSubscribed, mCallback58);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvGedanDetailAvatarName, mCallback54);
        }
        if ((dirtyFlags & 0xa0002L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.ivGedanDetailAlbumTag, vmTypeTYPEALBUM);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.ivGedanDetailAvatarImg, vmTypeTYPEPLAYLIST);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.ivGedanDetailPlaynum, vmTypeTYPEPLAYLIST);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.tvGedanDetailPlaynum, vmTypeTYPEPLAYLIST);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailToolbarTitle, vmTypeKey);
        }
        if ((dirtyFlags & 0xa2000L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.ivGedanDetailAvatarImg, vmCreatorImgUrlGet);
        }
        if ((dirtyFlags & 0xa0010L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCorner(this.ivGedanDetailImg, vmCoverImgUrlGet, (int)0);
        }
        if ((dirtyFlags & 0xa0088L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForImageView(this.ivGedanDetailImgBack, vmBackgroundImgUrlGet, vmBackgroundImgRadisGet);
        }
        if ((dirtyFlags & 0xa0180L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForImageView(this.ivGedanDetailImgCover, vmBackgroundImgUrlGet, vmBackgroundCoverImgRadisGet);
        }
        if ((dirtyFlags & 0xa0020L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llGedanSubscribe, vmIsCollected);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llGedanSubscribed, vmIsCollectedGet);
        }
        if ((dirtyFlags & 0xa0400L) != 0) {
            // api target 1

            this.mboundView16.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView16.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvGedanDetailNormal, VmLoadingVisible1);
        }
        if ((dirtyFlags & 0xa0004L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvGedanDetailNormal, vmAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0xa0802L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailAvatarName, vmTypeTYPEALBUMJavaLangStringVmCreatorVmCreator);
        }
        if ((dirtyFlags & 0xa1000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCollectCount, javaLangStringSearchUtilGetCorresPondingStringVmCollectCountJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCollectCount1, vmCollectCountGet);
        }
        if ((dirtyFlags & 0xa4000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCommentCount, vmCommentCountGet);
        }
        if ((dirtyFlags & 0xa8000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailDesc, vmDescGet);
        }
        if ((dirtyFlags & 0xa0200L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailPlaynum, searchUtilGetCorresPondingStringVmPlayCount);
        }
        if ((dirtyFlags & 0xa0001L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailShareCount, vmShareCountGet);
        }
        if ((dirtyFlags & 0xa0040L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailSongNum, javaLangStringVmSongCountJavaLangString);
        }
        if ((dirtyFlags & 0xb0000L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.tvGedanDetailToolbarReason, VmReasonJavaLangString1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailToolbarReason, vmReasonGet);
        }
        executeBindingsOn(mboundView16);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 3: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.comment();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.userInfo();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeSubscribeStatus();
                }
                break;
            }
            case 6: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.square.detail.SongListDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeSubscribeStatus();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.shareCount
        flag 1 (0x2L): vm.type
        flag 2 (0x3L): vm.adapter
        flag 3 (0x4L): vm.backgroundImgRadis
        flag 4 (0x5L): vm.coverImgUrl
        flag 5 (0x6L): vm.isCollected
        flag 6 (0x7L): vm.songCount
        flag 7 (0x8L): vm.backgroundImgUrl
        flag 8 (0x9L): vm.backgroundCoverImgRadis
        flag 9 (0xaL): vm.playCount
        flag 10 (0xbL): vm.loadingVisible
        flag 11 (0xcL): vm.creator
        flag 12 (0xdL): vm.collectCount
        flag 13 (0xeL): vm.creatorImgUrl
        flag 14 (0xfL): vm.commentCount
        flag 15 (0x10L): vm.desc
        flag 16 (0x11L): vm.reason
        flag 17 (0x12L): vm
        flag 18 (0x13L): proxy
        flag 19 (0x14L): null
        flag 20 (0x15L): vm.type.get() == TYPE.ALBUM ? ("歌手: ") + (vm.creator.get()) : vm.creator.get()
        flag 21 (0x16L): vm.type.get() == TYPE.ALBUM ? ("歌手: ") + (vm.creator.get()) : vm.creator.get()
    flag mapping end*/
    //end
}