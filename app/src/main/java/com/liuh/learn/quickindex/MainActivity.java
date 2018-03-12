package com.liuh.learn.quickindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.liuh.learn.quickindex.adapter.CityListAdapter;
import com.liuh.learn.quickindex.utils.ToastUtil;
import com.liuh.learn.quickindex.widget.QuickIndexView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_city)
    RecyclerView rvCity;

    @BindView(R.id.id_quickIndexView)
    QuickIndexView mQuickIndexView;

    private CityListAdapter cityAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);


        mQuickIndexView.setOnLetterChangeListener(new QuickIndexView.OnLetterChangeListener() {
            @Override
            public void onLetterChanged(String letter) {
                Log.e("-----------", "letter : " + letter);

                ToastUtil.showToast(MainActivity.this, letter);
            }
        });
    }
}
