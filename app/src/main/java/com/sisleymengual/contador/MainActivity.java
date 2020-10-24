package com.sisleymengual.contador;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {
    private final String CONTEO = "com.sisley.mengual.contador.conteo";
    private TextView mConteoTextView;
    private Button mContarButton;
    private Button mReiniciarButton;
    private int mConteo;


    @Override
    public void onSaveInstanceState(@NonNull Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(CONTEO, mConteo);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mConteo = 0;
        mConteoTextView = findViewById(R.id.conteo_text_view);
        mContarButton = findViewById(R.id.contar_button);
        mReiniciarButton = findViewById(R.id.reiniciar_button);

        if (savedInstanceState != null) {
            mConteo = savedInstanceState.getInt(CONTEO);
        }
        else {
            mConteo = 0;
        }
        mConteoTextView.setText(String.format(Locale.getDefault(), "%d", mConteo));
        mContarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConteo++;
                mConteoTextView.setText(
                        String.format(Locale.getDefault(), "%d", mConteo));
            }
        });
        mReiniciarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mConteo = 0;
                mConteoTextView.setText(
                        String.format(Locale.getDefault(), "%d", mConteo));
            }

        });
    }
}




