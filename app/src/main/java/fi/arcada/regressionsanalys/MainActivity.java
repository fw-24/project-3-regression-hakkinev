package fi.arcada.regressionsanalys;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Två datamängder med längd och skonummer för 26 olika personer
    // hänger ihop på så vis att xData[0] och yData[0] är skonummer och längd  för den första personen, osv.
    // Observera att de är primitiva arrays, inte ArrayLists, så de behandlas lite annorlunda.
    double[] xData = { 47,  42,  43,  42,  41,  48,  46,  44,  42,  43,  39,  43,  39,  42,  44,  45,  43,  44,  45,  42,  43,  32,  48,  43,  45,  45};
    double[] yData = { 194, 188, 181, 177, 182, 197, 179, 176, 177, 188, 164, 171, 170, 180, 171, 185, 179, 182, 180, 178, 178, 148, 197, 183, 179, 198};

    // Deklarera yValue för längd, Denna variabel ska sedan få ett värde som hämtas från en EditText-box i appens GUI
    double yValue;

    // Deklarera övriga variabler och objekt du behöver, t.ex. TextViews osv.

    @Override
    protected void onCreate(Bundle savedInstanceState)  {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Här kommer som vanligt alla findViewById som behövs
    }

    // Gör så att den här metoden anropas vid ett knapptryck
    public void getEstimate(View view) {

        // RegressionLine beräknar regressionslinjen på basen av våra datamängder
        // RegressionLine är alltså en klass som vi själva definierat (och som bör vidareutvecklas!)
        // Instansiera regressionLine t.ex. så här:
        //RegressionLine regLine = new RegressionLine(xData, yData);

        // Ta emot användarens input (längd) och spara i yValue
        // Använd ett try/catch-block för NumberFormatException så att appen inte crashar
        // om man skriver någonting annat än siffror

        // Anropa regLine.getX()-metoden via objektet regLine, och använd yValue som parameter
        // Skicka svaret till en TextView i layouten!


    }

}
