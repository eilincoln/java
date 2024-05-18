Algoritmo "case"
// Disciplina   : [Linguagem e Lógica de Programação]
// Professor   : Antonio Carlos Nicolodi 
// Descrição   : Aqui você descreve o que o programa faz! (função)
// Autor(a)    : Nome do(a) aluno(a)
// Data atual  : 5/18/2024
Var
// Seção de Declarações das variáveis 
   opcao : inteiro

Inicio


// Solicita ao usuário para inserir um número entre 1 e 4
        escreva("Digite um número entre 1 e 4: ")
        leia(opcao)

        // Estrutura case para decidir o que fazer com base na entrada do usuário
        escolha opcao
            caso 1:
                escreva("Você escolheu a opção 1")
            caso 2:
                escreva("Você escolheu a opção 2")
            caso 3:
                escreva("Você escolheu a opção 3")
            caso 4:
                escreva("Você escolheu a opção 4")
            // Caso default para tratar qualquer outro valor não esperado
            caso contrario:
                escreva("Opção inválida, por favor escolha um número entre 1 e 4")
        fimescolha

    // Fim do bloco de comandos
Fimalgoritmo