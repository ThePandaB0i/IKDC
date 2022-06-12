package com.example.ikdc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

import java.util.Objects;

public class Verigiris extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);//will hide the title
        Objects.requireNonNull(getSupportActionBar()).hide();
        setContentView(R.layout.activity_verigiris);
    }

    public void ilacActivate(View view) {
        Intent intent = new Intent(this,ilac.class);
        startActivity(intent);
    }
    public void terminate(View view) {
        finish();
    }
}