package e.hg.ageapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {


    private Button calculator;
    private EditText age;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        result=findViewById(R.id.textView2);
        age=findViewById(R.id.editText);

        calculator=findViewById(R.id.button);

        calculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int a=Calendar.getInstance().get(Calendar.YEAR)-Integer.parseInt(age.getText().toString());

                result.setText(a +"");
            }
        });



    }
}
