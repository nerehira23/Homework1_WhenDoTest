Feature: Login
  Scenario Outline: Como usuario administrador
            Quiero usar mi email
            Para ingresar a la aplicacion

    Given tengo un usuario "user"
    And tengo abierto facebook app
    When yo ingreso mi <email> en la caja de texto user
    And yo ingreso mi <password> en la caja de texto password
    And yo hago clic en el boton login
    Then yo deberia de ingresar a facebook

    Examples:
      | email          | password |
      | nerehira@gmail.com  | 123 |
      | ibeth@gmail.com     | 246 |
      | nery23@gmail.com    | 987 |


