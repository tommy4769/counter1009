package tw.edu.pu.s1088123.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1,button2,button3,button4;
    TextView text1;
    int x = 0;
    int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = findViewById(R.id.btn1);
        button2 = findViewById(R.id.btn2);
        button3 = findViewById(R.id.btn3);
        button4 = findViewById(R.id.btn4);
        text1 = findViewById(R.id.text);


        View.OnClickListener myOnClickListner = new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (x == 0) {
                    switch (view.getId()) {
                        case R.id.btn1:
                            sum = sum + 10;
                            break;

                        case R.id.btn2:
                            sum = sum + 20;
                            break;

                        case R.id.btn3:
                            sum = sum + 30;
                            break;
                        case R.id.btn4:
                            sum =0;
                    }
                    text1.setText("熱量總共是" + sum);
                }
            }


        };
            button1.setOnClickListener(myOnClickListner);
            button2.setOnClickListener(myOnClickListner);
            button3.setOnClickListener(myOnClickListner);
            button4.setOnClickListener(myOnClickListner);


    }
}
