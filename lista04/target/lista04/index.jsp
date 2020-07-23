<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<title>Document</title>
	</head>
	<body>
		<h2>Hello World!</h2>
		<form method="POST" action="/lista04/person.jsp">
			<div>
				<label>Nome</label>
				<input type="text" name="first_name">
			</div>
			<div>
				<label>Sobrenome</label>
				<input type="text" name="last_name">
			</div>
			<div>
				<label>E-mail</label>
				<input type="email" name="email">
			</div>
			<div>
				<label>Telefone</label>
				<input type="text" name="phone">
			</div>
			<div>
				<label>Data de nascimento</label>
				<input type="date" name="birthday">
			</div>
			<button>Enviar</button>
		</form>
	</body>
</html>
