Feature: Login

  @Regression @SmokeTest
  Scenario: Como usuario administrador
            Quiero usar mi email
            Para ingresar a la aplicacion

    Given tengo un usuario "user"
    And tengo abierto facebook app
    When yo realizo el login a la app
          |email      | uc@ucb.com |
          |password      | 123 |

    Then yo deberia de ingresar a facebook
