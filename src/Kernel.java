public class Kernel {
    private MEM mem;
    private CPU cpu;
    private Middleware middleware;

    public Kernel(MEM mem, CPU cpu, Middleware middleware) {
        this.mem = mem;
        this.cpu = cpu;
        this.middleware = middleware;
    }

    public void processarTarefa(Tarefa tarefa) {
        // Lógica principal de processamento da tarefa
        // Pode envolver interações com a CPU, MEM e Middleware
        cpu.escalonarTarefa(tarefa);
        cpu.executarTarefa(tarefa);
        mem.escreverDado(endereco, dado);
        middleware.enviarMensagem(origem, destino, mensagem);
    }

    public synchronized void processarTarefa(Tarefa tarefa) {
        // Lógica principal de processamento da tarefa
        cpu.escalonarTarefa(tarefa);
        cpu.executarTarefa(tarefa);
        mem.escreverDado(endereco, dado);
        middleware.enviarMensagem(origem, destino, mensagem);
    }
}
