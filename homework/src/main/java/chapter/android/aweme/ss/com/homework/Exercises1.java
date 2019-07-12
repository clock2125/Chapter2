package chapter.android.aweme.ss.com.homework;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * 作业1：
 * 打印出Activity屏幕切换 Activity会执行什么生命周期？
 *
 * 答：
 * onCreate
 * onStart
 * onResume
 * //旋转
 * onPause
 * onStop
 * onDestroy
 * onCreate
 * onStart
 * onResume
 *
 */
public class Exercises1 extends AppCompatActivity{

    private static final String TAG = "wangyi";

    static ArrayList<String> state = new ArrayList<String>();


    private static final String ON_CREATE = "onCreate";
    private static final String ON_START = "onStart";
    private static final String ON_RESUME = "onResume";
    private static final String ON_PAUSE = "onPause";
    private static final String ON_STOP = "onStop";
    private static final String ON_RESTART = "onRestart";
    private static final String ON_DESTROY = "onDestroy";


    private TextView mLifecycleDisplay;


    private void Print() {
        int i;
        for(i=0;i<state.size();i++){
            mLifecycleDisplay.append(state.get(i)+"\n");
        }
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        state.add(ON_RESTART);
    }

    @Override
    protected void onStart() {
        super.onStart();
        state.add(ON_START);
    }

    @Override
    protected void onResume() {
        super.onResume();
        state.add(ON_RESUME);
        Print();
    }


    @Override
    protected void onPause() {
        super.onPause();
        state.add(ON_PAUSE);
    }

    @Override
    protected void onStop() {
        super.onStop();
        state.add(ON_STOP);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        state.add(ON_DESTROY);
    }


    static int index = 0;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.exercise1_main);
        mLifecycleDisplay = findViewById(R.id.ex1_tv1);
        Button btn = findViewById(R.id.ex1_btn1);
        btn.setOnClickListener(new View.OnClickListener() {
                                   public void onClick(View v) {
                                       state.clear();
                                       mLifecycleDisplay.setText("");
                                   }
                               });
//        logAndAppend(String.valueOf(index++));
        state.add(ON_CREATE);
    }


}
