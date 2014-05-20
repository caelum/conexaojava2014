<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

${pergunta.titulo}
${pergunta.conteudo}
${pergunta.autor}

<c:forEach items="${pergunta.respostas}" var="resposta">
${resposta}
</c:forEach>