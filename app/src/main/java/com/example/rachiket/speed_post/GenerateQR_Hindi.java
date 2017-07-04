package com.example.rachiket.speed_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by udaipur on 7/3/2017.
 */

public class GenerateQR_Hindi extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.generating_qr_hindi);

        Button printBut = (Button) findViewById(R.id.generate_code_hindi);
        printBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), PrintQR_Hindi.class);
                startActivity(i);
            }
        });

        Button backBut = (Button) findViewById(R.id.back_from_generate_hindi);
        backBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), Hindi.class);
                startActivity(i);
            }
        });

    }


}
