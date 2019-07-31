package com.gustiawandicoding.mynotesapp;

import android.view.View;

/**
 * Created by Gustiawan on 9/22/2018.
 */

public class CustomOnItemClickListener implements View.OnClickListener {

    private int position;
    private OnItemClickCallback onItemClickCallback;

    public CustomOnItemClickListener(int position, OnItemClickCallback onItemCallback){
        this.position = position;
        this.onItemClickCallback = onItemCallback;
    }

    @Override
    public void onClick(View view) {
        onItemClickCallback.onItemClicked(view, position);

    }

    public interface OnItemClickCallback {
        void onItemClicked(View view, int position);
    }


}
