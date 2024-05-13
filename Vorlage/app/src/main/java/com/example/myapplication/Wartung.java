package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.annotation.NonNull;

public class Wartung extends Activity {
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.wartung);
    }
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mi = new MenuInflater(this);
        mi.inflate(R.menu.optionmenu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        // Log.v("DEMO","##### Activity Alpha: "+item.getTitle()+" #####");
        if (item.getItemId() == R.id.Startseite) {
            Intent myintent = new Intent(this, MainFrame.class);
            myintent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(myintent);
        }
        return true;
    }

}
