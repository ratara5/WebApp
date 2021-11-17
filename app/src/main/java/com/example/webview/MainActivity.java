package com.example.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et1=(EditText)findViewById(R.id.txt_web);
    }

    //Método Botón IR
    public void navegar(View view){
        Intent ir =new Intent(this, SecondActivity.class);
        ir.putExtra("sitioWeb",et1.getText().toString());
        startActivity(ir);
    }
}