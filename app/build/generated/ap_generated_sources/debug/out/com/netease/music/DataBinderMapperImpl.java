package com.netease.music;

import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import androidx.databinding.DataBinderMapper;
import androidx.databinding.DataBindingComponent;
import androidx.databinding.ViewDataBinding;
import com.netease.music.databinding.ActivityMainBindingImpl;
import com.netease.music.databinding.AdapterLibraryBindingImpl;
import com.netease.music.databinding.DelegateArtistSortBindingImpl;
import com.netease.music.databinding.DelegateDailyRecommendBindingImpl;
import com.netease.music.databinding.DelegateDiscoverBindingImpl;
import com.netease.music.databinding.DelegateFriendBindingImpl;
import com.netease.music.databinding.DelegateGedanDetailBindingImpl;
import com.netease.music.databinding.DelegateGedanDetailCommentBindingImpl;
import com.netease.music.databinding.DelegateMessageTabBindingImpl;
import com.netease.music.databinding.DelegateMineBindingImpl;
import com.netease.music.databinding.DelegateMineRadioBindingImpl;
import com.netease.music.databinding.DelegateMvDetailBindingImpl;
import com.netease.music.databinding.DelegateMvNormalBindingImpl;
import com.netease.music.databinding.DelegateMvSortBindingImpl;
import com.netease.music.databinding.DelegateNewAlbumBindingImpl;
import com.netease.music.databinding.DelegateNormalLoadingBindingImpl;
import com.netease.music.databinding.DelegatePhoneLoginBindingImpl;
import com.netease.music.databinding.DelegateRadioBindingImpl;
import com.netease.music.databinding.DelegateRadioDeatailBindingImpl;
import com.netease.music.databinding.DelegateRadioInfoBindingImpl;
import com.netease.music.databinding.DelegateRadioPayBindingImpl;
import com.netease.music.databinding.DelegateRecyclerviewNormalBindingImpl;
import com.netease.music.databinding.DelegateSearchResultBindingImpl;
import com.netease.music.databinding.DelegateUserCloudBindingImpl;
import com.netease.music.databinding.DelegateUserDetailBindingImpl;
import com.netease.music.databinding.DelegateVideoDetailBindingImpl;
import com.netease.music.databinding.DelegateVideoTabBindingImpl;
import com.netease.music.databinding.FragmentDrawerBindingImpl;
import com.netease.music.databinding.FragmentLoginBindingImpl;
import com.netease.music.databinding.FragmentMainBindingImpl;
import com.netease.music.databinding.FragmentSearchBindingImpl;
import com.netease.music.databinding.ItemDiscoverAlbumSongBindingImpl;
import com.netease.music.databinding.ItemDiscoverGedanBindingImpl;
import com.netease.music.databinding.ItemRadioProgramHeaderBindingImpl;
import com.netease.music.databinding.ItemSearchSuggestBindingImpl;
import java.lang.IllegalArgumentException;
import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.RuntimeException;
import java.lang.String;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class DataBinderMapperImpl extends DataBinderMapper {
  private static final int LAYOUT_ACTIVITYMAIN = 1;

  private static final int LAYOUT_ADAPTERLIBRARY = 2;

  private static final int LAYOUT_DELEGATEARTISTSORT = 3;

  private static final int LAYOUT_DELEGATEDAILYRECOMMEND = 4;

  private static final int LAYOUT_DELEGATEDISCOVER = 5;

  private static final int LAYOUT_DELEGATEFRIEND = 6;

  private static final int LAYOUT_DELEGATEGEDANDETAIL = 7;

  private static final int LAYOUT_DELEGATEGEDANDETAILCOMMENT = 8;

  private static final int LAYOUT_DELEGATEMESSAGETAB = 9;

  private static final int LAYOUT_DELEGATEMINE = 10;

  private static final int LAYOUT_DELEGATEMINERADIO = 11;

  private static final int LAYOUT_DELEGATEMVDETAIL = 12;

  private static final int LAYOUT_DELEGATEMVNORMAL = 13;

  private static final int LAYOUT_DELEGATEMVSORT = 14;

  private static final int LAYOUT_DELEGATENEWALBUM = 15;

  private static final int LAYOUT_DELEGATENORMALLOADING = 16;

  private static final int LAYOUT_DELEGATEPHONELOGIN = 17;

  private static final int LAYOUT_DELEGATERADIO = 18;

  private static final int LAYOUT_DELEGATERADIODEATAIL = 19;

  private static final int LAYOUT_DELEGATERADIOINFO = 20;

  private static final int LAYOUT_DELEGATERADIOPAY = 21;

  private static final int LAYOUT_DELEGATERECYCLERVIEWNORMAL = 22;

  private static final int LAYOUT_DELEGATESEARCHRESULT = 23;

  private static final int LAYOUT_DELEGATEUSERCLOUD = 24;

  private static final int LAYOUT_DELEGATEUSERDETAIL = 25;

  private static final int LAYOUT_DELEGATEVIDEODETAIL = 26;

  private static final int LAYOUT_DELEGATEVIDEOTAB = 27;

  private static final int LAYOUT_FRAGMENTDRAWER = 28;

  private static final int LAYOUT_FRAGMENTLOGIN = 29;

  private static final int LAYOUT_FRAGMENTMAIN = 30;

  private static final int LAYOUT_FRAGMENTSEARCH = 31;

  private static final int LAYOUT_ITEMDISCOVERALBUMSONG = 32;

  private static final int LAYOUT_ITEMDISCOVERGEDAN = 33;

  private static final int LAYOUT_ITEMRADIOPROGRAMHEADER = 34;

  private static final int LAYOUT_ITEMSEARCHSUGGEST = 35;

  private static final SparseIntArray INTERNAL_LAYOUT_ID_LOOKUP = new SparseIntArray(35);

  static {
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.activity_main, LAYOUT_ACTIVITYMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.adapter_library, LAYOUT_ADAPTERLIBRARY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_artist_sort, LAYOUT_DELEGATEARTISTSORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_daily_recommend, LAYOUT_DELEGATEDAILYRECOMMEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_discover, LAYOUT_DELEGATEDISCOVER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_friend, LAYOUT_DELEGATEFRIEND);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_gedan_detail, LAYOUT_DELEGATEGEDANDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_gedan_detail_comment, LAYOUT_DELEGATEGEDANDETAILCOMMENT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_message_tab, LAYOUT_DELEGATEMESSAGETAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_mine, LAYOUT_DELEGATEMINE);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_mine_radio, LAYOUT_DELEGATEMINERADIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_mv_detail, LAYOUT_DELEGATEMVDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_mv_normal, LAYOUT_DELEGATEMVNORMAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_mv_sort, LAYOUT_DELEGATEMVSORT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_new_album, LAYOUT_DELEGATENEWALBUM);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_normal_loading, LAYOUT_DELEGATENORMALLOADING);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_phone_login, LAYOUT_DELEGATEPHONELOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_radio, LAYOUT_DELEGATERADIO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_radio_deatail, LAYOUT_DELEGATERADIODEATAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_radio_info, LAYOUT_DELEGATERADIOINFO);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_radio_pay, LAYOUT_DELEGATERADIOPAY);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_recyclerview_normal, LAYOUT_DELEGATERECYCLERVIEWNORMAL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_search_result, LAYOUT_DELEGATESEARCHRESULT);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_user_cloud, LAYOUT_DELEGATEUSERCLOUD);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_user_detail, LAYOUT_DELEGATEUSERDETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_video_detail, LAYOUT_DELEGATEVIDEODETAIL);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.delegate_video_tab, LAYOUT_DELEGATEVIDEOTAB);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.fragment_drawer, LAYOUT_FRAGMENTDRAWER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.fragment_login, LAYOUT_FRAGMENTLOGIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.fragment_main, LAYOUT_FRAGMENTMAIN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.fragment_search, LAYOUT_FRAGMENTSEARCH);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.item_discover_album_song, LAYOUT_ITEMDISCOVERALBUMSONG);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.item_discover_gedan, LAYOUT_ITEMDISCOVERGEDAN);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.item_radio_program_header, LAYOUT_ITEMRADIOPROGRAMHEADER);
    INTERNAL_LAYOUT_ID_LOOKUP.put(com.netease.music.R.layout.item_search_suggest, LAYOUT_ITEMSEARCHSUGGEST);
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View view, int layoutId) {
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = view.getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
        case  LAYOUT_ACTIVITYMAIN: {
          if ("layout/activity_main_0".equals(tag)) {
            return new ActivityMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for activity_main is invalid. Received: " + tag);
        }
        case  LAYOUT_ADAPTERLIBRARY: {
          if ("layout/adapter_library_0".equals(tag)) {
            return new AdapterLibraryBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for adapter_library is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEARTISTSORT: {
          if ("layout/delegate_artist_sort_0".equals(tag)) {
            return new DelegateArtistSortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_artist_sort is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEDAILYRECOMMEND: {
          if ("layout/delegate_daily_recommend_0".equals(tag)) {
            return new DelegateDailyRecommendBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_daily_recommend is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEDISCOVER: {
          if ("layout/delegate_discover_0".equals(tag)) {
            return new DelegateDiscoverBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_discover is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEFRIEND: {
          if ("layout/delegate_friend_0".equals(tag)) {
            return new DelegateFriendBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_friend is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEGEDANDETAIL: {
          if ("layout/delegate_gedan_detail_0".equals(tag)) {
            return new DelegateGedanDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_gedan_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEGEDANDETAILCOMMENT: {
          if ("layout/delegate_gedan_detail_comment_0".equals(tag)) {
            return new DelegateGedanDetailCommentBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_gedan_detail_comment is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMESSAGETAB: {
          if ("layout/delegate_message_tab_0".equals(tag)) {
            return new DelegateMessageTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_message_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMINE: {
          if ("layout/delegate_mine_0".equals(tag)) {
            return new DelegateMineBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_mine is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMINERADIO: {
          if ("layout/delegate_mine_radio_0".equals(tag)) {
            return new DelegateMineRadioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_mine_radio is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMVDETAIL: {
          if ("layout/delegate_mv_detail_0".equals(tag)) {
            return new DelegateMvDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_mv_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMVNORMAL: {
          if ("layout/delegate_mv_normal_0".equals(tag)) {
            return new DelegateMvNormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_mv_normal is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEMVSORT: {
          if ("layout/delegate_mv_sort_0".equals(tag)) {
            return new DelegateMvSortBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_mv_sort is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATENEWALBUM: {
          if ("layout/delegate_new_album_0".equals(tag)) {
            return new DelegateNewAlbumBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_new_album is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATENORMALLOADING: {
          if ("layout/delegate_normal_loading_0".equals(tag)) {
            return new DelegateNormalLoadingBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_normal_loading is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEPHONELOGIN: {
          if ("layout/delegate_phone_login_0".equals(tag)) {
            return new DelegatePhoneLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_phone_login is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATERADIO: {
          if ("layout/delegate_radio_0".equals(tag)) {
            return new DelegateRadioBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_radio is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATERADIODEATAIL: {
          if ("layout/delegate_radio_deatail_0".equals(tag)) {
            return new DelegateRadioDeatailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_radio_deatail is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATERADIOINFO: {
          if ("layout/delegate_radio_info_0".equals(tag)) {
            return new DelegateRadioInfoBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_radio_info is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATERADIOPAY: {
          if ("layout/delegate_radio_pay_0".equals(tag)) {
            return new DelegateRadioPayBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_radio_pay is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATERECYCLERVIEWNORMAL: {
          if ("layout/delegate_recyclerview_normal_0".equals(tag)) {
            return new DelegateRecyclerviewNormalBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_recyclerview_normal is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATESEARCHRESULT: {
          if ("layout/delegate_search_result_0".equals(tag)) {
            return new DelegateSearchResultBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_search_result is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEUSERCLOUD: {
          if ("layout/delegate_user_cloud_0".equals(tag)) {
            return new DelegateUserCloudBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_user_cloud is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEUSERDETAIL: {
          if ("layout/delegate_user_detail_0".equals(tag)) {
            return new DelegateUserDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_user_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEVIDEODETAIL: {
          if ("layout/delegate_video_detail_0".equals(tag)) {
            return new DelegateVideoDetailBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_video_detail is invalid. Received: " + tag);
        }
        case  LAYOUT_DELEGATEVIDEOTAB: {
          if ("layout/delegate_video_tab_0".equals(tag)) {
            return new DelegateVideoTabBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for delegate_video_tab is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTDRAWER: {
          if ("layout/fragment_drawer_0".equals(tag)) {
            return new FragmentDrawerBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_drawer is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTLOGIN: {
          if ("layout/fragment_login_0".equals(tag)) {
            return new FragmentLoginBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_login is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTMAIN: {
          if ("layout/fragment_main_0".equals(tag)) {
            return new FragmentMainBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_main is invalid. Received: " + tag);
        }
        case  LAYOUT_FRAGMENTSEARCH: {
          if ("layout/fragment_search_0".equals(tag)) {
            return new FragmentSearchBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for fragment_search is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDISCOVERALBUMSONG: {
          if ("layout/item_discover_album_song_0".equals(tag)) {
            return new ItemDiscoverAlbumSongBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_discover_album_song is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMDISCOVERGEDAN: {
          if ("layout/item_discover_gedan_0".equals(tag)) {
            return new ItemDiscoverGedanBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_discover_gedan is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMRADIOPROGRAMHEADER: {
          if ("layout/item_radio_program_header_0".equals(tag)) {
            return new ItemRadioProgramHeaderBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_radio_program_header is invalid. Received: " + tag);
        }
        case  LAYOUT_ITEMSEARCHSUGGEST: {
          if ("layout/item_search_suggest_0".equals(tag)) {
            return new ItemSearchSuggestBindingImpl(component, view);
          }
          throw new IllegalArgumentException("The tag for item_search_suggest is invalid. Received: " + tag);
        }
      }
    }
    return null;
  }

  @Override
  public ViewDataBinding getDataBinder(DataBindingComponent component, View[] views, int layoutId) {
    if(views == null || views.length == 0) {
      return null;
    }
    int localizedLayoutId = INTERNAL_LAYOUT_ID_LOOKUP.get(layoutId);
    if(localizedLayoutId > 0) {
      final Object tag = views[0].getTag();
      if(tag == null) {
        throw new RuntimeException("view must have a tag");
      }
      switch(localizedLayoutId) {
      }
    }
    return null;
  }

  @Override
  public int getLayoutId(String tag) {
    if (tag == null) {
      return 0;
    }
    Integer tmpVal = InnerLayoutIdLookup.sKeys.get(tag);
    return tmpVal == null ? 0 : tmpVal;
  }

  @Override
  public String convertBrIdToString(int localId) {
    String tmpVal = InnerBrLookup.sKeys.get(localId);
    return tmpVal;
  }

  @Override
  public List<DataBinderMapper> collectDependencies() {
    ArrayList<DataBinderMapper> result = new ArrayList<DataBinderMapper>(4);
    result.add(new androidx.databinding.library.baseAdapters.DataBinderMapperImpl());
    result.add(new com.chad.library.DataBinderMapperImpl());
    result.add(new com.kunminx.architecture.DataBinderMapperImpl());
    result.add(new com.kunminx.strictdatabinding.DataBinderMapperImpl());
    return result;
  }

  private static class InnerBrLookup {
    static final SparseArray<String> sKeys = new SparseArray<String>(19);

    static {
      sKeys.put(0, "_all");
      sKeys.put(1, "adapter");
      sKeys.put(2, "albumSongAdapter");
      sKeys.put(3, "asc");
      sKeys.put(4, "bannerListener");
      sKeys.put(5, "changeListener");
      sKeys.put(6, "click");
      sKeys.put(7, "count");
      sKeys.put(8, "event");
      sKeys.put(9, "info");
      sKeys.put(10, "item");
      sKeys.put(11, "listener");
      sKeys.put(12, "loadMoreListener");
      sKeys.put(13, "loading");
      sKeys.put(14, "offsetListener");
      sKeys.put(15, "proxy");
      sKeys.put(16, "refreshListener");
      sKeys.put(17, "subAdapter");
      sKeys.put(18, "vm");
    }
  }

  private static class InnerLayoutIdLookup {
    static final HashMap<String, Integer> sKeys = new HashMap<String, Integer>(35);

    static {
      sKeys.put("layout/activity_main_0", com.netease.music.R.layout.activity_main);
      sKeys.put("layout/adapter_library_0", com.netease.music.R.layout.adapter_library);
      sKeys.put("layout/delegate_artist_sort_0", com.netease.music.R.layout.delegate_artist_sort);
      sKeys.put("layout/delegate_daily_recommend_0", com.netease.music.R.layout.delegate_daily_recommend);
      sKeys.put("layout/delegate_discover_0", com.netease.music.R.layout.delegate_discover);
      sKeys.put("layout/delegate_friend_0", com.netease.music.R.layout.delegate_friend);
      sKeys.put("layout/delegate_gedan_detail_0", com.netease.music.R.layout.delegate_gedan_detail);
      sKeys.put("layout/delegate_gedan_detail_comment_0", com.netease.music.R.layout.delegate_gedan_detail_comment);
      sKeys.put("layout/delegate_message_tab_0", com.netease.music.R.layout.delegate_message_tab);
      sKeys.put("layout/delegate_mine_0", com.netease.music.R.layout.delegate_mine);
      sKeys.put("layout/delegate_mine_radio_0", com.netease.music.R.layout.delegate_mine_radio);
      sKeys.put("layout/delegate_mv_detail_0", com.netease.music.R.layout.delegate_mv_detail);
      sKeys.put("layout/delegate_mv_normal_0", com.netease.music.R.layout.delegate_mv_normal);
      sKeys.put("layout/delegate_mv_sort_0", com.netease.music.R.layout.delegate_mv_sort);
      sKeys.put("layout/delegate_new_album_0", com.netease.music.R.layout.delegate_new_album);
      sKeys.put("layout/delegate_normal_loading_0", com.netease.music.R.layout.delegate_normal_loading);
      sKeys.put("layout/delegate_phone_login_0", com.netease.music.R.layout.delegate_phone_login);
      sKeys.put("layout/delegate_radio_0", com.netease.music.R.layout.delegate_radio);
      sKeys.put("layout/delegate_radio_deatail_0", com.netease.music.R.layout.delegate_radio_deatail);
      sKeys.put("layout/delegate_radio_info_0", com.netease.music.R.layout.delegate_radio_info);
      sKeys.put("layout/delegate_radio_pay_0", com.netease.music.R.layout.delegate_radio_pay);
      sKeys.put("layout/delegate_recyclerview_normal_0", com.netease.music.R.layout.delegate_recyclerview_normal);
      sKeys.put("layout/delegate_search_result_0", com.netease.music.R.layout.delegate_search_result);
      sKeys.put("layout/delegate_user_cloud_0", com.netease.music.R.layout.delegate_user_cloud);
      sKeys.put("layout/delegate_user_detail_0", com.netease.music.R.layout.delegate_user_detail);
      sKeys.put("layout/delegate_video_detail_0", com.netease.music.R.layout.delegate_video_detail);
      sKeys.put("layout/delegate_video_tab_0", com.netease.music.R.layout.delegate_video_tab);
      sKeys.put("layout/fragment_drawer_0", com.netease.music.R.layout.fragment_drawer);
      sKeys.put("layout/fragment_login_0", com.netease.music.R.layout.fragment_login);
      sKeys.put("layout/fragment_main_0", com.netease.music.R.layout.fragment_main);
      sKeys.put("layout/fragment_search_0", com.netease.music.R.layout.fragment_search);
      sKeys.put("layout/item_discover_album_song_0", com.netease.music.R.layout.item_discover_album_song);
      sKeys.put("layout/item_discover_gedan_0", com.netease.music.R.layout.item_discover_gedan);
      sKeys.put("layout/item_radio_program_header_0", com.netease.music.R.layout.item_radio_program_header);
      sKeys.put("layout/item_search_suggest_0", com.netease.music.R.layout.item_search_suggest);
    }
  }
}
