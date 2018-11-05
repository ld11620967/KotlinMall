package com.kotlin.user.service

import rx.Observable

interface UserService {
    fun register(moblie:String,verifyCode:String,pwd:String):Observable<Boolean>
}