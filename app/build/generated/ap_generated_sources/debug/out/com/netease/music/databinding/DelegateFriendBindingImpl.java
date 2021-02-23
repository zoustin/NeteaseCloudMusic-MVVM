package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateFriendBindingImpl extends DelegateFriendBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = new androidx.databinding.ViewDataBinding.IncludedLayouts(4);
        sIncludes.setIncludes(1, 
            new String[] {"delegate_normal_loading"},
            new int[] {3},
            new int[] {com.netease.music.R.layout.delegate_normal_loading});
        sViewsWithIds = null;
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView1;
    @Nullable
    private final com.netease.music.databinding.DelegateNormalLoadingBinding mboundView11;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateFriendBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private DelegateFriendBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (com.scwang.smart.refresh.layout.SmartRefreshLayout) bindings[0]
            , (androidx.recyclerview.widget.RecyclerView) bindings[2]
            );
        this.mboundView1 = (android.widget.RelativeLayout) bindings[1];
        this.mboundView1.setTag(null);
        this.mboundView11 = (com.netease.music.databinding.DelegateNormalLoadingBinding) bindings[3];
        setContainedBinding(this.mboundView11);
        this.refreshLayoutDelegateFriend.setTag(null);
        this.rvDelegateFriend.setTag(null);
        setRootTag(root);
        // listeners
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
        if (BR.loadMoreListener == variableId) {
            setLoadMoreListener((com.scwang.smart.refresh.layout.listener.OnLoadMoreListener) variable);
        }
        else if (BR.vm == variableId) {
            setVm((com.netease.music.ui.state.CloudVillageFragmentViewModel) variable);
        }
        else if (BR.refreshListener == variableId) {
            setRefreshListener((com.scwang.smart.refresh.layout.listener.OnRefreshListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setLoadMoreListener(@Nullable com.scwang.smart.refresh.layout.listener.OnLoadMoreListener LoadMoreListener) {
        this.mLoadMoreListener = LoadMoreListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.loadMoreListener);
        super.requestRebind();
    }
    public void setVm(@Nullable com.netease.music.ui.state.CloudVillageFragmentViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setRefreshListener(@Nullable com.scwang.smart.refresh.layout.listener.OnRefreshListener RefreshListener) {
        this.mRefreshListener = RefreshListener;
        synchronized(this) {
            mDirtyFlags |= 0x20L;
        }
        notifyPropertyChanged(BR.refreshListener);
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
                return onChangeVmLoadingVisible((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeVmReloadState((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmLoadingVisible(androidx.databinding.ObservableBoolean VmLoadingVisible, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmReloadState(androidx.databinding.ObservableBoolean VmReloadState, int fieldId) {
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
        com.scwang.smart.refresh.layout.listener.OnLoadMoreListener loadMoreListener = mLoadMoreListener;
        boolean vmReloadStateGet = false;
        androidx.databinding.ObservableBoolean vmLoadingVisible = null;
        androidx.databinding.ObservableBoolean vmReloadState = null;
        com.netease.music.ui.state.CloudVillageFragmentViewModel vm = mVm;
        boolean VmLoadingVisible1 = false;
        boolean vmLoadingVisibleGet = false;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        com.scwang.smart.refresh.layout.listener.OnRefreshListener refreshListener = mRefreshListener;

        if ((dirtyFlags & 0x48L) != 0) {
        }
        if ((dirtyFlags & 0x57L) != 0) {


            if ((dirtyFlags & 0x51L) != 0) {

                    if (vm != null) {
                        // read vm.loadingVisible
                        vmLoadingVisible = vm.loadingVisible;
                    }
                    updateRegistration(0, vmLoadingVisible);


                    if (vmLoadingVisible != null) {
                        // read vm.loadingVisible.get()
                        vmLoadingVisibleGet = vmLoadingVisible.get();
                    }


                    // read !vm.loadingVisible.get()
                    VmLoadingVisible1 = !vmLoadingVisibleGet;
            }
            if ((dirtyFlags & 0x52L) != 0) {

                    if (vm != null) {
                        // read vm.reloadState
                        vmReloadState = vm.reloadState;
                    }
                    updateRegistration(1, vmReloadState);


                    if (vmReloadState != null) {
                        // read vm.reloadState.get()
                        vmReloadStateGet = vmReloadState.get();
                    }
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
        }
        if ((dirtyFlags & 0x60L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x51L) != 0) {
            // api target 1

            this.mboundView11.setLoading(vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.mboundView11.getRoot(), vmLoadingVisibleGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvDelegateFriend, VmLoadingVisible1);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setOnLoadMoreListener(this.refreshLayoutDelegateFriend, loadMoreListener);
        }
        if ((dirtyFlags & 0x60L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setOffsetChangeListener(this.refreshLayoutDelegateFriend, refreshListener);
        }
        if ((dirtyFlags & 0x52L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RefreshBindingAdapter.reloadRefreshLayoutState(this.refreshLayoutDelegateFriend, vmReloadStateGet);
        }
        if ((dirtyFlags & 0x54L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvDelegateFriend, vmAdapterGet, (boolean)false);
        }
        executeBindingsOn(mboundView11);
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.loadingVisible
        flag 1 (0x2L): vm.reloadState
        flag 2 (0x3L): vm.adapter
        flag 3 (0x4L): loadMoreListener
        flag 4 (0x5L): vm
        flag 5 (0x6L): refreshListener
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}