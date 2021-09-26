package com.ebeatsz.retrofitlib;


import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JSONPlaceholder {
    @GET("products")
    Call<List<Post>> getPost();
}
