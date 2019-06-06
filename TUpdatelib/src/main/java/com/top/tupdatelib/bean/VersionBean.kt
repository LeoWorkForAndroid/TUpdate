package com.top.tupdatelib.bean


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
class VersionBean {

    //最新版本号
    var newVersionCode: String? = null
    //当前版本号
    var currentVersionCode: String? = null
    //最小支持版本号
    var minVersionCode: String? = null
    //版本名字
    var versionName: String? = null
    //apk下载url
    var apkUrl: String? = null
    //apk size
    var apkSize: String? = null
    //更新信息
    var updateDescription: String? = null
    //是否有更新
    var isUpdate: String? = null
    //是否强制更新
    var forceUpdate: String? = null
    //下载apk的MD5
    var newmd5: String? = null

}
