package com.example.findhome.gallery;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import com.example.findhome.R;
import com.example.findhome.custom_things.suggested_propertie.SuggestedListAdapter;
import com.example.findhome.custom_things.suggested_propertie.SuggestedPropertiesModel;

import java.util.ArrayList;
import java.util.List;


public class GalleryListFragment extends Fragment {

    GalleryImageListAdapter listAdapter;
    List<GalleryModel> galleryModels = new ArrayList<>();


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
      View view = inflater.inflate(R.layout.fragment_gallery_list, container, false);

        galleryModels.add(new GalleryModel("https://media.architecturaldigest.com/photos/56d8c93365e378730c185b14/master/w_400%2Cc_limit/bedroom-with-fireplaces-2-002.jpg"));
        galleryModels.add(new GalleryModel("https://images.wallpaperscraft.com/image/living_room_interior_design_fireplaces_furniture_106134_1280x720.jpg"));
        galleryModels.add(new GalleryModel("https://images.wallpaperscraft.com/image/bed_bedroom_room_balcony_view_furniture_39712_1280x720.jpg"));
        galleryModels.add(new GalleryModel("https://images.wallpaperscraft.com/image/bedroom_design_interior_bed_doors_high_tech_96528_1280x720.jpg"));

        listAdapter  = new GalleryImageListAdapter(getActivity() , R.layout.fragment_gallery_card, galleryModels);

        ListView listView = view.findViewById(R.id.GalleryList);
        listView.setAdapter(listAdapter);

        return view;
    }
}