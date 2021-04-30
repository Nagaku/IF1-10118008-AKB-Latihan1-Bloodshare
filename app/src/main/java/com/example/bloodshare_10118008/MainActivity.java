package com.example.bloodshare_10118008;


/*
    Tanggal : Jumat, 30/4/2021
    NIM     : 10118008
    Nama    : Michael Nagaku Milenn Salim
    Kelas   : IF-1
*/

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.view.View;
import android.os.Bundle;
import android.view.Window;

public class MainActivity extends AppCompatActivity {

    public String nama = "";
    public String tipe = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pertama(View view) {
        setContentView(R.layout.activity_form);
    }

    public void kedua(View view) {
        setContentView(R.layout.activity_almost_there);
    }

    public void ketiga(View view) {
        setContentView(R.layout.activity_verify_account);
    }

    public void keempat(View view) {
        setContentView(R.layout.activity_profile);
    }
}