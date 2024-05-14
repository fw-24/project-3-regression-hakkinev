package fi.arcada.regressionsanalys;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    double[] xData = { 47,  42,  43,  42,  41,  48,  46,  44,  42,  43,  39,  43,  39,  42,  44,  45,  43,  44,  45,  42,  43,  32,  48,  43,  45,  45};
    double[] yData = { 194, 188, 181, 177, 182, 197, 179, 176, 177, 188, 164, 171, 170, 180, 171, 185, 179, 182, 180, 178, 178, 148, 197, 183, 179, 198};
    double yValue;
    TextView outText;
    EditText editTextNumber;
    Button calcBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outText = findViewById(R.id.outText);
        editTextNumber = findViewById(R.id.editTextNumber);
        calcBtn = findViewById(R.id.calcBtn);

        // Lägg till en lyssnare för knappen
        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getEstimate();
            }
        });
    }

    public void getEstimate() {
        try {
            // Hämta och spara användarens input i yValue
            yValue = Double.parseDouble(editTextNumber.getText().toString());

            // Instansiera RegressionLine-objekt
            RegressionLine regLine = new RegressionLine(xData, yData);

            // Anropa getX() för att få uppskattat skostorlek baserat på längden
            double estShoeSize = regLine.getX(yValue);

            // Visa resultatet för användaren utan decimaler
            outText.setText("Skostorlek: " + String.format("%.0f", estShoeSize));

        }   catch (NumberFormatException e) {
                outText.setText("Ange en giltig längd.");
            }
    }
}
