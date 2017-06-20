package com.example.yanmonteiro.primeiralistview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

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

//                Basico
//                Toast.makeText(MainActivity.this,
//                        "Clicou em "+ position,
//                        Toast.LENGTH_LONG).show();


//                Pegando conteudo filho da ListView
//                TextView textView = (TextView) view.findViewById(R.id.txtView);
//                Toast.makeText(MainActivity.this, "Clicou em " +
//                                textView.getText().toString(),
//                        Toast.LENGTH_SHORT).show();

                Intent intencao = new Intent(MainActivity.this, SegundaTela.class);

                TextView textView = (TextView) view.findViewById(R.id.txtView);

                intencao.putExtra("texto", textView.getText().toString());
                startActivity(intencao);

            }
        });

        lv.setAdapter(adaptador);
    }
}
