package com.mac.training.orientation;

import android.content.res.Configuration;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private int currentOrientation;
    private Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.i("onCreate: ", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        currentOrientation = getScreenOrientation();
        changeButtonText(currentOrientation);
        Log.i("Orientation: ", "" + currentOrientation);
    }

    private void changeButtonText(int currentOrientation) {
        if (currentOrientation == 1) {
            btn.setText("Hi!");
        } else if (currentOrientation == 2) {
            btn.setText("GoodBye");
        }
    }

    private int getScreenOrientation() {
        return getResources().getConfiguration().orientation;
    }
}
