package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateGedanDetailCommentBindingImpl extends DelegateGedanDetailCommentBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(12);
        sIncludes.setIncludes(3, 
            new String[] {"delegate_normal_loading"},
            new int[] {10},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_tab_more, 11);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView3;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView31;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView9;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback6;
    @Nullable
    private final android.view.View.OnClickListener mCallback7;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateGedanDetailCommentBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 12, sIncludes, sViewsWithIds));
    }
    private DelegateGedanDetailCommentBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[11]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[5]
            , (android.widget.RelativeLayout) bindings[4]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[7]
            );
        this.imgGedanCommentBack.setTag(null);
        this.ivAlbumRightFlag.setTag(null);
        this.ivGedanDetailCommentImg.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.LinearLayout) bindings[3];
        this.mboundView3.setTag(null);
        this.mboundView31 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[10];
        setContainedBinding(this.mboundView31);
        this.mboundView9 = (androidx.recyclerview.widget.RecyclerView) bindings[9];
        this.mboundView9.setTag(null);
        this.rlGedanCommentHeader.setTag(null);
        this.tvGedanDetailCommentCreator.setTag(null);
        this.tvGedanDetailCommentNum.setTag(null);
        this.tvGedanDetailCommentTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback6 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback7 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setVm((com.netease.music.ui.state.CommentViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.square.detail.CommentActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.CommentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.square.detail.CommentActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
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
                return onChangeVmImgUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmCommentSize((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeVmTitile((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 3 :
                return onChangeVmCreateor((androidx.databinding.ObservableField<java.lang.CharSequence>) object, fieldId);
            case 4 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeVmType((androidx.databinding.ObservableField<com.netease.music.data.config.TYPE>) object, fieldId);
            case 6 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmImgUrl(androidx.databinding.ObservableField<java.lang.String> VmImgUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCommentSize(androidx.databinding.ObservableInt VmCommentSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTitile(androidx.databinding.ObservableField<java.lang.String> VmTitile, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCreateor(androidx.databinding.ObservableField<java.lang.CharSequence> VmCreateor, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmType(androidx.databinding.ObservableField<com.netease.music.data.config.TYPE> VmType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdapter, int fieldId) {
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
        androidx.databinding.ObservableField<java.lang.String> vmImgUrl = null;
        com.netease.music.ui.state.CommentViewModel vm = mVm;
        com.netease.music.data.config.TYPE vmTypeGet = null;
        boolean vmTypeTYPEALBUM = false;
        boolean vmLoadingVisible = false;
        androidx.databinding.ObservableInt vmCommentSize = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        com.netease.music.ui.page.discover.square.detail.CommentActivity.ClickProxy proxy = mProxy;
        java.lang.String javaLangStringVmCommentSizeJavaLangString = null;
        androidx.databinding.ObservableField<java.lang.String> vmTitile = null;
        androidx.databinding.ObservableField<java.lang.CharSequence> vmCreateor = null;
        androidx.databinding.ObservableBoolean VmLoadingVisible1 = null;
        int vmCommentSizeGet = 0;
        java.lang.String vmTitileGet = null;
        androidx.databinding.ObservableField<com.netease.music.data.config.TYPE> vmType = null;
        java.lang.String vmImgUrlGet = null;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        java.lang.CharSequence vmCreateorGet = null;
        java.lang.String javaLangStringVmCommentSize = null;

        if ((dirtyFlags & 0x2ffL) != 0) {


            if ((dirtyFlags & 0x281L) != 0) {

                    if (vm != null) {
                        // read vm.imgUrl
                        vmImgUrl = vm.imgUrl;
                    }
                    updateRegistration(0, vmImgUrl);


                    if (vmImgUrl != null) {
                        // read vm.imgUrl.get()
                        vmImgUrlGet = vmImgUrl.get();
                    }
            }
            if ((dirtyFlags & 0x282L) != 0) {

                    if (vm != null) {
                        // read vm.commentSize
                        vmCommentSize = vm.commentSize;
                    }
                    updateRegistration(1, vmCommentSize);


                    if (vmCommentSize != null) {
                        // read vm.commentSize.get()
                        vmCommentSizeGet = vmCommentSize.get();
                    }


                    // read ("评论(") + (vm.commentSize.get())
                    javaLangStringVmCommentSize = ("评论(") + (vmCommentSizeGet);


                    // read (("评论(") + (vm.commentSize.get())) + (")")
                    javaLangStringVmCommentSizeJavaLangString = (javaLangStringVmCommentSize) + (")");
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (vm != null) {
                        // read vm.titile
                        vmTitile = vm.titile;
                    }
                    updateRegistration(2, vmTitile);


                    if (vmTitile != null) {
                        // read vm.titile.get()
                        vmTitileGet = vmTitile.get();
                    }
            }
            if ((dirtyFlags & 0x288L) != 0) {

                    if (vm != null) {
                        // read vm.createor
                        vmCreateor = vm.createor;
                    }
                    updateRegistration(3, vmCreateor);


                    if (vmCreateor != null) {
                        // read vm.createor.get()
                        vmCreateorGet = vmCreateor.get();
                    }
            }
            if ((dirtyFlags & 0x290L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        VmLoadingVisible1 = vm.loadingVisible;
                    }
                    updateRegistration(4, VmLoadingVisible1);


                    if (VmLoadingVisible1 != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = VmLoadingVisible1.get();
                    }


                    // read !vm.loadingVisible.get()
                    vmLoadingVisible = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (vm != null) {
                        // read vm.type
                        vmType = vm.type;
                    }
                    updateRegistration(5, vmType);


                    if (vmType != null) {
                        // read vm.type.get()
                        vmTypeGet = vmType.get();
                    }


                    // read vm.type.get() == TYPE.ALBUM
                    vmTypeTYPEALBUM = (vmTypeGet) == (com.netease.music.data.config.TYPE.ALBUM);
            }
            if ((dirtyFlags & 0x2c0L) != 0) {

                    if (vm != null) {
                        // read vm.adapter
                        vmAdapter = vm.adapter;
                    }
                    updateRegistration(6, vmAdapter);


                    if (vmAdapter != null) {
                        // read vm.adapter.get()
                        vmAdapterGet = vmAdapter.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgGedanCommentBack, mCallback6);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.rlGedanCommentHeader, mCallback7);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.ivAlbumRightFlag, vmTypeTYPEALBUM);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCorner(this.ivGedanDetailCommentImg, vmImgUrlGet, (int)0);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            this.mboundView31.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView31.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView9, vmLoadingVisible);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.mboundView9, vmAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCommentCreator, vmCreateorGet);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCommentNum, javaLangStringVmCommentSizeJavaLangString);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvGedanDetailCommentTitle, vmTitileGet);
        }
        executeBindingsOn(mboundView31);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.square.detail.CommentActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.discover.square.detail.CommentActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.back();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.imgUrl
        flag 1 (0x2L): vm.commentSize
        flag 2 (0x3L): vm.titile
        flag 3 (0x4L): vm.createor
        flag 4 (0x5L): vm.loadingVisible
        flag 5 (0x6L): vm.type
        flag 6 (0x7L): vm.adapter
        flag 7 (0x8L): vm
        flag 8 (0x9L): proxy
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}