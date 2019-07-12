package com.ss.android.ugc.chapter1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import static android.content.ContentValues.TAG;

/**
 * Fn +F2
 */
public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView listView = findViewById(R.id.listview);
        ListViewBaseAdapter adapter = new ListViewBaseAdapter(this);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(MainActivity.this, "点击了第：" + position, Toast.LENGTH_LONG).show();
            }
        });
        int position = getIntent().getIntExtra("position", 1000);
        Toast.makeText(MainActivity.this, "数据传输：" + position, Toast.LENGTH_LONG).show();
        Log.d(TAG, "onCreate: ");
    }
    

    @Override protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }

    @Override protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }

    @Override protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.d(TAG, "onActivityResult: ");
        
    }
}
