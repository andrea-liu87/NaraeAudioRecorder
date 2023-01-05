package com.github.windsekirun.naraeaudiorecorder.ffmpeg.config

import com.github.windsekirun.naraeaudiorecorder.ffmpeg.model.FFmpegBitRate
import com.github.windsekirun.naraeaudiorecorder.ffmpeg.model.FFmpegSamplingRate

/**
 * Data class for convert config in FFmpeg
 *
 * @param bitRate Bitrate settings
 * @param samplingRate Sampling rate settings
 * @param mono true if channel is mono
 * @param oggFormat
 */
data class FFmpegConvertConfig(
    val bitRate: FFmpegBitRate,
    val samplingRate: FFmpegSamplingRate,
    val mono: Boolean,
    val oggFormat: Boolean = false
) {

    companion object {
        @JvmStatic
        fun defaultConfig() =
            FFmpegConvertConfig(FFmpegBitRate.def, FFmpegSamplingRate.ORIGINAL, true)
    }
}