package com.example.android.tourguide;

/**
 * Created by AiGa on 2017.06.27..
 */

public class Place {
    //The name of the place
    private String mPlaceName;


    //The description of the place
    private String mPlaceDescription;

    //The history and long description about place
    private String mPlaceAbout;

    //The ID of the image resource of the place
    private int mPlaceImageResourceID;


    //public constructor of the Place object which takes three parameters
    public Place(String name, String description, int imageResourceID) {
        mPlaceName = name;
        mPlaceDescription = description;
        mPlaceImageResourceID = imageResourceID;
    }

    //Public constructor of the Place object which takes four parameters
    public Place(String name, String description, String about, int imageResourceID) {
        mPlaceName = name;
        mPlaceDescription = description;
        mPlaceAbout = about;
        mPlaceImageResourceID = imageResourceID;
    }

    //Get the name of the place
    public String getName() {
        return mPlaceName;
    }

    //Get the description of the place
    public String getDescription() {
        return mPlaceDescription;
    }

    //Get the long description about the place
    public String getAbout() {
        return mPlaceAbout;
    }

    //Get the image resource ID of the place
    public int getImageResourceID() {
        return mPlaceImageResourceID;
    }

}
