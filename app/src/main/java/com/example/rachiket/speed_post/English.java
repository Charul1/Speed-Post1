package com.example.rachiket.speed_post;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Rachiket on 19-06-2017.
 */

public class English extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_screen);

        Button useKioskBut = (Button) findViewById(R.id.use_kiosk);
        useKioskBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), UseKiosk.class);
                startActivity(i);
            }
        });

        Button printQRBut = (Button) findViewById(R.id.print_QR);
        printQRBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), PrintQR.class);
                startActivity(i);
            }
        });

        Button postBut = (Button) findViewById(R.id.post_letter);
        postBut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(v.getContext(), UseKiosk.class);
                startActivity(i);
            }
        });

    }

}
