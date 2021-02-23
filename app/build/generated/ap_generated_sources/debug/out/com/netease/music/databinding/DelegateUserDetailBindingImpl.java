package com.netease.music.databinding;
import com.netease.music.R;
import com.netease.music.BR;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import android.view.View;
@SuppressWarnings("unchecked")
public class DelegateUserDetailBindingImpl extends DelegateUserDetailBinding implements com.netease.music.generated.callback.OnClickListener.Listener {

    @Nullable
    private static final androidx.databinding.ViewDataBinding.IncludedLayouts sIncludes;
    @Nullable
    private static final android.util.SparseIntArray sViewsWithIds;
    static {
        sIncludes = null;
        sViewsWithIds = new android.util.SparseIntArray();
        sViewsWithIds.put(R.id.appbar, 24);
        sViewsWithIds.put(R.id.iv_user_detail_vip, 25);
        sViewsWithIds.put(R.id.tv_item_search_user_follow, 26);
        sViewsWithIds.put(R.id.toolbar, 27);
        sViewsWithIds.put(R.id.tv_left_title, 28);
        sViewsWithIds.put(R.id.img_tab_more, 29);
        sViewsWithIds.put(R.id.rl_user_detail_bottom, 30);
        sViewsWithIds.put(R.id.ll_user_magicindicator, 31);
        sViewsWithIds.put(R.id.tv_gap, 32);
        sViewsWithIds.put(R.id.view_pager, 33);
        sViewsWithIds.put(R.id.iv_user_info_listen_rank, 34);
    }
    // views
    @NonNull
    private final android.widget.LinearLayout mboundView0;
    @NonNull
    private final android.widget.LinearLayout mboundView12;
    @NonNull
    private final androidx.recyclerview.widget.RecyclerView mboundView23;
    // variables
    @Nullable
    private final android.view.View.OnClickListener mCallback43;
    @Nullable
    private final android.view.View.OnClickListener mCallback42;
    @Nullable
    private final android.view.View.OnClickListener mCallback40;
    @Nullable
    private final android.view.View.OnClickListener mCallback41;
    // values
    // listeners
    // Inverse Binding Event Handlers

