package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateRecyclerviewNormalBindingImpl extends DelegateRecyclerviewNormalBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_msg_text, 2);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateRecyclerviewNormalBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 3, sIncludes, sViewsWithIds));
    }
    private DelegateRecyclerviewNormalBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (androidx.recyclerview.widget.RecyclerView) bindings[1]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvDelegateNormal.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x10L;
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
            setVm((com.netease.music.ui.state.VideoViewModel) variable);
        }
        else if (BR.changeListener == variableId) {
            setChangeListener((androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.VideoViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setChangeListener(@Nullable androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener ChangeListener) {
        this.mChangeListener = ChangeListener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.changeListener);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmAdpter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 1 :
                return onChangeVmList((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.VideoBean.VideoEntity>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmAdpter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdpter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmList(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.VideoBean.VideoEntity>> VmList, int fieldId) {
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
        com.netease.music.ui.state.VideoViewModel vm = mVm;
        java.util.List<com.netease.lib_api.model.mv.VideoBean.VideoEntity> vmListGet = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdpter = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdpterGet = null;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.mv.VideoBean.VideoEntity>> vmList = null;
        androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener changeListener = mChangeListener;

        if ((dirtyFlags & 0x17L) != 0) {


            if ((dirtyFlags & 0x15L) != 0) {

                    if (vm != null) {
                        // read vm.adpter
                        vmAdpter = vm.adpter;
                    }
                    updateRegistration(0, vmAdpter);


                    if (vmAdpter != null) {
                        // read vm.adpter.get()
                        vmAdpterGet = vmAdpter.get();
                    }
            }
            if ((dirtyFlags & 0x16L) != 0) {

                    if (vm != null) {
                        // read vm.list
                        vmList = vm.list;
                    }
                    updateRegistration(1, vmList);


                    if (vmList != null) {
                        // read vm.list.get()
                        vmListGet = vmList.get();
                    }
            }
        }
        if ((dirtyFlags & 0x18L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x16L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvDelegateNormal, vmListGet);
        }
        if ((dirtyFlags & 0x18L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.addOnChildAttachStateChangeListener(this.rvDelegateNormal, changeListener);
        }
        if ((dirtyFlags & 0x15L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvDelegateNormal, vmAdpterGet, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.adpter
        flag 1 (0x2L): vm.list
        flag 2 (0x3L): vm
        flag 3 (0x4L): changeListener
        flag 4 (0x5L): null
    flag mapping end*/
    //end
}