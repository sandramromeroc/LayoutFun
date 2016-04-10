package com.example.stepp.layoutfun;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;

public class Resultados extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultados);
    }

    public void click(View View){
        Intent i = new Intent(this, com.example.stepp.layoutfun.FiltrosTS.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }
}
