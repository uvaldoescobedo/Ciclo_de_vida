package com.cetech.uvaldo.ciclo_de_vida;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mostrarMensaje("OnCreate    ");

    }

    private void mostrarMensaje(String mensaje){
        Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show();
            }


    //principales metodos de ciclos de vida de una aplicaicon en android , estos se van a sobre escribir para declarar acciones a hacer en cierta actividad

    @Override
    protected void onStart() {
        super.onStart();
        mostrarMensaje("OnStart");
    }

    @Override
    protected void onPostResume() {
        super.onPostResume();
        mostrarMensaje("OnResume");
    }

    @Override
    protected void onStop() {
        super.onStop();
        mostrarMensaje("OnStop");
    }

    @Override
    protected void onPause() {
        super.onPause();
        mostrarMensaje("OnPause");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        mostrarMensaje("OnRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mostrarMensaje("OnDestroy");
    }
}

