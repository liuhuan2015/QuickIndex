package com.liuh.learn.quickindex;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;

import com.liuh.learn.quickindex.adapter.CityListAdapter;
import com.liuh.learn.quickindex.model.ATestData;
import com.liuh.learn.quickindex.model.ATestGoodMan;
import com.liuh.learn.quickindex.utils.ToastUtil;
import com.liuh.learn.quickindex.widget.QuickIndexView;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.rv_city)
    RecyclerView rvCity;

    @BindView(R.id.id_quickIndexView)
    QuickIndexView mQuickIndexView;

    private CityListAdapter cityAdapter;

    private List<ATestGoodMan> datas = new ArrayList<ATestGoodMan>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        for (String city : ATestData.names) {
            datas.add(new ATestGoodMan(city));
        }

        Collections.sort(datas);

        cityAdapter = new CityListAdapter(datas);
        rvCity.setAdapter(cityAdapter);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);

        rvCity.setLayoutManager(layoutManager);


        mQuickIndexView.setOnLetterChangeListener(new QuickIndexView.OnLetterChangeListener() {
            @Override
            public void onLetterChanged(String letter) {
                Log.e("-----------", "letter : " + letter);

                ToastUtil.showToast(MainActivity.this, letter);
            }
        });
    }
}
