package com.example.student1.crimeintent;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;

import com.example.student1.crimeintent.ListOfCrimes;
import com.example.student1.crimeintent.R;

/**
 * Created by asus on 15.01.2017.
 */

public abstract class SingleFragmentActivity extends FragmentActivity{@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_fragment);
    FragmentManager fm = getSupportFragmentManager();
    Fragment fragment = fm.findFragmentById(R.id.fragmentContainer);

    if (fragment==null){
        //fragment =
        fm.beginTransaction().add(R.id.fragmentContainer,fragment).commit();

    }
}
}

