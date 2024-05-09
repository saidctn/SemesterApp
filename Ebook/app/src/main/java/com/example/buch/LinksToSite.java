package com.example.buch;

import android.app.Activity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class LinksToSite extends Activity {
    CheckBox btnPsso;
    CheckBox btnIlu;
    CheckBox btnWebMail;
    CheckBox btnCampusIT;
    TextView textView ;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_site);

        // Getting checkbuttons by id
        btnPsso = findViewById(R.id.bntPsso);
        btnIlu = findViewById(R.id.bntIlu);
        btnWebMail = findViewById(R.id.bntWebMail);
        btnCampusIT = findViewById(R.id.btnCampusIT);

        // TextView for link display
        textView = findViewById(R.id.textViewHeaderID);

        btnPsso.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked() ) {
                    textView.setText("https://psso.th-koeln.de/qisserver/rds?state=user&type=0");
                }
            }
        });

        btnIlu.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    textView.setText("https://ilu.th-koeln.de/ilias.php?baseClass=ilmembershipoverviewgui");
                }
            }
        });

        btnWebMail.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    textView.setText("https://webmail.th-koeln.de/login.php");
                }
            }
        });


        btnCampusIT.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(compoundButton.isChecked()){
                    textView.setText("https://www.th-koeln.de/hochschule/campus-it_3866.php");
                }
            }
        });




    }
}
