Feature: Iniciar sesion de forma exitosa
  Yo como aprendiz de Sophos
  Necesito iniciar sesion en la app de advantage
  para validar el mensaje de logueo exitoso

  Scenario: Iniciar sesion en advantage
    Given Deseo ir al menu de logueo
    When ingreso usuario y password
    Then valido logueo exitoso