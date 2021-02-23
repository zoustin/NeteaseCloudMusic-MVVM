package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentSearchBindingImpl extends FragmentSearchBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

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
    @Nullable
    private final android.view.View.OnClickListener mCallback30;
    @Nullable
    private final android.view.View.OnClickListener mCallback31;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener tvSearchKeywordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.searchKeyword.get()
            //         is vm.searchKeyword.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(tvSearchKeyword);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.netease.music.ui.state.SearchViewModel vm = mVm;
            // vm.searchKeyword
            androidx.databinding.ObservableField<java.lang.String> vmSearchKeyword = null;
            // vm.searchKeyword != null
            boolean vmSearchKeywordJavaLangObjectNull = false;
            // vm.searchKeyword.get()
            java.lang.String vmSearchKeywordGet = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmSearchKeyword = vm.searchKeyword;

                vmSearchKeywordJavaLangObjectNull = (vmSearchKeyword) != (null);
                if (vmSearchKeywordJavaLangObjectNull) {




                    vmSearchKeyword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentSearchBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private FragmentSearchBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 2
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[4]
            , (android.widget.EditText) bindings[2]
            );
        this.imgSearchArtist.setTag(null);
        this.imgSuggestBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rvSuggestList.setTag(null);
        this.tvSearchKeyword.setTag(null);
        setRootTag(root);
        // listeners
        mCallback30 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback31 = new com.netease.music.generated.callback.OnClickListener(this, 2);
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
            setVm((com.netease.music.ui.state.SearchViewModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((android.widget.TextView.OnEditorActionListener) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.chad.library.adapter.base.BaseQuickAdapter) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.netease.music.ui.page.search.SearchActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.SearchViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setListener(@Nullable android.widget.TextView.OnEditorActionListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.chad.library.adapter.base.BaseQuickAdapter Adapter) {
        this.mAdapter = Adapter;
    }
    public void setClick(@Nullable com.netease.music.ui.page.search.SearchActivity.ClickProxy Click) {
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
                return onChangeVmSearchKeyword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 1 :
                return onChangeVmAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmSearchKeyword(androidx.databinding.ObservableField<java.lang.String> VmSearchKeyword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmAdapter, int fieldId) {
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
        com.netease.music.ui.state.SearchViewModel vm = mVm;
        android.widget.TextView.OnEditorActionListener listener = mListener;
        androidx.databinding.ObservableField<java.lang.String> vmSearchKeyword = null;
        com.netease.music.ui.page.search.SearchActivity.ClickProxy click = mClick;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmAdapter = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmAdapterGet = null;
        java.lang.String vmSearchKeywordGet = null;

        if ((dirtyFlags & 0x47L) != 0) {


            if ((dirtyFlags & 0x45L) != 0) {

                    if (vm != null) {
                        // read vm.searchKeyword
                        vmSearchKeyword = vm.searchKeyword;
                    }
                    updateRegistration(0, vmSearchKeyword);


                    if (vmSearchKeyword != null) {
                        // read vm.searchKeyword.get()
                        vmSearchKeywordGet = vmSearchKeyword.get();
                    }
            }
            if ((dirtyFlags & 0x46L) != 0) {

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
        if ((dirtyFlags & 0x48L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x40L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgSearchArtist, mCallback31);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgSuggestBack, mCallback30);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.tvSearchKeyword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, tvSearchKeywordandroidTextAttrChanged);
        }
        if ((dirtyFlags & 0x46L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvSuggestList, vmAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x45L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvSearchKeyword, vmSearchKeywordGet);
        }
        if ((dirtyFlags & 0x48L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setOnEditorActionListener(this.tvSearchKeyword, listener);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.search.SearchActivity.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.back();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.search.SearchActivity.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.navToArtist();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.searchKeyword
        flag 1 (0x2L): vm.adapter
        flag 2 (0x3L): vm
        flag 3 (0x4L): listener
        flag 4 (0x5L): adapter
        flag 5 (0x6L): click
        flag 6 (0x7L): null
    flag mapping end*/
    //end
}