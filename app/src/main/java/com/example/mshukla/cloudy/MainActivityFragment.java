package com.example.mshukla.cloudy;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import butterknife.Bind;
import butterknife.ButterKnife;

/**
 * A placeholder fragment containing a simple view.
 */
public class MainActivityFragment extends Fragment {

    private ArrayAdapter<String> mForecastAdapter;
    @Bind(R.id.listview_layout)
    ListView listView;

    public MainActivityFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_main, container, false);
        ButterKnife.bind(this,rootView);

        String forcastArray[] = { "Today-Sunny-81/85","Today-Sunny-81/85",
                "Today-Sunny-81/82",
                "Today-Sunny-81/86"};
        List<String> weekForecast = new ArrayList<>(Arrays.asList(forcastArray));

        mForecastAdapter = new ArrayAdapter<String>(getActivity(), R.layout.list_item_forecast, R.id.list_item_forecast_textview,
                weekForecast);

        listView.setAdapter(mForecastAdapter);

        return rootView;

    }




}
