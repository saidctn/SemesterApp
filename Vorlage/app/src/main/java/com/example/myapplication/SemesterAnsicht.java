package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;

public class SemesterAnsicht extends Activity implements View.OnClickListener {
    private CardView s1,s2,s3,s4,s5,s6,s7;
    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.semesteransicht_layout);
        s1 = findViewById(R.id.sem_1);
        s2 = findViewById(R.id.sem_2);
        s3 = findViewById(R.id.sem_3);
        s4 = findViewById(R.id.sem_4);
        s5 = findViewById(R.id.sem_5);
        s6 = findViewById(R.id.sem_6);
        s7 = findViewById(R.id.sem_7);

        s1.setOnClickListener(this);
        s2.setOnClickListener(this);
        s3.setOnClickListener(this);
        s4.setOnClickListener(this);
        s5.setOnClickListener(this);
        s6.setOnClickListener(this);
        s7.setOnClickListener(this);

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
        Intent i = new Intent(this, Stundenplan.class);
        Intent intent = new Intent(this, Wartung.class);

        if (v.getId() == R.id.sem_1){
            //i.putExtra("pdfName","Batin4.pdf");
            startActivity(intent);
        } else if (v.getId() == R.id.sem_2) {
            i.putExtra("pdfName","BATIN2.pdf");
            startActivity(i);
        } else if (v.getId() == R.id.sem_3) {
            startActivity(intent);
        }else if (v.getId() == R.id.sem_4) {
            i.putExtra("pdfName","BATIN4.pdf");
            startActivity(i);
        }else if (v.getId() == R.id.sem_5) {
            startActivity(intent);
        }else if (v.getId() == R.id.sem_6) {
            i.putExtra("pdfName","BATIN6.pdf");
            startActivity(i);
        }else if (v.getId() == R.id.sem_7) {
            startActivity(intent);
        }

    }
}
