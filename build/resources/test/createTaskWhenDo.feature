Feature: Task

  @Appium
  Scenario: Como usuario en la app
            Quiero crear tareas con titulo y descripcion
            Para realizar seguimiento a mis actividades

    Given la app WhenDo esta abierta
    And yo hago click en el boton agregarTarjea
    When yo creo una tarea
          |titulo | CREATE |
          | descripcion | Esto es una descripcion |
    And yo realizo click en el boton guardar
    Then la tarea con el nombre "CREATE" deberia ser creada