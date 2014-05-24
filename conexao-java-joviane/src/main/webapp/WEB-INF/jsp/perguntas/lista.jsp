<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
	<ul>
		<c:forEach var="pergunta" items="${perguntas}">
			<li>
				<a href="perguntas/verPergunta?id=${pergunta.getId()}">${pergunta.getTitulo()}</a> - ${pergunta.getAutor()}
		</c:forEach>
	</ul>
