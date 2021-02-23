package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateDiscoverBindingImpl extends DelegateDiscoverBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_discover_daily_recommend, 9);
        sViewsWithIds.put(R.id.tv_spec_name, 10);
        sViewsWithIds.put(R.id.ll_discover_gedan, 11);
        sViewsWithIds.put(R.id.iv_mine_spec1, 12);
        sViewsWithIds.put(R.id.tv_spec_name1, 13);
        sViewsWithIds.put(R.id.ll_discover_rank, 14);
        sViewsWithIds.put(R.id.iv_mine_spec2, 15);
        sViewsWithIds.put(R.id.tv_spec_name2, 16);
        sViewsWithIds.put(R.id.iv_mine_spec3, 17);
        sViewsWithIds.put(R.id.tv_spec_name3, 18);
        sViewsWithIds.put(R.id.ll_discover_myfm, 19);
        sViewsWithIds.put(R.id.iv_mine_spec4, 20);
        sViewsWithIds.put(R.id.tv_spec_name4, 21);
        sViewsWithIds.put(R.id.tv_discover_gedan_square, 22);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback50;
    @Nullable
    private final android.view.View.OnClickListener mCallback48;
    @Nullable
    private final android.view.View.OnClickListener mCallback51;
    @Nullable
    private final android.view.View.OnClickListener mCallback49;
    @Nullable
    private final android.view.View.OnClickListener mCallback52;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateDiscoverBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 23, sIncludes, sViewsWithIds));
    }
    private DelegateDiscoverBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.bigkoo.convenientbanner.ConvenientBanner) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.ImageView) bindings[20]
            , (android.widget.LinearLayout) bindings[9]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[14]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[6]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[18]
            , (android.widget.TextView) bindings[21]
            );
        this.bannerRecyclerItem.setTag(null);
        this.ivMineSpec.setTag(null);
        this.llDiscoverRadio.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.rvDiscoverAlbumSong.setTag(null);
        this.rvDiscoverPlaylist.setTag(null);
        this.tvDiscoverMoreAlbumSong.setTag(null);
        this.tvDiscoverNewAlbum.setTag(null);
        this.tvDiscoverNewSong.setTag(null);
        setRootTag(root);
        // listeners
        mCallback50 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback48 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback51 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback49 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback52 = new com.netease.music.generated.callback.OnClickListener(this, 5);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
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
            setVm((com.netease.music.ui.state.DiscoverViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy) variable);
        }
        else if (BR.bannerListener == variableId) {
            setBannerListener((com.bigkoo.convenientbanner.listener.OnItemClickListener) variable);
        }
        else if (BR.albumSongAdapter == variableId) {
            setAlbumSongAdapter((com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.DiscoverViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }
    public void setBannerListener(@Nullable com.bigkoo.convenientbanner.listener.OnItemClickListener BannerListener) {
        this.mBannerListener = BannerListener;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.bannerListener);
        super.requestRebind();
    }
    public void setAlbumSongAdapter(@Nullable com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter AlbumSongAdapter) {
        this.mAlbumSongAdapter = AlbumSongAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.albumSongAdapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPlayListAdapter((androidx.databinding.ObservableField<com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter<com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean,com.netease.music.databinding.ItemDiscoverGedanBinding>>) object, fieldId);
            case 1 :
                return onChangeVmType((androidx.databinding.ObservableField<com.netease.music.data.config.TYPE>) object, fieldId);
            case 2 :
                return onChangeVmCurrentAlbumOrSongLiveData((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.album.AlbumOrSongBean>>) object, fieldId);
            case 3 :
                return onChangeVmBannersPic((androidx.databinding.ObservableField<java.util.List<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPlayListAdapter(androidx.databinding.ObservableField<com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter<com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean,com.netease.music.databinding.ItemDiscoverGedanBinding>> VmPlayListAdapter, int fieldId) {
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
    private boolean onChangeVmCurrentAlbumOrSongLiveData(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.album.AlbumOrSongBean>> VmCurrentAlbumOrSongLiveData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBannersPic(androidx.databinding.ObservableField<java.util.List<java.lang.String>> VmBannersPic, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
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
        com.netease.music.ui.state.DiscoverViewModel vm = mVm;
        androidx.databinding.ObservableField<com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter<com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean,com.netease.music.databinding.ItemDiscoverGedanBinding>> vmPlayListAdapter = null;
        com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;
        float vmTypeTYPESONGTvDiscoverNewAlbumAndroidDimenSp12TvDiscoverNewAlbumAndroidDimenSp15 = 0f;
        int vmTypeTYPESONGTvDiscoverNewAlbumAndroidColorGrayTvDiscoverNewAlbumAndroidColorBlack = 0;
        java.util.List<java.lang.String> vmBannersPicGet = null;
        java.util.List<com.netease.lib_api.model.album.AlbumOrSongBean> vmCurrentAlbumOrSongLiveDataGet = null;
        androidx.databinding.ObservableField<com.netease.music.data.config.TYPE> vmType = null;
        com.bigkoo.convenientbanner.listener.OnItemClickListener bannerListener = mBannerListener;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.album.AlbumOrSongBean>> vmCurrentAlbumOrSongLiveData = null;
        com.netease.music.data.config.TYPE vmTypeGet = null;
        android.graphics.Typeface vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceBOLDTypefaceDefaultFromStyleTypefaceNORMAL = null;
        boolean vmTypeTYPESONG = false;
        com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter<com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean,com.netease.music.databinding.ItemDiscoverGedanBinding> vmPlayListAdapterGet = null;
        com.kunminx.architecture.ui.adapter.SimpleDataBindingAdapter<?,? extends androidx.databinding.ViewDataBinding> albumSongAdapter = mAlbumSongAdapter;
        float vmTypeTYPESONGTvDiscoverNewSongAndroidDimenSp15TvDiscoverNewSongAndroidDimenSp12 = 0f;
        int vmTypeTYPESONGTvDiscoverNewSongAndroidColorBlackTvDiscoverNewSongAndroidColorGray = 0;
        android.graphics.Typeface vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceNORMALTypefaceDefaultFromStyleTypefaceBOLD = null;
        java.lang.String vmTypeTYPESONGJavaLangStringJavaLangString = null;
        androidx.databinding.ObservableField<java.util.List<java.lang.String>> vmBannersPic = null;

        if ((dirtyFlags & 0x15fL) != 0) {


            if ((dirtyFlags & 0x111L) != 0) {

                    if (vm != null) {
                        // read vm.playListAdapter
                        vmPlayListAdapter = vm.playListAdapter;
                    }
                    updateRegistration(0, vmPlayListAdapter);


                    if (vmPlayListAdapter != null) {
                        // read vm.playListAdapter.get()
                        vmPlayListAdapterGet = vmPlayListAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x112L) != 0) {

                    if (vm != null) {
                        // read vm.type
                        vmType = vm.type;
                    }
                    updateRegistration(1, vmType);


                    if (vmType != null) {
                        // read vm.type.get()
                        vmTypeGet = vmType.get();
                    }


                    // read vm.type.get() == TYPE.SONG
                    vmTypeTYPESONG = (vmTypeGet) == (com.netease.music.data.config.TYPE.SONG);
                if((dirtyFlags & 0x112L) != 0) {
                    if(vmTypeTYPESONG) {
                            dirtyFlags |= 0x400L;
                            dirtyFlags |= 0x1000L;
                            dirtyFlags |= 0x4000L;
                            dirtyFlags |= 0x10000L;
                            dirtyFlags |= 0x40000L;
                            dirtyFlags |= 0x100000L;
                            dirtyFlags |= 0x400000L;
                    }
                    else {
                            dirtyFlags |= 0x200L;
                            dirtyFlags |= 0x800L;
                            dirtyFlags |= 0x2000L;
                            dirtyFlags |= 0x8000L;
                            dirtyFlags |= 0x20000L;
                            dirtyFlags |= 0x80000L;
                            dirtyFlags |= 0x200000L;
                    }
                }


                    // read vm.type.get() == TYPE.SONG ? @android:dimen/sp_12 : @android:dimen/sp_15
                    vmTypeTYPESONGTvDiscoverNewAlbumAndroidDimenSp12TvDiscoverNewAlbumAndroidDimenSp15 = ((vmTypeTYPESONG) ? (tvDiscoverNewAlbum.getResources().getDimension(R.dimen.sp_12)) : (tvDiscoverNewAlbum.getResources().getDimension(R.dimen.sp_15)));
                    // read vm.type.get() == TYPE.SONG ? @android:color/gray : @android:color/black
                    vmTypeTYPESONGTvDiscoverNewAlbumAndroidColorGrayTvDiscoverNewAlbumAndroidColorBlack = ((vmTypeTYPESONG) ? (getColorFromResource(tvDiscoverNewAlbum, R.color.gray)) : (getColorFromResource(tvDiscoverNewAlbum, R.color.black)));
                    // read vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.BOLD) : Typeface.defaultFromStyle(Typeface.NORMAL)
                    vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceBOLDTypefaceDefaultFromStyleTypefaceNORMAL = ((vmTypeTYPESONG) ? (android.graphics.Typeface.defaultFromStyle(android.graphics.Typeface.BOLD)) : (android.graphics.Typeface.defaultFromStyle(android.graphics.Typeface.NORMAL)));
                    // read vm.type.get() == TYPE.SONG ? @android:dimen/sp_15 : @android:dimen/sp_12
                    vmTypeTYPESONGTvDiscoverNewSongAndroidDimenSp15TvDiscoverNewSongAndroidDimenSp12 = ((vmTypeTYPESONG) ? (tvDiscoverNewSong.getResources().getDimension(R.dimen.sp_15)) : (tvDiscoverNewSong.getResources().getDimension(R.dimen.sp_12)));
                    // read vm.type.get() == TYPE.SONG ? @android:color/black : @android:color/gray
                    vmTypeTYPESONGTvDiscoverNewSongAndroidColorBlackTvDiscoverNewSongAndroidColorGray = ((vmTypeTYPESONG) ? (getColorFromResource(tvDiscoverNewSong, R.color.black)) : (getColorFromResource(tvDiscoverNewSong, R.color.gray)));
                    // read vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.NORMAL) : Typeface.defaultFromStyle(Typeface.BOLD)
                    vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceNORMALTypefaceDefaultFromStyleTypefaceBOLD = ((vmTypeTYPESONG) ? (android.graphics.Typeface.defaultFromStyle(android.graphics.Typeface.NORMAL)) : (android.graphics.Typeface.defaultFromStyle(android.graphics.Typeface.BOLD)));
                    // read vm.type.get() == TYPE.SONG ? "新歌推荐" : "更多新碟"
                    vmTypeTYPESONGJavaLangStringJavaLangString = ((vmTypeTYPESONG) ? ("新歌推荐") : ("更多新碟"));
            }
            if ((dirtyFlags & 0x114L) != 0) {

                    if (vm != null) {
                        // read vm.currentAlbumOrSongLiveData
                        vmCurrentAlbumOrSongLiveData = vm.currentAlbumOrSongLiveData;
                    }
                    updateRegistration(2, vmCurrentAlbumOrSongLiveData);


                    if (vmCurrentAlbumOrSongLiveData != null) {
                        // read vm.currentAlbumOrSongLiveData.get()
                        vmCurrentAlbumOrSongLiveDataGet = vmCurrentAlbumOrSongLiveData.get();
                    }
            }
            if ((dirtyFlags & 0x158L) != 0) {

                    if (vm != null) {
                        // read vm.bannersPic
                        vmBannersPic = vm.bannersPic;
                    }
                    updateRegistration(3, vmBannersPic);


                    if (vmBannersPic != null) {
                        // read vm.bannersPic.get()
                        vmBannersPicGet = vmBannersPic.get();
                    }
            }
        }
        if ((dirtyFlags & 0x158L) != 0) {
        }
        if ((dirtyFlags & 0x180L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x158L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setDefault(this.bannerRecyclerItem, vmBannersPicGet, bannerListener);
        }
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivMineSpec, mCallback48);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llDiscoverRadio, mCallback49);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvDiscoverMoreAlbumSong, mCallback52);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvDiscoverNewAlbum, mCallback50);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvDiscoverNewSong, mCallback51);
        }
        if ((dirtyFlags & 0x114L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvDiscoverAlbumSong, vmCurrentAlbumOrSongLiveDataGet);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithGridLayoutManager(this.rvDiscoverAlbumSong, albumSongAdapter, (int)0);
        }
        if ((dirtyFlags & 0x111L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithGridLayoutManager(this.rvDiscoverPlaylist, vmPlayListAdapterGet, (int)0);
        }
        if ((dirtyFlags & 0x112L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDiscoverMoreAlbumSong, vmTypeTYPESONGJavaLangStringJavaLangString);
            this.tvDiscoverNewAlbum.setTextColor(vmTypeTYPESONGTvDiscoverNewAlbumAndroidColorGrayTvDiscoverNewAlbumAndroidColorBlack);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextSize(this.tvDiscoverNewAlbum, vmTypeTYPESONGTvDiscoverNewAlbumAndroidDimenSp12TvDiscoverNewAlbumAndroidDimenSp15);
            this.tvDiscoverNewAlbum.setTypeface(vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceNORMALTypefaceDefaultFromStyleTypefaceBOLD);
            this.tvDiscoverNewSong.setTextColor(vmTypeTYPESONGTvDiscoverNewSongAndroidColorBlackTvDiscoverNewSongAndroidColorGray);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextSize(this.tvDiscoverNewSong, vmTypeTYPESONGTvDiscoverNewSongAndroidDimenSp15TvDiscoverNewSongAndroidDimenSp12);
            this.tvDiscoverNewSong.setTypeface(vmTypeTYPESONGTypefaceDefaultFromStyleTypefaceBOLDTypefaceDefaultFromStyleTypefaceNORMAL);
        }
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
                com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeAlbumOrSong();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.dailyRecommend();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeAlbumOrSong();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.radio();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.DiscoverFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.clickAlbumOrSongDetail();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.playListAdapter
        flag 1 (0x2L): vm.type
        flag 2 (0x3L): vm.currentAlbumOrSongLiveData
        flag 3 (0x4L): vm.bannersPic
        flag 4 (0x5L): vm
        flag 5 (0x6L): proxy
        flag 6 (0x7L): bannerListener
        flag 7 (0x8L): albumSongAdapter
        flag 8 (0x9L): null
        flag 9 (0xaL): vm.type.get() == TYPE.SONG ? @android:dimen/sp_12 : @android:dimen/sp_15
        flag 10 (0xbL): vm.type.get() == TYPE.SONG ? @android:dimen/sp_12 : @android:dimen/sp_15
        flag 11 (0xcL): vm.type.get() == TYPE.SONG ? @android:color/gray : @android:color/black
        flag 12 (0xdL): vm.type.get() == TYPE.SONG ? @android:color/gray : @android:color/black
        flag 13 (0xeL): vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.BOLD) : Typeface.defaultFromStyle(Typeface.NORMAL)
        flag 14 (0xfL): vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.BOLD) : Typeface.defaultFromStyle(Typeface.NORMAL)
        flag 15 (0x10L): vm.type.get() == TYPE.SONG ? @android:dimen/sp_15 : @android:dimen/sp_12
        flag 16 (0x11L): vm.type.get() == TYPE.SONG ? @android:dimen/sp_15 : @android:dimen/sp_12
        flag 17 (0x12L): vm.type.get() == TYPE.SONG ? @android:color/black : @android:color/gray
        flag 18 (0x13L): vm.type.get() == TYPE.SONG ? @android:color/black : @android:color/gray
        flag 19 (0x14L): vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.NORMAL) : Typeface.defaultFromStyle(Typeface.BOLD)
        flag 20 (0x15L): vm.type.get() == TYPE.SONG ? Typeface.defaultFromStyle(Typeface.NORMAL) : Typeface.defaultFromStyle(Typeface.BOLD)
        flag 21 (0x16L): vm.type.get() == TYPE.SONG ? "新歌推荐" : "更多新碟"
        flag 22 (0x17L): vm.type.get() == TYPE.SONG ? "新歌推荐" : "更多新碟"
    flag mapping end*/
    //end
}