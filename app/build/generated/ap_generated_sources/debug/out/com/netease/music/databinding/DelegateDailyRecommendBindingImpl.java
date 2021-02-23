package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateDailyRecommendBindingImpl extends DelegateDailyRecommendBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(17);
        sIncludes.setIncludes(8, 
            new String[] {"delegate_normal_loading"},
            new int[] {11},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.toolbar, 12);
        sViewsWithIds.put(R.id.rl_playall_top, 13);
        sViewsWithIds.put(R.id.iv_playall, 14);
        sViewsWithIds.put(R.id.tv_playall, 15);
        sViewsWithIds.put(R.id.tv_gap, 16);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView8;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback23;
    @Nullable
    private final android.view.View.OnClickListener mCallback24;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateDailyRecommendBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private DelegateDailyRecommendBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (com.google.android.material.appbar.AppBarLayout) bindings[1]
            , (android.widget.ImageView) bindings[6]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[14]
            , (android.widget.RelativeLayout) bindings[8]
            , (android.widget.RelativeLayout) bindings[9]
            , (android.widget.RelativeLayout) bindings[13]
            , (androidx.recyclerview.widget.RecyclerView) bindings[10]
            , (androidx.appcompat.widget.Toolbar) bindings[12]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[7]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[15]
            );
        this.appbar.setTag(null);
        this.imgDailyBack.setTag(null);
        this.ivBackground.setTag(null);
        this.ivBackgroundCover.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView8 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[11];
        setContainedBinding(this.mboundView8);
        this.rlPlay.setTag(null);
        this.rlPlayall.setTag(null);
        this.rvGedanDetailNormal.setTag(null);
        this.tvDay.setTag(null);
        this.tvLeftTitle.setTag(null);
        this.tvMonth.setTag(null);
        setRootTag(root);
        // listeners
        mCallback23 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback24 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
        }
        mboundView8.invalidateAll();
        requestRebind();
    }

    @Override
    public boolean hasPendingBindings() {
        synchronized(this) {
            if (mDirtyFlags != 0) {
                return true;
            }
        }
        if (mboundView8.hasPendingBindings()) {
            return true;
        }
        return false;
    }

    @Override
    public boolean setVariable(int variableId, @Nullable Object variable)  {
        boolean variableSet = true;
        if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.DailyRecommendViewModel) variable);
        }
        else if (BR.offsetListener == variableId) {
            setOffsetListener((com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.daily.DailyRecommendActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.DailyRecommendViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setOffsetListener(@Nullable com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener OffsetListener) {
        this.mOffsetListener = OffsetListener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.offsetListener);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.daily.DailyRecommendActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    public void setLifecycleOwner(@Nullable androidx.lifecycle.LifecycleOwner lifecycleOwner) {
        super.setLifecycleOwner(lifecycleOwner);
        mboundView8.setLifecycleOwner(lifecycleOwner);
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmLeftTitleVisiable((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeVmLeftTitleAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 2 :
                return onChangeVmTextAlpha((androidx.databinding.ObservableFloat) object, fieldId);
            case 3 :
                return onChangeVmDay((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmBackgroundImgUrl((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 5 :
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 6 :
                return onChangeVmCoverImgAlpha((androidx.databinding.ObservableInt) object, fieldId);
            case 7 :
                return onChangeVmMonth((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 8 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 9 :
                return onChangeVmBackgroundImgRadis((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLeftTitleVisiable(androidx.databinding.ObservableBoolean VmLeftTitleVisiable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLeftTitleAlpha(androidx.databinding.ObservableFloat VmLeftTitleAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTextAlpha(androidx.databinding.ObservableFloat VmTextAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmDay(androidx.databinding.ObservableField<java.lang.String> VmDay, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBackgroundImgUrl(androidx.databinding.ObservableField<java.lang.String> VmBackgroundImgUrl, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCoverImgAlpha(androidx.databinding.ObservableInt VmCoverImgAlpha, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmMonth(androidx.databinding.ObservableField<java.lang.String> VmMonth, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmBackgroundImgRadis(androidx.databinding.ObservableInt VmBackgroundImgRadis, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        androidx.databinding.ObservableBoolean vmLeftTitleVisiable = null;
        int vmBackgroundImgRadisGet = 0;
        java.lang.String javaLangStringVmMonth = null;
        com.netease.music.ui.state.DailyRecommendViewModel vm = mVm;
        androidx.databinding.ObservableFloat vmLeftTitleAlpha = null;
        com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener offsetListener = mOffsetListener;
        boolean vmLoadingVisible = false;
        float vmLeftTitleAlphaGet = 0f;
        androidx.databinding.ObservableFloat vmTextAlpha = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        com.netease.music.ui.page.discover.daily.DailyRecommendActivity.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableField<java.lang.String> vmDay = null;
        java.lang.String vmDayGet = null;
        float vmTextAlphaGet = 0f;
        androidx.databinding.ObservableField<java.lang.String> vmBackgroundImgUrl = null;
        java.lang.String vmMonthGet = null;
        androidx.databinding.ObservableBoolean VmLoadingVisible1 = null;
        java.lang.String vmBackgroundImgUrlGet = null;
        int vmCoverImgAlphaGet = 0;
        androidx.databinding.ObservableInt vmCoverImgAlpha = null;
        androidx.databinding.ObservableField<java.lang.String> vmMonth = null;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        boolean vmLeftTitleVisiableGet = false;
        androidx.databinding.ObservableInt vmBackgroundImgRadis = null;

        if ((dirtyFlags & 0x27ffL) != 0) {


            if ((dirtyFlags & 0x2401L) != 0) {

                    if (vm != null) {
                        // read vm.leftTitleVisiable
                        vmLeftTitleVisiable = vm.leftTitleVisiable;
                    }
                    updateRegistration(0, vmLeftTitleVisiable);


                    if (vmLeftTitleVisiable != null) {
                        // read vm.leftTitleVisiable.get()
                        vmLeftTitleVisiableGet = vmLeftTitleVisiable.get();
                    }
            }
            if ((dirtyFlags & 0x2402L) != 0) {

                    if (vm != null) {
                        // read vm.leftTitleAlpha
                        vmLeftTitleAlpha = vm.leftTitleAlpha;
                    }
                    updateRegistration(1, vmLeftTitleAlpha);


                    if (vmLeftTitleAlpha != null) {
                        // read vm.leftTitleAlpha.get()
                        vmLeftTitleAlphaGet = vmLeftTitleAlpha.get();
                    }
            }
            if ((dirtyFlags & 0x2404L) != 0) {

                    if (vm != null) {
                        // read vm.textAlpha
                        vmTextAlpha = vm.textAlpha;
                    }
                    updateRegistration(2, vmTextAlpha);


                    if (vmTextAlpha != null) {
                        // read vm.textAlpha.get()
                        vmTextAlphaGet = vmTextAlpha.get();
                    }
            }
            if ((dirtyFlags & 0x2408L) != 0) {

                    if (vm != null) {
                        // read vm.day
                        vmDay = vm.day;
                    }
                    updateRegistration(3, vmDay);


                    if (vmDay != null) {
                        // read vm.day.get()
                        vmDayGet = vmDay.get();
                    }
            }
            if ((dirtyFlags & 0x2610L) != 0) {

                    if (vm != null) {
                        // read vm.backgroundImgUrl
                        vmBackgroundImgUrl = vm.backgroundImgUrl;
                        // read vm.backgroundImgRadis
                        vmBackgroundImgRadis = vm.backgroundImgRadis;
                    }
                    updateRegistration(4, vmBackgroundImgUrl);
                    updateRegistration(9, vmBackgroundImgRadis);


                    if (vmBackgroundImgUrl != null) {
                        // read vm.backgroundImgUrl.get()
                        vmBackgroundImgUrlGet = vmBackgroundImgUrl.get();
                    }
                    if (vmBackgroundImgRadis != null) {
                        // read vm.backgroundImgRadis.get()
                        vmBackgroundImgRadisGet = vmBackgroundImgRadis.get();
                    }

                if ((dirtyFlags & 0x2410L) != 0) {
                }
            }
            if ((dirtyFlags & 0x2420L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        VmLoadingVisible1 = vm.loadingVisible;
                    }
                    updateRegistration(5, VmLoadingVisible1);


                    if (VmLoadingVisible1 != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = VmLoadingVisible1.get();
                    }


                    // read !vm.loadingVisible.get()
                    vmLoadingVisible = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x2440L) != 0) {

                    if (vm != null) {
                        // read vm.coverImgAlpha
                        vmCoverImgAlpha = vm.coverImgAlpha;
                    }
                    updateRegistration(6, vmCoverImgAlpha);


                    if (vmCoverImgAlpha != null) {
                        // read vm.coverImgAlpha.get()
                        vmCoverImgAlphaGet = vmCoverImgAlpha.get();
                    }
            }
            if ((dirtyFlags & 0x2480L) != 0) {

                    if (vm != null) {
                        // read vm.month
                        vmMonth = vm.month;
                    }
                    updateRegistration(7, vmMonth);


                    if (vmMonth != null) {
                        // read vm.month.get()
                        vmMonthGet = vmMonth.get();
                    }


                    // read ("/") + (vm.month.get())
                    javaLangStringVmMonth = ("/") + (vmMonthGet);
            }
            if ((dirtyFlags & 0x2500L) != 0) {

                    if (vm != null) {
                        // read vm.adapter
                        vmAdapter = vm.adapter;
                    }
                    updateRegistration(8, vmAdapter);


                    if (vmAdapter != null) {
                        // read vm.adapter.get()
                        vmAdapterGet = vmAdapter.get();
                    }
            }
        }
        if ((dirtyFlags & 0x2800L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.addOnOffsetChangedListener(this.appbar, offsetListener);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgDailyBack, mCallback23);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.rlPlayall, mCallback24);
        }
        if ((dirtyFlags & 0x2610L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForImageView(this.ivBackground, vmBackgroundImgUrlGet, vmBackgroundImgRadisGet);
        }
        if ((dirtyFlags & 0x2440L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setImageViewAlpha(this.ivBackgroundCover, vmCoverImgAlphaGet);
        }
        if ((dirtyFlags & 0x2410L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForView(this.ivBackgroundCover, vmBackgroundImgUrlGet, (android.graphics.drawable.Drawable)null);
        }
        if ((dirtyFlags & 0x2420L) != 0) {
            // api target 1

            this.mboundView8.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView8.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvGedanDetailNormal, vmLoadingVisible);
        }
        if ((dirtyFlags & 0x2500L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvGedanDetailNormal, vmAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x2408L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvDay, vmDayGet);
        }
        if ((dirtyFlags & 0x2404L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setAlpha(this.tvDay, vmTextAlphaGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setAlpha(this.tvMonth, vmTextAlphaGet);
        }
        if ((dirtyFlags & 0x2402L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setAlpha(this.tvLeftTitle, vmLeftTitleAlphaGet);
        }
        if ((dirtyFlags & 0x2401L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.tvLeftTitle, vmLeftTitleVisiableGet);
        }
        if ((dirtyFlags & 0x2480L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMonth, javaLangStringVmMonth);
        }
        executeBindingsOn(mboundView8);
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
                com.netease.music.ui.page.discover.daily.DailyRecommendActivity.ClickProxy proxy = mProxy;



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
                com.netease.music.ui.page.discover.daily.DailyRecommendActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.playAll();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.leftTitleVisiable
        flag 1 (0x2L): vm.leftTitleAlpha
        flag 2 (0x3L): vm.textAlpha
        flag 3 (0x4L): vm.day
        flag 4 (0x5L): vm.backgroundImgUrl
        flag 5 (0x6L): vm.loadingVisible
        flag 6 (0x7L): vm.coverImgAlpha
        flag 7 (0x8L): vm.month
        flag 8 (0x9L): vm.adapter
        flag 9 (0xaL): vm.backgroundImgRadis
        flag 10 (0xbL): vm
        flag 11 (0xcL): offsetListener
        flag 12 (0xdL): proxy
        flag 13 (0xeL): null
    flag mapping end*/
    //end
}