package com.example.myapplication;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class Links extends Activity implements View.OnClickListener {

    private String ilu = "https://ilu.th-koeln.de/ilias.php?baseClass=ilrepositorygui&ref_id=1";
    private String psso = "https://psso.th-koeln.de/qisserver/rds?state=user&type=0";
    private String cams ="https://cams.th-koeln.de/qisserver/pages/cs/sys/portal/hisinoneStartPage.faces";

    ImageView ilu_view;
    ImageView psso_view;
    ImageView cams_view;


    @Override
    public void onCreate(Bundle bundle){
        super.onCreate(bundle);
        setContentView(R.layout.link_layout);

        ilu_view = findViewById(R.id.ilu);
        psso_view = findViewById(R.id.psso);
        cams_view = findViewById(R.id.cams);

        ilu_view.setOnClickListener(this);
        psso_view.setOnClickListener(this);
        cams_view.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent i = new Intent(this, Webview.class);
        if (v.getId() == R.id.ilu) {
            i.putExtra("LinkName",ilu);
            Toast.makeText(this,"Wechsle zur Internetseite", Toast.LENGTH_SHORT).show();
            startActivity(i);
        }else if (v.getId() == R.id.cams) {
            i.putExtra("LinkName",cams);
            Toast.makeText(this,"Wechsle zur Internetseite", Toast.LENGTH_SHORT).show();
            startActivity(i);
        } else if (v.getId() == R.id.psso) {
            i.putExtra("LinkName",psso);
            Toast.makeText(this,"Wechsle zur Internetseite", Toast.LENGTH_SHORT).show();
            startActivity(i);
        }
    }
}
