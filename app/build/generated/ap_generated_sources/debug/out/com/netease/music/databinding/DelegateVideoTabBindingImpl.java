package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateVideoTabBindingImpl extends DelegateVideoTabBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateVideoTabBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private DelegateVideoTabBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (net.lucode.hackware.magicindicator.MagicIndicator) bindings[1]
            , (androidx.viewpager.widget.ViewPager) bindings[2]
            );
        this.magicIndicatorTab.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.viewPagerTab.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x8L;
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
            setVm((com.netease.music.ui.state.VideoTabViewModel) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.VideoTabViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmIndicatorTitle((androidx.databinding.ObservableField<java.lang.String[]>) object, fieldId);
            case 1 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<androidx.fragment.app.FragmentPagerAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmIndicatorTitle(androidx.databinding.ObservableField<java.lang.String[]> VmIndicatorTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<androidx.fragment.app.FragmentPagerAdapter> VmAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
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
        com.netease.music.ui.state.VideoTabViewModel vm = mVm;
        androidx.databinding.ObservableField<java.lang.String[]> vmIndicatorTitle = null;
        java.lang.String[] vmIndicatorTitleGet = null;
        androidx.databinding.ObservableField<androidx.fragment.app.FragmentPagerAdapter> vmAdapter = null;
        androidx.fragment.app.FragmentPagerAdapter vmAdapterGet = null;

        if ((dirtyFlags & 0xfL) != 0) {


            if ((dirtyFlags & 0xdL) != 0) {

                    if (vm != null) {
                        // read vm.indicatorTitle
                        vmIndicatorTitle = vm.indicatorTitle;
                    }
                    updateRegistration(0, vmIndicatorTitle);


                    if (vmIndicatorTitle != null) {
                        // read vm.indicatorTitle.get()
                        vmIndicatorTitleGet = vmIndicatorTitle.get();
                    }
            }
            if ((dirtyFlags & 0xeL) != 0) {

                    if (vm != null) {
                        // read vm.adapter
                        vmAdapter = vm.adapter;
                    }
                    updateRegistration(1, vmAdapter);


                    if (vmAdapter != null) {
                        // read vm.adapter.get()
                        vmAdapterGet = vmAdapter.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0xdL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.MagicIndicatorBindingAdapter.bindCommonMagicIndocator(this.magicIndicatorTab, vmIndicatorTitleGet);
        }
        if ((dirtyFlags & 0xeL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setViewPagerAdapter(this.viewPagerTab, vmAdapterGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.indicatorTitle
        flag 1 (0x2L): vm.adapter
        flag 2 (0x3L): vm
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}