package com.flakoo.convexp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Calculator extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        
        setContentView(R.layout.activity_calculator);
        
        // aperture pickers
        ArrayAdapter<CharSequence> inputApertureAdapter = ArrayAdapter.createFromResource(this, R.array.apertures_array, android.R.layout.simple_spinner_item);
        inputApertureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner inputApertureSpinner = (Spinner)findViewById(R.id.inputApertureSpinner);
        inputApertureSpinner.setAdapter(inputApertureAdapter);
        
        ArrayAdapter<CharSequence> outputApertureAdapter = ArrayAdapter.createFromResource(this, R.array.apertures_array, android.R.layout.simple_spinner_item);
        outputApertureAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner outputApertureSpinner = (Spinner)findViewById(R.id.outputApertureSpinner);
        outputApertureSpinner.setAdapter(outputApertureAdapter);
        
        // exposure time picker
        ArrayAdapter<CharSequence> inputExposureTimeAdapter = ArrayAdapter.createFromResource(this, R.array.exposure_time_array, android.R.layout.simple_spinner_item);
        inputExposureTimeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner inputExposureTimeSpinner = (Spinner)findViewById(R.id.inputExposureTimeSpinner);
        inputExposureTimeSpinner.setAdapter(inputExposureTimeAdapter);
        
        // iso pickers
        ArrayAdapter<CharSequence> inputIsoAdapter = ArrayAdapter.createFromResource(this, R.array.iso_array, android.R.layout.simple_spinner_item);
        inputIsoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner inputIsoSpinner = (Spinner)findViewById(R.id.inputIsoSpinner);
        inputIsoSpinner.setAdapter(inputIsoAdapter);
        
        ArrayAdapter<CharSequence> outputIsoAdapter = ArrayAdapter.createFromResource(this, R.array.iso_array, android.R.layout.simple_spinner_item);
        outputIsoAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner outputIsoSpinner = (Spinner)findViewById(R.id.outputIsoSpinner);
        outputIsoSpinner.setAdapter(outputIsoAdapter);        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.activity_calculator, menu);
        return true;
    }
    
}
