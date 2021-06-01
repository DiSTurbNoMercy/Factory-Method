package com.example.factorymethod;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "36186";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarCreator europeCarCreator = new EuropeCarCreator();
        Car bmw = europeCarCreator.create(EuropeCarCreator.BMW);
        Car renault = europeCarCreator.create(EuropeCarCreator.Renault);
        Car landrover = europeCarCreator.create(EuropeCarCreator.LandRover);
        Car dacia = europeCarCreator.create(EuropeCarCreator.Dacia);
        Car ferrari = europeCarCreator.create(EuropeCarCreator.Ferrari);

        Log.d(TAG, bmw.getInfo());
        Log.d(TAG, renault.getInfo());
        Log.d(TAG, landrover.getInfo());
        Log.d(TAG, dacia.getInfo());
        Log.d(TAG, ferrari.getInfo());
    }
}