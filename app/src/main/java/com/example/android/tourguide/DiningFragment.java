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
public class DiningFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the list
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.QuinlansBarName), getString(R.string.QuinlansBarDesc), getString(R.string.QuinlansBarAbout), R.drawable.seafood_bar));
        places.add(new Place(getString(R.string.BricinRestaurant), getString(R.string.BricinRestDesc), getString(R.string.BricinRestAbout), R.drawable.bricin_restaurant));
        places.add(new Place(getString(R.string.CroninsRestName), getString(R.string.CroninsRestDesc), getString(R.string.CroninsRestAbout), R.drawable.cronins_restaurant));
        places.add(new Place(getString(R.string.MacsRestName), getString(R.string.MacsRestDesc), getString(R.string.MacsRestAbout), R.drawable.macs));
        places.add(new Place(getString(R.string.SmokeHouseRestName), getString(R.string.SmokeHouseRestDesc), getString(R.string.SmokeHouseRestAbout), R.drawable.smokehouse_dining));
        places.add(new Place(getString(R.string.CasitaMexicanaName), getString(R.string.CasitaMexicanaDesc), getString(R.string.CasitaMexicanaAbout), R.drawable.casita_mexicana));
        places.add(new Place(getString(R.string.TreyvaudsRestName), getString(R.string.TreyvaudsRestDesc), getString(R.string.TreyvaudsRestAbout), R.drawable.treyvauds_restaurant));
        places.add(new Place(getString(R.string.CelticBarName), getString(R.string.CelticBarDesc), getString(R.string.CelticBarAbout), R.drawable.celtic_whiskey_bar));
        places.add(new Place(getString(R.string.MilanoRestName), getString(R.string.MilanoRestDesc), getString(R.string.MilanoRestAbout), R.drawable.milano));
        places.add(new Place(getString(R.string.DesireKitchenRestName), getString(R.string.DesireKitchenRestDesc), getString(R.string.DesireKitchenRestAbout), R.drawable.desire_kitchen));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }
}
