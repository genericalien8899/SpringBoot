package spring.course.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class TimeAPIResponse {
    
    private String utc_datetime;

    public TimeAPIResponse(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    public String getUtc_datetime() {
        return this.utc_datetime;
    }

    public void setUtc_datetime(String utc_datetime) {
        this.utc_datetime = utc_datetime;
    }

    
}