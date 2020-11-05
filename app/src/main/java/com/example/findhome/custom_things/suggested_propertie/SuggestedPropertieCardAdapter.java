package com.example.findhome.custom_things.suggested_propertie;

import android.content.Context;
import android.graphics.Typeface;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.findhome.R;
import com.example.findhome.view_a_property.ImagesCarouselFragment;

import java.util.List;

public class SuggestedPropertieCardAdapter extends PagerAdapter  {


    private List<SuggestedPropertiesModel> suggestedModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public SuggestedPropertieCardAdapter(List<SuggestedPropertiesModel> reviewsModels, Context context) {
        this.suggestedModels = reviewsModels;
        this.context = context;
    }

    @Override
    public int getCount() { return suggestedModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.suggested_properties_card,container , false);

        ImagesCarouselFragment imagesCarouselFragment = null;
        TextView name ,averageRatingReviewsNoumber ,location ,price , discoundPercentage ;
        RatingBar stars;
        ImageView imageView = view.findViewById(R.id.suggestedPropertieCard_image);


        name = view.findViewById(R.id.suggestedPropertieCard_body_title_text);
        stars = view.findViewById(R.id.suggestedPropertieCard_body_title_rating);
        averageRatingReviewsNoumber = view.findViewById(R.id.suggestedPropertieCard_body_rating_text);
        location = view.findViewById(R.id.suggestedPropertieCard_footer_location);
        price = view.findViewById(R.id.suggestedPropertieCard_footer_discount_percentage_oldPrice);
        discoundPercentage = view.findViewById(R.id.suggestedPropertieCard_footer_discount_percentage_noumber);


        name.setText(suggestedModels.get(position).getName());
        stars.setRating( suggestedModels.get(position).getStars());
        averageRatingReviewsNoumber.setText(boldRatingWithReviewsNoumber(position));
        location.setText(suggestedModels.get(position).getLocation());
        price.setText("$" + suggestedModels.get(position).getPrice());
        discoundPercentage.setText("" + suggestedModels.get(position).getDiscoundPercentage()+"%");
        imageView.setImageBitmap(imagesCarouselFragment.getBitmapFromURL(suggestedModels.get(position).getImage()));

        container.addView(view , 0);
        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((View)object);
    }

    private SpannableString boldRatingWithReviewsNoumber(int position){
        SpannableString spannableString = new SpannableString(suggestedModels.get(position).getAverageRating() + " - "+ suggestedModels.get(position).getReviewsNoumber() + " reviews");
        spannableString.setSpan(new StyleSpan(Typeface.BOLD), 0, String.valueOf(suggestedModels.get(position).getAverageRating()).length(), Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
        return spannableString;
    }


}
