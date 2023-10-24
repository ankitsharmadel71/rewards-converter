import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RewardValueTests {

    @Test
    void create_with_cash_value() {
        double cashValue = 100d;
        var rewardValue = new RewardValue(cashValue);
        assertEquals((long) (cashValue * 0.0035), rewardValue.getCashValue());
    }

    @Test
    void create_with_miles_value() {
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue * 285, rewardValue.getMilesValue());
    }

    @Test
    void convert_from_cash_to_miles() {
        assert true;
    }

    @Test
    void convert_from_miles_to_cash() {
        assert true;
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
        double mtc;
           mtc=285*cvalue;
        return (long)mtc;
    }
     double getCashValue()
    {
        double ctm;
           ctm=0.0035*cvalue;
        return (long)ctm;
    }

    }
}
