import java.util.PriorityQueue;

public class HospitalQueueService{
    public PriorityQueue<Patient> hospitalQueue = new PriorityQueue<>();

    public void addPatient(Patient patient) {
        hospitalQueue.add(patient);
    }

    public Patient next() {
        hospitalQueue.comparator();
        return hospitalQueue.poll();

    }

    public Patient peek() {

        return hospitalQueue.peek();

    }

}
