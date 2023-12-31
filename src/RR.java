
public class RR {
    private Queue queue;
    private int quantum; // Zaman dilimi

    public RR(Queue queue, int quantum) {
        this.queue = queue;
        this.quantum = quantum;
    }

    public void execute() {
        while (!queue.isEmpty()) {
            Process process = queue.poll(); // Kuyruktan bir süreci al
            // Süreci belirli bir zaman dilimi boyunca işle
            if (!process.isCompleted()) {
                queue.offer(process); // Eğer süreç tamamlanmadıysa, kuyruğun sonuna ekle
            }
        }
    }
}
