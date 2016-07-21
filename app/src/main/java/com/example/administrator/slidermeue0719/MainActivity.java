package com.example.administrator.slidermeue0719;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.example.administrator.slidermeue0719.Utils.Utils;
import com.example.administrator.slidermeue0719.drag.DragLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //查找Draglayout，设置监听
        DragLayout mDragLayout = (DragLayout) findViewById(R.id.dl);
        mDragLayout.setDragStausListener(new DragLayout.OnDragStatusChangeListener() {
            @Override
            public void onClose() {
                Utils.showToast(MainActivity.this,"close");
            }

            @Override
            public void onOpen() {
                Utils.showToast(MainActivity.this,"open");

            }

            @Override
            public void onDraging(float percent) {

            }
        });
    }
}
