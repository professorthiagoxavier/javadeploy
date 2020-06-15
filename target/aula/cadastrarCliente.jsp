<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
        <title>Cadastrar cliente</title>
    </head>
    <body>
        <div class="container">
            <h2>Cadastrar cliente</h2>

            <form action="cliente" method="post">
                <p>
                    Nome:
                    <input type="text" name="nome" id="nome" />
                </p>
                <p>
                    Endereço:
                    <input type="text" name="endereco" id="endereco" />
                </p>
                <p>
                    Número
                    <input type="number" name="numero" id="numero" />
                </p>
                <input type="submit" class="btn btn-success" value="Salvar" />
            </form>
        </div>
    </body>
</html>
