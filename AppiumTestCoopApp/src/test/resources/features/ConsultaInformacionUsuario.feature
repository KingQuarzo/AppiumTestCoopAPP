#Autor: Luis Lopez
  #Language:es

Feature:  Yo como usuario registrado de coopApp
  quiero consultar la informacion registrada
  para validar la veracidad de esta


  @Consulta
  Scenario: Consulta informacion exitosa
    Given el actor ingreso a la pantalla incial login
    When se autentique en el aplicativo
      | usuario  | 654881    |
      | password | 123456789 |
    And ingrese a la seccion de informacion de usuario
    Then el visualizara la informacion registrada
      | tipoId          | Cedula              |
      | identificacion  | 654881              |
      | correo          | yoqueses2@gmail.com |
      | nombres         | Pepito              |
      | apellidos       | Perez               |
      | fechaNacimiento | 30081996            |
