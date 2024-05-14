// RegressionLine.java
package fi.arcada.regressionsanalys;

public class RegressionLine {

    double k; // Variabel för lutningen i räta linjens ekvation y = kx + m
    double m; // Variabel för skärningen i räta linjens ekvation y = kx + m


    // Konstruktor som tar emot data som double-arrays för x- och y-värden
    public RegressionLine(double[] xVals, double[] yVals) {
        // Uträkning av k och m med hjälp av minsta kvadratmetoden
        double sumX = 0, sumY = 0, sumXY = 0, sumXSquare = 0;
        // Loopar genom varje element i xVals
        for (int i = 0; i < xVals.length; i++) {
            sumX += xVals[i]; // Adderar det aktuella värdet av x till sumX
            sumY += yVals[i];// Adderar det aktuella värdet av y till sumY
            sumXY += xVals[i] * yVals[i];// Adderar produkten av aktuella x-värdet och y-värdet till sumXY
            sumXSquare += xVals[i] * xVals[i];// Adderar kvadraten av det aktuella x-värdet till sumXSquare
        }
        double n = xVals.length;
        k = (n * sumXY - sumX * sumY) / (n * sumXSquare - sumX * sumX);
        m = (sumY - k * sumX) / n;

    }

    // Metod för att beräkna och returnera skostorleken (x) baserat på ett givet y-värde
    public double getX(double y) {
        return (y - m) / k; // Använd räta linjens ekvation y = kx + m för att beräkna skostorleken (x)
    }

}
