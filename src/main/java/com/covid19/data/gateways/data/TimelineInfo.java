package com.covid19.data.gateways.data;

import com.google.gson.annotations.SerializedName;
import lombok.Data;

import java.util.Date;

@Data
public class TimelineInfo {

    @SerializedName("date")
    Date infoDate;
    @SerializedName("deaths")
    int deaths;
    @SerializedName("confirmed")
    int confirmed;
    @SerializedName("active")
    int active;
    @SerializedName("recovered")
    int recovered;
    @SerializedName("new_confirmed")
    int newlyConfirmed;
    @SerializedName("new_deaths")
    int newlyRecovered;
}
