package com.sisleymengual.contador;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mConteoTextView;
    private Button mContarButton;
    private Button mReiniciarButton;
    private int mConteo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConteo = 0;
        mConteoTextView = findViewById(R.id.conteo_text_view);
        mContarButton = findViewById(R.id.contar_button);
        mReiniciarButton = findViewById(R.id.reiniciar_button);

        mContarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mConteo++;
                mConteoTextView.setText(Integer.toString(mConteo));

            }


        });
        mReiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mConteo = 0;
                mConteoTextView.setText(Integer.toString(mConteo));

            }
        });


    }
}