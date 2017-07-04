package com.example.rachiket.speed_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by udaipur on 7/3/2017.
 */

public class UseKioskHindi extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.use_kiosk_hindi);

        Button backButHindi = (Button)findViewById(R.id.back_use_kiosk_hindi);
        backButHindi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(),Hindi.class);
                startActivity(i);
            }
        });

    }

}
