package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateMineRadioBindingImpl extends DelegateMineRadioBinding  {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.img_mine_radio_back, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView1;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateMineRadioBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private DelegateMineRadioBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 3
            , (android.widget.ImageView) bindings[4]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView1 = (android.widget.TextView) bindings[1];
        this.mboundView1.setTag(null);
        this.rvMineSubRadio.setTag(null);
        this.tvMineSubTitle.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x20L;
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
            setVm((com.netease.music.ui.state.MyRadioViewModel) variable);
        }
        else if (BR.subAdapter == variableId) {
            setSubAdapter((com.chad.library.adapter.base.BaseQuickAdapter) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.MyRadioViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setSubAdapter(@Nullable com.chad.library.adapter.base.BaseQuickAdapter SubAdapter) {
        this.mSubAdapter = SubAdapter;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.subAdapter);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmCreateRadioSize((androidx.databinding.ObservableInt) object, fieldId);
            case 1 :
                return onChangeVmSubRadioSize((androidx.databinding.ObservableInt) object, fieldId);
            case 2 :
                return onChangeVmSubRadioList((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjSubListBean.DjRadios>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmCreateRadioSize(androidx.databinding.ObservableInt VmCreateRadioSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSubRadioSize(androidx.databinding.ObservableInt VmSubRadioSize, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSubRadioList(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjSubListBean.DjRadios>> VmSubRadioList, int fieldId) {
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
        int vmCreateRadioSizeGet = 0;
        java.lang.String javaLangStringVmCreateRadioSize = null;
        androidx.databinding.ObservableInt vmCreateRadioSize = null;
        androidx.databinding.ObservableInt vmSubRadioSize = null;
        int vmSubRadioSizeGet = 0;
        java.lang.String javaLangStringVmCreateRadioSizeJavaLangString = null;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.dj.DjSubListBean.DjRadios>> vmSubRadioList = null;
        com.netease.music.ui.state.MyRadioViewModel vm = mVm;
        java.lang.String javaLangStringVmSubRadioSizeJavaLangString = null;
        java.util.List<com.netease.lib_api.model.dj.DjSubListBean.DjRadios> vmSubRadioListGet = null;
        java.lang.String javaLangStringVmSubRadioSize = null;
        com.chad.library.adapter.base.BaseQuickAdapter<?,? extends com.chad.library.adapter.base.viewholder.BaseViewHolder> subAdapter = mSubAdapter;

        if ((dirtyFlags & 0x2fL) != 0) {


            if ((dirtyFlags & 0x29L) != 0) {

                    if (vm != null) {
                        // read vm.createRadioSize
                        vmCreateRadioSize = vm.createRadioSize;
                    }
                    updateRegistration(0, vmCreateRadioSize);


                    if (vmCreateRadioSize != null) {
                        // read vm.createRadioSize.get()
                        vmCreateRadioSizeGet = vmCreateRadioSize.get();
                    }


                    // read ("我创建的电台(") + (vm.createRadioSize.get())
                    javaLangStringVmCreateRadioSize = ("我创建的电台(") + (vmCreateRadioSizeGet);


                    // read (("我创建的电台(") + (vm.createRadioSize.get())) + (")")
                    javaLangStringVmCreateRadioSizeJavaLangString = (javaLangStringVmCreateRadioSize) + (")");
            }
            if ((dirtyFlags & 0x2aL) != 0) {

                    if (vm != null) {
                        // read vm.subRadioSize
                        vmSubRadioSize = vm.subRadioSize;
                    }
                    updateRegistration(1, vmSubRadioSize);


                    if (vmSubRadioSize != null) {
                        // read vm.subRadioSize.get()
                        vmSubRadioSizeGet = vmSubRadioSize.get();
                    }


                    // read ("我订阅的电台(") + (vm.subRadioSize.get())
                    javaLangStringVmSubRadioSize = ("我订阅的电台(") + (vmSubRadioSizeGet);


                    // read (("我订阅的电台(") + (vm.subRadioSize.get())) + (")")
                    javaLangStringVmSubRadioSizeJavaLangString = (javaLangStringVmSubRadioSize) + (")");
            }
            if ((dirtyFlags & 0x2cL) != 0) {

                    if (vm != null) {
                        // read vm.subRadioList
                        vmSubRadioList = vm.subRadioList;
                    }
                    updateRegistration(2, vmSubRadioList);


                    if (vmSubRadioList != null) {
                        // read vm.subRadioList.get()
                        vmSubRadioListGet = vmSubRadioList.get();
                    }
            }
        }
        if ((dirtyFlags & 0x30L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x29L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.mboundView1, javaLangStringVmCreateRadioSizeJavaLangString);
        }
        if ((dirtyFlags & 0x2cL) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvMineSubRadio, vmSubRadioListGet);
        }
        if ((dirtyFlags & 0x30L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvMineSubRadio, subAdapter, androidx.databinding.ViewDataBinding.safeUnbox(java.lang.Boolean.TRUE));
        }
        if ((dirtyFlags & 0x2aL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvMineSubTitle, javaLangStringVmSubRadioSizeJavaLangString);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.createRadioSize
        flag 1 (0x2L): vm.subRadioSize
        flag 2 (0x3L): vm.subRadioList
        flag 3 (0x4L): vm
        flag 4 (0x5L): subAdapter
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}