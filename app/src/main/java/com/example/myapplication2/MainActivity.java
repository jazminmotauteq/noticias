package com.example.myapplication2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity
implements AdapterView.OnItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //DATOS
        final String[] datos =
                new
                        String[]{"JAZMIN MORA","WENDY MESTANZA","FRANCISCO VARELA","JOSEPH ESPINOZA","GLENDIS TAMAMI"};
        //ADAPTADOR
        ArrayAdapter<String> adaptador2 =
                new ArrayAdapter<String>(this,
                        android.R.layout.simple_list_item_1,
                        datos);
        ListView lstOpciones= (ListView)findViewById(R.id.cblista);
        lstOpciones.setAdapter(adaptador2);
//ASIGANA EL ADAPTADOR DE LA VISTA (sPINNER)

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}