package com.example.android.reportcard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<String> classes = new ArrayList<String>();
        classes.add("Algebra I");
        classes.add("Biology");
        classes.add("English");
        classes.add("Spanish I");
        classes.add("P. E.");
        classes.add("World History");
        classes.add("Band");
    }
}
