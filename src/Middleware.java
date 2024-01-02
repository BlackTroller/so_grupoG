public class Middleware {
    private Map<Tarefa, Queue<String>> mensagens = new HashMap<>();

    public void enviarMensagem(Tarefa origem, Tarefa destino, String mensagem) {
        // Lógica para enviar mensagem entre tarefas
        mensagens.computeIfAbsent(destino, k -> new LinkedList<>()).offer(mensagem);
    }

    public String receberMensagem(Tarefa origem, Tarefa destino) {
        // Lógica para receber mensagem entre tarefas
        Queue<String> filaMensagens = mensagens.get(destino);
        return (filaMensagens != null) ? filaMensagens.poll() : null;
    }
}
