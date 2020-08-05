package com.covid19.data.gateways;

import com.covid19.data.gateways.data.TimelineResponse;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;
import retrofit2.Response;

import java.io.IOException;

public class AboutCovid19ClientTest {

    @Test
    public void getTimelineForCountryTest() throws IOException{
        AboutCovid19Client aboutCovid19Client = new AboutCovid19Client("http://corona-api.com");

        Response<TimelineResponse> response = aboutCovid19Client.getTimeLineForCountry("CN").execute();
        TimelineResponse timelineResponse = response.body();

        Assert.notNull(timelineResponse);
        Assert.notNull(timelineResponse.getCovidData());
        Assert.notEmpty(timelineResponse.getCovidData().getTimelineInfo());
    }

}
