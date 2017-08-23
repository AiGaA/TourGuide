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
public class SightsFragment extends Fragment {
    public SightsFragment() {
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
        places.add(new Place(getString(R.string.TorcWaterfall), getString(R.string.TorcWaterfallDescription), getString(R.string.TorcWaterfallAbout), R.drawable.torc_waterfall));
        places.add(new Place(getString(R.string.TorcMountain), getString(R.string.TorcMountainDescription), getString(R.string.TorcMountainAbout), R.drawable.torc_mountain));
        places.add(new Place(getString(R.string.MuckrossHouse), getString(R.string.MuckrossDescription), getString(R.string.MuckrossHouseAbout), R.drawable.muckross_house));
        places.add(new Place(getString(R.string.RossCastle), getString(R.string.RossCastleDescription), getString(R.string.RossCastleAbout), R.drawable.ross_castle));
        places.add(new Place(getString(R.string.LakesOfKillarney), getString(R.string.LakeDescription), getString(R.string.LakesAbout), R.drawable.killarney_lakes));
        places.add(new Place(getString(R.string.GapOfDunloe), getString(R.string.GapOfDunloeDescription), getString(R.string.GapOfDunloeAbout), R.drawable.gap_of_dunloe));
        places.add(new Place(getString(R.string.RingOfKerry), getString(R.string.RingOfKerryDescription), getString(R.string.RingOfKerryAbout), R.drawable.ring_of_kerry));
        places.add(new Place(getString(R.string.InnisfallenIsland), getString(R.string.InnisfallenDescription), getString(R.string.InnisfallenAbout), R.drawable.innisfallen_island));
        places.add(new Place(getString(R.string.MuckrossAbbey), getString(R.string.MuckrossAbbeyDescription), getString(R.string.MuckrossAbbeyAbout), R.drawable.muckross_abbey));
        places.add(new Place(getString(R.string.Falconry), getString(R.string.FalconryDescription), getString(R.string.FalconryAbout), R.drawable.falconry));


        //Set the adapter for the places
        PlaceAdapter adapter = new PlaceAdapter(getActivity(), places);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(adapter);

        //Return the fragment rootview
        return rootView;
    }
}
