package com.example.smp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MenuActivity extends AppCompatActivity {
    ImageView ivmenu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ivmenu = findViewById(R.id.iv_menu);


        ivmenu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MenuActivity.this,MainActivity.class);
                startActivity(intent);
            }
        });
    }
}