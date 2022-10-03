import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
      double fuelCapacity;
      double fuelEfficiency;
      double pricePerGallon;
      double totalDistance;
      double distanceCost;
      String trash;

       //distanceCost = pricePerGallon * (100 / fuelEfficiency)
      //totalDistance = fuelCapacity * fuelEfficiency

      Scanner in = new Scanner(System.in);

      System.out.println("Enter the number gallons of gas in the tank ");
      if (in.hasNextDouble()) {
        fuelCapacity = in.nextDouble();
        in.nextLine();


        System.out.println("Enter the fuel efficiency in miles per gallon ");

        if (in.hasNextDouble()) {
          fuelEfficiency = in.nextDouble();
          in.nextLine();


          System.out.println("Enter the price of gas per gallon ");

          if (in.hasNextDouble()) {
            pricePerGallon = in.nextDouble();
            in.nextLine();


            distanceCost = pricePerGallon * (100 / fuelEfficiency);

            totalDistance = fuelCapacity * fuelEfficiency;

            System.out.printf("The cost of travelling 100 miles is $%.2f%n ", distanceCost);
            System.out.printf("The total distance the car can travel is %.2f miles", totalDistance);

          }
        }
      } else {
        trash = in.nextLine();
        System.out.println("You entered an invalid width value" + trash);
      }
    }

}