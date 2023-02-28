


@test
Feature: acessar e pesquisar nome keegoo no google
  eu como usuario que acessar o google para fazer uma pesquisa

  Scenario: acessar e pesquisar nome keegoo no google

    Given que eu acessar o google
    When pesquisar o no da empresa
    Then Valido as informacoes