package com.example.student1.crimeintent;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CrimeFragment extends Fragment {
    private Button mDateButton;
    private CheckBox mSolvedCheckBox;
    Crime mCrime;
    private ArrayList <Crime> mCrimes;
    private Button ButtonTitle;
    private EditText mTitleField;

   // public ArrayList<Crime> getmCrimes() {
     //   return mCrimes;
    //}

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
         mCrime = new Crime("Title");
         mCrimes = CrimeLab.get(getActivity()).getmCrimes();
        for (Crime c:mCrimes){
            Log.v("CRIME", c + "");
        }

    }


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_crime,container,false);
        ButtonTitle = (Button)v.findViewById(R.id.getTitle);
        ButtonTitle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast toast = Toast.makeText(getActivity().getApplicationContext(),
                        mCrime.getTitle(),
                        Toast.LENGTH_SHORT);
                toast.show();
            }
        });
        mTitleField =(EditText)v.findViewById(R.id.Fragment_Crime_edit_text2);

        mTitleField.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                mCrime.setTitle(charSequence.toString() );
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        mDateButton = (Button)v.findViewById(R.id.crime_date);
        mDateButton.setText(mCrime.getmDate().toString());
        mDateButton.setEnabled(false);

        mSolvedCheckBox=(CheckBox)v.findViewById(R.id.checkBox);
        mSolvedCheckBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean isChecked) {
                mCrime.setSolved(isChecked);
            }
        });
        return v;


    }
}
