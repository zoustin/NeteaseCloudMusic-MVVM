package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegatePhoneLoginBindingImpl extends DelegatePhoneLoginBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.tv_show_auto_signin, 14);
        sViewsWithIds.put(R.id.tv_86, 15);
        sViewsWithIds.put(R.id.tv_capcha_title, 16);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback2;
    @Nullable
    private final android.view.View.OnClickListener mCallback5;
    @Nullable
    private final android.view.View.OnClickListener mCallback1;
    @Nullable
    private final android.view.View.OnClickListener mCallback4;
    @Nullable
    private final android.view.View.OnClickListener mCallback3;
    // values
    // listeners
    // Inverse Binding Event Handlers
    private androidx.databinding.InverseBindingListener etLoginPasswordandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.password.get()
            //         is vm.password.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etLoginPassword);
            // localize variables for thread safety
            // vm.password.get()
            java.lang.String vmPasswordGet = null;
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.netease.music.ui.state.PhoneLoginViewModel vm = mVm;
            // vm.password != null
            boolean vmPasswordJavaLangObjectNull = false;
            // vm.password
            androidx.databinding.ObservableField<java.lang.String> vmPassword = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPassword = vm.password;

                vmPasswordJavaLangObjectNull = (vmPassword) != (null);
                if (vmPasswordJavaLangObjectNull) {




                    vmPassword.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };
    private androidx.databinding.InverseBindingListener etLoginPhoneandroidTextAttrChanged = new androidx.databinding.InverseBindingListener() {
        @Override
        public void onChange() {
            // Inverse of vm.phone.get()
            //         is vm.phone.set((java.lang.String) callbackArg_0)
            java.lang.String callbackArg_0 = androidx.databinding.adapters.TextViewBindingAdapter.getTextString(etLoginPhone);
            // localize variables for thread safety
            // vm != null
            boolean vmJavaLangObjectNull = false;
            // vm
            com.netease.music.ui.state.PhoneLoginViewModel vm = mVm;
            // vm.phone.get()
            java.lang.String vmPhoneGet = null;
            // vm.phone != null
            boolean vmPhoneJavaLangObjectNull = false;
            // vm.phone
            androidx.databinding.ObservableField<java.lang.String> vmPhone = null;



            vmJavaLangObjectNull = (vm) != (null);
            if (vmJavaLangObjectNull) {


                vmPhone = vm.phone;

                vmPhoneJavaLangObjectNull = (vmPhone) != (null);
                if (vmPhoneJavaLangObjectNull) {




                    vmPhone.set(((java.lang.String) (callbackArg_0)));
                }
            }
        }
    };

    public DelegatePhoneLoginBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 17, sIncludes, sViewsWithIds));
    }
    private DelegatePhoneLoginBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 10
            , (com.netease.lib_common_ui.widget.CaptchaView) bindings[13]
            , (android.widget.EditText) bindings[7]
            , (com.google.android.material.textfield.TextInputEditText) bindings[4]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.RelativeLayout) bindings[10]
            , (android.widget.LinearLayout) bindings[6]
            , (android.widget.RelativeLayout) bindings[3]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[12]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[8]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[2]
            , (android.widget.TextView) bindings[14]
            );
        this.captchaView.setTag(null);
        this.etLoginPassword.setTag(null);
        this.etLoginPhone.setTag(null);
        this.imgTabBack.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.rlCaptcha.setTag(null);
        this.rvLoginPassword.setTag(null);
        this.rvLoginPhone.setTag(null);
        this.tvCapchaPhone.setTag(null);
        this.tvCaptchaTimer.setTag(null);
        this.tvLoginForget.setTag(null);
        this.tvLoginLogin.setTag(null);
        this.tvLoginNext.setTag(null);
        this.tvLoginTitle.setTag(null);
        setRootTag(root);
        // listeners
        mCallback2 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback5 = new com.netease.music.generated.callback.OnClickListener(this, 5);
        mCallback1 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback4 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback3 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x2000L;
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
            setVm((com.netease.music.ui.state.PhoneLoginViewModel) variable);
        }
        else if (BR.listener == variableId) {
            setListener((com.netease.lib_common_ui.widget.CaptchaView.OnInputListener) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.PhoneLoginViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x400L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setListener(@Nullable com.netease.lib_common_ui.widget.CaptchaView.OnInputListener Listener) {
        this.mListener = Listener;
        synchronized(this) {
            mDirtyFlags |= 0x800L;
        }
        notifyPropertyChanged(BR.listener);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x1000L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmShowInputPasswordView((androidx.databinding.ObservableBoolean) object, fieldId);
            case 1 :
                return onChangeVmTitle((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 2 :
                return onChangeVmShowForgetPasswordView((androidx.databinding.ObservableBoolean) object, fieldId);
            case 3 :
                return onChangeVmPassword((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 4 :
                return onChangeVmShowInputPhoneView((androidx.databinding.ObservableBoolean) object, fieldId);
            case 5 :
                return onChangeVmPhone((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 6 :
                return onChangeVmShowCaptureView((androidx.databinding.ObservableBoolean) object, fieldId);
            case 7 :
                return onChangeVmEnableCaptureButton((androidx.databinding.ObservableBoolean) object, fieldId);
            case 8 :
                return onChangeVmPasswordHint((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
            case 9 :
                return onChangeVmCountDownText((androidx.databinding.ObservableField<java.lang.String>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmShowInputPasswordView(androidx.databinding.ObservableBoolean VmShowInputPasswordView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmTitle(androidx.databinding.ObservableField<java.lang.String> VmTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmShowForgetPasswordView(androidx.databinding.ObservableBoolean VmShowForgetPasswordView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPassword(androidx.databinding.ObservableField<java.lang.String> VmPassword, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmShowInputPhoneView(androidx.databinding.ObservableBoolean VmShowInputPhoneView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPhone(androidx.databinding.ObservableField<java.lang.String> VmPhone, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmShowCaptureView(androidx.databinding.ObservableBoolean VmShowCaptureView, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEnableCaptureButton(androidx.databinding.ObservableBoolean VmEnableCaptureButton, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x80L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPasswordHint(androidx.databinding.ObservableField<java.lang.String> VmPasswordHint, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x100L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmCountDownText(androidx.databinding.ObservableField<java.lang.String> VmCountDownText, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x200L;
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
        java.lang.String vmPasswordGet = null;
        java.lang.String vmPhoneLengthInt11VmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7JavaLangString = null;
        boolean vmShowForgetPasswordViewGet = false;
        com.netease.music.ui.state.PhoneLoginViewModel vm = mVm;
        boolean vmShowInputPhoneViewGet = false;
        java.lang.String vmPhoneGet = null;
        com.netease.lib_common_ui.widget.CaptchaView.OnInputListener listener = mListener;
        com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;
        java.lang.String vmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7 = null;
        androidx.databinding.ObservableBoolean vmShowInputPasswordView = null;
        java.lang.String vmTitleGet = null;
        java.lang.String vmCountDownTextGet = null;
        boolean vmShowForgetPasswordView = false;
        androidx.databinding.ObservableField<java.lang.String> vmTitle = null;
        boolean vmShowInputPasswordViewGet = false;
        boolean vmShowCaptureViewGet = false;
        java.lang.String vmPasswordHintGet = null;
        boolean vmPhoneLengthInt11 = false;
        androidx.databinding.ObservableBoolean VmShowForgetPasswordView1 = null;
        androidx.databinding.ObservableField<java.lang.String> vmPassword = null;
        androidx.databinding.ObservableBoolean vmShowInputPhoneView = null;
        java.lang.String vmPhoneSubstringInt0Int3 = null;
        int vmPhoneLength = 0;
        androidx.databinding.ObservableField<java.lang.String> vmPhone = null;
        androidx.databinding.ObservableBoolean vmShowCaptureView = null;
        java.lang.String vmShowForgetPasswordViewJavaLangStringJavaLangString = null;
        java.lang.String vmPhoneSubstringInt7 = null;
        androidx.databinding.ObservableBoolean vmEnableCaptureButton = null;
        androidx.databinding.ObservableField<java.lang.String> vmPasswordHint = null;
        androidx.databinding.ObservableField<java.lang.String> vmCountDownText = null;
        java.lang.String vmPhoneSubstringInt0Int3JavaLangString = null;
        boolean vmEnableCaptureButtonGet = false;

        if ((dirtyFlags & 0x27ffL) != 0) {


            if ((dirtyFlags & 0x2401L) != 0) {

                    if (vm != null) {
                        // read vm.showInputPasswordView
                        vmShowInputPasswordView = vm.showInputPasswordView;
                    }
                    updateRegistration(0, vmShowInputPasswordView);


                    if (vmShowInputPasswordView != null) {
                        // read vm.showInputPasswordView.get()
                        vmShowInputPasswordViewGet = vmShowInputPasswordView.get();
                    }
            }
            if ((dirtyFlags & 0x2402L) != 0) {

                    if (vm != null) {
                        // read vm.title
                        vmTitle = vm.title;
                    }
                    updateRegistration(1, vmTitle);


                    if (vmTitle != null) {
                        // read vm.title.get()
                        vmTitleGet = vmTitle.get();
                    }
            }
            if ((dirtyFlags & 0x2404L) != 0) {

                    if (vm != null) {
                        // read vm.showForgetPasswordView
                        VmShowForgetPasswordView1 = vm.showForgetPasswordView;
                    }
                    updateRegistration(2, VmShowForgetPasswordView1);


                    if (VmShowForgetPasswordView1 != null) {
                        // read vm.showForgetPasswordView.get()
                        vmShowForgetPasswordViewGet = VmShowForgetPasswordView1.get();
                    }
                if((dirtyFlags & 0x2404L) != 0) {
                    if(vmShowForgetPasswordViewGet) {
                            dirtyFlags |= 0x20000L;
                    }
                    else {
                            dirtyFlags |= 0x10000L;
                    }
                }


                    // read !vm.showForgetPasswordView.get()
                    vmShowForgetPasswordView = !vmShowForgetPasswordViewGet;
                    // read vm.showForgetPasswordView.get() ? "下一步" : "登录"
                    vmShowForgetPasswordViewJavaLangStringJavaLangString = ((vmShowForgetPasswordViewGet) ? ("下一步") : ("登录"));
            }
            if ((dirtyFlags & 0x2408L) != 0) {

                    if (vm != null) {
                        // read vm.password
                        vmPassword = vm.password;
                    }
                    updateRegistration(3, vmPassword);


                    if (vmPassword != null) {
                        // read vm.password.get()
                        vmPasswordGet = vmPassword.get();
                    }
            }
            if ((dirtyFlags & 0x2410L) != 0) {

                    if (vm != null) {
                        // read vm.showInputPhoneView
                        vmShowInputPhoneView = vm.showInputPhoneView;
                    }
                    updateRegistration(4, vmShowInputPhoneView);


                    if (vmShowInputPhoneView != null) {
                        // read vm.showInputPhoneView.get()
                        vmShowInputPhoneViewGet = vmShowInputPhoneView.get();
                    }
            }
            if ((dirtyFlags & 0x2420L) != 0) {

                    if (vm != null) {
                        // read vm.phone
                        vmPhone = vm.phone;
                    }
                    updateRegistration(5, vmPhone);


                    if (vmPhone != null) {
                        // read vm.phone.get()
                        vmPhoneGet = vmPhone.get();
                    }


                    if (vmPhoneGet != null) {
                        // read vm.phone.get().length()
                        vmPhoneLength = vmPhoneGet.length();
                    }


                    // read vm.phone.get().length() >= 11
                    vmPhoneLengthInt11 = (vmPhoneLength) >= (11);
                if((dirtyFlags & 0x2420L) != 0) {
                    if(vmPhoneLengthInt11) {
                            dirtyFlags |= 0x8000L;
                    }
                    else {
                            dirtyFlags |= 0x4000L;
                    }
                }
            }
            if ((dirtyFlags & 0x2440L) != 0) {

                    if (vm != null) {
                        // read vm.showCaptureView
                        vmShowCaptureView = vm.showCaptureView;
                    }
                    updateRegistration(6, vmShowCaptureView);


                    if (vmShowCaptureView != null) {
                        // read vm.showCaptureView.get()
                        vmShowCaptureViewGet = vmShowCaptureView.get();
                    }
            }
            if ((dirtyFlags & 0x2480L) != 0) {

                    if (vm != null) {
                        // read vm.enableCaptureButton
                        vmEnableCaptureButton = vm.enableCaptureButton;
                    }
                    updateRegistration(7, vmEnableCaptureButton);


                    if (vmEnableCaptureButton != null) {
                        // read vm.enableCaptureButton.get()
                        vmEnableCaptureButtonGet = vmEnableCaptureButton.get();
                    }
            }
            if ((dirtyFlags & 0x2500L) != 0) {

                    if (vm != null) {
                        // read vm.passwordHint
                        vmPasswordHint = vm.passwordHint;
                    }
                    updateRegistration(8, vmPasswordHint);


                    if (vmPasswordHint != null) {
                        // read vm.passwordHint.get()
                        vmPasswordHintGet = vmPasswordHint.get();
                    }
            }
            if ((dirtyFlags & 0x2600L) != 0) {

                    if (vm != null) {
                        // read vm.countDownText
                        vmCountDownText = vm.countDownText;
                    }
                    updateRegistration(9, vmCountDownText);


                    if (vmCountDownText != null) {
                        // read vm.countDownText.get()
                        vmCountDownTextGet = vmCountDownText.get();
                    }
            }
        }
        if ((dirtyFlags & 0x2800L) != 0) {
        }
        // batch finished

        if ((dirtyFlags & 0x8000L) != 0) {

                if (vmPhoneGet != null) {
                    // read vm.phone.get().substring(0, 3)
                    vmPhoneSubstringInt0Int3 = vmPhoneGet.substring(0, 3);
                    // read vm.phone.get().substring(7)
                    vmPhoneSubstringInt7 = vmPhoneGet.substring(7);
                }


                // read (vm.phone.get().substring(0, 3)) + ("****")
                vmPhoneSubstringInt0Int3JavaLangString = (vmPhoneSubstringInt0Int3) + ("****");


                // read ((vm.phone.get().substring(0, 3)) + ("****")) + (vm.phone.get().substring(7))
                vmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7 = (vmPhoneSubstringInt0Int3JavaLangString) + (vmPhoneSubstringInt7);
        }

        if ((dirtyFlags & 0x2420L) != 0) {

                // read vm.phone.get().length() >= 11 ? ((vm.phone.get().substring(0, 3)) + ("****")) + (vm.phone.get().substring(7)) : ""
                vmPhoneLengthInt11VmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7JavaLangString = ((vmPhoneLengthInt11) ? (vmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7) : (""));
        }
        // batch finished
        if ((dirtyFlags & 0x2800L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setListener(this.captchaView, listener);
        }
        if ((dirtyFlags & 0x2500L) != 0) {
            // api target 1

            this.etLoginPassword.setHint(vmPasswordHintGet);
        }
        if ((dirtyFlags & 0x2408L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etLoginPassword, vmPasswordGet);
        }
        if ((dirtyFlags & 0x2000L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etLoginPassword, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etLoginPasswordandroidTextAttrChanged);
            androidx.databinding.adapters.TextViewBindingAdapter.setTextWatcher(this.etLoginPhone, (androidx.databinding.adapters.TextViewBindingAdapter.BeforeTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.OnTextChanged)null, (androidx.databinding.adapters.TextViewBindingAdapter.AfterTextChanged)null, etLoginPhoneandroidTextAttrChanged);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgTabBack, mCallback1);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvCaptchaTimer, mCallback5);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvLoginForget, mCallback3);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvLoginLogin, mCallback4);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.tvLoginNext, mCallback2);
        }
        if ((dirtyFlags & 0x2420L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.etLoginPhone, vmPhoneGet);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCapchaPhone, vmPhoneLengthInt11VmPhoneSubstringInt0Int3JavaLangStringVmPhoneSubstringInt7JavaLangString);
        }
        if ((dirtyFlags & 0x2440L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rlCaptcha, vmShowCaptureViewGet);
        }
        if ((dirtyFlags & 0x2401L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvLoginPassword, vmShowInputPasswordViewGet);
        }
        if ((dirtyFlags & 0x2410L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rvLoginPhone, vmShowInputPhoneViewGet);
        }
        if ((dirtyFlags & 0x2480L) != 0) {
            // api target 1

            this.tvCaptchaTimer.setEnabled(vmEnableCaptureButtonGet);
        }
        if ((dirtyFlags & 0x2600L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvCaptchaTimer, vmCountDownTextGet);
        }
        if ((dirtyFlags & 0x2404L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.tvLoginForget, vmShowForgetPasswordView);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLoginLogin, vmShowForgetPasswordViewJavaLangStringJavaLangString);
        }
        if ((dirtyFlags & 0x2402L) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvLoginTitle, vmTitleGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.next();
                }
                break;
            }
            case 5: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.reObtainCpatureCode();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.back();
                }
                break;
            }
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.login();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.login.PhoneLoginActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.forgetPassword();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.showInputPasswordView
        flag 1 (0x2L): vm.title
        flag 2 (0x3L): vm.showForgetPasswordView
        flag 3 (0x4L): vm.password
        flag 4 (0x5L): vm.showInputPhoneView
        flag 5 (0x6L): vm.phone
        flag 6 (0x7L): vm.showCaptureView
        flag 7 (0x8L): vm.enableCaptureButton
        flag 8 (0x9L): vm.passwordHint
        flag 9 (0xaL): vm.countDownText
        flag 10 (0xbL): vm
        flag 11 (0xcL): listener
        flag 12 (0xdL): proxy
        flag 13 (0xeL): null
        flag 14 (0xfL): vm.phone.get().length() >= 11 ? ((vm.phone.get().substring(0, 3)) + ("****")) + (vm.phone.get().substring(7)) : ""
        flag 15 (0x10L): vm.phone.get().length() >= 11 ? ((vm.phone.get().substring(0, 3)) + ("****")) + (vm.phone.get().substring(7)) : ""
        flag 16 (0x11L): vm.showForgetPasswordView.get() ? "下一步" : "登录"
        flag 17 (0x12L): vm.showForgetPasswordView.get() ? "下一步" : "登录"
    flag mapping end*/
    //end
}