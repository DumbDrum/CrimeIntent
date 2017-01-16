package com.example.student1.crimeintent;

import android.support.v4.app.Fragment;


public class ListOfCrimes extends SingleFragmentActivity {
    protected Fragment createFragment(){
        return new CrimeFragment();
    }
}
