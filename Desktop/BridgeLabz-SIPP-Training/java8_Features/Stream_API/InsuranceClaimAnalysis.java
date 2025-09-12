package Stream_API;
import java.util.*;
import java.util.stream.*;

class InsuranceClaim {
    String claimType;
    double amount;

    public InsuranceClaim(String claimType, double amount) {
        this.claimType = claimType;
        this.amount = amount;
    }

    public String getClaimType() {
        return claimType;
    }

    public double getAmount() {
        return amount;
    }
}

public class InsuranceClaimAnalysis {
    public static void main(String[] args) {
        List<InsuranceClaim> claims = Arrays.asList(
            new InsuranceClaim("Health", 5000),
            new InsuranceClaim("Car", 15000),
            new InsuranceClaim("Health", 7000),
            new InsuranceClaim("Home", 20000),
            new InsuranceClaim("Car", 12000),
            new InsuranceClaim("Health", 6000)
        );

        // Group by claim type and calculate average
        Map<String, Double> avgClaims = claims.stream()
            .collect(Collectors.groupingBy(
                InsuranceClaim::getClaimType,
                Collectors.averagingDouble(InsuranceClaim::getAmount)
            ));

        System.out.println("=== Average Claim Amount by Type ===");
        avgClaims.forEach((type, avg) -> 
            System.out.println(type + " → " + avg));
    }
}
