package com.covid19.data.gateways;

import com.covid19.data.gateways.data.TimelineResponse;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface AboutCovid19Gateway {

    @GET("countries/{country}")
    Call<TimelineResponse> fetchCountryTimeline(
            @Path("country") String country,
            @Query("include") String timeline
    );

}
