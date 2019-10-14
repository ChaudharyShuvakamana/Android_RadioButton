package com.example.animals;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    RadioButton radioButton1,radioButton2,radioButton3;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioButton1=findViewById(R.id.radio_bird);
        radioButton2=findViewById(R.id.radio_tiger);
        radioButton3=findViewById(R.id.radio_snake);
        imageView=findViewById(R.id.image_view);

        radioButton1.setOnClickListener(this);
        radioButton2.setOnClickListener(this);
        radioButton3.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId())
        { case R.id.radio_bird:
        imageView.setImageResource(R.drawable.bird);
        break;
            case  R.id.radio_tiger:
        imageView.setImageResource(R.drawable.tiger);
        break;
            case R.id.radio_snake:
        imageView.setImageResource(R.drawable.snake);
        break;}
    }
}
