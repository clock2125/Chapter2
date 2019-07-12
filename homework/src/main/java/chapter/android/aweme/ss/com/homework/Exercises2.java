package chapter.android.aweme.ss.com.homework;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * 作业2：一个抖音笔试题：统计页面所有view的个数
 * Tips：ViewGroup有两个API
 * {@link android.view.ViewGroup #getChildAt(int) #getChildCount()}
 * 用一个TextView展示出来
 *
 *
 * 答：7个
 */
public class Exercises2 extends AppCompatActivity {

    static int cnt = 0;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        View inflate = LayoutInflater.from(this).inflate(R.layout.activity_chatroom,null);
        setContentView(inflate);
        getViewCount(inflate, 0);
        System.out.println("number of views:"+cnt);
    }

    private ArrayList<View> getViewCount(View view, int n) {
        ArrayList<View> allchildren = new ArrayList<View>();
        if (view instanceof ViewGroup) {
            ViewGroup vp = (ViewGroup) view;
            for (int i = 0; i < vp.getChildCount(); i++) {
                View viewchild = vp.getChildAt(i);
                allchildren.add(viewchild);
                for(int j = 0;j<n;j++){
                    System.out.print(' ');
                }
                System.out.println(viewchild.getId());
                cnt++;
                allchildren.addAll(getViewCount(viewchild, n+1));
            }
        }
        return allchildren;
    }

}
