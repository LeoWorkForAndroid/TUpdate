package com.top.tupdatelib.proxy

import androidx.annotation.NonNull
import java.io.File

/**
 * 版本更新网络请求服务API
 */
interface IUpdateHttpServic {
    /**
     * 异步get
     *
     * @param url      get请求地址
     * @param params   get参数
     * @param callBack 回调
     */
    abstract fun asyncGet(@NonNull url: String, @NonNull params: Map<String, Any>, @NonNull callBack: Callback)


    /**
     * 异步post
     *
     * @param url      post请求地址
     * @param params   post请求参数
     * @param callBack 回调
     */
    abstract fun asyncPost(@NonNull url: String, @NonNull params: Map<String, Any>, @NonNull callBack: Callback)

    /**
     * 文件下载
     *
     * @param url      下载地址
     * @param path     文件保存路径
     * @param fileName 文件名称
     * @param callback 文件下载回调
     */
    abstract fun download(@NonNull url: String, @NonNull path: String, @NonNull fileName: String, @NonNull callback: DownloadCallback)

    /**
     * 取消文件下载
     *
     * @param url      下载地址
     */
    abstract fun cancelDownload(@NonNull url: String)

    /**
     * 网络请求回调
     */
    interface Callback {
        /**
         * 结果回调
         *
         * @param result 结果
         */
        fun onSuccess(result: String)

        /**
         * 错误回调
         *
         * @param throwable 错误提示
         */
        fun onError(throwable: Throwable)
    }

    /**
     * 下载回调
     */
    interface DownloadCallback {
        /**
         * 下载之前
         */
        fun onStart()

        /**
         * 更新进度
         *
         * @param progress 进度0.00 - 0.50  - 1.00
         * @param total    文件总大小 单位字节
         */
        fun onProgress(progress: Float, total: Long)

        /**
         * 结果回调
         *
         * @param file 下载好的文件
         */
        fun onSuccess(file: File)

        /**
         * 错误回调
         *
         * @param throwable 错误提示
         */
        fun onError(throwable: Throwable)

    }



}