package com.liuh.learn.quickindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.liuh.learn.quickindex.widget.QuickIndexView;

public class MainActivity extends AppCompatActivity {

    QuickIndexView mQuickIndexView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mQuickIndexView = findViewById(R.id.id_quickIndexView);
        mQuickIndexView.setOnLetterChangeListener(new QuickIndexView.OnLetterChangeListener() {
            @Override
            public void onLetterChanged(String letter) {
                Log.e("-----------", "letter : " + letter);

                ToastUtil.showToast(MainActivity.this, letter);
            }
        });
    }
}
