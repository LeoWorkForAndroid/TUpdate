package com.top.tupdatelib

import android.content.Context

class TUpdate {






    /**
     * 版本更新管理构建者
     */
    open class Builder {

        //必填项
        internal lateinit var context: Context
        //版本更新的url地址
        internal lateinit var updateUrl: String
        //请求参数
        internal lateinit var params: MutableMap<String, Any>



    }


}