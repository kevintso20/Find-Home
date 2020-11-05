package com.example.findhome.view_a_property;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.findhome.R;
import com.example.findhome.custom_things.reviews.ReviewsCardAdapter;
import com.example.findhome.custom_things.reviews.ReviewsModel;

import java.util.ArrayList;
import java.util.List;

public class ReviewsFragment extends Fragment {

    ViewPager viewPager;
    ReviewsCardAdapter cardAdapter;
    List<ReviewsModel> reviewsModels = new ArrayList<>();

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_reviews, container, false);

        String comment = "Great dining with affortable prices, great deserts, and lovely snacks";
        reviewsModels.add(new ReviewsModel("food",110,comment, "Free popcorn", "Free muffins","Plenty of food options"));
        reviewsModels.add(new ReviewsModel("vibe",73,comment, "Good servce", "Nice colors","Comfortable room"));
        reviewsModels.add(new ReviewsModel("location",51,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));
        reviewsModels.add(new ReviewsModel("service",259,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));
        reviewsModels.add(new ReviewsModel("location",51,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));
        reviewsModels.add(new ReviewsModel("service",259,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));
        reviewsModels.add(new ReviewsModel("location",51,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));
        reviewsModels.add(new ReviewsModel("service",259,comment, "End of imagination boundarys", "End of imagination boundarys","End of imagination boundarys"));


        cardAdapter = new ReviewsCardAdapter(reviewsModels ,getActivity());
        viewPager = view.findViewById(R.id.reviews_body_carousel);
        viewPager.setOffscreenPageLimit(3);
        viewPager.setAdapter(cardAdapter);


        return view;
    }
}