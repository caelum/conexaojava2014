public class Forum {
	public static void main(String[] args) {
		Pergunta pergunta = new Pergunta();
		pergunta.titulo = "Luan Santana no Conexão Java";
		pergunta.conteudo = "É impressão minha ou o Matheus parece com o Luan Santana? Além disso, o Mauricio parece com o Encantado do Shrek! Mais aguém acha isso?";
		pergunta.autor = "Joviane";
		
		System.out.println("Titulo: " + pergunta.titulo);
		System.out.println("Conteudo: " + pergunta.conteudo);
		System.out.println("Autor: " + pergunta.autor);
	}
}
