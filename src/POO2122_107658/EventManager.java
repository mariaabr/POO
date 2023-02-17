package POO2122_1907658;

import java.time.LocalDate;
import java.util.*;

public class EventManager {
    private String nome;
    // private Map<Client , Event> registos = new TreeMap<Client, Event>();
    private Set<Client> clients = new TreeSet<Client>();
    private Set<Event> events = new TreeSet<Event>();

    public EventManager(String nome, Set<Client> clients, Set<Event> events) {
        this.nome = nome;
        this.clients = clients;
        this.events = events;
    }

    public EventManager(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Client> getClients() {
        return this.clients;
    }

    public void setClients(Set<Client> clients) {
        this.clients = clients;
    }

    public Set<Event> getEvents() {
        return this.events;
    }

    public void setEvents(Set<Event> events) {
        this.events = events;
    }

    public Client addClient(String nome, String local) {
        return new Client(nome, local);
    }

    public Event addEvent(Client c, LocalDate date) {
        return new Event(c, date);
    }

    public String listClients() {
        String write = "Clients: \n";
        for (Client c : clients) {
            write += c.getNome() + " [" + c.getLocal() + "]";
        }

        return write;
    }

    public String listEvents() {
        String write = "Events: \n";
        for (Event e : events) {
            write += e.getClient();
            write += "*** Evento em " + e.getDate() + ", total =" + e.totalCost() + "euros";

            for (Activity a : e.getActivities()) {
            write += a + " " + a.getParticipantes() + " participants.";
            }
        }

        return write;
    }
}
