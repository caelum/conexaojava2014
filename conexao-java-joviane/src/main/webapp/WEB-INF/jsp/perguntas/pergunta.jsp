<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

${pergunta.titulo} <br/>
${pergunta.conteudo} <br/>
${pergunta.autor} <br/>

<c:forEach items="${pergunta.respostas}" var="resposta">
${resposta} <br/>
</c:forEach>