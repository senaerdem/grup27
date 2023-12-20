import java.util.Random;
public class Process {
    public int id = 0;
    public int arrival_time;
    public int priority;
    public int remain_time;
    public String color ;

    public Queue jobDispatchList = new Queue();
    //Renk array� tan�mlan�r.
    String[] colors = {Color.BLACK,Color.BLUE,Color.CYAN,Color.GREEN,Color.PURPLE,
            Color.RED,Color.WHITE,Color.YELLOW,Color.MAGENTA,Color.ORANGE,Color.ROSE,Color.NEON,
            Color.PINK,Color.NAVY};


    //yap�c� fonksiyona parametreler atanarak proses �zellikleri tan�mlan�r.
    public Process(int _id,int _arrival_time,int _priority,int _remain_time,String color){

        this.id = _id;
        this.arrival_time = _arrival_time;
        this.priority = _priority;
        this.remain_time = _remain_time;
        this.color = color;
    }
    //bo� yap�c� fonksiyon
    public Process(){}

    //Get-Set id metodlar�.
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Process CreateNewProcess(String line){
        //14 farkl� renkten random de�er al�p prosese gelen random say�daki renk atan�r.
        Random rand = new Random();
        int rnd = rand.nextInt(14);
        String color = colors[rnd];
        int arrival_time;
        int priority;
        int time_process;
        String split_line[] = line.split(",");// virg�l karakteri ile ay�r�r.
        arrival_time = Integer.parseInt(split_line[0]);//ilk de�er var�� s�resi
        String priority_string = split_line[1].substring(1,2);
        priority = Integer.parseInt(priority_string);//dizinin 1. indisi �ncelik
        String time_process_string = split_line[2].substring(1,2);
        time_process = Integer.parseInt(time_process_string);//dizinin 2. indisi �ncelik
        Process new_process = new Process(this.id,arrival_time,priority,time_process,color);//gelen de�erlerle proje olu�turulur.
        setId(this.id +1);//id atan�r ve sonraki proses i�in 1 artar.
        return new_process;
    }
}
