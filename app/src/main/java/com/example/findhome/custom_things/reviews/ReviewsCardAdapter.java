package com.example.findhome.custom_things.reviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

import com.example.findhome.R;

import java.util.List;

public class ReviewsCardAdapter extends PagerAdapter {

    private List<ReviewsModel> reviewsModels;
    private LayoutInflater layoutInflater;
    private Context context;

    public ReviewsCardAdapter(List<ReviewsModel> reviewsModels, Context context) {
        this.reviewsModels = reviewsModels;
        this.context = context;
    }

    @Override
    public int getCount() {
        return reviewsModels.size();
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view.equals(object);
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        layoutInflater = LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.reviews_card,container , false);

        TextView category,reviewsNoumber ,comments, firstBenefit , secondBenefit, thirdBenefit ;

        category = view.findViewById(R.id.card_head_category);
        reviewsNoumber = view.findViewById(R.id.card_head_noumberOfReviews);
        comments =  view.findViewById(R.id.card_body_comment);
        firstBenefit = view.findViewById(R.id.card_body_comment_firstRow_benefit);
        secondBenefit = view.findViewById(R.id.card_body_comment_secondRow_benefit);
        thirdBenefit = view.findViewById(R.id.card_body_comment_thirdRow_benefit);




        category.setText(reviewsModels.get(position).getCategory());
        reviewsNoumber.setText(String.valueOf(reviewsModels.get(position).getReviewsNoumber()) + " reviews");
        comments.setText(reviewsModels.get(position).getComment());
        firstBenefit.setText(reviewsModels.get(position).getFirstBenefit());
        secondBenefit.setText(reviewsModels.get(position).getSecondBenefit());
        thirdBenefit.setText(reviewsModels.get(position).getThirdBenefit());


        container.addView(view , 0);



        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
       container.removeView((View)object);
    }
}
