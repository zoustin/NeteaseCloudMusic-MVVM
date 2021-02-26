package com.netease.lib_api.model.playlist;

import org.jetbrains.annotations.NotNull;

import java.util.List;

/**
 * 推荐歌单bean
 */
public class MainRecommendPlayListBean {

    /**
     * hasTaste : false
     * code : 200
     * category : 0
     * result : [{"id":6629720831,"type":0,"name":"Daft Punk宣布解散，让我们再来一次。","copywriter":"编辑推荐：Daft Punk宣布解散，让我们再来一次。","picUrl":"https://p1.music.126.net/yQSLjnuzJTCGqY-SY-BEMw==/109951165752221517.jpg","canDislike":false,"trackNumberUpdateTime":1614009564317,"playCount":263536,"trackCount":22,"highQuality":false,"alg":"featured"},{"id":6624570023,"type":0,"name":"别急，我们会在无数个晚风中相遇","copywriter":"编辑推荐：生因为有了遇见的温暖，所有的日子都浸染着花香雨露","picUrl":"https://p1.music.126.net/uxYA-MV1aAidGJGLhxV4UQ==/109951165743037223.jpg","canDislike":false,"trackNumberUpdateTime":1614220746629,"playCount":541920,"trackCount":49,"highQuality":false,"alg":"featured"},{"id":2974449693,"type":0,"name":"我想你了 其实我也很脆弱","copywriter":"热门推荐","picUrl":"https://p1.music.126.net/fob5pHV3xzGlJ_-KEeLFLg==/109951165693966983.jpg","canDislike":true,"trackNumberUpdateTime":1612493399745,"playCount":49682384,"trackCount":186,"highQuality":false,"alg":"cityLevel_unknow"},{"id":6608781907,"type":0,"name":"最深情的告白是 我会一直陪着你","copywriter":"热门推荐","picUrl":"https://p1.music.126.net/Hstxh3M52XZApM5i8BaYww==/109951165714645163.jpg","canDislike":true,"trackNumberUpdateTime":1613631156938,"playCount":1832594,"trackCount":60,"highQuality":false,"alg":"cityLevel_unknow"},{"id":6618037332,"type":0,"name":"得不到回应的热情 就该适可而止","copywriter":"热门推荐","picUrl":"https://p1.music.126.net/72-YEapzBTYpmU7q8MeURQ==/109951165731066852.jpg","canDislike":true,"trackNumberUpdateTime":1614161696610,"playCount":157036,"trackCount":216,"highQuality":false,"alg":"cityLevel_unknow"},{"id":6586558300,"type":0,"name":"听歌发呆：也许有种孤独叫放空吧","copywriter":"热门推荐","picUrl":"https://p1.music.126.net/LGuQy6VKKDdMw_feSMoZ9g==/109951165675435042.jpg","canDislike":true,"trackNumberUpdateTime":1614198348099,"playCount":2907952,"trackCount":40,"highQuality":false,"alg":"cityLevel_unknow"}]
     */

    private boolean hasTaste;
    private int code;
    private int category;
    private List<ResultBean> result;

    public boolean isHasTaste() {
        return hasTaste;
    }

    public void setHasTaste(boolean hasTaste) {
        this.hasTaste = hasTaste;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getCategory() {
        return category;
    }

    public void setCategory(int category) {
        this.category = category;
    }

    public List<ResultBean> getResult() {
        return result;
    }

    public void setResult(List<ResultBean> result) {
        this.result = result;
    }

    public static class ResultBean {
        /**
         * id : 6629720831
         * type : 0
         * name : Daft Punk宣布解散，让我们再来一次。
         * copywriter : 编辑推荐：Daft Punk宣布解散，让我们再来一次。
         * picUrl : https://p1.music.126.net/yQSLjnuzJTCGqY-SY-BEMw==/109951165752221517.jpg
         * canDislike : false
         * trackNumberUpdateTime : 1614009564317
         * playCount : 263536
         * trackCount : 22
         * highQuality : false
         * alg : featured
         */

        private long id;
        private int type;
        private String name;
        private String copywriter;
        private String picUrl;
        private boolean canDislike;
        private long trackNumberUpdateTime;
        private long playCount;
        private int trackCount;
        private boolean highQuality;
        private String alg;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getCopywriter() {
            return copywriter;
        }

        public void setCopywriter(String copywriter) {
            this.copywriter = copywriter;
        }

        public String getPicUrl() {
            return picUrl;
        }

        public void setPicUrl(String picUrl) {
            this.picUrl = picUrl;
        }

        public boolean isCanDislike() {
            return canDislike;
        }

        public void setCanDislike(boolean canDislike) {
            this.canDislike = canDislike;
        }

        public long getTrackNumberUpdateTime() {
            return trackNumberUpdateTime;
        }

        public void setTrackNumberUpdateTime(long trackNumberUpdateTime) {
            this.trackNumberUpdateTime = trackNumberUpdateTime;
        }

        public long getPlayCount() {
            return playCount;
        }

        public void setPlayCount(int playCount) {
            this.playCount = playCount;
        }

        public int getTrackCount() {
            return trackCount;
        }

        public void setTrackCount(int trackCount) {
            this.trackCount = trackCount;
        }

        public boolean isHighQuality() {
            return highQuality;
        }

        public void setHighQuality(boolean highQuality) {
            this.highQuality = highQuality;
        }

        public String getAlg() {
            return alg;
        }

        public void setAlg(String alg) {
            this.alg = alg;
        }

        @Override
        public String toString() {
            return "RecommendBean{" +
                    "id=" + id +
                    ", type=" + type +
                    ", name='" + name + '\'' +
                    ", copywriter='" + copywriter + '\'' +
                    ", picUrl='" + picUrl + '\'' +
                    ", playcount=" + playCount +
                    ", createTime=" + trackNumberUpdateTime +
                    ", trackCount=" + trackCount +
                    ", alg='" + alg + '\'' +
                    '}';
        }
    }

    @NotNull
    @Override
    public String toString() {
        return "MainRecommendPlayListBean{" +
                "code=" + code +
                '}';
    }
}
