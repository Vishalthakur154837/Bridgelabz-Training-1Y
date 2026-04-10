abstract class Checkpoint {
        String id, name;
        double distanceFromLast;
        double expectedDuration;
        double actualDuration;

        Checkpoint(String id, String name, double dist, double exp, double act) {
            this.id = id;
            this.name = name;
            this.distanceFromLast = dist;
            this.expectedDuration = exp;
            this.actualDuration = act;
        }

        public boolean isDelayed() {
            return actualDuration > expectedDuration;
        }

        public abstract double calculatePenalty();
        public abstract boolean isCritical();
    }

}
