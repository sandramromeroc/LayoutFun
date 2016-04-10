/*
 * CS 193A, Marty Stepp
 * This activity class represents the event handling and state
 * of our ninja turtle app.
 */

package com.example.stepp.layoutfun;
//
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {
    /*
     * This method is called when the user chooses one of the turtle radio buttons.
     * In this code we set which turtle image is visible on the screen in the ImageView.
     */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void click(View View){
        Intent i = new Intent(this, com.example.stepp.layoutfun.FiltrosTS.class);
        //i.putExtra("direccion", et1.getText().toString());
        startActivity(i);

    }


}
