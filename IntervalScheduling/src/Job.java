public record Job(int startingTime, int finishTime) implements Comparable<Job> {

    public Job {
        if (finishTime <= startingTime)
            try {
                throw new InvalidJobException();
            } catch (InvalidJobException e) {
                e.printStackTrace();
            }
    }

    public int getFinishTime() {
        return finishTime;
    }

    public int getStartingTime() {
        return startingTime;
    }

    @Override
    public int compareTo(Job o) {
        if (this.finishTime == o.getFinishTime())
            return 0;
        else if (this.finishTime >= o.getFinishTime()) {
            return 1;
        }

        return -1;

    }

    @Override
    public String toString() {
        return "Interval{" +
                "startingTime=" + startingTime +
                ", finishTime=" + finishTime +
                '}';
    }

}
