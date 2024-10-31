#Autor: Luis Lopez
  #Language:es

Feature:  Yo como usuario de coopApp
          quiero iniciar sesion en el aplicativo
          para conocer mis saldos


  @login
  Scenario: login exitoso
    Given el actor ingreso a la pantalla incial login
    When se autentique en el aplicativo
      | usuario  | 123456    |
      | password | 123456 |
    Then el visualizara la pantalla de productos
