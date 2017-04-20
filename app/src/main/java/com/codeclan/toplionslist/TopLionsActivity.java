package com.codeclan.toplionslist;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ListView;

import java.util.ArrayList;

public class TopLionsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.lions_list);

        TopLions topLions = new TopLions();
        ArrayList<Lion> list = topLions.getList();

        TopLionsAdapter lionsAdapter = new TopLionsAdapter(this, list);

        ListView listView = (ListView) findViewById(R.id.list);
        listView.setAdapter(lionsAdapter);
    }

    public void getLion(View listItem) {
        Lion lion = (Lion) listItem.getTag();
        Log.d("Lion Name: ", lion.getName());

    }

    startActivity(Intent, intent)

}
