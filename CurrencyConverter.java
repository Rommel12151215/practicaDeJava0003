  import java.util.Scanner;

  public class CurrencyConverter {
      public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
          System.out.println("Ingrese la cantidad a convertir:");
          double amount = scanner.nextDouble();
          System.out.println("Ingrese la moneda de origen (USD, EUR, INR):");
          String fromCurrency = scanner.next();
          System.out.println("Ingrese la moneda de destino (USD, EUR, INR):");
          String toCurrency = scanner.next();

          double convertedAmount = convertCurrency(amount, fromCurrency, toCurrency);
          System.out.println("La cantidad convertida es: " + convertedAmount + " " + toCurrency);
      }

      public static double convertCurrency(double amount, String fromCurrency, String toCurrency) {
          // Aquí debes implementar la lógica para convertir la moneda
          // Esto podría implicar hacer una solicitud a una API de conversión de divisas
          return amount; // Por ahora, simplemente devolvemos la cantidad sin convertir
      }
  }
