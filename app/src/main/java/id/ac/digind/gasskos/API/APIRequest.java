package id.ac.digind.gasskos.API;

import id.ac.digind.gasskos.models.DetailPenginapanResponse;
import id.ac.digind.gasskos.models.LoginResponse;
import id.ac.digind.gasskos.models.PenginapanResponse;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.POST;

public interface APIRequest {
    @FormUrlEncoded
    @POST("auth/register")
    Call<ResponseBody> register(
        @Field("name") String name,
        @Field("email") String email,
        @Field("password") String password,
        @Field("password_confirmation") String password_confirmation
    );

    @FormUrlEncoded
    @POST("auth/login")
    Call<LoginResponse> login(
        @Field("email") String email,
        @Field("password") String password
    );

    @GET("penginapan")
    Call<PenginapanResponse> getPenginapan(@Header("Authorization") String token);

    @POST("penginapan/i")
    Call<DetailPenginapanResponse> getDetailPenginapan(
            @Header("Authorization") String token,
            @Field("id_penginapan") Integer id_penginapan
    );
}
