package com.example.yanmonteiro.primeiralistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] listaValores = new String[]{"Let's", "Go", "Cepo", "De", "Madeira"};

        ListView lv = (ListView) findViewById(R.id.lstConteudo);

        ArrayAdapter<String> adaptador =
                new ArrayAdapter<String>(
                        this,
                        R.layout.segundo_layout,
                        R.id.txtView,
                        listaValores);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Toast.makeText(MainActivity.this,
                        "Clicou em "+ position,
                        Toast.LENGTH_LONG).show();
            }
        });

        lv.setAdapter(adaptador);
    }
}
