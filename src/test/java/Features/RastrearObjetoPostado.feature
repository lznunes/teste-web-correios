Feature: Rastreamento por objeto postado
  Scenario: Consulta por objeto válido
    Given Acessar o site dos correios
    When Informar objeto valido
    And Clicar no botão buscar
    Then Valida status da entrega

  Scenario: Rastreamento por objeto inválido
    Given Acessar o site dos correios
    When Informar objeto inválido
    And Clicar no botão buscar
    Then Valida status da entrega invalido



