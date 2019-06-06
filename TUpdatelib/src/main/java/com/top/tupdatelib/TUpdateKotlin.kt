package com.top.tupdatelib

import android.annotation.SuppressLint
import android.content.Context
import androidx.annotation.DrawableRes


class TUpdateKotlin {

    var builder: Builder
    //1,必填项,上下文
    var mContext: Context? = null
    //2,版本更新的url地址
    var mUpdateUrl: String = ""
    //3，设置按钮，进度条的颜色
    var mThemeColor = 0
    //4，顶部的图片
    @DrawableRes
    var mTopPic = 0
    //6,apk的下载路径
    var mTargetPath: String? = null
    //7,是否是post请求，默认是get
    var isPost: Boolean = false
    //8,自定义请求参数
    var mParams: Map<String, String>? = null
    // 9,是否忽略默认参数，解决
    var mIgnoreDefParams = false
    //10,是否隐藏对话框下载进度条
    var mHideDialog = false
    //11,是否显示忽略版本
    var mShowIgnoreVersion: Boolean = false
    //12,是否隐藏通知栏下载进度
    var mDismissNotificationProgress: Boolean = false
    //13,是否只有wifi情况下下载
    var mOnlyWifi: Boolean = false

    constructor(builder: Builder) {
        this.builder = builder

        this.mContext = builder.context
        this.mUpdateUrl = builder.updateUrl
        this.mThemeColor = builder.themeColor
        this.mTopPic = builder.topPic
        this.mTargetPath = builder.targetPath
        this.isPost = builder.isPost
        this.mParams = builder.params
        this.mIgnoreDefParams = builder.ignoreDefParams
        this.mHideDialog = builder.hideDialog
        this.mShowIgnoreVersion = builder.showIgnoreVersion
        this.mDismissNotificationProgress = builder.dismissNotificationProgress
        this.mOnlyWifi = builder.onlyWifi
    }












    /**
     * 版本更新管理构建者
     */
    object Builder {
        //1,必填项,上下文
        lateinit var context: Context
        //2,版本更新的url地址
        var updateUrl: String = ""
        //3，设置按钮，进度条的颜色
         var themeColor:Int = 0
        //4，顶部的图片
        @DrawableRes
        var topPic = 0
        //6,apk的下载路径
        var targetPath: String? = null
        //7,是否是post请求，默认是get
        var isPost: Boolean = false
        //8,自定义请求参数
        var params: Map<String, String>? = null
        // 9,是否忽略默认参数，解决
        var ignoreDefParams = false
        //10,是否隐藏对话框下载进度条
        var hideDialog = false
        //11,是否显示忽略版本
        var showIgnoreVersion: Boolean = false
        //12,是否隐藏通知栏下载进度
        var dismissNotificationProgress: Boolean = false
        //13,是否只有wifi情况下下载
        var onlyWifi: Boolean = false

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * 更新地址
         * @param updateUrl 更新地址
         * @return Builder
         */
        fun setUpdateUrl(updateUrl: String): Builder {
            this.updateUrl = updateUrl
            return this
        }

        fun setContext(context: Context): Builder {
            this.context = context
            return this
        }

        fun setOnlyWifi(status:Boolean): Builder {
            this.onlyWifi = status
            return this
        }

        fun setThemeColor(status:Boolean): Builder {
            this.onlyWifi = status
            return this
        }



        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    }


}