package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateMineBindingImpl extends DelegateMineBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(24);
        sIncludes.setIncludes(1, 
            new String[] {"delegate_normal_loading"},
            new int[] {9},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.rv_spec_mine, 10);
        sViewsWithIds.put(R.id.fragment_main_item_img, 11);
        sViewsWithIds.put(R.id.fragment_main_item_title, 12);
        sViewsWithIds.put(R.id.fragment_main_item_img1, 13);
        sViewsWithIds.put(R.id.fragment_main_item_title1, 14);
        sViewsWithIds.put(R.id.fragment_main_item_img2, 15);
        sViewsWithIds.put(R.id.fragment_main_item_title2, 16);
        sViewsWithIds.put(R.id.fragment_main_item_count2, 17);
        sViewsWithIds.put(R.id.fragment_main_item_img3, 18);
        sViewsWithIds.put(R.id.fragment_main_item_title3, 19);
        sViewsWithIds.put(R.id.fragment_main_item_radio_count, 20);
        sViewsWithIds.put(R.id.fragment_main_item_im5, 21);
        sViewsWithIds.put(R.id.fragment_main_item_titl5, 22);
        sViewsWithIds.put(R.id.fragment_main_item_collect_count, 23);
    }
    // views
    @NonNull
    private final androidx.core.widget.NestedScrollView mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView1;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView11;
    @NonNull
    private final android.widget.LinearLayout mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback21;
    @Nullable
    private final android.view.View.OnClickListener mCallback19;
    @Nullable
    private final android.view.View.OnClickListener mCallback20;
    @Nullable
    private final android.view.View.OnClickListener mCallback22;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateMineBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 24, sIncludes, sViewsWithIds));
    }
    private DelegateMineBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (android.widget.TextView) bindings[23]
            , (android.widget.TextView) bindings[17]
            , (android.widget.ImageView) bindings[21]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[13]
            , (android.widget.ImageView) bindings[15]
            , (android.widget.ImageView) bindings[18]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[22]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[19]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[2]
            , (android.widget.LinearLayout) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            );
        this.fragmentMainItemLatelyCount.setTag(null);
        this.fragmentMainItemLocalmusicCount.setTag(null);
        this.llMineCollect.setTag(null);
        this.llMineLocalMusic.setTag(null);
        this.llMineRadio.setTag(null);
        this.mboundView0 = (androidx.core.widget.NestedScrollView) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.LinearLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[9];
        setContainedBinding(this.mboundView11);
        this.mboundView4 = (android.widget.LinearLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.rvMineCreateGedan.setTag(null);
        setRootTag(root);
        // listeners
        mCallback21 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback19 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback20 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback22 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
        }
        mboundView11.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView11.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.MineViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.mine.MineFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.MineViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.mine.MineFragment.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView11.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmPlaylistAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 1 :
                return onChangeVmRecentPlaySongSize((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeVmLocalMusicSize((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmPlaylistAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmPlaylistAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmRecentPlaySongSize(androidx.databinding.ObservableInt VmRecentPlaySongSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLocalMusicSize(androidx.databinding.ObservableInt VmLocalMusicSize, int fieldId) {
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
        com.netease.music.ui.state.MineViewModel vm = mVm;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmPlaylistAdapter = null;
        java.lang.String javaLangStringVmLocalMusicSize = null;
        boolean vmLoadingVisible = false;
        com.netease.music.ui.page.mine.MineFragment.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableInt vmRecentPlaySongSize = null;
        int vmRecentPlaySongSizeGet = 0;
        java.lang.String javaLangStringVmLocalMusicSizeJavaLangString = null;
        int vmLocalMusicSizeGet = 0;
        java.lang.String javaLangStringVmRecentPlaySongSizeJavaLangString = null;
        androidx.databinding.ObservableBoolean VmLoadingVisible1 = null;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableInt vmLocalMusicSize = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmPlaylistAdapterGet = null;
        java.lang.String javaLangStringVmRecentPlaySongSize = null;

        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (vm != null) {
                        // read vm.playlistAdapter
                        vmPlaylistAdapter = vm.playlistAdapter;
                    }
                    updateRegistration(0, vmPlaylistAdapter);


                    if (vmPlaylistAdapter != null) {
                        // read vm.playlistAdapter.get()
                        vmPlaylistAdapterGet = vmPlaylistAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.recentPlaySongSize
                        vmRecentPlaySongSize = vm.recentPlaySongSize;
                    }
                    updateRegistration(1, vmRecentPlaySongSize);


                    if (vmRecentPlaySongSize != null) {
                        // read vm.recentPlaySongSize.get()
                        vmRecentPlaySongSizeGet = vmRecentPlaySongSize.get();
                    }


                    // read ("(") + (vm.recentPlaySongSize.get())
                    javaLangStringVmRecentPlaySongSize = ("(") + (vmRecentPlaySongSizeGet);


                    // read (("(") + (vm.recentPlaySongSize.get())) + (")")
                    javaLangStringVmRecentPlaySongSizeJavaLangString = (javaLangStringVmRecentPlaySongSize) + (")");
            }
            if ((dirtyFlags & 0x54L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        VmLoadingVisible1 = vm.loadingVisible;
                    }
                    updateRegistration(2, VmLoadingVisible1);


                    if (VmLoadingVisible1 != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = VmLoadingVisible1.get();
                    }


                    // read !vm.loadingVisible.get()
                    vmLoadingVisible = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x58L) != 0) {

                    if (vm != null) {
                        // read vm.localMusicSize
                        vmLocalMusicSize = vm.localMusicSize;
                    }
                    updateRegistration(3, vmLocalMusicSize);


                    if (vmLocalMusicSize != null) {
                        // read vm.localMusicSize.get()
                        vmLocalMusicSizeGet = vmLocalMusicSize.get();
                    }


                    // read ("(") + (vm.localMusicSize.get())
                    javaLangStringVmLocalMusicSize = ("(") + (vmLocalMusicSizeGet);


                    // read (("(") + (vm.localMusicSize.get())) + (")")
                    javaLangStringVmLocalMusicSizeJavaLangString = (javaLangStringVmLocalMusicSize) + (")");
            }
        }
        // batch finished
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentMainItemLatelyCount, javaLangStringVmRecentPlaySongSizeJavaLangString);
        }
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.fragmentMainItemLocalmusicCount, javaLangStringVmLocalMusicSizeJavaLangString);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llMineCollect, mCallback22);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llMineLocalMusic, mCallback19);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llMineRadio, mCallback21);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.mboundView4, mCallback20);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            this.mboundView11.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView11.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvMineCreateGedan, vmLoadingVisible);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvMineCreateGedan, vmPlaylistAdapterGet, (boolean)false);
        }
        executeBindingsOn(mboundView11);
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
                com.netease.music.ui.page.mine.MineFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.myRadio();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.mine.MineFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.localMusic();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.mine.MineFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.recentPlay();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.mine.MineFragment.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.myCollect();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.playlistAdapter
        flag 1 (0x2L): vm.recentPlaySongSize
        flag 2 (0x3L): vm.loadingVisible
        flag 3 (0x4L): vm.localMusicSize
        flag 4 (0x5L): vm
        flag 5 (0x6L): proxy
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}