package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;

import com.github.barteksc.pdfviewer.PDFView;

public class Stundenplan extends Activity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.stundenplan_layout);
        PDFView pdf = findViewById(R.id.pdf);
        String pdfname = getIntent().getStringExtra("pdfName");
        pdf.fromAsset(pdfname).load();
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mi = new MenuInflater(this);
        mi.inflate(R.menu.optionmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        Log.v("DEMO","##### Activity : "+item.getTitle()+" #####");

        if (item.getItemId() == R.id.Startseite) {
            Intent intent = new Intent(this, MainFrame.class);
            intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        }
        return true;
    }
}
