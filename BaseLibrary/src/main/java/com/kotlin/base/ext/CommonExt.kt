package com.kotlin.base.ext

import com.kotlin.base.rx.BaseSubscriber
import rx.Observable


fun <T> Observable<T>.execute(subscriber: BaseSubscriber<T>){
    this.observeOn(rx.android.schedulers.AndroidSchedulers.mainThread())
        .subscribeOn(rx.schedulers.Schedulers.io())
        .subscribe(subscriber)
}