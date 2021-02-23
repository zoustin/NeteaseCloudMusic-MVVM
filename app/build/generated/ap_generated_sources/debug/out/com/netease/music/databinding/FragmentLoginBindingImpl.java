package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentLoginBindingImpl extends FragmentLoginBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.spreadView, 4);
        sViewsWithIds.put(R.id.tv_rule, 5);
    }
    // views
    @NonNull
    private final android.widget.RelativeLayout mboundView0;
    @NonNull
    private final android.widget.CheckBox mboundView3;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback14;
    @Nullable
    private final android.view.View.OnClickListener mCallback15;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener mboundView3androidCheckedAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.argeeRule.get()
            //         is vm.argeeRule.set((boolean) callbackArg_0)
            boolean callbackArg_0 = mboundView3.isChecked();
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.netease.music.ui.state.LoginViewModel vm = mVm;
            // vm.argeeRule.get()
            boolean vmArgeeRuleGet = false;
            // vm.argeeRule
            androidx.databinding.ObservableBoolean vmArgeeRule = null;
            // vm.argeeRule != null
            boolean vmArgeeRuleJavaLangObjectNull = false;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmArgeeRule = vm.argeeRule;

                vmArgeeRuleJavaLangObjectNull = (vmArgeeRule) != (null);
                if (vmArgeeRuleJavaLangObjectNull) {




                    vmArgeeRule.set(((boolean) (callbackArg_0)));
                }
            }
        }
    };

    public FragmentLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 6, sIncludes, sViewsWithIds));
    }
    private FragmentLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[1]
            , (com.netease.lib_common_ui.SpreadView) bindings[4]
            , (android.widget.TextView) bindings[5]
            );
        this.loginExperience.setTag(null);
        this.loginPhone.setTag(null);
        this.mboundView0 = (android.widget.RelativeLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView3 = (android.widget.CheckBox) bindings[3];
        this.mboundView3.setTag(null);
        setRootTag(root);
        // listeners
        mCallback14 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback15 = new com.netease.music.generated.callback.OnClickListener(this, 2);
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
            setVm((com.netease.music.ui.state.LoginViewModel) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.netease.music.ui.page.login.LoginActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.LoginViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setClick(@Nullable com.netease.music.ui.page.login.LoginActivity.ClickProxy Click) {
        this.mClick = Click;
        synchronized(this) {
            mDirtyFlags |= 0x4L;
        }
        notifyPropertyChanged(BR.click);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmArgeeRule((androidx.databinding.ObservableBoolean) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmArgeeRule(androidx.databinding.ObservableBoolean VmArgeeRule, int fieldId) {
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
        androidx.databinding.ObservableBoolean vmArgeeRule = null;
        com.netease.music.ui.state.LoginViewModel vm = mVm;
        boolean vmArgeeRuleGet = false;
        com.netease.music.ui.page.login.LoginActivity.ClickProxy click = mClick;

        if ((dirtyFlags & 0xbL) != 0) {



                if (vm != null) {
                    // read vm.argeeRule
                    vmArgeeRule = vm.argeeRule;
                }
                updateRegistration(0, vmArgeeRule);


                if (vmArgeeRule != null) {
                    // read vm.argeeRule.get()
                    vmArgeeRuleGet = vmArgeeRule.get();
                }
        }
        // batch finished
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.loginExperience, mCallback15);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.loginPhone, mCallback14);
            androidx.databinding.adapters.CompoundButtonBindingAdapter.setListeners(this.mboundView3, (android.widget.CompoundButton.OnCheckedChangeListener)null, mboundView3androidCheckedAttrChanged);
        }
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.CompoundButtonBindingAdapter.setChecked(this.mboundView3, vmArgeeRuleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 1: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.login.LoginActivity.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.phoneLogin();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.login.LoginActivity.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.experience();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.argeeRule
        flag 1 (0x2L): vm
        flag 2 (0x3L): click
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}