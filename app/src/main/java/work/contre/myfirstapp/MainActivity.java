package work.contre.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(android.view.View view) {
        TextView bmiScore =(TextView)this.findViewById(R.id.bmiScore);
        EditText heightForm =(EditText)this.findViewById(R.id.heightForm);
        EditText weightForm =(EditText)this.findViewById(R.id.weightForm);

        String strHeight,strWeight;
        strHeight = heightForm.getText().toString();
        strWeight = weightForm.getText().toString();

        double bmi,height,weight;
        height = Double.parseDouble(strHeight);
        weight = Double.parseDouble(strWeight);
        height /= 100;
        bmi = weight / (height * height);
        String msg = "BMIスコア：" + bmi;
        bmiScore.setText(msg);



    }
}