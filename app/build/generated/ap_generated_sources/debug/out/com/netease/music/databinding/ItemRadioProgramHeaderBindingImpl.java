package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class ItemRadioProgramHeaderBindingImpl extends ItemRadioProgramHeaderBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.select, 4);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback17;
    @Nullable
    private final android.view.View.OnClickListener mCallback18;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public ItemRadioProgramHeaderBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 5, sIncludes, sViewsWithIds));
    }
    private ItemRadioProgramHeaderBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 0
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[4]
            , (android.widget.TextView) bindings[1]
            , (android.widget.TextView) bindings[3]
            );
        this.ivRadioProgramSort.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.tvRadioProgramHeaderCount.setTag(null);
        this.tvRadioProgramSort.setTag(null);
        setRootTag(root);
        // listeners
        mCallback17 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback18 = new com.netease.music.generated.callback.OnClickListener(this, 2);
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
        if (BR.asc == variableId) {
            setAsc((java.lang.Boolean) variable);
        }
        else if (BR.count == variableId) {
            setCount((java.lang.Integer) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setAsc(@Nullable java.lang.Boolean Asc) {
        this.mAsc = Asc;
        synchronized(this) {
            mDirtyFlags |= 0x1L;
        }
        notifyPropertyChanged(BR.asc);
        super.requestRebind();
    }
    public void setCount(@Nullable java.lang.Integer Count) {
        this.mCount = Count;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.count);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.proxy);
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
        java.lang.Boolean asc = mAsc;
        java.lang.String javaLangStringCount = null;
        java.lang.Integer count = mCount;
        android.graphics.drawable.Drawable ascIvRadioProgramSortAndroidDrawableIcUpBlackIvRadioProgramSortAndroidDrawableIcDownBlack = null;
        boolean androidxDatabindingViewDataBindingSafeUnboxAsc = false;
        java.lang.String javaLangStringCountJavaLangString = null;
        com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;

        if ((dirtyFlags & 0x9L) != 0) {



                // read androidx.databinding.ViewDataBinding.safeUnbox(asc)
                androidxDatabindingViewDataBindingSafeUnboxAsc = androidx.databinding.ViewDataBinding.safeUnbox(asc);
            if((dirtyFlags & 0x9L) != 0) {
                if(androidxDatabindingViewDataBindingSafeUnboxAsc) {
                        dirtyFlags |= 0x20L;
                }
                else {
                        dirtyFlags |= 0x10L;
                }
            }


                // read androidx.databinding.ViewDataBinding.safeUnbox(asc) ? @android:drawable/ic_up_black : @android:drawable/ic_down_black
                ascIvRadioProgramSortAndroidDrawableIcUpBlackIvRadioProgramSortAndroidDrawableIcDownBlack = ((androidxDatabindingViewDataBindingSafeUnboxAsc) ? (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivRadioProgramSort.getContext(), R.drawable.ic_up_black)) : (androidx.appcompat.content.res.AppCompatResources.getDrawable(ivRadioProgramSort.getContext(), R.drawable.ic_down_black)));
        }
        if ((dirtyFlags & 0xaL) != 0) {



                // read ("共") + (count)
                javaLangStringCount = ("共") + (count);


                // read (("共") + (count)) + ("期")
                javaLangStringCountJavaLangString = (javaLangStringCount) + ("期");
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.ivRadioProgramSort, mCallback17);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvRadioProgramSort, mCallback18);
        }
        if ((dirtyFlags & 0x9L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.setImageRes(this.ivRadioProgramSort, ascIvRadioProgramSortAndroidDrawableIcUpBlackIvRadioProgramSortAndroidDrawableIcDownBlack);
        }
        if ((dirtyFlags & 0xaL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvRadioProgramHeaderCount, javaLangStringCountJavaLangString);
        }
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
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeProgramAsc();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.radio.RadioDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changeProgramAsc();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): asc
        flag 1 (0x2L): count
        flag 2 (0x3L): proxy
        flag 3 (0x4L): null
        flag 4 (0x5L): androidx.databinding.ViewDataBinding.safeUnbox(asc) ? @android:drawable/ic_up_black : @android:drawable/ic_down_black
        flag 5 (0x6L): androidx.databinding.ViewDataBinding.safeUnbox(asc) ? @android:drawable/ic_up_black : @android:drawable/ic_down_black
    flag mapping end*/
    //end
}