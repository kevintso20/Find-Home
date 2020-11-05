package com.example.findhome.view_a_property;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.findhome.R;
import com.synnapps.carouselview.CarouselView;
import com.synnapps.carouselview.ImageListener;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;


public class ImagesCarouselFragment extends Fragment {

    private  String[] images = new String[]{
            "https://images.unsplash.com/photo-1567767292278-a4f21aa2d36e?ixlib=rb-1.2.1&q=80&fm=jpg&crop=entropy&cs=tinysrgb&w=1080&fit=max&ixid=eyJhcHBfaWQiOjEyMDd9",
            "https://www.marinabaysands.com/content/dam/singapore/marinabaysands/master/main/home/hotel/rooms-suites/grand-club-room-thumbnail-1000x750.jpg",
            "https://www.marinabaysands.com/content/dam/singapore/marinabaysands/master/main/home/hotel/rooms-suites/club-room/club-room-thumbnail-1000x750.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn%3AANd9GcRl5d0yyVFFhIFtOGr5DoqXoCmBYBnsofPgvQ&usqp=CAU"

    };


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.images_carousel, container, false);

        CarouselView carouselView = view.findViewById(R.id.image_room_carousel);
        carouselView.setPageCount(images.length);
        carouselView.setImageListener(new ImageListener() {
            @Override
            public void setImageForPosition(int position, ImageView imageView) {
                imageView.setImageBitmap(getBitmapFromURL(images[position]));
            }
        });
        return view;
    }

    public static Bitmap getBitmapFromURL(String src) {
        try {
            URL url = new URL(src);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setDoInput(true);
            connection.connect();
            InputStream input = connection.getInputStream();
            Bitmap myBitmap = BitmapFactory.decodeStream(input);
            return myBitmap;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
}