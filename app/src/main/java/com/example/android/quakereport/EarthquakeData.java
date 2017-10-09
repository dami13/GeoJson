package com.example.android.quakereport;

/**
 * Created by dami on 09.10.2017.
 */

public class EarthquakeData {
    private int mMag; //magnitude
    private String mLocation;
    private String mTime;

    public EarthquakeData(int mag, String location, String time) {
        this.mMag = mag;
        this.mLocation = location;
        this.mTime = time;
    }

    public String getMag() {
        return String.valueOf(mMag);
    }

    public String getLocation() {
        return mLocation;
    }

    public String getTime() {
        return mTime;
    }
}
