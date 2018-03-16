package com.kaksha.karanbagle.kaksha;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class About1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about1);
    }
    
    @Override
public void onBackPressed() {
    new AlertDialog.Builder(this)
        .setIcon(android.R.drawable.ic_dialog_alert)
        .setTitle("Closing Activity")
        .setMessage("Are you sure you want to close this activity?")
        .setPositiveButton("Yes", new DialogInterface.OnClickListener()
    {
        @Override
        public void onClick(DialogInterface dialog, int which) {
            finish();    
        }

    })
    .setNegativeButton("No", null)
    .show();
}
    
}
