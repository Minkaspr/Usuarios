<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Registrarse</title>
        <link rel="icon" href="assets/Clase.png">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">

            <%@include file="WEB-INF/jspf/header.jspf" %>

            <main class="vh-100">
                <div class="card">
                    <div class="card-header">
                        Registrarse
                    </div>
                    <div class="card-body">
                        <form action="Usuario" method="post">
                            <input type="hidden" name="accion" value="REGISTER"/>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="nombres" class="col-sm col-form-label">Nombres</label>
                                <div class="col-sm">
                                    <input type="text" class="form-control" id="nombres" name="nombres">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="paterno" class="col-sm col-form-label">Apellido Paterno</label>
                                <div class="col-sm">
                                    <input type="text" class="form-control" id="paterno" name="paterno">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="materno" class="col-sm col-form-label">Apellido Materno</label>
                                <div class="col-sm">
                                    <input type="text" class="form-control" id="materno" name="materno">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="staticUser" class="col-sm col-form-label">Usuario</label>
                                <div class="col-sm">
                                    <input type="text" class="form-control" id="staticUser" name="usuario">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="inputPassword" class="col-sm col-form-label">Contraseña</label>
                                <div class="col-sm">
                                    <input type="password" class="form-control" id="inputPassword" name="clave">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex flex-column">
                                <label for="confirmPassword" class="col-sm col-form-label">Confirmar Contraseña</label>
                                <div class="col-sm">
                                    <input type="password" class="form-control" id="confirmPassword">
                                </div>
                            </div>
                            <div class="mb-3 row d-flex justify-content-center">
                                <div class="col-auto">
                                    <button type="submit" class="btn btn-primary mb-3">Registrar</button>
                                </div>
                            </div>
                        </form>
                        <c:if test="${message != null}">
                            <div class="card" style="width: 18rem;">
                                <div class="card-header">
                                    Error
                                </div>
                                <ul class="list-group list-group-flush">
                                    ${message}
                                </ul>
                            </div>
                        </c:if>
                    </div>
                </div>
            </main>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
