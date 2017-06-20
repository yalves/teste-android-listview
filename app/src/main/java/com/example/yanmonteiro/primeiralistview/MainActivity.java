package com.example.yanmonteiro.primeiralistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

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
    }
}
