package com.example.android.tourguide;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

/**
 * Created by AiGa on 2017.06.27..
 */

public class PlaceAdapter extends ArrayAdapter<Place> {

    private Context context = getContext();

    public PlaceAdapter(Activity context, ArrayList<Place> places) {
        super(context, 0, places);
    }

    @NonNull
    @Override
    public View getView(final int position, View convertView, ViewGroup parent) {

        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        // Get the {@link Place} object located at this position in the list
        final Place currentPlace = getItem(position);

        //Get the ImageView and set the image of the Object
        ImageView itemImageView = (ImageView) listItemView.findViewById(R.id.image);
        itemImageView.setImageResource(currentPlace.getImageResourceID());

        //Get the TextView and set the name of the Object
        TextView nameTextView = (TextView) listItemView.findViewById(R.id.place_name);
        nameTextView.setText(currentPlace.getName());

        //Get the TextView and set the description of the Object
        TextView descriptionTextView = (TextView) listItemView.findViewById(R.id.description);
        descriptionTextView.setText(currentPlace.getDescription());


        // * Set a click listener to open the details activity
        // * Pass the data that you need as string extras
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DetailActivity.class);
                intent.putExtra("name", currentPlace.getName());
                intent.putExtra("image", currentPlace.getImageResourceID());
                intent.putExtra("about", currentPlace.getAbout());
                //On click it will be DetailActivity opened with intent.
                getContext().startActivity(intent);
            }
        });

        return listItemView;
    }
}