    public DelegateUserDetailBindingImpl(@Nullable androidx.databinding.DataBindingComponent bindingComponent, @NonNull View root) {
        this(bindingComponent, root, mapBindings(bindingComponent, root, 35, sIncludes, sViewsWithIds));
    }
    private DelegateUserDetailBindingImpl(androidx.databinding.DataBindingComponent bindingComponent, View root, Object[] bindings) {
        super(bindingComponent, root, 7
            , (com.google.android.material.appbar.AppBarLayout) bindings[24]
            , (android.widget.FrameLayout) bindings[8]
            , (android.widget.ImageView) bindings[29]
            , (android.widget.ImageView) bindings[10]
            , (android.widget.ImageView) bindings[3]
            , (android.widget.ImageView) bindings[1]
            , (android.widget.ImageView) bindings[2]
            , (android.widget.ImageView) bindings[25]
            , (android.widget.ImageView) bindings[19]
            , (android.widget.ImageView) bindings[34]
            , (android.widget.LinearLayout) bindings[7]
            , (android.widget.LinearLayout) bindings[31]
            , (net.lucode.hackware.magicindicator.MagicIndicator) bindings[11]
            , (android.widget.RelativeLayout) bindings[30]
            , (android.widget.RelativeLayout) bindings[18]
            , (androidx.recyclerview.widget.RecyclerView) bindings[22]
            , (androidx.appcompat.widget.Toolbar) bindings[27]
            , (android.widget.TextView) bindings[32]
            , (android.widget.TextView) bindings[26]
            , (android.widget.TextView) bindings[28]
            , (android.widget.TextView) bindings[14]
            , (android.widget.TextView) bindings[15]
            , (android.widget.TextView) bindings[13]
            , (android.widget.TextView) bindings[4]
            , (android.widget.TextView) bindings[9]
            , (android.widget.TextView) bindings[5]
            , (android.widget.TextView) bindings[21]
            , (android.widget.TextView) bindings[17]
            , (android.widget.TextView) bindings[20]
            , (android.widget.TextView) bindings[16]
            , (android.widget.TextView) bindings[6]
            , (androidx.viewpager.widget.ViewPager) bindings[33]
            );
        this.flUserDetailFollowed.setTag(null);
        this.imgUserDetailBack.setTag(null);
        this.ivUserDetailAvatar.setTag(null);
        this.ivUserDetailBackground.setTag(null);
        this.ivUserDetailBackgroundCover.setTag(null);
        this.ivUserInfoLike.setTag(null);
        this.llUserDetailFollow.setTag(null);
        this.magicUserIndicator.setTag(null);
        this.mboundView0 = (android.widget.LinearLayout) bindings[0];
        this.mboundView0.setTag(null);
        this.mboundView12 = (android.widget.LinearLayout) bindings[12];
        this.mboundView12.setTag(null);
        this.mboundView23 = (androidx.recyclerview.widget.RecyclerView) bindings[23];
        this.mboundView23.setTag(null);
        this.rlUserInfoLikemusic.setTag(null);
        this.rvUserInfoPlaylist.setTag(null);
        this.tvUserDetailAge.setTag(null);
        this.tvUserDetailArea.setTag(null);
        this.tvUserDetailCreatetime.setTag(null);
        this.tvUserDetailName.setTag(null);
        this.tvUserDetailSendMsg.setTag(null);
        this.tvUserDetailSub.setTag(null);
        this.tvUserInfoBottomlike.setTag(null);
        this.tvUserInfoBottomtext.setTag(null);
        this.tvUserInfoToplike.setTag(null);
        this.tvUserInfoToptext.setTag(null);
        this.tvUserLevel.setTag(null);
        setRootTag(root);
        // listeners
        mCallback43 = new com.netease.music.generated.callback.OnClickListener(this, 4);
        mCallback42 = new com.netease.music.generated.callback.OnClickListener(this, 3);
        mCallback40 = new com.netease.music.generated.callback.OnClickListener(this, 1);
        mCallback41 = new com.netease.music.generated.callback.OnClickListener(this, 2);
        invalidateAll();
    }

    @Override
    public void invalidateAll() {
        synchronized(this) {
                mDirtyFlags = 0x200L;
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
            setVm((com.netease.music.ui.state.UserDetailViewModel) variable);
        }
        else if (BR.proxy == variableId) {
            setProxy((com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy) variable);
        }
        else {
            variableSet = false;
        }
            return variableSet;
    }

    public void setVm(@Nullable com.netease.music.ui.state.UserDetailViewModel Vm) {
        this.mVm = Vm;
        synchronized(this) {
            mDirtyFlags |= 0x80L;
        }
        notifyPropertyChanged(BR.vm);
        super.requestRebind();
    }
    public void setProxy(@Nullable com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy Proxy) {
        this.mProxy = Proxy;
        synchronized(this) {
            mDirtyFlags |= 0x100L;
        }
        notifyPropertyChanged(BR.proxy);
        super.requestRebind();
    }

