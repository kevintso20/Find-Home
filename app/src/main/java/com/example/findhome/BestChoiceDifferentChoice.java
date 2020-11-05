package com.example.findhome;

import android.graphics.Typeface;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.style.ImageSpan;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

public class BestChoiceDifferentChoice extends Fragment {



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view = inflater.inflate(R.layout.fragment_best_choice_different_choice, container, false);

        TextView textView = view.findViewById(R.id.bestDealTitle);
//
////        textView.setCompoundDrawablesWithIntrinsicBounds(
////                R.drawable.a, 0, 0, 0);
//
////        SpannableStringBuilder spannableStringBuilder =  new SpannableStringBuilder();
////        Log.e("DDD",""+spannableStringBuilder.length());
////        spannableStringBuilder.append("aaadddeeee");
////        Log.e("DDD",""+spannableStringBuilder.length());
////
////        spannableStringBuilder.setSpan(new ImageSpan(view.getContext(), R.drawable.blue_star_icon) , 0 , 0,0);
//
//        SpannableStringBuilder ssb = new SpannableStringBuilder(" Hello world! Hello world! Hello world! Hello world! Hello world! Hello world! setCompo undDrawable sWithIn trinsicBounds  setCompou ndD rawa blesWithIntr insicB ounds");
//        textView.setCompoundDrawablesWithIntrinsicBounds(
//                R.drawable.two_human_purple, 0, 0, 0);
//        textView.append(ssb);
       return view;
    }
}

// TODO: https://stackoverflow.com/questions/6272614/how-do-i-get-the-text-at-a-specific-line-in-a-textview