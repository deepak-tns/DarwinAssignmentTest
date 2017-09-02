package com.tns.assignmenttest;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }

    public static HomeFragment newInstance(int index) {
        HomeFragment f = new HomeFragment();
        Bundle args = new Bundle();
        args.putInt("index", index);
        f.setArguments(args);
        return f;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v=  inflater.inflate(R.layout.fragment_home, container, false);
        View highlight =(View)v. findViewById(R.id.eth);

        highlight.setBackgroundResource(R.color.colorPrimary);//Any color you want to set

        ViewGroup.LayoutParams layoutParams = highlight.getLayoutParams();
        layoutParams.width = (int) (dpToPixel(5) * 25 / 100.0f);//If you want to set 25%
        highlight.setLayoutParams(layoutParams);
        return v;
    }
    public int dpToPixel(float dp) {
        final float scale = getResources().getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }

}
