package com.kotlin.user.data.repository

import com.kotlin.base.data.net.RetrofitFactory
import com.kotlin.base.data.protocol.BaseResp
import com.kotlin.user.data.api.UserApi
import com.kotlin.user.data.protocol.RegisterReq
import rx.Observable

class UserRepository {
    fun register(moblie: String, verifyCode: String, pwd: String):Observable<BaseResp<String>>{
        return RetrofitFactory.instance.create(UserApi::class.java)
            .register(RegisterReq(moblie,pwd,verifyCode))
    }
}