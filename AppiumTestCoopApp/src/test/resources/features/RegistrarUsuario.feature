#Autor: Luis Lopez
  #Language:es

Feature:  Yo como usuario de coopApp
  quiero Registrarme en el aplicativo
  para acceder a los productos que ofrece la cooperativa


  @registro
  Scenario: Registro exitoso
    Given el actor ingreso a la pantalla de registro
    When se ingrese todos los datos para un registro
      | tipoId          | cedula             |
      | identificacion  | 513215             |
      | correo          | yoquese1@gmail.com |
      | nombres         | Pepito             |
      | apellidos       | Perez              |
      | password        | 123456789          |
      | fechaNacimiento | 30081996           |
    And se autentique en el aplicativo
      | usuario  | 513215    |
      | password | 123456789 |
    Then el visualizara la pantalla de productos