    @Override
    protected boolean onFieldChange(int localFieldId, Object object, int fieldId) {
        switch (localFieldId) {
            case 0 :
                return onChangeVmUser((androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserDetailBean>) object, fieldId);
            case 1 :
                return onChangeVmFollowed((androidx.databinding.ObservableBoolean) object, fieldId);
            case 2 :
                return onChangeVmLikePlayList((androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserPlaylistBean.PlaylistBean>) object, fieldId);
            case 3 :
                return onChangeVmIndicatorTitle((androidx.databinding.ObservableField<java.lang.CharSequence[]>) object, fieldId);
            case 4 :
                return onChangeVmEventAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 5 :
                return onChangeVmPlayListAdapter((androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter>) object, fieldId);
            case 6 :
                return onChangeVmSendMsgDrawable((androidx.databinding.ObservableField<android.graphics.drawable.Drawable>) object, fieldId);
        }
        return false;
    }
    private boolean onChangeVmUser(androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserDetailBean> VmUser, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x1L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmFollowed(androidx.databinding.ObservableBoolean VmFollowed, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x2L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmLikePlayList(androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserPlaylistBean.PlaylistBean> VmLikePlayList, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x4L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmIndicatorTitle(androidx.databinding.ObservableField<java.lang.CharSequence[]> VmIndicatorTitle, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x8L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmEventAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmEventAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x10L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmPlayListAdapter(androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> VmPlayListAdapter, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x20L;
            }
            return true;
        }
        return false;
    }
    private boolean onChangeVmSendMsgDrawable(androidx.databinding.ObservableField<android.graphics.drawable.Drawable> VmSendMsgDrawable, int fieldId) {
        if (fieldId == BR._all) {
            synchronized(this) {
                    mDirtyFlags |= 0x40L;
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
        java.lang.String vmUserProfileNicknameJavaLangString = null;
        java.lang.String timeUtilGetUserAgeTagVmUserProfileBirthday = null;
        androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserDetailBean> vmUser = null;
        com.netease.music.ui.state.UserDetailViewModel vm = mVm;
        android.graphics.drawable.Drawable vmSendMsgDrawableGet = null;
        java.lang.String javaLangStringVmUserProfileFollows = null;
        java.lang.String vmLikePlayListCoverImgUrl = null;
        int vmUserProfileCity = 0;
        com.netease.lib_api.model.user.UserPlaylistBean.PlaylistBean vmLikePlayListGet = null;
        java.lang.String vmUserProfileAvatarUrl = null;
        java.lang.CharSequence[] vmIndicatorTitleGet = null;
        com.chad.library.adapter.base.BaseQuickAdapter vmEventAdapterGet = null;
        long vmLikePlayListPlayCount = 0;
        androidx.databinding.ObservableBoolean vmFollowed = null;
        java.lang.String javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangString = null;
        androidx.databinding.ObservableField<com.netease.lib_api.model.user.UserPlaylistBean.PlaylistBean> vmLikePlayList = null;
        java.lang.String timeUtilGetTimeStandardOnlyYMDVmUserCreateTime = null;
        java.lang.String javaLangStringTimeUtilGetUserAgeTagVmUserProfileBirthday = null;
        boolean vmFollowedGet = false;
        int vmUserProfileFollows = 0;
        androidx.databinding.ObservableField<java.lang.CharSequence[]> vmIndicatorTitle = null;
        java.lang.String javaLangStringVmUserProfileProvince = null;
        java.lang.String searchUtilGetCorresPondingStringVmLikePlayListPlayCount = null;
        java.lang.String VmUserProfileNicknameJavaLangString1 = null;
        java.lang.String javaLangStringVmUserProfileFollowsJavaLangStringVmUserProfileFolloweds = null;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmEventAdapter = null;
        java.lang.String javaLangStringVmUserListenSongs = null;
        java.lang.String javaLangStringVmUserProfileProvinceJavaLangString = null;
        java.lang.String vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCount = null;
        java.lang.String javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTime = null;
        long vmUserProfileBirthday = 0;
        int vmUserProfileProvince = 0;
        androidx.databinding.ObservableField<com.chad.library.adapter.base.BaseQuickAdapter> vmPlayListAdapter = null;
        com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy proxy = mProxy;
        java.lang.String javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTimeJavaLangString = null;
        java.lang.String javaLangStringVmUserProfileFollowsJavaLangString = null;
        java.lang.String vmUserProfileBackgroundUrl = null;
        com.netease.lib_api.model.user.UserDetailBean.ProfileBean vmUserProfile = null;
        int vmUserListenSongs = 0;
        com.netease.lib_api.model.user.UserDetailBean vmUserGet = null;
        int vmLikePlayListTrackCount = 0;
        int vmUserProfileFolloweds = 0;
        com.chad.library.adapter.base.BaseQuickAdapter vmPlayListAdapterGet = null;
        int vmUserLevel = 0;
        long vmUserCreateTime = 0;
        java.lang.String vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCountJavaLangString = null;
        int timeUtilGetUserCloudAgeVmUserCreateTime = 0;
        java.lang.String vmLikePlayListTrackCountJavaLangString = null;
        java.lang.String javaLangStringVmUserProfileProvinceJavaLangStringVmUserProfileCity = null;
        java.lang.String javaLangStringLvVmUserLevel = null;
        androidx.databinding.ObservableField<android.graphics.drawable.Drawable> vmSendMsgDrawable = null;
        java.lang.String javaLangStringVmUserListenSongsJavaLangString = null;
        java.lang.String javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangString = null;
        java.lang.String javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTime = null;
        boolean VmFollowed1 = false;
        java.lang.String vmUserProfileNickname = null;

        if ((dirtyFlags & 0x2ffL) != 0) {


            if ((dirtyFlags & 0x281L) != 0) {

                    if (vm != null) {
                        // read vm.user
                        vmUser = vm.user;
                    }
                    updateRegistration(0, vmUser);


                    if (vmUser != null) {
                        // read vm.user.get()
                        vmUserGet = vmUser.get();
                    }


                    if (vmUserGet != null) {
                        // read vm.user.get().profile
                        vmUserProfile = vmUserGet.getProfile();
                        // read vm.user.get().listenSongs
                        vmUserListenSongs = vmUserGet.getListenSongs();
                        // read vm.user.get().level
                        vmUserLevel = vmUserGet.getLevel();
                        // read vm.user.get().createTime
                        vmUserCreateTime = vmUserGet.getCreateTime();
                    }


                    if (vmUserProfile != null) {
                        // read vm.user.get().profile.city
                        vmUserProfileCity = vmUserProfile.getCity();
                        // read vm.user.get().profile.avatarUrl
                        vmUserProfileAvatarUrl = vmUserProfile.getAvatarUrl();
                        // read vm.user.get().profile.follows
                        vmUserProfileFollows = vmUserProfile.getFollows();
                        // read vm.user.get().profile.birthday
                        vmUserProfileBirthday = vmUserProfile.getBirthday();
                        // read vm.user.get().profile.province
                        vmUserProfileProvince = vmUserProfile.getProvince();
                        // read vm.user.get().profile.backgroundUrl
                        vmUserProfileBackgroundUrl = vmUserProfile.getBackgroundUrl();
                        // read vm.user.get().profile.followeds
                        vmUserProfileFolloweds = vmUserProfile.getFolloweds();
                        // read vm.user.get().profile.nickname
                        vmUserProfileNickname = vmUserProfile.getNickname();
                    }
                    // read ("累计听歌") + (vm.user.get().listenSongs)
                    javaLangStringVmUserListenSongs = ("累计听歌") + (vmUserListenSongs);
                    // read ("Lv.") + (vm.user.get().level)
                    javaLangStringLvVmUserLevel = ("Lv.") + (vmUserLevel);
                    // read TimeUtil.getTimeStandardOnlyYMD(vm.user.get().createTime)
                    timeUtilGetTimeStandardOnlyYMDVmUserCreateTime = com.netease.music.util.TimeUtil.getTimeStandardOnlyYMD(vmUserCreateTime);
                    // read TimeUtil.getUserCloudAge(vm.user.get().createTime)
                    timeUtilGetUserCloudAgeVmUserCreateTime = com.netease.music.util.TimeUtil.getUserCloudAge(vmUserCreateTime);


                    // read ("关注 ") + (vm.user.get().profile.follows)
                    javaLangStringVmUserProfileFollows = ("关注 ") + (vmUserProfileFollows);
                    // read TimeUtil.getUserAgeTag(vm.user.get().profile.birthday)
                    timeUtilGetUserAgeTagVmUserProfileBirthday = com.netease.music.util.TimeUtil.getUserAgeTag(vmUserProfileBirthday);
                    // read ("地区: 省份码 ") + (vm.user.get().profile.province)
                    javaLangStringVmUserProfileProvince = ("地区: 省份码 ") + (vmUserProfileProvince);
                    // read (vm.user.get().profile.nickname) + ("喜欢的音乐")
                    vmUserProfileNicknameJavaLangString = (vmUserProfileNickname) + ("喜欢的音乐");
                    // read (vm.user.get().profile.nickname) + ("的听歌排行")
                    VmUserProfileNicknameJavaLangString1 = (vmUserProfileNickname) + ("的听歌排行");
                    // read (("累计听歌") + (vm.user.get().listenSongs)) + ("首")
                    javaLangStringVmUserListenSongsJavaLangString = (javaLangStringVmUserListenSongs) + ("首");
                    // read ("村龄:  ") + (TimeUtil.getUserCloudAge(vm.user.get().createTime))
                    javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTime = ("村龄:  ") + (timeUtilGetUserCloudAgeVmUserCreateTime);


                    // read (("关注 ") + (vm.user.get().profile.follows)) + ("  粉丝")
                    javaLangStringVmUserProfileFollowsJavaLangString = (javaLangStringVmUserProfileFollows) + ("  粉丝");
                    // read ("年龄:  ") + (TimeUtil.getUserAgeTag(vm.user.get().profile.birthday))
                    javaLangStringTimeUtilGetUserAgeTagVmUserProfileBirthday = ("年龄:  ") + (timeUtilGetUserAgeTagVmUserProfileBirthday);
                    // read (("地区: 省份码 ") + (vm.user.get().profile.province)) + ("市码 ")
                    javaLangStringVmUserProfileProvinceJavaLangString = (javaLangStringVmUserProfileProvince) + ("市码 ");
                    // read (("村龄:  ") + (TimeUtil.getUserCloudAge(vm.user.get().createTime))) + ("年 ")
                    javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangString = (javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTime) + ("年 ");


                    // read ((("关注 ") + (vm.user.get().profile.follows)) + ("  粉丝")) + (vm.user.get().profile.followeds)
                    javaLangStringVmUserProfileFollowsJavaLangStringVmUserProfileFolloweds = (javaLangStringVmUserProfileFollowsJavaLangString) + (vmUserProfileFolloweds);
                    // read ((("地区: 省份码 ") + (vm.user.get().profile.province)) + ("市码 ")) + (vm.user.get().profile.city)
                    javaLangStringVmUserProfileProvinceJavaLangStringVmUserProfileCity = (javaLangStringVmUserProfileProvinceJavaLangString) + (vmUserProfileCity);
                    // read ((("村龄:  ") + (TimeUtil.getUserCloudAge(vm.user.get().createTime))) + ("年 ")) + (" (")
                    javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangString = (javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangString) + (" (");


                    // read (((("村龄:  ") + (TimeUtil.getUserCloudAge(vm.user.get().createTime))) + ("年 ")) + (" (")) + (TimeUtil.getTimeStandardOnlyYMD(vm.user.get().createTime))
                    javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTime = (javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangString) + (timeUtilGetTimeStandardOnlyYMDVmUserCreateTime);


                    // read ((((("村龄:  ") + (TimeUtil.getUserCloudAge(vm.user.get().createTime))) + ("年 ")) + (" (")) + (TimeUtil.getTimeStandardOnlyYMD(vm.user.get().createTime))) + ("注册)")
                    javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTimeJavaLangString = (javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTime) + ("注册)");
            }
            if ((dirtyFlags & 0x282L) != 0) {

                    if (vm != null) {
                        // read vm.followed
                        vmFollowed = vm.followed;
                    }
                    updateRegistration(1, vmFollowed);


                    if (vmFollowed != null) {
                        // read vm.followed.get()
                        vmFollowedGet = vmFollowed.get();
                    }


                    // read !vm.followed.get()
                    VmFollowed1 = !vmFollowedGet;
            }
            if ((dirtyFlags & 0x284L) != 0) {

                    if (vm != null) {
                        // read vm.likePlayList
                        vmLikePlayList = vm.likePlayList;
                    }
                    updateRegistration(2, vmLikePlayList);


                    if (vmLikePlayList != null) {
                        // read vm.likePlayList.get()
                        vmLikePlayListGet = vmLikePlayList.get();
                    }


                    if (vmLikePlayListGet != null) {
                        // read vm.likePlayList.get().coverImgUrl
                        vmLikePlayListCoverImgUrl = vmLikePlayListGet.getCoverImgUrl();
                        // read vm.likePlayList.get().playCount
                        vmLikePlayListPlayCount = vmLikePlayListGet.getPlayCount();
                        // read vm.likePlayList.get().trackCount
                        vmLikePlayListTrackCount = vmLikePlayListGet.getTrackCount();
                    }


                    // read SearchUtil.getCorresPondingString(vm.likePlayList.get().playCount)
                    searchUtilGetCorresPondingStringVmLikePlayListPlayCount = com.netease.music.util.SearchUtil.getCorresPondingString(vmLikePlayListPlayCount);
                    // read (vm.likePlayList.get().trackCount) + ("首,  播放")
                    vmLikePlayListTrackCountJavaLangString = (vmLikePlayListTrackCount) + ("首,  播放");


                    // read ((vm.likePlayList.get().trackCount) + ("首,  播放")) + (SearchUtil.getCorresPondingString(vm.likePlayList.get().playCount))
                    vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCount = (vmLikePlayListTrackCountJavaLangString) + (searchUtilGetCorresPondingStringVmLikePlayListPlayCount);


                    // read (((vm.likePlayList.get().trackCount) + ("首,  播放")) + (SearchUtil.getCorresPondingString(vm.likePlayList.get().playCount))) + ("次")
                    vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCountJavaLangString = (vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCount) + ("次");
            }
            if ((dirtyFlags & 0x288L) != 0) {

                    if (vm != null) {
                        // read vm.indicatorTitle
                        vmIndicatorTitle = vm.indicatorTitle;
                    }
                    updateRegistration(3, vmIndicatorTitle);


                    if (vmIndicatorTitle != null) {
                        // read vm.indicatorTitle.get()
                        vmIndicatorTitleGet = vmIndicatorTitle.get();
                    }
            }
            if ((dirtyFlags & 0x290L) != 0) {

                    if (vm != null) {
                        // read vm.eventAdapter
                        vmEventAdapter = vm.eventAdapter;
                    }
                    updateRegistration(4, vmEventAdapter);


                    if (vmEventAdapter != null) {
                        // read vm.eventAdapter.get()
                        vmEventAdapterGet = vmEventAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x2a0L) != 0) {

                    if (vm != null) {
                        // read vm.playListAdapter
                        vmPlayListAdapter = vm.playListAdapter;
                    }
                    updateRegistration(5, vmPlayListAdapter);


                    if (vmPlayListAdapter != null) {
                        // read vm.playListAdapter.get()
                        vmPlayListAdapterGet = vmPlayListAdapter.get();
                    }
            }
            if ((dirtyFlags & 0x2c0L) != 0) {

                    if (vm != null) {
                        // read vm.sendMsgDrawable
                        vmSendMsgDrawable = vm.sendMsgDrawable;
                    }
                    updateRegistration(6, vmSendMsgDrawable);


                    if (vmSendMsgDrawable != null) {
                        // read vm.sendMsgDrawable.get()
                        vmSendMsgDrawableGet = vmSendMsgDrawable.get();
                    }
            }
        }
        // batch finished
        if ((dirtyFlags & 0x200L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.flUserDetailFollowed, mCallback41);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.imgUserDetailBack, mCallback42);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.llUserDetailFollow, mCallback40);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.onClickWithDebouncing(this.rlUserInfoLikemusic, mCallback43);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setAlpha(this.tvUserDetailSendMsg, 200);
        }
        if ((dirtyFlags & 0x282L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.flUserDetailFollowed, vmFollowedGet);
            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.visible(this.llUserDetailFollow, VmFollowed1);
        }
        if ((dirtyFlags & 0x281L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCircle(this.ivUserDetailAvatar, vmUserProfileAvatarUrl);
            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForImageView(this.ivUserDetailBackground, vmUserProfileBackgroundUrl, 125);
            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForView(this.ivUserDetailBackgroundCover, vmUserProfileBackgroundUrl, (android.graphics.drawable.Drawable)null);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserDetailAge, javaLangStringTimeUtilGetUserAgeTagVmUserProfileBirthday);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserDetailArea, javaLangStringVmUserProfileProvinceJavaLangStringVmUserProfileCity);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserDetailCreatetime, javaLangStringTimeUtilGetUserCloudAgeVmUserCreateTimeJavaLangStringJavaLangStringTimeUtilGetTimeStandardOnlyYMDVmUserCreateTimeJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserDetailName, vmUserProfileNickname);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserDetailSub, javaLangStringVmUserProfileFollowsJavaLangStringVmUserProfileFolloweds);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserInfoBottomtext, javaLangStringVmUserListenSongsJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserInfoToplike, vmUserProfileNicknameJavaLangString);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserInfoToptext, VmUserProfileNicknameJavaLangString1);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserLevel, javaLangStringLvVmUserLevel);
        }
        if ((dirtyFlags & 0x284L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.ImageBindingAdapter.displayImageForCorner(this.ivUserInfoLike, vmLikePlayListCoverImgUrl, (int)0);
            androidx.databinding.adapters.TextViewBindingAdapter.setText(this.tvUserInfoBottomlike, vmLikePlayListTrackCountJavaLangStringSearchUtilGetCorresPondingStringVmLikePlayListPlayCountJavaLangString);
        }
        if ((dirtyFlags & 0x288L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.TabPageBindingAdapter.initTabAndPage(this.magicUserIndicator, vmIndicatorTitleGet, (int)0);
        }
        if ((dirtyFlags & 0x290L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.mboundView23, vmEventAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x2a0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.RecyclerViewBindingAdapter.initRecyclerViewWithLinearLayoutManager(this.rvUserInfoPlaylist, vmPlayListAdapterGet, (boolean)false);
        }
        if ((dirtyFlags & 0x2c0L) != 0) {
            // api target 1

            com.netease.music.ui.base.binding_adapter.CommonBindingAdapter.setCompoundDrawables(this.tvUserDetailSendMsg, vmSendMsgDrawableGet);
        }
    }
    // Listener Stub Implementations
    // callback impls
    public final void _internalCallbackOnClick(int sourceId , android.view.View callbackArg_0) {
        switch(sourceId) {
            case 4: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.userLikePlaylist();
                }
                break;
            }
            case 3: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.back();
                }
                break;
            }
            case 1: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changefollowStatus();
                }
                break;
            }
            case 2: {
                // localize variables for thread safety
                // proxy != null
                boolean proxyJavaLangObjectNull = false;
                // proxy
                com.netease.music.ui.page.discover.user.UserDetailActivity.ClickProxy proxy = mProxy;



                proxyJavaLangObjectNull = (proxy) != (null);
                if (proxyJavaLangObjectNull) {


                    proxy.changefollowStatus();
                }
                break;
            }
        }
    }
    // dirty flag
    private  long mDirtyFlags = 0xffffffffffffffffL;
    /* flag mapping
        flag 0 (0x1L): vm.user
        flag 1 (0x2L): vm.followed
        flag 2 (0x3L): vm.likePlayList
        flag 3 (0x4L): vm.indicatorTitle
        flag 4 (0x5L): vm.eventAdapter
        flag 5 (0x6L): vm.playListAdapter
        flag 6 (0x7L): vm.sendMsgDrawable
        flag 7 (0x8L): vm
        flag 8 (0x9L): proxy
        flag 9 (0xaL): null
    flag mapping end*/
    //end
}