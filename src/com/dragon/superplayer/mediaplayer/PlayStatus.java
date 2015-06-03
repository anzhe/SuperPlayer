package com.dragon.superplayer.mediaplayer;

/**
 * 播放状态枚举类
 * @author yeguolong
 */
public enum PlayStatus {

    /**
     * 正在播放
     */
    PLAYING,

    /**
     * 已暂停
     */
    PAUSED,

    /**
     * 已停止
     */
    STOPED,

    /**
     * 已播放完毕
     */
    COMPLETED,

    /**
     * 播放错误
     */
    ERROR,

    /**
     * 正在缓冲中
     */
    BUFFERRING

}
