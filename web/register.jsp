
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
            <header class="d-flex flex-wrap align-items-center justify-content-center justify-content-md-between py-3 mb-4 border-bottom">
                <a href="/" class="d-flex align-items-center col-md-3 mb-2 mb-md-0 text-dark text-decoration-none">
                    <i class="bi bi-bootstrap me-2" width="40" height="32" role="img"></i>
                </a>

                <ul class="nav col-12 col-md-auto mb-2 justify-content-center mb-md-0">
                    <li><a href="index.html" class="nav-link px-2 link-secondary">Inicio</a></li>
                    <li><a href="#" class="nav-link px-2 link-dark">Usuarios</a></li>
                </ul>

                <div class="col-md-3 text-end">
                    <a href="register.jsp" class="btn btn-outline-primary me-2">Registrarse</a>
                    <a href="login.jsp" class="btn btn-primary">Iniciar Sesion</a>
                </div>
            </header>

            <main class="vh-100">
                <div class="card">
                    <div class="card-header">
                        Registrarse
                    </div>
                    <div class="card-body">
                        <div class="mb-3 row d-flex flex-column">
                            <label for="staticUser" class="col-sm col-form-label">Usuario</label>
                            <div class="col-sm">
                                <input type="text" class="form-control" id="staticUser">
                            </div>
                        </div>
                        <div class="mb-3 row d-flex flex-column">
                            <label for="inputPassword" class="col-sm col-form-label">Contraseña</label>
                            <div class="col-sm">
                                <input type="password" class="form-control" id="inputPassword">
                            </div>
                        </div>
                        <div class="mb-3 row d-flex justify-content-center">
                            <div class="col-auto">
                                <button type="submit" class="btn btn-primary mb-3">Confirmar</button>
                            </div>
                        </div>
                    </div>
                </div>
            </main>
        </div>

        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL" crossorigin="anonymous"></script>
    </body>
</html>
