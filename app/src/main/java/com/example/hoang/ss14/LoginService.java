package com.example.hoang.ss14;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.POST;

/**
 * Created by hoang on 4/15/2018.
 */

public interface LoginService {
    @POST ("login")
    Call<Login.LoginResponse> login(@Body Login.LoginRequest loginRequest);
}
