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
public class NightlifeFragment extends Fragment {

    public NightlifeFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        //Inflate the list
        View rootView = inflater.inflate(R.layout.place_list, container, false);

        //Create the ArrayList for the places
        ArrayList<Place> places = new ArrayList<Place>();

        //Add the places to the ArrayList
        places.add(new Place(getString(R.string.JarveysPubName), getString(R.string.JarveysPubDesc), getString(R.string.JarveysPubAbout), R.drawable.jarveys_pub));
        places.add(new Place(getString(R.string.GrandHotelName), getString(R.string.GrandHotelDesc), getString(R.string.GrandHotelAbout), R.drawable.the_grand_nightclub));
        places.add(new Place(getString(R.string.KubeBarName), getString(R.string.KubeBarDesc), getString(R.string.KubeBarAbout), R.drawable.the_kube_bar));
        places.add(new Place(getString(R.string.TatlersBarName), getString(R.string.TatlersBarDesc), getString(R.string.TatlersBarAbout), R.drawable.tatler_jack_pub));
        places.add(new Place(getString(R.string.CourtneysBarName), getString(R.string.CourtneysBarDesc), getString(R.string.CourtneysBarAbout), R.drawable.courtneys_bar));
        places.add(new Place(getString(R.string.ShireBarName), getString(R.string.ShireBarDesc), getString(R.string.ShireBarAbout), R.drawable.the_shire_bar));
        places.add(new Place(getString(R.string.LaurelsBarName), getString(R.string.LaurelsBarDesc), getString(R.string.LaurelsBarAbout), R.drawable.the_laurels_pub));
        places.add(new Place(getString(R.string.JacksCBarName), getString(R.string.JacksCBarDesc), getString(R.string.JacksCBarAbout), R.drawable.jacks_pub));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }

}

