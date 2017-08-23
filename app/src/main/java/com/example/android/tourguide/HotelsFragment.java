package com.example.android.tourguide;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class HotelsFragment extends Fragment {
    //required empty constructor
    public HotelsFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the list
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.RandlesHotelName), getString(R.string.RandlesHotelDesc), getString(R.string.RandlesHotelAbout), R.drawable.randles_hotel));
        places.add(new Place(getString(R.string.PlazaHotelName), getString(R.string.PlazaHotelDesc), getString(R.string.PlazaHotelAbout), R.drawable.plaza_spa_hotel));
        places.add(new Place(getString(R.string.RiversideHotelName), getString(R.string.RiversideHotelDesc), getString(R.string.RiversideHotelAbout), R.drawable.riverside_hotel));
        places.add(new Place(getString(R.string.ParkHotelName), getString(R.string.ParkHotelDesc), getString(R.string.ParkHotelAbout), R.drawable.park_hotel));
        places.add(new Place(getString(R.string.McSweeneyHotelName), getString(R.string.McSweeneyHotelDesc), getString(R.string.McSweeneyHotelAbout), R.drawable.mcsweeney_hotel));
        places.add(new Place(getString(R.string.HolidayInnName), getString(R.string.HolidayInnDesc), getString(R.string.HolidayInnAbout), R.drawable.holiday_inn));
        places.add(new Place(getString(R.string.BrehonHotelName), getString(R.string.BrehonHotelDesc), getString(R.string.BrehonHotelAbout), R.drawable.brehon_hotel));
        places.add(new Place(getString(R.string.GleneagleHotelName), getString(R.string.GleneagleHotelDesc), getString(R.string.GleneagleHotelAbout), R.drawable.gleneagle_hotel));
        places.add(new Place(getString(R.string.AghadoeHotelName), getString(R.string.AghadoeHotelDesc), getString(R.string.AghadoeHotelAbout), R.drawable.aghadoe_hotel));
        places.add(new Place(getString(R.string.MuckrossHotelName), getString(R.string.MuckrossHotelDesc), getString(R.string.MuckrossHotelAbout), R.drawable.muckross_hotel));
        places.add(new Place(getString(R.string.MaltonHotelName), getString(R.string.MaltonHotelDesc), getString(R.string.MaltonHotelAbout), R.drawable.malton_hotel));

        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }
}
