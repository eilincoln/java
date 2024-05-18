Algoritmo "studentAverage"

Var
// Seção de Declarações das variáveis.
   nota1, nota2, nota3, nota4, media: real
Inicio
// Seção de Comandos, procedimento, funções, operadores, etc...

   escreva("digite a primeira nota do aluno: ")
   leia(nota1)
   escreva("digite a segunda nota do aluno: ")
   leia(nota2)
   escreva("digite a terceira nota do aluno: ")
   leia(nota3)
   escreva("digite a quarta nota do aluno: ")
   leia(nota4)
   
   media <- (nota1 + nota2 + nota3 + nota4) / 4
   
   escreval("nota final eh:", media)
   
   se(media >= 70) entao
      escreva("aprovado")
   senao
      escreval("reprovado")

      
   fimse
   


Fimalgoritmo