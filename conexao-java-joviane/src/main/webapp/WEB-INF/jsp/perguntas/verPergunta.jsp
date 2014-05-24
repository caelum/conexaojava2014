<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

${pergunta.getTitulo()} <br>
${pergunta.getConteudo()} <br>
${pergunta.getAutor()} <br>
<br>
<c:forEach var="resposta" items="${pergunta.getRespostas()}">
	${resposta} <br>
</c:forEach>