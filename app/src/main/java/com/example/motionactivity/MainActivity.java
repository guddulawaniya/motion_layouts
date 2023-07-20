package com.example.motionactivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityOptionsCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.transition.platform.MaterialContainerTransformSharedElementCallback;

public class MainActivity extends AppCompatActivity {

    Button nextbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        config();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextbutton = findViewById(R.id.nextbutton);


        nextbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this,MainActivity3.class);
                Bundle bundle = ActivityOptionsCompat.makeSceneTransitionAnimation(MainActivity.this,nextbutton,"go").toBundle();
                startActivity(intent,bundle);

            }
        });


    }

     void config() {
        setExitSharedElementCallback(new MaterialContainerTransformSharedElementCallback());
        getWindow().setSharedElementsUseOverlay(false);
    }
}