package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class FragmentDrawerBindingImpl extends FragmentDrawerBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.left_drawer_layout_base, 8);
        sViewsWithIds.put(R.id.iv_avatar_vip, 9);
        sViewsWithIds.put(R.id.tv_user_level, 10);
        sViewsWithIds.put(R.id.avatar_check, 11);
        sViewsWithIds.put(R.id.icon_notification_listen, 12);
        sViewsWithIds.put(R.id.home_qrcode, 13);
        sViewsWithIds.put(R.id.home_music, 14);
        sViewsWithIds.put(R.id.online_music_view, 15);
        sViewsWithIds.put(R.id.check_update_view, 16);
        sViewsWithIds.put(R.id.divider, 17);
        sViewsWithIds.put(R.id.operator_view, 18);
        sViewsWithIds.put(R.id.exit_layout, 19);
    }
    // views
    @NonNull
    private final androidx.constraintlayout.widget.ConstraintLayout mboundView0;
    @NonNull
    private final android.widget.TextView mboundView5;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback27;
    @Nullable
    private final android.view.View.OnClickListener mCallback28;
    @Nullable
    private final android.view.View.OnClickListener mCallback26;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public FragmentDrawerBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 20, sIncludes, sViewsWithIds));
    }
    private FragmentDrawerBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 1
            , (android.widget.TextView) bindings[11]
            , (android.widget.TextView) bindings[3]
            , (android.widget.ImageView) bindings[2]
            , (com.netease.lib_common_ui.HornizeItemView) bindings[16]
            , (android.view.View) bindings[17]
            , (android.widget.LinearLayout) bindings[19]
            , (com.netease.lib_common_ui.HornizeItemView) bindings[14]
            , (com.netease.lib_common_ui.HornizeItemView) bindings[13]
            , (com.netease.lib_common_ui.HornizeItemView) bindings[7]
            , (com.netease.lib_common_ui.VerticalItemView) bindings[12]
            , (com.netease.lib_common_ui.VerticalItemView) bindings[6]
            , (android.widget.ImageView) bindings[9]
            , (android.widget.RelativeLayout) bindings[8]
            , (com.netease.lib_common_ui.HornizeItemView) bindings[15]
            , (android.widget.LinearLayout) bindings[18]
            , (android.widget.RelativeLayout) bindings[1]
            , (android.widget.TextView) bindings[10]
            , (android.widget.LinearLayout) bindings[4]
            );
        this.avatarName.setTag(null);
        this.avatrView.setTag(null);
        this.iconCloudMusic.setTag(null);
        this.iconNotificationMsg.setTag(null);
        this.mboundView0 = (androidx.constraintlayout.widget.ConstraintLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView5 = (android.widget.TextView) bindings[5];
        this.mboundView5.setTag(null);
        this.rlMainAvatar.setTag(null);
        this.unlogginLayout.setTag(null);
        setRootTag(root);
        // listeners
        mCallback27 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        mCallback28 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback26 = new com.netease.music.generated.callback.OnClickListener(this, 1);
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
            setVm((com.netease.music.ui.state.DrawerViewModel) variable);
        }
        else if (BR.click == variableId) {
            setClick((com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.DrawerViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x2L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setClick(@Nullable com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy Click) {
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
                return onChangeVmUser((androidx.lifecycle.MutableLiveData<com.netease.lib_api.model.user.LoginBean>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUser(androidx.lifecycle.MutableLiveData<com.netease.lib_api.model.user.LoginBean> VmUser, int fieldId) {
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
        com.netease.lib_api.model.user.LoginBean vmUserGetValue = null;
        boolean vmUserJavaLangObjectNull = false;
        androidx.lifecycle.MutableLiveData<com.netease.lib_api.model.user.LoginBean> vmUser = null;
        com.netease.music.ui.state.DrawerViewModel vm = mVm;
        java.lang.String vmUserProfileAvatarUrl = null;
        boolean VmUserJavaLangObjectNull1 = false;
        com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy click = mClick;
        java.lang.String vmUserProfileNickname = null;
        com.netease.lib_api.model.user.LoginBean.ProfileBean vmUserProfile = null;

        if ((dirtyFlags & 0xbL) != 0) {



                if (vm != null) {
                    // read vm.user
                    vmUser = vm.user;
                }
                updateLiveDataRegistration(0, vmUser);


                if (vmUser != null) {
                    // read vm.user.getValue()
                    vmUserGetValue = vmUser.getValue();
                }


                // read vm.user.getValue() == null
                vmUserJavaLangObjectNull = (vmUserGetValue) == (null);
                if (vmUserGetValue != null) {
                    // read vm.user.getValue().profile
                    vmUserProfile = vmUserGetValue.getProfile();
                }


                // read !vm.user.getValue() == null
                VmUserJavaLangObjectNull1 = !vmUserJavaLangObjectNull;
                if (vmUserProfile != null) {
                    // read vm.user.getValue().profile.avatarUrl
                    vmUserProfileAvatarUrl = vmUserProfile.getAvatarUrl();
                    // read vm.user.getValue().profile.nickname
                    vmUserProfileNickname = vmUserProfile.getNickname();
                }
        }
        // batch finished
        if ((dirtyFlags & 0xbL) != 0) {
            // api target 1

            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.avatarName, vmUserProfileNickname);
            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.avatrView, vmUserProfileAvatarUrl);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.rlMainAvatar, VmUserJavaLangObjectNull1);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.unlogginLayout, vmUserJavaLangObjectNull);
        }
        if ((dirtyFlags & 0x8L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.iconCloudMusic, mCallback28);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.iconNotificationMsg, mCallback27);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.mboundView5, mCallback26);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 2: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.searchMessage();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.searchCloud();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // click
                com.netease.music.ui.page.drawer.DrawerFragment.ClickProxy click = mClick;
                // click != null
                boolean clickJavaLangObjectNull = false;



                clickJavaLangObjectNull = (click) != (null);
                if (clickJavaLangObjectNull) {


                    click.login();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.user
        flag 1 (0x2L): vm
        flag 2 (0x3L): click
        flag 3 (0x4L): null
    flag mapping end*/
    //end
}