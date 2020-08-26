package mx.tec.example.example_1itesm_ad2020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button myBtn;
    TextView myTxtView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //renders whats on the xml
        setContentView(R.layout.activity_main);

        //connect this button to the one on the XML
        myBtn = findViewById(R.id.button1);
        myTxtView = findViewById(R.id.txtview1);

        myTxtView.setText("Good Bye Class!");

    }
}