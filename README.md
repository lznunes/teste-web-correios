# Teste Site Correios

Rastreamento de objeto

## História de usuário

Como usuário do sistema quero consultar as informações sobre uma entrega do correio para acompanhar o andamento da entrega.


## Cenários

### Cenário 1:  Rastreamento por objeto postado
* Acessar o site dos correios 
* Informar um objeto válido	JY183171564BR
* Clicar no botão buscar
* Verificar o status da entrega


### Cenário 2: Rastreamento por objeto inválido

* Acessar o site dos correios 
* Informar um objeto inválido 00000601594528
* Clicar no botão buscar
* Verificar o status da entrega igual: "O(s) código(s) ou CPF/CNPJ estão inválidos"

## Evidência
No passo 2 do  cenário 1 o resultado esperado é diferente do esperdo. 

Retornado: "Aguardando postagem pelo remetente".

Nos outros caso o resultados passaram

![](https://github.com/lznunes/unisys-teste-web-correios/blob/main/src/test/Evidencias/PrintEvidencias.JPG)

## Ferramentas

* IntelliJ-IDe 2020.2
* Selenium Java WebDriver 3.141.59
* ChromeDriver 90.0.4430.24
* cucumber-junit 1.2.5


## Linguagem

* JAVA
* Gherkin


## Documentações

https://www.jetbrains.com/help/idea/2020.2/discover-intellij-idea.html

https://www.selenium.dev/documentation/en/

https://cucumber.io/docs/installation/


