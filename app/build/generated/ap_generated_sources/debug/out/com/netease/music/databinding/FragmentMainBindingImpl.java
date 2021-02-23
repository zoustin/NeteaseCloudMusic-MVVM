package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentMainBindingImpl extends FragmentMainBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.content_layout, 5);
        sViewsWithIds.put(R.id.title_layout, 6);
        sViewsWithIds.put(R.id.bottom_view, 7);
    }
    // views
    @NonNull
    private final androidx.coordinatorlayout.widget.CoordinatorLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback65;
    @Nullable
    private final android.view.View.OnClickListener mCallback64;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentMainBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 8, sIncludes, sViewsWithIds));
    }
    private FragmentMainBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.netease.music.ui.page.audio.BottomMusicView) bindings[7]
            , (android.widget.RelativeLayout) bindings[5]
            , (net.lucode.hackware.magicindicator.MagicIndicator) bindings[3]
            , (android.widget.TextView) bindings[2]
            , (android.widget.RelativeLayout) bindings[6]
            , (android.widget.TextView) bindings[1]
            , (androidx.viewpager.widget.ViewPager) bindings[4]
            );
        this.magicIndicator.setTag(null);
        this.mboundView0 = (androidx.coordinatorlayout.widget.CoordinatorLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.searchView.setTag(null);
        this.toggleView.setTag(null);
        this.viewPager.setTag(null);
        setRootTag(root);
        // listeners
        mCallback65 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback64 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x40L;
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
            setVm((com.netease.music.ui.state.MainViewModel) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((androidx.fragment.app.FragmentPagerAdapter) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.netease.music.ui.page.MainFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.MainViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setAdapter(@Nullable androidx.fragment.app.FragmentPagerAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setClick(@Nullable com.netease.music.ui.page.MainFragment.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCurrentItem((androidx.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeVmChannelArray((androidx.databinding.ObservableField<com.netease.music.data.config.CHANNEL[]>) object, fieldId);
            case 2 :
                return onChangeVmLimit((androidx.databinding.ObservableInt) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCurrentItem(androidx.databinding.ObservableInt VmCurrentItem, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmChannelArray(androidx.databinding.ObservableField<com.netease.music.data.config.CHANNEL[]> VmChannelArray, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLimit(androidx.databinding.ObservableInt VmLimit, int fieldId) {
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
        com.netease.music.data.config.CHANNEL[] vmChannelArrayGet = null;
        androidx.databinding.ObservableInt vmCurrentItem = null;
        androidx.databinding.ObservableField<com.netease.music.data.config.CHANNEL[]> vmChannelArray = null;
        int vmLimitGet = 0;
        com.netease.music.ui.state.MainViewModel vm = mVm;
        int vmCurrentItemGet = 0;
        androidx.fragment.app.FragmentPagerAdapter adapter = mAdapter;
        com.netease.music.ui.page.MainFragment.ClickProxy click = mClick;
        androidx.databinding.ObservableInt vmLimit = null;

        if ((dirtyFlags & 0x4fL) != 0) {


            if ((dirtyFlags & 0x49L) != 0) {

                    if (vm != null) {
                        // read vm.currentItem
                        vmCurrentItem = vm.currentItem;
                    }
                    updateRegistration(0, vmCurrentItem);


                    if (vmCurrentItem != null) {
                        // read vm.currentItem.get()
                        vmCurrentItemGet = vmCurrentItem.get();
                    }
            }
            if ((dirtyFlags & 0x4aL) != 0) {

                    if (vm != null) {
                        // read vm.channelArray
                        vmChannelArray = vm.channelArray;
                    }
                    updateRegistration(1, vmChannelArray);


                    if (vmChannelArray != null) {
                        // read vm.channelArray.get()
                        vmChannelArrayGet = vmChannelArray.get();
                    }
            }
            if ((dirtyFlags & 0x4cL) != 0) {

                    if (vm != null) {
                        // read vm.limit
                        vmLimit = vm.limit;
                    }
                    updateRegistration(2, vmLimit);


                    if (vmLimit != null) {
                        // read vm.limit.get()
                        vmLimitGet = vmLimit.get();
                    }
            }
        }
        if ((dirtyFlags & 0x50L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x4aL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.MagicIndicatorBindingAdapter.bindHomeMagicIndocator(this.magicIndicator, vmChannelArrayGet);
        }
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.searchView, mCallback65);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.toggleView, mCallback64);
        }
        if ((dirtyFlags & 0x50L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setViewPagerAdapter(this.viewPager, adapter);
        }
        if ((dirtyFlags & 0x4cL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setViewPagerAdapter(this.viewPager, vmLimitGet);
        }
        if ((dirtyFlags & 0x49L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setCurrentItem(this.viewPager, vmCurrentItemGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.MainFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.search();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.MainFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.openMenu();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.currentItem
        flag 1 (0x2L): vm.channelArray
        flag 2 (0x3L): vm.limit
        flag 3 (0x4L): vm
        flag 4 (0x5L): adapter
        flag 5 (0x6L): click
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}