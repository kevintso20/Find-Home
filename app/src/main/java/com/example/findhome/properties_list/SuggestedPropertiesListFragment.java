package com.example.findhome.properties_list;

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


public class SuggestedPropertiesListFragment extends Fragment {

    SuggestedListAdapter cardAdapter;
    List<SuggestedPropertiesModel> suggestedModels = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_suggested_properties_list, container, false);



        suggestedModels.add(new SuggestedPropertiesModel("The best choice",3,8.1f,912,"Chainatown" ,86, 34, "https://media.architecturaldigest.com/photos/56d8c93365e378730c185b14/master/w_400%2Cc_limit/bedroom-with-fireplaces-2-002.jpg"));
        suggestedModels.add(new SuggestedPropertiesModel("Moody Moon",4,6.3f,231,"Manhatan" ,210, 21, "https://images.wallpaperscraft.com/image/living_room_interior_design_fireplaces_furniture_106134_1280x720.jpg"));
        suggestedModels.add(new SuggestedPropertiesModel("Mandarin Oriental",4.5f,9.5f,691,"Sindicon valley" , 91,59, "https://images.wallpaperscraft.com/image/bed_bedroom_room_balcony_view_furniture_39712_1280x720.jpg"));
        suggestedModels.add(new SuggestedPropertiesModel("Radisson Hote",3.5f,7.8f,762,"Holywood" , 154,13, "https://images.wallpaperscraft.com/image/bedroom_design_interior_bed_doors_high_tech_96528_1280x720.jpg"));


        cardAdapter  = new SuggestedListAdapter(getActivity() , R.layout.suggested_properties_card, suggestedModels);

        ListView listView = view.findViewById(R.id.suggestedPropertiesList);
        listView.setAdapter(cardAdapter);

        return view;
    }
}