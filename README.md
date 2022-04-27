# Desafio DIO POO Bootcamp

> Abstraindo um Bootcamp Usando Programação Orientação a Objetos em Java

> Projeto de desafio criado durante o Bootcamp Philips Fullstack Developer da DIO

## Tecnologias

- Java 17

- Programação Orientação a Objetos

## Conteúdo

1. ABSTRAIR o DOMÍNIO Bootcamp e MODELAR seus ATRIBUTOS E MÉTODOS
2. Criar as CLASSES: Bootcamp, Cursos, Mentorias e Devs e relaciona-las
3. Modelar também as CLASSES Curso, Mentoria e Devs, criando seus ATRIBUTOS E MÉTODOS
4. Utilizar do PARADIGMA DE ORIENTAÇÃO A OBJETOS (POO) as: ABSTRAÇÃO, ENCAPSULAMENTO, HERANÇA E POLIMORFISMO
5. Criar OBJETOS instânciando as Classes implementadas

## Passo a passo

### Parte 1 - Abstração e encapsulamento

01. Criação da classe Main com o método main()
02. Criação das classes Curso e Mentoria (Abstração)
03. Adicionando do atributos das classes Curso e Mentoria (Abstração)
04. Boas práticas adicionando o modificador de acesso private para os atributos das classes Curso e Mentoria (Encapsulamento)
05. Para acessar os atributos com private foram criados os getters and setters (Encapsulamento)
06. Criação do método toString() para as classe Curso e Mentoria
07. Na classe Main foram criados os Objetos, através da palavra reservada "new", curso1, curso2, mentoria1 setando seus respectivos atributos e imprimindo no console (Instâncias de Classes = Objetos)

### Parte 2 - Herança e Polimorfismo

01. Criação da classe abstrata Conteudo, classe abstrata não pode ser instânciada (Herança)
02. Conteudo fica agora com os atributos e métodos comuns de Curso e Mentoria (Herança)
03. Criação do método abstrato calcularXp(), classes filhas são obrigadas a implementar métodos abstratos (Herança)
04. Classes Curso e Mentoria extendem Conteudo (Herança)
05. Removemos atributos e métodos que já estão em Conteudo (Herança)
06. Implementamos o método calcularXp() para cada classe filha, Curso e Mentoria (Herança)
07. Na classe Main criamos um objeto conteudo intanciando um Curso para ele (Polimorfismo) e outro instanciando Mentoria

### Parte 3 - Abstração, Encapsulamento e Polimorfismo

01. Criação das classes Bootcamp e Dev
02. Adicionando os atributos de Dev e Bootcamp
03. Adicionando assinatura dos métodos de Dev

### Parte 4 - Finalizando regras de negócio

01. Implementando métodos da classe Dev

### Parte 5 - Interligando classes de Domínio

01. Na classe Main criamos os objetos bootcamp1, devCamila e devRodolfo instanciando suas respectivas classes e setando seus atributos iniciais
02. Criação da impressão de conteúdos inscritos para devCamila e devRodolfo
03. Incrição de devCamila e devRodolfo no bootcamp1 através do método de Dev inscreverBootcamp
04. Criação da impressão de conteúdos inscritos para devCamila e devRodolfo
05. Progredir devCamila e devRodolfo no bootcamp1 através do método de Dev progredir
06. Criação da impressão de xp para devCamila e devRodolfo
07. Progredir devCamila e devRodolfo mais vezes e ver o resultado
