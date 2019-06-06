package com.top.tupdatelib.bean;


/**
 * 参考
 * https://blog.csdn.net/h176nhx7/article/details/79970008
 * {
 * "newVersionCode":,"2",
 * "currentVersionCode":"1",
 * "minVersionCode":"0",
 * "versionName":"V1.2",
 * "apkUrl":"",
 * "apkSize":"12M",
 * "updateDescription":"\r\n1、优化api接口。\r\n2、添加使用demo演示。\r\n3、新增自定义更新服务API接口。\r\n4、优化更新提示界面。",
 * "isUpdate":"yes",
 * "forceUpdate":"no",
 * "newmd5":"b97bea014531123f94c3ba7b7afbaad2",
 * }
 *
 *
 */
public class VersionBean2 {

    //最新版本号
    private String newVersionCode;
    //当前版本号
    private String currentVersionCode;
    //最小支持版本号
    private String minVersionCode;
    //版本名字
    private String versionName;
    //apk下载url
    private String apkUrl;
    //apk size
    private String apkSize;
    //更新信息
    private String updateDescription;
    //是否有更新
    private String isUpdate;
    //是否强制更新
    private String forceUpdate;
    //下载apk的MD5
    private String newmd5;





    //////////////////////////////////////////////////////////////////////////////////////


    public String getNewVersionCode() {
        return newVersionCode;
    }

    public void setNewVersionCode(String newVersionCode) {
        this.newVersionCode = newVersionCode;
    }

    public String getCurrentVersionCode() {
        return currentVersionCode;
    }

    public void setCurrentVersionCode(String currentVersionCode) {
        this.currentVersionCode = currentVersionCode;
    }

    public String getMinVersionCode() {
        return minVersionCode;
    }

    public void setMinVersionCode(String minVersionCode) {
        this.minVersionCode = minVersionCode;
    }

    public String getVersionName() {
        return versionName;
    }

    public void setVersionName(String versionName) {
        this.versionName = versionName;
    }

    public String getApkUrl() {
        return apkUrl;
    }

    public void setApkUrl(String apkUrl) {
        this.apkUrl = apkUrl;
    }

    public String getApkSize() {
        return apkSize;
    }

    public void setApkSize(String apkSize) {
        this.apkSize = apkSize;
    }

    public String getUpdateDescription() {
        return updateDescription;
    }

    public void setUpdateDescription(String updateDescription) {
        this.updateDescription = updateDescription;
    }

    public String getIsUpdate() {
        return isUpdate;
    }

    public void setIsUpdate(String isUpdate) {
        this.isUpdate = isUpdate;
    }

    public String getForceUpdate() {
        return forceUpdate;
    }

    public void setForceUpdate(String forceUpdate) {
        this.forceUpdate = forceUpdate;
    }

    public String getNewmd5() {
        return newmd5;
    }

    public void setNewmd5(String newmd5) {
        this.newmd5 = newmd5;
    }
}
