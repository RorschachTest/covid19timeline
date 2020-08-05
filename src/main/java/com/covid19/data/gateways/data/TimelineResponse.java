package com.covid19.data.gateways.data;

import com.covid19.data.gateways.data.TimelineInfo;
import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.List;

@Data
public class TimelineResponse {

    @Data
    public static class CovidData{
        @SerializedName("timeline")
        List<TimelineInfo> timelineInfo;
    }

    @SerializedName("data")
    CovidData covidData;

}
