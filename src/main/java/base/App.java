package base;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class App {
    static final double conversion = 0.09290304;//constant for conversion
    Scanner input = new Scanner(System.in); //class scanner

    public static void main(String[] args)
    {
        App area = new App(); //create instance

        double length = area.askLength();
        double width = area.askWidth();
        area.printDimensions(length,width);

        //calculate area
        double standardArea = area.calculateArea(length, width);

        //convert area to metric
        double metricArea = area.convertArea(standardArea);

        //print output
        area.printArea(standardArea, metricArea);
    }

    public double askLength()
    {
        System.out.print("What is the length of the room in feet? ");
        return input.nextFloat();
    }

    public double askWidth()
    {
        System.out.print("What is the width of the room in feet? ");
        return input.nextFloat();
    }

    public void printDimensions(double length, double width)
    {
        //create new number formatter
        NumberFormat standardFormat = new DecimalFormat("#0");

        //Printing dimensions with formatting to match sample
        System.out.println("You entered dimensions of " + standardFormat.format(length) + " feet by " + standardFormat.format(width) + " feet.");
    }

    public double calculateArea(double length, double width)
    {
        return length * width;
    }

    public double convertArea(double area)
    {
        return area * conversion;
    }
    public void printArea(double area, double metricArea)
    {
        //format decimal places to match sample output
        NumberFormat standardFormat = new DecimalFormat("#0");
        NumberFormat metricFormat = new DecimalFormat("#0.000");

        System.out.print("The area is\n" + standardFormat.format(area) + " square feet\n" + metricFormat.format(metricArea) + " square meters\n");
    }
}
