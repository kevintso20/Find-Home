package com.example.findhome.gallery;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import com.example.findhome.R;


import java.util.List;

public class GalleryImageListAdapter extends ArrayAdapter<GalleryModel> {

    private int resourceLayout;
    private Context mContext;

    public GalleryImageListAdapter(Context context, int resource, List<GalleryModel> galleryModels) {
        super(context, resource, galleryModels);
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
            GalleryCardFragment galleryCardFragment = null;

            ImageView imageView = convertView.findViewById(R.id.galleryCard_image);
            GalleryModel p = getItem(position);
            imageView.setImageBitmap(galleryCardFragment.getBitmapFromURL(p.getImage()));


        return convertView;
    }
}
