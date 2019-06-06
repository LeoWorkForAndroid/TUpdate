package com.top.tupdatelib;

import android.content.Context;
import android.nfc.Tag;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.DrawableRes;

import java.util.Map;

public class TUpdate {

    private static final String TAG ="TUpdate";


    //1,必填项,上下文
    private Context mContext;
    //2,版本更新的url地址
    private String mUpdateUrl;
    //3，设置按钮，进度条的颜色
    private int mThemeColor;
    //4，顶部的图片
    @DrawableRes
    private int mTopPic;
    //6,apk的下载路径
    private String mTargetPath;
    //7,是否是post请求，默认是get
    private boolean isPost;
    //8,自定义请求参数
    private Map<String, String> mParams;
    // 9,是否忽略默认参数，解决
    private boolean mIgnoreDefParams;
    //10,是否隐藏对话框下载进度条
    private boolean mHideDialog;
    //11,是否显示忽略版本
    private boolean mShowIgnoreVersion;
    //12,是否隐藏通知栏下载进度
    private boolean mDismissNotificationProgress;
    //13,是否只有wifi情况下下载
    private boolean mOnlyWifi;

    private TUpdate(Builder builder) {

        this.mContext = builder.context;
        this.mUpdateUrl = builder.updateUrl;
        this.mThemeColor = builder.themeColor;
        this.mTopPic = builder.topPic;
        this.mTargetPath = builder.targetPath;
        this.isPost = builder.isPost;
        this.mParams = builder.params;
        this.mIgnoreDefParams = builder.ignoreDefParams;
        this.mHideDialog = builder.hideDialog;
        this.mShowIgnoreVersion = builder.showIgnoreVersion;
        this.mDismissNotificationProgress = builder.dismissNotificationProgress;
        this.mOnlyWifi = builder.onlyWifi;

    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public void update(){

    }


    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    /**
     * 版本更新管理构建者
     */
    public static class Builder {


        //1,必填项,上下文
        private Context context;
        //2,版本更新的url地址
        private String updateUrl;
        //3，设置按钮，进度条的颜色
        private int themeColor;
        //4，顶部的图片
        @DrawableRes
        private int topPic;
        //6,apk的下载路径
        private String targetPath;
        //7,是否是post请求，默认是get
        private boolean isPost;
        //8,自定义请求参数
        private Map<String, String> params;
        // 9,是否忽略默认参数，解决
        private boolean ignoreDefParams;
        //10,是否隐藏对话框下载进度条
        private boolean hideDialog;
        //11,是否显示忽略版本
        private boolean showIgnoreVersion;
        //12,是否隐藏通知栏下载进度
        private boolean dismissNotificationProgress;
        //13,是否只有wifi情况下下载
        private boolean onlyWifi;


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////


        private Context getContext() {
            return context;
        }

        private String getTargetPath() {
            return targetPath;
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public Builder setContext(Context context) {
            this.context = context;
            return this;
        }

        public Builder setUpdateUrl(String updateUrl) {
            this.updateUrl = updateUrl;
            return this;
        }

        public Builder setThemeColor(int themeColor) {
            this.themeColor = themeColor;
            return this;
        }

        public Builder setTopPic(int topPic) {
            this.topPic = topPic;
            return this;
        }

        public Builder setTargetPath(String targetPath) {
            this.targetPath = targetPath;
            return this;
        }

        public Builder setPost(boolean post) {
            isPost = post;
            return this;
        }

        public Builder setParams(Map<String, String> params) {
            this.params = params;
            return this;
        }

        public Builder setIgnoreDefParams(boolean ignoreDefParams) {
            this.ignoreDefParams = ignoreDefParams;
            return this;
        }

        public Builder setHideDialog(boolean hideDialog) {
            this.hideDialog = hideDialog;
            return this;
        }

        public Builder setShowIgnoreVersion(boolean showIgnoreVersion) {
            this.showIgnoreVersion = showIgnoreVersion;
            return this;
        }

        public Builder setDismissNotificationProgress(boolean dismissNotificationProgress) {
            this.dismissNotificationProgress = dismissNotificationProgress;
            return this;
        }

        public Builder setOnlyWifi(boolean onlyWifi) {
            this.onlyWifi = onlyWifi;
            return this;
        }


        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        /**
         * 生成TUpdate实例
         * @return
         */
        public TUpdate build() {

            //context为必须的参数，
            if (getContext() == null) {
                throw new NullPointerException("context is null!");
            }

            //如果TargetPath为空，则下载到默认download目录
            if (TextUtils.isEmpty(getTargetPath())) {
                //sd卡是否存在
                String path = "";
                if (Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED) || !Environment.isExternalStorageRemovable()) {
                    try {
                        path = Environment.getDownloadCacheDirectory().getAbsolutePath();
                    } catch (Exception e) {
                        Log.e(TAG,e.toString());
                        e.printStackTrace();
                    }
                    if (TextUtils.isEmpty(path)) {
                        path = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS).getAbsolutePath();
                    }
                } else {
                    path = getContext().getCacheDir().getAbsolutePath();
                }
                setTargetPath(path);
            }





            return new TUpdate(this);
        }

        /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    }

    /////////////////////////////////////////////////////////////////////////////////////////////////////////////////
}
