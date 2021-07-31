Feature: Login

  @Regression @SmokeTest
  Scenario: Como usuario administrador
            Quiero usar mi email
            Para ingresar a la aplicacion

    Given tengo un usuario "user"
    And tengo abierto facebook app
    When yo realizo el login en la app
    #objeto
          |email        | password |
          |uc@ucb.com   | 123 |

    Then yo deberia de ingresar a facebook
