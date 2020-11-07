package com.example.findhome.detaild_search;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.findhome.R;

public class DetaildSearchFragment extends Fragment {


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       View view = inflater.inflate(R.layout.fragment_detaild_search, container, false);

        ConstraintLayout constraintLayout = view.findViewById(R.id.detaildSearch_persons);

        constraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AddGuestsFragment addGuestsFragment = new AddGuestsFragment();
                addGuestsFragment.show(getChildFragmentManager(), "addGuestFragment");
            }
        });

        return view;
    }
}