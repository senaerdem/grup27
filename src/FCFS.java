
public class FCFS {
    private Queue queue;

    public FCFS(Queue queue) {
        this.queue = queue;
    }

    public void execute() {
        while (!queue.isEmpty()) {
            Process process = queue.poll(); // Kuyruktan bir süreci al
            // Süreci işle
            // Sürecin tamamlanması için gerekli işlemleri yap
        }
    }
}
