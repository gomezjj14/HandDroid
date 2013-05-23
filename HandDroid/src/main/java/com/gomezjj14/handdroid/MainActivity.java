package com.gomezjj14.handdroid;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {
    public final static String EXTRA_LOCAL="com.gomezjj14.handdroid.LOCAL";
    public final static String EXTRA_VISITANTE="com.gomezjj14.handdroid.VISITANTE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    public void empezarPartido(View view){
        Intent intent = new Intent(this, PartidoActivity.class);
        EditText etLocal = (EditText) findViewById(R.id.editTextLocal);
        EditText etVisitante = (EditText) findViewById(R.id.editTextVisitante);

        intent.putExtra(EXTRA_LOCAL, etLocal.getText().toString());
        intent.putExtra(EXTRA_VISITANTE, etVisitante.getText().toString());
        startActivity(intent);
    }
    
}
