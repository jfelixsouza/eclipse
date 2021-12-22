#Jeferson  jfelixsouza@terra.com.br


Feature: cadastrar cliente
  COMO: Usuario QUERO: Acessar site PARA Cadastrar novo cliente

  
  Scenario: Cadastrar novo cliente
    Given que esteja no site "https://www.grocerycrud.com/v1.x/demo/my_boss_is_in_a_hurry/bootstrap"
    And altere o combo select version
    When clico em Add costumer
    And preencho name "Teste Sicredi"
    And preencho Last name "Teste"
    And preencho ContacFirstName "Jeferson"
    And preencho Phone "51 9999-9999"
    And preencho AddressLine1 "Av Assis Brasil, 3970"
    And preencho AddressLine2 "Torre D"
    And preencho City "Porto Alegre"
    And preencho State "RS"
    And preencho Postal Code "91000-000"
    And preencho Country "Brasil"
    And preencho from employeer "Fixter"
    And preencho CreditLimit "200"
    And Clico em Save
    Then Validamos a mensagem "You data has benn successfully stored into the database. Edit Customer or Go back to List"
   

