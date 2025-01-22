public class ZombiePlant {
    private int maxPotency;
    private int sucTreatment;

    public ZombiePlant(int a, int b) {
        maxPotency = a;
        sucTreatment = b;
    }

    public int getPotency() {
        return maxPotency;
    }

    public int treatmentsNeeded() {
        return sucTreatment;
    }

    public boolean isDangerous() {
        if (treatmentsNeeded() > 0) {
            return true;
        }
        return false;
    }

    public void treat(int n) {
        if (n <= 0) {
            return;
        }
        else if (sucTreatment == 0) {
            if (n <= maxPotency) {
                return;
            }
            else if (n >= maxPotency) {
                sucTreatment = 1;
            }
        }
        else if (n <= maxPotency) {
            sucTreatment--;
        }
        else if (n >= maxPotency) {
            sucTreatment++;
        }
    }
}
