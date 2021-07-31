Feature: Login

  @Regression @SmokeTest
  Scenario: Como usuario administrador
            Quiero usar mi email
            Para ingresar a la aplicacion

    Given tengo un usuario "user"
    And tengo abierto facebook app
    When yo ingreso mi imorales@gmail.com en la caja de texto user
    And yo ingreso mi pwd123 en la caja de texto password
    And yo hago clic en el boton login
    Then yo deberia de ingresar a facebook
