package com.example.streamingandrouas.data.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class CallResponse {
    @SerializedName("response")
    private String response;
    @SerializedName("videos")
    private List<Video> videos;

    public List<Video> getVideos() {
        return videos;
    }

    public String getResponse() {
        return response;
    }
}