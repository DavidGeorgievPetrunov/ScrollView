package com.example.scrollview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = findViewById(R.id.article);
        editText.setFocusable(false);
    }

    public void writableOnOff(View view) {
        if (editText.isFocusable()  ){
            editText.setFocusable(false);
            editText.setFocusableInTouchMode(false);
        } else {
            editText.setFocusable(true);
            editText.setFocusableInTouchMode(true);
        }

        //Tambien puedo usar el enabled pero esto afecta la apariencia del texto haciendolo mas dificil de leer
        //if if (editText.isEnabled()  ){
        //            editText.setEnabled(false);
        //        } else {
        //            editText.setEnabled(true);
        //        }
        Toast.makeText(this, "¡Botón clicado!", Toast.LENGTH_SHORT).show();
    }
}