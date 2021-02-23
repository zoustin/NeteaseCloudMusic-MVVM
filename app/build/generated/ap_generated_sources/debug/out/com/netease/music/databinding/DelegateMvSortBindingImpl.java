package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateMvSortBindingImpl extends DelegateMvSortBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(7);
        sIncludes.setIncludes(0, 
            new String[] {"delegate_normal_loading"},
            new int[] {5},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_tab_search, 6);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView01;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback62;
    @Nullable
    private final android.view.View.OnClickListener mCallback63;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateMvSortBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 7, sIncludes, sViewsWithIds));
    }
    private DelegateMvSortBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 5
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.imgTabBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[5];
        setContainedBinding(this.mboundView01);
        this.rvMvSort.setTag(null);
        this.tvMvSortDialog.setTag(null);
        this.tvMvSortTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback62 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback63 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x100L;
        }
        mboundView01.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView01.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.MvSortViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.video.mv.MvSortActivity.ClickProxy) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.chad.library.adapter.base.BaseQuickAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.MvSortViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.video.mv.MvSortActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x40L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.chad.library.adapter.base.BaseQuickAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmArea((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmOrder((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmData((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.MvBean.MvDetailBean>>) object, fieldId);
            case 3 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 4 :
                return onChangeVmType((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmArea(androidx.databinding.ObservableField<java.lang.String> VmArea, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmOrder(androidx.databinding.ObservableField<java.lang.String> VmOrder, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmData(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.MvBean.MvDetailBean>> VmData, int fieldId) {
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
    private boolean onChangeVmType(androidx.databinding.ObservableField<java.lang.String> VmType, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
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
        androidx.databinding.ObservableField<java.lang.String> vmArea = null;
        java.util.List<com.netease.lib_api.model.mv.MvBean.MvDetailBean> vmDataGet = null;
        java.lang.String vmOrderGet = null;
        java.lang.String vmAreaJavaLangStringVmTypeJavaLangString = null;
        java.lang.String vmAreaGet = null;
        com.netease.music.ui.state.MvSortViewModel vm = mVm;
        java.lang.String vmTypeGet = null;
        boolean vmLoadingVisible = false;
        com.netease.music.ui.page.video.mv.MvSortActivity.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableField<java.lang.String> vmOrder = null;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.MvBean.MvDetailBean>> vmData = null;
        androidx.databinding.ObservableBoolean VmLoadingVisible1 = null;
        com.chad.library.adapter.base.BaseQuickAdapter<?,? extends com.chad.library.adapter.base.viewholder.BaseViewHolder> adapter = mAdapter;
        androidx.databinding.ObservableField<java.lang.String> vmType = null;
        java.lang.String vmAreaJavaLangString = null;
        boolean vmLoadingVisibleGet = false;
        java.lang.String vmAreaJavaLangStringVmType = null;
        java.lang.String vmAreaJavaLangStringVmTypeJavaLangStringVmOrder = null;

        if ((dirtyFlags & 0x13fL) != 0) {


            if ((dirtyFlags & 0x133L) != 0) {

                    if (vm != null) {
                        // read vm.area
                        vmArea = vm.area;
                        // read vm.order
                        vmOrder = vm.order;
                        // read vm.type
                        vmType = vm.type;
                    }
                    updateRegistration(0, vmArea);
                    updateRegistration(1, vmOrder);
                    updateRegistration(4, vmType);


                    if (vmArea != null) {
                        // read vm.area.get()
                        vmAreaGet = vmArea.get();
                    }
                    if (vmOrder != null) {
                        // read vm.order.get()
                        vmOrderGet = vmOrder.get();
                    }
                    if (vmType != null) {
                        // read vm.type.get()
                        vmTypeGet = vmType.get();
                    }


                    // read (vm.area.get()) + ("•")
                    vmAreaJavaLangString = (vmAreaGet) + ("•");


                    // read ((vm.area.get()) + ("•")) + (vm.type.get())
                    vmAreaJavaLangStringVmType = (vmAreaJavaLangString) + (vmTypeGet);


                    // read (((vm.area.get()) + ("•")) + (vm.type.get())) + ("•")
                    vmAreaJavaLangStringVmTypeJavaLangString = (vmAreaJavaLangStringVmType) + ("•");


                    // read ((((vm.area.get()) + ("•")) + (vm.type.get())) + ("•")) + (vm.order.get())
                    vmAreaJavaLangStringVmTypeJavaLangStringVmOrder = (vmAreaJavaLangStringVmTypeJavaLangString) + (vmOrderGet);
            }
            if ((dirtyFlags & 0x124L) != 0) {

                    if (vm != null) {
                        // read vm.data
                        vmData = vm.data;
                    }
                    updateRegistration(2, vmData);


                    if (vmData != null) {
                        // read vm.data.get()
                        vmDataGet = vmData.get();
                    }
            }
            if ((dirtyFlags & 0x128L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        VmLoadingVisible1 = vm.loadingVisible;
                    }
                    updateRegistration(3, VmLoadingVisible1);


                    if (VmLoadingVisible1 != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = VmLoadingVisible1.get();
                    }


                    // read !vm.loadingVisible.get()
                    vmLoadingVisible = !vmLoadingVisibleGet;
            }
        }
        if ((dirtyFlags & 0x180L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x100L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgTabBack, mCallback62);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvMvSortDialog, mCallback63);
        }
        if ((dirtyFlags & 0x128L) != 0) {
            // api target 1

            this.mboundView01.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView01.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvMvSort, vmLoadingVisible);
        }
        if ((dirtyFlags & 0x124L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvMvSort, vmDataGet);
        }
        if ((dirtyFlags & 0x180L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithGridLayoutManager(this.rvMvSort, adapter, 2);
        }
        if ((dirtyFlags & 0x133L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMvSortTitle, vmAreaJavaLangStringVmTypeJavaLangStringVmOrder);
        }
        executeBindingsOn(mboundView01);
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
                com.netease.music.ui.page.video.mv.MvSortActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.video.mv.MvSortActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.showSortDialog();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.area
        flag 1 (0x2L): vm.order
        flag 2 (0x3L): vm.data
        flag 3 (0x4L): vm.loadingVisible
        flag 4 (0x5L): vm.type
        flag 5 (0x6L): vm
        flag 6 (0x7L): proxy
        flag 7 (0x8L): adapter
        flag 8 (0x9L): null
    flag mapping end*/
    //end
}