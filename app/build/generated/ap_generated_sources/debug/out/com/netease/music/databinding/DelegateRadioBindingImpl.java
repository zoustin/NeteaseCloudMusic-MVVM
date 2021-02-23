package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateRadioBindingImpl extends DelegateRadioBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(20);
        sIncludes.setIncludes(0, 
            new String[] {"delegate_normal_loading"},
            new int[] {7},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.ll_radio_sort, 8);
        sViewsWithIds.put(R.id.iv_mine_spec, 9);
        sViewsWithIds.put(R.id.tv_spec_name, 10);
        sViewsWithIds.put(R.id.ll_radio_rank, 11);
        sViewsWithIds.put(R.id.iv_mine_spec1, 12);
        sViewsWithIds.put(R.id.tv_spec_name1, 13);
        sViewsWithIds.put(R.id.iv_mine_spec2, 14);
        sViewsWithIds.put(R.id.tv_spec_name2, 15);
        sViewsWithIds.put(R.id.ll_discover_radio, 16);
        sViewsWithIds.put(R.id.iv_mine_spec3, 17);
        sViewsWithIds.put(R.id.tv_spec_name3, 18);
        sViewsWithIds.put(R.id.ll_radio_recommend_header, 19);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView01;
    @NonNull
    private final android.widget.RelativeLayout mboundView4;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback39;
    @Nullable
    private final android.view.View.OnClickListener mCallback37;
    @Nullable
    private final android.view.View.OnClickListener mCallback38;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateRadioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private DelegateRadioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 4
            , (com.bigkoo.convenientbanner.ConvenientBanner) bindings[2]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.ImageView) bindings[12]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.ImageView) bindings[17]
            , (android.widget.LinearLayout) bindings[16]
            , (android.widget.LinearLayout) bindings[3]
            , (android.widget.LinearLayout) bindings[11]
            , (android.widget.LinearLayout) bindings[19]
            , (android.widget.LinearLayout) bindings[8]
            , (androidx.recyclerview.widget.RecyclerView) bindings[6]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[10]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[18]
            );
        this.bannerRadioRecyclerItem.setTag(null);
        this.imgRadioBack.setTag(null);
        this.llRadioPay.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView01 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[7];
        setContainedBinding(this.mboundView01);
        this.mboundView4 = (android.widget.RelativeLayout) bindings[4];
        this.mboundView4.setTag(null);
        this.rvRadioLoading.setTag(null);
        this.tvRadioRecommendHeaderChange.setTag(null);
        setRootTag(root);
        // listeners
        mCallback39 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback37 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback38 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setVm((com.netease.music.ui.state.RadioViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.RadioViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy Proxy) {
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
        mboundView01.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCurrentRecommendRadio((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjRecommendBean.DjRadiosBean>>) object, fieldId);
            case 1 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 3 :
                return onChangeVmBannersPic((androidx.databinding.ObservableField<java.util.List<java.lang.String>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCurrentRecommendRadio(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjRecommendBean.DjRadiosBean>> VmCurrentRecommendRadio, int fieldId) {
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
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjRecommendBean.DjRadiosBean>> vmCurrentRecommendRadio = null;
        com.netease.music.ui.state.RadioViewModel vm = mVm;
        java.util.List<com.netease.lib_api.model.dj.DjRecommendBean.DjRadiosBean> vmCurrentRecommendRadioGet = null;
        boolean vmLoadingVisible = false;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableBoolean VmLoadingVisible1 = null;
        java.util.List<java.lang.String> vmBannersPicGet = null;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        androidx.databinding.ObservableField<java.util.List<java.lang.String>> vmBannersPic = null;

        if ((dirtyFlags & 0x5fL) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (vm != null) {
                        // read vm.currentRecommendRadio
                        vmCurrentRecommendRadio = vm.currentRecommendRadio;
                    }
                    updateRegistration(0, vmCurrentRecommendRadio);


                    if (vmCurrentRecommendRadio != null) {
                        // read vm.currentRecommendRadio.get()
                        vmCurrentRecommendRadioGet = vmCurrentRecommendRadio.get();
                    }
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        VmLoadingVisible1 = vm.loadingVisible;
                    }
                    updateRegistration(1, VmLoadingVisible1);


                    if (VmLoadingVisible1 != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = VmLoadingVisible1.get();
                    }


                    // read !vm.loadingVisible.get()
                    vmLoadingVisible = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x54L) != 0) {

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
            if ((dirtyFlags & 0x58L) != 0) {

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
        // batch finished
        if ((dirtyFlags & 0x58L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setDefault(this.bannerRadioRecyclerItem, vmBannersPicGet, (com.bigkoo.convenientbanner.listener.OnItemClickListener)null);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgRadioBack, mCallback37);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llRadioPay, mCallback38);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvRadioRecommendHeaderChange, mCallback39);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            this.mboundView01.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView01.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView4, vmLoadingVisible);
        }
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvRadioLoading, vmCurrentRecommendRadioGet);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithGridLayoutManager(this.rvRadioLoading, vmAdapterGet, (int)0);
        }
        executeBindingsOn(mboundView01);
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
                com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeRecommendData();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.discover.radio.RadioActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.vip();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.currentRecommendRadio
        flag 1 (0x2L): vm.loadingVisible
        flag 2 (0x3L): vm.adapter
        flag 3 (0x4L): vm.bannersPic
        flag 4 (0x5L): vm
        flag 5 (0x6L): proxy
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}