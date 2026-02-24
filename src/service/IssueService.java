package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    // Note: The Issue class must implement Comparable<Issue>
    // or you must provide a Comparator here.
    private PriorityQueue<Issue> issues = new PriorityQueue<>((a, b) -> Integer.compare(a.getUrgencyLevel(), b.getUrgencylevel()));

    public void initializeIssues() {
        issues.add(new Issue("problem 1", 1));
        issues.add(new Issue("problem 2", 2));
        issues.add(new Issue("problem 3", 3));
        issues.add(new Issue("problem 4", 1));
        issues.add(new Issue("problem 5", 2));
        System.out.println("Issues were initialized.");
    }

    public void showMostUrgent() {
        if (!issues.isEmpty()) {
            System.out.println("Most Urgent Issue: " + issues.peek().getDescription());
        } else {
            System.out.println("No pending issues.");
        }
    }

    public void resolveIssues() {
        for (int d = 0; d < 2; d++) {
            if (!issues.isEmpty()) {
                Issue resolved = issues.poll();
                System.out.println("Resolved: " + resolved.getDescription());
            }
        }
    } // Fixed: Added missing closing brace for the method

    public void printRemainingIssues() {
        // Using an Iterator as requested
        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println("Remaining: " + it.next().getDescription());
        }
    }

    // Removed the extra semicolon after 'int urgency'
    public void addNewIssue(String description, int urgency) {
        issues.add(new Issue(description, urgency));
        System.out.println("Added new issue: " + description);
    }
}
