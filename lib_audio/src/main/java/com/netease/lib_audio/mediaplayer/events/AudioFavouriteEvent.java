package com.netease.lib_audio.mediaplayer.events;

/**
 * 收藏/取消收藏事件
 */
public class AudioFavouriteEvent {
    public final boolean isFavourite;

    public AudioFavouriteEvent(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }
}