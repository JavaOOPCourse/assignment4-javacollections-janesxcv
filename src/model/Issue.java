package model;

public class Issue implements  Comparable<Issue> {
    private String description;
    private int UrgencyLevel;

    public Issue(String description, int UrgencyLevel) {
        this.description = description;
        this.UrgencyLevel = UrgencyLevel;
    }

    public String getDescription() {
        return description;
    }

    public int getUrgencyLevel() {
        return UrgencyLevel;
    }

    public int compareTo (Issue other) {
        return Integer.compare(this.UrgencyLevel, other.UrgencyLevel);
    }

    public String toString() {
        return "[priority :"+UrgencyLevel+"]" +description;
    }
}
