package com.example.bmi_roshankumarshah;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText height, weight;
    private Button btncalculate;
    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        height=findViewById(R.id.etheight);
        weight=findViewById(R.id.etweight);
        output=findViewById(R.id.output);
        btncalculate=findViewById(R.id.calculate);

        btncalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double Height = Double.parseDouble(height.getText().toString());
                double Weight = Double.parseDouble(weight.getText().toString());

                BMI_Act bmi = new BMI_Act();
                bmi.setHeight(Height);
                bmi.setWeight(Weight);
                double res = bmi.BMI();

                output.setText(Double.toString(res) + "  kg/m^2");

                if(res<18.5){
                    Toast.makeText(MainActivity.this,"Underweight",Toast.LENGTH_LONG).show();
                }else if(res>=18.5 && res<=24.9){
                    Toast.makeText(MainActivity.this,"Normalweight",Toast.LENGTH_LONG).show();
                }else if(res>=25 && res<=29.9){
                    Toast.makeText(MainActivity.this,"Overweight",Toast.LENGTH_LONG).show();
                }else if(res>=30){
                    Toast.makeText(MainActivity.this,"Obesity",Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
