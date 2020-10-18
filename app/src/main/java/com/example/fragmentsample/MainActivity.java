package com.example.fragmentsample;

import androidx.appcompat.app.AppCompatActivity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.widget.Button;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    private Button buttonChangeFragment;
    private FrameLayout fragmentContainer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonChangeFragment = findViewById(R.id.button_change_fragment);
        fragmentContainer = findViewById(R.id.fragment_container);

        buttonChangeFragment.setOnClickListener(v -> {
            FragmentManager fragmentManager = getFragmentManager();
            FragmentTransaction transaction = fragmentManager.beginTransaction();

            transaction.replace(R.id.fragment_container, new SecondFragment());
            transaction.addToBackStack("erew");
            transaction.commit();
        });

    }
}