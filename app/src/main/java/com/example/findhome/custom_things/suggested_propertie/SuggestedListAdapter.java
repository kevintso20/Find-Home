package com.example.findhome.custom_things.suggested_propertie;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.findhome.R;
import com.example.findhome.view_a_property.ImagesCarouselFragment;

import java.util.List;

public class SuggestedListAdapter extends ArrayAdapter<SuggestedPropertiesModel> {

    private int resourceLayout;
    private Context mContext;

    public SuggestedListAdapter(Context context, int resource , List<SuggestedPropertiesModel> suggestedPropertiesModels) {
        super(context, resource, suggestedPropertiesModels);
        this.resourceLayout = resource;
        this.mContext = context;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        if (convertView == null) {
            LayoutInflater vi;
            vi = LayoutInflater.from(mContext);
            convertView = vi.inflate(resourceLayout, null);
        }
        if(position == 0) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.fragment_price_range, null);

            TextView price;
            String minPrice = "52" , maxPrice = "10,834";

            price = convertView.findViewById(R.id.suggestedPropertieList_price_padded_priceAndPriceRange_range);
            price.setText("$"+minPrice + " - " + "$"+maxPrice);
        }else{
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.suggested_properties_card, null);
            ImagesCarouselFragment imagesCarouselFragment = null;
            TextView name, averageRatingReviewsNoumber, location, price, discoundPercentage;
            RatingBar stars;
            ImageView imageView = convertView.findViewById(R.id.suggestedPropertieCard_image);


            SuggestedPropertiesModel p = getItem(position);

            name = convertView.findViewById(R.id.suggestedPropertieCard_body_title_text);
            stars = convertView.findViewById(R.id.suggestedPropertieCard_body_title_rating);
            averageRatingReviewsNoumber = convertView.findViewById(R.id.suggestedPropertieCard_body_rating_text);
            location = convertView.findViewById(R.id.suggestedPropertieCard_footer_location);
            price = convertView.findViewById(R.id.suggestedPropertieCard_footer_discount_percentage_oldPrice);
            discoundPercentage = convertView.findViewById(R.id.suggestedPropertieCard_footer_discount_percentage_noumber);
            
            name.setText(p.getName());
            stars.setRating(p.getStars());

            location.setText(p.getLocation());
            price.setText("$" + p.getPrice());
            discoundPercentage.setText("" + p.getDiscoundPercentage() + "%");
            imageView.setImageBitmap(imagesCarouselFragment.getBitmapFromURL(p.getImage()));
        }

        return convertView;
    }
}
