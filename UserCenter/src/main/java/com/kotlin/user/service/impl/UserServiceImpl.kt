package com.kotlin.user.service.impl

import com.kotlin.user.service.UserService
import rx.Observable

class UserServiceImpl:UserService {
    override fun register(moblie: String, verifyCode: String, pwd: String): Observable<Boolean> {

    return Observable.just(true)
    }
}