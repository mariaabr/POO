package POO2122_1907658;

import java.time.LocalDate;
import java.util.*;

public abstract class Event implements IEvent{
    private LocalDate date;
    private Set<Activity> activities = new TreeSet<Activity>();
    private Client c;

    public Event(LocalDate date, Set<Activity> activities) {
        this.date = date;
        this.activities = new TreeSet<Activity>(Activity :: compareTo);
        this.activities.addAll(activities);
    }

    public Event(Client c, LocalDate date) {
        this.c = c;
        this.date = date;
    }

    public LocalDate getDate() {
        return this.date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Set<Activity> getActivities() {
        return this.activities;
    }

    public void setActivities(Set<Activity> activities) {
        this.activities = activities;
    }

    public Client getClient() {
        return this.c;
    }
 
    public Event addActivity(Activity activity) {
        return activities.add(activity);
    }

    public double totalCost() {
        int total = 0;
        for (Activity a : activities) {
            total += ((a.getPreco())*(a.getParticipantes()));
        }
        return total;
    }
}
