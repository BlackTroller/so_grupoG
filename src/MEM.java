public class MEM {
    // Estrutura de dados para armazenar informações
    private Object[] dados;

    public MEM(int tamanho) {
        // Inicialize a estrutura de dados com o tamanho especificado
        dados = new Object[tamanho];
    }

    // Métodos para ler e escrever dados na MEM
    public Object lerDado(int endereco) {
        // Lógica para ler dados do endereço especificado
        return dados[endereco];
    }

    public void escreverDado(int endereco, Object dado) {
        // Lógica para escrever dados no endereço especificado
        dados[endereco] = dado;
    }
}
