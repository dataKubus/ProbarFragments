package com.example.probarfragments;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity
{
    public int pimerActivado = 5;
    public int segundoActivado = 10;
    public int fragmentSeleccionado = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SecondFragment fragment1 = new SecondFragment();
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, fragment1)
                .commit();
    }

    public void onclikCambiarFragment(View view)
    {
        if (fragmentSeleccionado == pimerActivado)
        {
            fragmentSeleccionado = segundoActivado;
            SecondFragment fragment1 = new SecondFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment1)
                    .commit();
        }
        else
        {
            fragmentSeleccionado = pimerActivado;
            BlankFragment fragment1 = new BlankFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment1)
                    .commit();
        }


    }
}