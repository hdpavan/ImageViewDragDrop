package com.tutorialsbuzz.dragimageview;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.tutorialsbuzz.dragimageview.CustomView.TouchImageViewSample;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {


    TouchImageViewSample touchImageViewSample;


    View mainView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        mainView = inflater.inflate(R.layout.fragment_main, container, false);

        touchImageViewSample = (TouchImageViewSample) mainView.findViewById(R.id.imageView);


        return mainView;
    }

    @Override
    public void onResume() {
        super.onResume();
        

    }
}
