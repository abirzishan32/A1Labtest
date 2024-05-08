package com.example.a2007026;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textView1, textView2;
    Button CircleBtn, SquareBtn, TriangleBtn;
    Button RedBtn, BlueBtn, GreenBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        textView1 = findViewById(R.id.viewShape);
        CircleBtn = findViewById(R.id.circleBtn);
        SquareBtn = findViewById(R.id.sqrBtn);
        TriangleBtn = findViewById(R.id.triangleBtn);

        textView2 = findViewById(R.id.viewColor);
        RedBtn = findViewById(R.id.btnRed);
        BlueBtn = findViewById(R.id.btnBlue);
        GreenBtn = findViewById(R.id.btnGreen);



        CircleBtn.setOnClickListener(v -> {
            Circle circle = new Circle("circle", 5);
            String Area = "Area : " + circle.area();
            String Perimeter = "Perimeter : " + circle.perimeter();
            textView1.setText(Area + "\n" + Perimeter);
        });

        SquareBtn.setOnClickListener(v -> {
            Square square = new Square("square", 5);
            String Area = "Area : " + square.area();
            String Perimeter = "Perimeter : " + square.perimeter();
            textView1.setText(Area + "\n" + Perimeter);
        });



        RedBtn.setOnClickListener(v -> {
            Red red = new Red();
            red.showColor();
            textView2.setText("The color is: Red");
        });

        BlueBtn.setOnClickListener(v -> {
            Blue blue = new Blue();
            blue.showColor();
            textView2.setText("The color is: Blue");
        });

        GreenBtn.setOnClickListener(v -> {
            Green green = new Green();
            green.showColor();
            textView2.setText("The color is: Green");
        });

    }
}