package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

public class MainFrame extends Activity implements OnClickListener {

    private CardView Semester,Praktika,Weblinks,OffeneModule,Notizen;
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.mainframe);

        Semester = findViewById(R.id.sem_view);
        Praktika = findViewById(R.id.praktika_view);
        Weblinks = findViewById(R.id.links_view);
        OffeneModule = findViewById(R.id.offenemodule_view);
        Notizen = findViewById(R.id.notizen_view);

        Semester.setOnClickListener(this);
        Praktika.setOnClickListener(this);
        Weblinks.setOnClickListener(this);
        OffeneModule.setOnClickListener(this);
        Notizen.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        Intent i;
        if (v.getId()==R.id.sem_view) {

            i = new Intent(this, SemesterAnsicht.class);
            startActivity(i);
        } else if (v.getId() == R.id.praktika_view) {
            i = new Intent(this, Praktika.class);
            startActivity(i);
        }else if(v.getId() == R.id.links_view) {
            i = new Intent(this, Links.class);
            startActivity(i);
        } else if (v.getId()==R.id.offenemodule_view) {
            i = new Intent(this, OffeneModule.class);
            startActivity(i);
        } else if (v.getId() ==R.id.notizen_view ){
            i = new Intent(this, Notizen.class);
            startActivity(i);
        }
    }
}
