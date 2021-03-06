package com.brilliantzhao.baselibrary.api

import com.brilliantzhao.baselibrary.base.JsonResult
import com.brilliantzhao.baselibrary.examplebean.FuckGoods
import retrofit2.http.GET
import retrofit2.http.Path
import rx.Observable

/**
 * description: 示例api接口
 * Date: 2018/2/2 10:28
 * User: BrilliantZhao
 */
interface ExampleApi {

    /**
     * Android所有数据
     */
    @GET("data/Android/10/{page}")
    fun getAndroidData(@Path("page") page: Int): Observable<JsonResult<List<FuckGoods>>>

    /**
     * iOS所有数据
     */
    @GET("data/iOS/10/{page}")
    fun getiOSData(@Path("page") page: Int): Observable<JsonResult<List<FuckGoods>>>

    /**
     * 福利所有数据
     */
    @GET("data/福利/10/{page}")
    fun getGirlData(@Path("page") page: Int): Observable<JsonResult<List<FuckGoods>>>

    /**
     * 手气不错
     */
    @GET("random/data/{type}/1")
    fun getRandom(@Path("type") type: String): Observable<JsonResult<List<FuckGoods>>>

}