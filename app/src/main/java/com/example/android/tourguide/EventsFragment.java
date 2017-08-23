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
public class EventsFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        //Inflate the list
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.CelticSteps), getString(R.string.CelticStepsDescription), getString(R.string.CelticStepsAbout), R.drawable.celtic_steps));
        places.add(new Place(getString(R.string.Inec), getString(R.string.InecDescription), getString(R.string.InecAbout), R.drawable.inec));
        places.add(new Place(getString(R.string.Cineplex), getString(R.string.CineplexDescription), getString(R.string.CineplexAbout), R.drawable.cineplex));
        places.add(new Place(getString(R.string.FitzgeraldStadium), getString(R.string.FitzgeraldStadiumDescription), getString(R.string.FitzgeraldStadiumAbout), R.drawable.fitzgerald_stadium));
        places.add(new Place(getString(R.string.BikeFest), getString(R.string.BikeFestDescription), getString(R.string.BikeFestAbout), R.drawable.bikefest));
        places.add(new Place(getString(R.string.ROKCharityCycle), getString(R.string.RingOfKerryDescription), getString(R.string.KerryCharityCycleAbout), R.drawable.rok_cycle));
        places.add(new Place(getString(R.string.FolkFest), getString(R.string.FolkFestDescription), getString(R.string.FolkfestFestAbout), R.drawable.folkfest));
        places.add(new Place(getString(R.string.JulyRaces), getString(R.string.JulyRacesDescription), getString(R.string.JulyRacingAbout), R.drawable.july_races));
        places.add(new Place(getString(R.string.AugustRaces), getString(R.string.AugustRacesDescription), getString(R.string.AugustRacingAbout), R.drawable.august_races));
        places.add(new Place(getString(R.string.CyclingFestival), getString(R.string.CyclingFestivalDescription), getString(R.string.KillarneyCyclingFestAbout), R.drawable.cycling_festival));

        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }
}
