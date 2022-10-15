DEVinHouse
Módulo 1 - Projeto Avaliativo 1

SUMÁRIO
1 INTRODUÇÃO	1
2 REQUISITOS DA APLICAÇÃO	1
3 ROTEIRO DA APLICAÇÃO	2
4 CRITÉRIOS DE AVALIAÇÃO	2
5 ENTREGA	2
6 PLANO DE PROJETO	3

1 INTRODUÇÃO
Considerando os assuntos estudados até o momento no módulo 1, vamos aplicar todos os conceitos estudados resolvendo o problema abordado no desenvolvimento do software solicitado pelo cliente Lab School.

2 REQUISITOS DA APLICAÇÃO
A aplicação que deverá ser realizada individualmente deve contemplar os seguintes requisitos:
O sistema deverá ser desenvolvido em Java;
O sistema deve seguir o Roteiro da Aplicação;
Desenvolvimento das mensagens de saída, com espera da ação do usuário;
Captura da interação do usuário via entrada padrão;
O sistema deverá ser apresentado diretamente na linha de comando;
Gravação de um vídeo.

3 ROTEIRO DA APLICAÇÃO
A escola de programação Lab School deseja automatizar todo o sistema de armazenamento de informações referentes aos alunos, pedagogos e professores.
O sistema deve conter os tipos de cadastros abaixo, cada um com suas características.
Todos os cadastros devem ser derivados da classe “Pessoa”, que possui os seguintes atributos:

Pessoa
Nome
Telefone
Data de nascimento
CPF
Código  (deve ser gerado automaticamente pelo sistema).

Os requisitos de cadastros previstos são:

RF01 - Cadastro de Aluno
Situação da matrícula - um aluno pode estar com a matrícula nas seguintes situações:
Ativo
Irregular
Atendimento pedagógico
Inativo
O usuário do sistema poderá alterar esta situação sempre que necessário.
Nota: o aluno deve armazenar a nota do processo seletivo de entrada (0 até 10)
Esta nota deve ser inserida no momento do cadastro do aluno.
Total de atendimentos pedagógicos realizados.
Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado

RF02 - Atualização da Situação da matrícula de Aluno
O sistema deve permitir alterar/atualizar a situação da matrícula de determinado aluno.
O usuário do sistema poderá alterar esta situação sempre que necessário.

RF03 - Cadastro de Professor
Formação acadêmica:
Graduação incompleta
Graduação completa
Mestrado
Doutorado
Experiência em desenvolvimento:
Front-End
Back-End
Full-Stack
Estado
Ativo
Inativo

RF04 - Cadastro de Pedagogo
Total de atendimentos pedagógicos realizados:
Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado
O sistema deve perguntar qual foi o pedagogo e aluno participaram do atendimento

RF05 - Realização de Atendimento Pedagógico
O sistema deve perguntar qual foi o pedagogo e aluno que participaram do atendimento.
Sempre que um atendimento pedagógico é realizado, devem ser incrementados os atributos de atendimento do aluno e pedagogo envolvidos.
Sempre que um atendimento pedagógico é realizado, a situação da matrícula do aluno deve ser alterada para “Atendimento Pedagógico”.

O Lab School também deverá apresentar os seguintes relatórios:

RF06 - Listagem de Pessoas: Listar todas as pessoas cadastradas, exibindo os campos código, nome e CPF.
O usuário deverá informar quais categorias de pessoas deseja listar dentre as opções abaixo:
Alunos
Professores
Pedagogos
Todos

RF07 - Relatório dos Alunos: exibindo os campos código, nome, nota e total de atendimentos pedagógicos.
O usuário deve escolher quais alunos serão listados de acordo com a situação da matrícula abaixo:
Ativo
Irregular
Atendimento pedagógico
Inativo
Todos

RF08 - Relatório dos Professores: exibindo os campos código, nome, formação acadêmica, experiência e estado.
O usuário deve escolher quais registros apresentar de acordo com as opções abaixo de experiência:
Front-End
Back-End
Full-Stack
Todos

RF09 - Relatório de Alunos com mais atendimentos pedagógicos: exibindo os campos código, nome e total de atendimentos pedagógicos de todos os alunos em ordem decrescente de número de atendimentos, ou seja, o primeiro aluno listado deve ser o de maior número de atendimento.

RF10 - Pedagogos com mais atendimentos pedagógicos: exibindo os campos código, nome e total de atendimentos pedagógicos de todos os pedagogos em ordem decrescente de número de atendimentos, ou seja, o primeiro pedagogo listado deve ser o de maior número de atendimento.

