package com.covid19.data.gateways;

import com.covid19.data.gateways.AboutCovid19Gateway;
import com.covid19.data.gateways.data.TimelineResponse;
import com.sun.javafx.iio.common.ScalerFactory;
import okhttp3.OkHttpClient;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AboutCovid19Client {

    private final AboutCovid19Gateway aboutCovid19Gateway;

    public AboutCovid19Client(String baseurl) {
        this.aboutCovid19Gateway = new Retrofit.Builder()
                .baseUrl(baseurl)
                .client(new OkHttpClient.Builder().build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()
                .create(AboutCovid19Gateway.class);
    }

    public Call<TimelineResponse> getTimeLineForCountry(String countryCode){
        return aboutCovid19Gateway.fetchCountryTimeline(countryCode, "timeline");
    }
}
