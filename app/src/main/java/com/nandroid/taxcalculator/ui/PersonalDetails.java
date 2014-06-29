package com.nandroid.taxcalculator.ui;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;

import com.nandroid.taxcalculator.R;


public class PersonalDetails extends Activity {

    Spinner mTitleSpinner;
    EditText mFirstNameEditText, mLastNameEditText;
    Switch mGenereSwitch, mSeniorCitizenSwitch, mMetroCitySwitch, mIncomeModeSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal_details);
        mTitleSpinner = (Spinner) findViewById(R.id.spinner_title);
        mFirstNameEditText = (EditText) findViewById(R.id.first_name);
        mLastNameEditText = (EditText) findViewById(R.id.last_name);
        mGenereSwitch = (Switch) findViewById(R.id.switch_genere);
        mSeniorCitizenSwitch = (Switch) findViewById(R.id.switch_senior_citizen);
        mMetroCitySwitch = (Switch) findViewById(R.id.switch_living_in_metro);
        mIncomeModeSwitch = (Switch) findViewById(R.id.switch_income_mode);


        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.title_list, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mTitleSpinner.setAdapter(adapter);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.personal_details, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
