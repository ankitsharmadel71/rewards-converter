import java.util.Scanner;

public class RewardsConverter {
    public static void main(String[] args) {

          System.out.println("Welcome to the Credit Card Rewards Converter!");
          System.out.println("Press 1 for cash to miles convertor !");
          System.out.println("Press 2 for miles to cash convertor !");
          var inputs = new Scanner(System.in);
          var options = inputs.nextLine();
          int choise;
         try {
            choise = Integer.parseInt(options);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
            }
              finally
              {
                inputs.close();
              }
       
        
        switch (choise) {
          case 1:
           var scanner = new Scanner(System.in);
      
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var choise1 = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(choise1);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
            }
                System.out.println("converting $" + choise1 + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + choise1 + " is worth " +(long) rewardsValue.getMilesValue() + " miles");
            break;
          case 2:
            var scanner1 = new Scanner(System.in);
        
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value2 = scanner1.nextLine();
        int milesValue;

         try {
            milesValue = Integer.parseInt(input_value2);
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
            }
            System.out.println("converting miles" + input_value2 + " to cash");
        var rewardsValue1 = new RewardValue(milesValue);
        System.out.println("Miles  " + input_value2 + " is worth " +(long) rewardsValue1.getCashValue() + "$ cash");
           scanner1.close();
        break;
          default:
            System.out.println("Please meke correct choise");
        }


       /*  var scanner = new Scanner(System.in);
        System.out.println("Welcome to the Credit Card Rewards Converter!");
        System.out.println("Please enter a cash value to convert to airline miles: ");
        var input_value = scanner.nextLine();
        double cashValue;
        try {
            cashValue = Double.parseDouble(input_value);1
            
        } catch (NumberFormatException exception) {
            System.out.println("Could not parse input value as a double, exiting");
            return;
        }
        
        
        System.out.println("converting $" + input_value + " to miles");
        var rewardsValue = new RewardValue(cashValue);
        System.out.println("$" + input_value + " is worth " + rewardsValue.getMilesValue() + " miles");
    */
    }

    static class RewardValue {
        // Initializing global variables
      double cvalue;
    
        // Constructor
        RewardValue(double cash) {
        cvalue=cash; 
        }
         RewardValue(int cash) {
        cvalue=cash; 
        }
    double getMilesValue()
    {
        double ctm;
           ctm=285*cvalue;
        return ctm;
    }
     double getCashValue()
    {
        double ctm;
           ctm=0.0035*cvalue;
        return ctm;
    }

    }
}