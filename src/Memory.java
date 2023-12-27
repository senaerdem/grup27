public class Memory {
    // manage process and memory usage with this class
    private int memory_sizeForRealTimeTasks=64;
    private int memory_sizeForUserTasks=960;
    private int process_id;
    private boolean isAlreadyAllocated=false;

    public Memory(int process_id){
        this.process_id=process_id;
    }

    public int getMemory_sizeForRealTimeTasks() {
        return memory_sizeForRealTimeTasks;
    }

    public void allocateMemoryForRealTimeTasks(int memory_sizeForRealTimeTasks) {
        this.memory_sizeForRealTimeTasks -= memory_sizeForRealTimeTasks;
    }

    public void releaseMemoryForRealTimeTasks(int memory_sizeForRealTimeTasks) {
        this.memory_sizeForRealTimeTasks += memory_sizeForRealTimeTasks;
    }

    public int getMemory_sizeForUserTasks() {
        return memory_sizeForUserTasks;
    }

    public void allocateMemoryForUserTasks(int memory_sizeForUserTasks) {
        this.memory_sizeForUserTasks -= memory_sizeForUserTasks;
    }

    public void releaseMemoryForUserTasks(int memory_sizeForUserTasks) {
        this.memory_sizeForUserTasks += memory_sizeForUserTasks;
    }

    public int getProcess_id() {
        return process_id;
    }


}
