package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateArtistSortBindingImpl extends DelegateArtistSortBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

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
    @NonNull
    private final com.netease.lib_common_ui.widget.ArtistSortView mboundView2;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback16;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateArtistSortBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private DelegateArtistSortBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.ImageView) bindings[1]
            , (androidx.recyclerview.widget.RecyclerView) bindings[3]
            );
        this.imgArtistSortBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView2 = (com.netease.lib_common_ui.widget.ArtistSortView) bindings[2];
        this.mboundView2.setTag(null);
        this.rvArtistSort.setTag(null);
        setRootTag(root);
        // listeners
        mCallback16 = new com.netease.music.generated.callback.OnClickListener(this, 1);
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
            setVm((com.netease.music.ui.state.ArtistSortViewModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.netease.lib_common_ui.widget.ArtistSortView.OnChooseArtistSortListener) variable);
        }
        else if (BR.adapter == variableId) {
            setAdapter((com.chad.library.adapter.base.BaseQuickAdapter) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.search.artist.ArtistSortActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.ArtistSortViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setListener(@Nullable com.netease.lib_common_ui.widget.ArtistSortView.OnChooseArtistSortListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setAdapter(@Nullable com.chad.library.adapter.base.BaseQuickAdapter Adapter) {
        this.mAdapter = Adapter;
        synchronized(this) {
            mDirtyFlags |= 0x8L;
        }
        notifyPropertyChanged(BR.adapter);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.search.artist.ArtistSortActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x10L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmArtistData((androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.playlist.TopListDetailBean.Artist>>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmArtistData(androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.playlist.TopListDetailBean.Artist>> VmArtistData, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
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
        com.netease.music.ui.state.ArtistSortViewModel vm = mVm;
        com.netease.lib_common_ui.widget.ArtistSortView.OnChooseArtistSortListener listener = mListener;
        com.chad.library.adapter.base.BaseQuickAdapter<?,? extends com.chad.library.adapter.base.viewholder.BaseViewHolder> adapter = mAdapter;
        java.util.List<com.netease.lib_api.model.playlist.TopListDetailBean.Artist> vmArtistDataGet = null;
        com.netease.music.ui.page.search.artist.ArtistSortActivity.ClickProxy proxy = mProxy;
        androidx.databinding.ObservableField<java.util.List<com.netease.lib_api.model.playlist.TopListDetailBean.Artist>> vmArtistData = null;

        if ((dirtyFlags & 0x23L) != 0) {



                if (vm != null) {
                    // read vm.artistData
                    vmArtistData = vm.artistData;
                }
                updateRegistration(0, vmArtistData);


                if (vmArtistData != null) {
                    // read vm.artistData.get()
                    vmArtistDataGet = vmArtistData.get();
                }
        }
        if ((dirtyFlags & 0x24L) != 0) {
        }
        if ((dirtyFlags & 0x28L) != 0) {
        }
        // batch finished
        if ((dirtyFlags & 0x20L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgArtistSortBack, mCallback16);
        }
        if ((dirtyFlags & 0x24L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setOnChooseListener(this.mboundView2, listener);
        }
        if ((dirtyFlags & 0x23L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewData(this.rvArtistSort, vmArtistDataGet);
        }
        if ((dirtyFlags & 0x28L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvArtistSort, adapter, (boolean)false);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        // localize variables for thread safety
        // proxy != null
        boolean proxyJavaLangObjectNull = false;
        // proxy
        com.netease.music.ui.page.search.artist.ArtistSortActivity.ClickProxy proxy = mProxy;



        proxyJavaLangObjectNull = (proxy) != (null);
        if (proxyJavaLangObjectNull) {


            proxy.back();
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.artistData
        flag 1 (0x2L): vm
        flag 2 (0x3L): listener
        flag 3 (0x4L): adapter
        flag 4 (0x5L): proxy
        flag 5 (0x6L): null
    flag mapping end*/
    //end
}