3.1 VÍDEO
Além do desenvolvimento deste sistema você deverá gravar um vídeo (tempo máximo de 2 minutos) abordando os itens abaixo:
Como foi a sua experiência desenvolvendo o sistema para o Lab School?
Qual foi a sua maior dificuldade?
Você acha que faltou algo no seu código que você poderia melhorar?
Como está sendo sua experiência no DEVinHouse?

Você poderá gravar na vertical ou na horizontal. É importante que apareça seu rosto e esteja em um local com boa iluminação. Para realizar a entrega do vídeo, coloque no Youtube em modo não listado ou insira no seu Google Drive e deixe o link aberto, posteriormente insira no seu Readme.md do seu repositório no Github.

4 CRITÉRIOS DE AVALIAÇÃO
A tabela abaixo apresenta os critérios que serão avaliados durante a correção do projeto. O mesmo possui variação de nota de 0 (zero) a 10 (dez) como nota mínima e máxima, e possui peso de 40% sobre a avaliação do módulo.
Serão desconsiderados e atribuída a nota 0 (zero) os projetos que apresentarem plágio de soluções encontradas na internet ou de outros colegas. Lembre-se: Você está livre para utilizar outras soluções como base, mas não é permitida a cópia.


Nº
Critério de Avaliação
0
0,50 a 1,00
1,00 a 1,50
1
O aluno seguiu as convenções de código da linguagem?
O aluno não deixou seu algoritmo organizado.
O aluno deixou seu algoritmo parcialmente organizado.
O aluno deixou seu algoritmo organizado.
2
O aluno utilizou o conceito de heranças?
O aluno não utilizou o conceito de herança.
O aluno utilizou, parcialmente, os conceitos de heranças.
O aluno utilizou de forma correta o conceito de herança.
3
O aluno implementou todas as classes com seus respectivos atributos e métodos?
O aluno não implementou as classes.
O aluno implementou de forma parcial as classes, atributos e métodos
O aluno implementou todas as classes, juntamente com seus atributos e métodos.
4
O aluno apresentou um menu de fácil interação ao usuário?
O aluno não apresentou o menu.
O aluno apresentou o menu, contudo, de forma confusa.
O aluno apresentou o menu de forma clara para o usuário.
5
O aluno implementou e apresentou os relatórios solicitados?
O aluno não implementou os relatórios.
O aluno implementou e apresentou, de forma parcial, os relatórios.
O aluno implementou e apresentou todos os relatórios.
6
O aluno implementou todas as operações de cadastro das entidades e registro de atendimento pedagógico?
O aluno não implementou as operações de cadastro e nem de atendimento.
O aluno implementou, de forma parcial, as operações de cadastro e registro de atendimento.
O aluno implementou todas as operações de cadastro e registro de atendimento.
Nº
Critério de Avaliação
0
1,00
7
Gravação de um vídeo abordando os tópicos listados no item 3.1
O aluno não gravou o vídeo
O aluno gravou o vídeo e abordou todos os tópicos listados no item 3.1


5 ENTREGA
O código desenvolvido deverá ser submetido no Github, e o link deverá ser disponibilizado na tarefa Módulo 1 - Projeto Avaliativo 1, presente na semana 5 do AVA até o dia 16/10/2023 às 23h55.




Todos os alunos deverão entregar o link do seu repositório do Github na atividade do AVA!





O repositório deverá ser privado, com as seguintes pessoas adicionadas:
Tiago Albuquerque - tiagoamp  (tiagoamp@gmail.com)
Fernando Puntel - fernando.puntel@edu.sc.senai.br

Não serão aceitos projetos submetidos após a data limite da atividade, e, ou alterados depois de entregues.

Importante:
Será considerado como data final de entrega a última atualização no repositório do projeto no Github. Lembre-se de não modificar o código até receber sua nota.
Não esqueça de submeter submeter o link no AVA.

6 PLANO DE PROJETO
Ao construir a aplicação proposta, o aluno estará colocando em prática os aprendizados em:
Programação Orientada a Objetos: Conceitos de POO, Classes, Objetos, Métodos de Classes e Métodos Estáticos, Encapsulamento, Herança, Polimorfismo.
Modelagem: Criação de Classes e Abstração
JAVA: Ambiente virtual, Variáveis, Operadores lógicos, aritméticos e de comparação, Métodos, Listas, Condicionais, Strings, Loops e Funções.