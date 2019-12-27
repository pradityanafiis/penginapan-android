package id.ac.digind.gasskos;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DividerItemDecoration;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;

import java.util.List;

import id.ac.digind.gasskos.adapters.RiwayatAdapter;
import id.ac.digind.gasskos.models.Riwayat;

public class RiwayatActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        RecyclerView recyclerView = findViewById(R.id.rv_notifikasi);
        List<Riwayat> dataList = Riwayat.dummyData(10);
        RiwayatAdapter adapter = new RiwayatAdapter(dataList);
        recyclerView.setAdapter(adapter);
    }

}