package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemDiscoverGedanBindingImpl extends ItemDiscoverGedanBinding  {

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
    private final android.widget.RelativeLayout mboundView0;
    // variables
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemDiscoverGedanBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 4, sIncludes, sViewsWithIds));
    }
    private ItemDiscoverGedanBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[1]
            , (android.widget.TextView) bindings[3]
            , (android.widget.TextView) bindings[2]
            );
        this.ivItemDiscover.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvItemDiscoverDes.setTag(null);
        this.tvItemDiscoverPlaynum.setTag(null);
        setRootTag(root);
        // listeners
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2L;
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
        if (BR.item == variableId) {
            setItem((com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setItem(@Nullable com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean Item) {
        this.mItem = Item;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.item);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
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
        java.lang.String itemPicUrl = null;
        java.lang.String searchUtilGetCorresPondingStringItemPlaycount = null;
        java.lang.String itemName = null;
        com.netease.lib_api.model.playlist.MainRecommendPlayListBean.RecommendBean item = mItem;
        long itemPlaycount = 0;

        if ((dirtyFlags & 0x3L) != 0) {



                if (item != null) {
                    // read item.picUrl
                    itemPicUrl = item.getPicUrl();
                    // read item.name
                    itemName = item.getName();
                    // read item.playcount
                    itemPlaycount = item.getPlaycount();
                }


                // read SearchUtil.getCorresPondingString(item.playcount)
                searchUtilGetCorresPondingStringItemPlaycount = com.netease.music.util.SearchUtil.getCorresPondingString(itemPlaycount);
        }
        // batch finished
        if ((dirtyFlags & 0x3L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCorner(this.ivItemDiscover, itemPicUrl, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemDiscoverDes, itemName);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvItemDiscoverPlaynum, searchUtilGetCorresPondingStringItemPlaycount);
        }
    }
    // Listener Stub Implementations
    // callback impls
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): item
        flag 1 (0x2L): null
    flag mapping end*/
    //end
}