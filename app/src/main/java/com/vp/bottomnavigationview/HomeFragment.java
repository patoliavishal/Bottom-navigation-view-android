package com.vp.bottomnavigationview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Vishal Patolia on 18-Feb-18.
 */

public class HomeFragment extends Fragment {

    @BindView(R.id.home_txtTitle)
    TextView mHomeTxtTitle;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);
        ButterKnife.bind(this, rootView);
        mHomeTxtTitle.setText(getString(R.string.menu_home));
        return rootView;
    }
}
