import java.util.ArrayList;

public class GBG {
    private ArrayList<Queue> queues; // Her öncelik seviyesi için ayrı bir kuyruk

    public GBG(ArrayList<Queue> queues) {
        this.queues = queues;
    }

    public void execute() {
        for (Queue queue : queues) {
            while (!queue.isEmpty()) {
                Process process = queue.poll(); // Kuyruktan bir süreci al
                // Süreci işle
                // Süreçle ilgili geri bildirim al ve önceliği güncelle
                // Güncellenmiş önceliğe göre süreci uygun kuyruğa yerleştir
            }
        }
    }
}
