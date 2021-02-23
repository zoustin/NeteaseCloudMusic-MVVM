package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateRadioPayBindingImpl extends DelegateRadioPayBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(0, 
            new String[] {"delegate_normal_loading"},
            new int[] {3},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView01;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback29;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateRadioPayBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private DelegateRadioPayBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.imgRadioPayBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[3];
        setContainedBinding(this.mboundView01);
        this.rvRadioPayNormal.setTag(null);
        setRootTag(root);
        // listeners
        mCallback29 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setVm((com.netease.music.ui.state.RadioPayViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.radio.RadioPayActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.RadioPayViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.radio.RadioPayActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.proxy);
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
                return onChangeVmRadioList((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjPaygiftBean.DataBean.ListBean>>) object, fieldId);
            case 1 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmRadioList(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjPaygiftBean.DataBean.ListBean>> VmRadioList, int fieldId) {
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
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
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
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjPaygiftBean.DataBean.ListBean>> vmRadioList = null;
        java.util.List<com.netease.lib_api.model.dj.DjPaygiftBean.DataBean.ListBean> vmRadioListGet = null;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        com.netease.music.ui.state.RadioPayViewModel vm = mVm;
        boolean VmLoadingVisible1 = false;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        com.netease.music.ui.page.discover.radio.RadioPayActivity.ClickProxy proxy = mProxy;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.radioList
                        vmRadioList = vm.radioList;
                    }
                    updateRegistration(0, vmRadioList);


                    if (vmRadioList != null) {
                        // read vm.radioList.get()
                        vmRadioListGet = vmRadioList.get();
                    }
            }
            if ((dirtyFlags & 0x2aL) != 0) {

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
            if ((dirtyFlags & 0x2cL) != 0) {

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
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgRadioPayBack, mCallback29);
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            this.mboundView01.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView01.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvRadioPayNormal, VmLoadingVisible1);
        }
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerAddData(this.rvRadioPayNormal, vmRadioListGet);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvRadioPayNormal, vmAdapterGet, (boolean)false);
        }
        executeBindingsOn(mboundView01);
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // proxy != null
        boolean proxyJavaLangObjectNull = false;
        // proxy
        com.netease.music.ui.page.discover.radio.RadioPayActivity.ClickProxy proxy = mProxy;



        proxyJavaLangObjectNull = (proxy) != (null);
        if (proxyJavaLangObjectNull) {


            proxy.back();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.radioList
        flag 1 (0x2L): vm.loadingVisible
        flag 2 (0x3L): vm.adapter
        flag 3 (0x4L): vm
        flag 4 (0x5L): proxy
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}