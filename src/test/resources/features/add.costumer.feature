#language: pt
#Autor: Suelen Langendorf

@regressivo
Funcionalidade: Adicionar customer tema v4
  Eu como usuario quero escolher o tema e adicionar novos customers

  Cenario: Adicionar customer tema v4
    Dado que esteja na versao 4
    E iniciar o cadastro do novo customer
    Quando enviar todos os dados do formulario
    Então validamos a mensagem de sucesso
    
    