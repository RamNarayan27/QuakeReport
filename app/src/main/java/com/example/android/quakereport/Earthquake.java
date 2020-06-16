package com.example.android.quakereport;

public class Earthquake {
    private double mMagnitude;
    private String mLocation;
    private long mTimeInMilliseconds;
    private String mDate;
    private String mUrl;

    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    public double getMagnitude() {
        return mMagnitude;
    }

    public String getDate() {
        return mDate;
    }

    public String getLocation() {
        return mLocation;
    }

    public String getUrl() {
        return mUrl;
    }
}
