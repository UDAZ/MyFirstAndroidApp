package work.contre.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.*;
import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClickButton(android.view.View view) {
        TextView bmiScore = this.findViewById(R.id.bmiScore);
        EditText heightForm = this.findViewById(R.id.heightForm);
        EditText weightForm = this.findViewById(R.id.weightForm);

        String strHeight,strWeight;
        strHeight = heightForm.getText().toString();
        strWeight = weightForm.getText().toString();

        double bmi,height,weight;
        height = Double.parseDouble(strHeight);
        weight = Double.parseDouble(strWeight);
        height /= 100;
        bmi = weight / (height * height);
        String msg = String.format(Locale.US,"BMIスコア：%.1f", bmi);
        bmiScore.setText(msg);



    }
}