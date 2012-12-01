package com.example.intentsample1;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class IntentFirst extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent_first);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_intent_first, menu);
        return true;
    }
}
