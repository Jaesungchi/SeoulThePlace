package com.ensharp.seoul.seoultheplace.Course.PlaceView;


import android.support.v7.widget.CardView;

public interface CardAdapter {

    public final int MAX_ELEVATION_FACTOR = 4;

    float getBaseElevation();

    CardView getCardViewAt(int position);

    int getCount();
}
