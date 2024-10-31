#Autor: Luis Lopez
  #Language:es

Feature:
  Yo como usuario de coopApp
  quiero Registrarme en el aplicativo
  para acceder a los productos que ofrece la cooperativa


  @registro
  Scenario: Registro exitoso
    Given el actor ingreso a la pantalla de registro
    When se ingrese todos los datos para un registro
      | usuario  | 123456789 |
      | password | 123456789 |
    And se autentique en el aplicativo
    Then el visualizara la pantalla de productos
