package com.example.student1.crimeintent;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import com.example.student1.crimeintent.dummy.DummyContent;
import com.example.student1.crimeintent.dummy.DummyContent.DummyItem;

import java.util.ArrayList;
import java.util.List;


public class ListOfCrimes extends Fragment {

    public ArrayList<Crime> mCrimes;



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.list_of_crimes, container, false);
        Spinner spinner = (Spinner) v.findViewById(R.id.spinner);
        ArrayAdapter adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, mCrimes);
        spinner.setAdapter(adapter);

        return v;
    }
}
