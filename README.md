![Ilog](/ilog.png)

# LABSCHOOL
Projeto LabSchool da DevInHouse Ilog.

## INTRODUÇÃO
<p>Considerando os assuntos estudados até o momento no módulo 1, vamos aplicar todos os conceitos estudados resolvendo o problema abordado no desenvolvimento do software solicitado pelo cliente Lab School.</p>

## REQUISITOS DA APLICAÇÃO
<p>A aplicação que deverá ser realizada individualmente deve contemplar os seguintes requisitos:</p>

- O sistema deverá ser desenvolvido em Java
- O sistema deve seguir o Roteiro da Aplicação;
- Desenvolvimento das mensagens de saída, com espera da ação do usuário;
- Captura da interação do usuário via entrada padrão;
- O sistema deverá ser apresentado diretamente na linha de comando;
- Gravação de um vídeo.

## ROTEIRO DA APLICAÇÃO
<p>A escola de programação Lab School deseja automatizar todo o sistema de armazenamento de informações referentes aos alunos, pedagogos e professores. 
O sistema deve conter os tipos de cadastros abaixo, cada um com suas características. </p>

<p>Todos os cadastros devem ser derivados da classe “Pessoa”, que possui os seguintes atributos:</p>

- Pessoa
  - Nome
  - Telefone
  - Data de nascimento
  - CPF
  - Código  (deve ser gerado automaticamente pelo sistema).
  
  <p>Os requisitos de cadastros previstos são:</p>
 
- **RF01 - Cadastro de Aluno**
  - Situação da matrícula - um aluno pode estar com a matrícula nas seguintes situações:  
    - Ativo
    - Irregular
    - Atendimento pedagógico
    - Inativo
      - O usuário do sistema poderá alterar esta situação sempre que necessário.</p>
  
  - Nota: o aluno deve armazenar a nota do processo seletivo de entrada (0 até 10)
    - Esta nota deve ser inserida no momento do cadastro do aluno.
  - Total de atendimentos pedagógicos realizados.
    - Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado
    
- **RF02 - Atualização da Situação da matrícula de Aluno**
  - O sistema deve permitir alterar/atualizar a situação da matrícula de determinado aluno.
    - O usuário do sistema poderá alterar esta situação sempre que necessário.
    
- **RF03 - Cadastro de Professor**
  - Formação acadêmica:
    - Graduação incompleta
    - Graduação completa
    - Mestrado
    - Doutorado
  - Experiência em desenvolvimento:
    - Front-End
    - Back-End
    - Full-Stack
  - Estado
    - Ativo
    - Inativo
- **RF04 - Cadastro de Pedagogo**
  - Total de atendimentos pedagógicos realizados:
    - Este item é um contador que inicia em zero. Sempre que um pedagogo realiza um atendimento este valor deve ser incrementado.
    - O sistema deve perguntar qual foi o pedagogo e aluno participaram do atendimento.
    
- **RF05 - Realização de Atendimento Pedagógico**
  - O sistema deve perguntar qual foi o pedagogo e aluno que participaram do atendimento.
  - Sempre que um atendimento pedagógico é realizado, devem ser incrementados os atributos de atendimento do aluno e pedagogo envolvidos.
  - Sempre que um atendimento pedagógico é realizado, a situação da matrícula do aluno deve ser alterada para “Atendimento Pedagógico”.
  
<p>O Lab School também deverá apresentar os seguintes relatórios:</p>

- **RF06 - Listagem de Pessoas**
  <p>Listar todas as pessoas cadastradas, exibindo os campos código, nome e CPF.</p> 
  <p>O usuário deverá informar quais categorias de pessoas deseja listar dentre as opções abaixo:</p>
  
    - Alunos
    - Professores
    - Pedagogos
    - Todos

- **RF07 - Relatório dos Alunos** E
  <p>Exibindo os campos código, nome, nota e total de atendimentos pedagógicos.</p>
  <p>O usuário deve escolher quais alunos serão listados de acordo com a situação da matrícula abaixo:</p>
  
  - Ativo
  - Irregular
  - Atendimento pedagógico
  - Inativo
  - Todos
  
- **RF08 - Relatório dos Professores**
  <p>Exibindo os campos código, nome, formação acadêmica, experiência e estado.</p>
  <p>O usuário deve escolher quais registros apresentar de acordo com as opções abaixo de experiência:</p>
  
  - Front-End
  - Back-End
  - Full-Stack
  - Todos

- **RF09 - Relatório de Alunos com mais atendimentos pedagógicos**
  <p>exibindo os campos código, nome e total de atendimentos pedagógicos de todos os alunos em ordem decrescente de número de atendimentos, ou seja, o primeiro aluno listado deve ser o de maior número de atendimento. </p>

- **RF10 - Pedagogos com mais atendimentos pedagógicos**
  <p>exibindo os campos código, nome e total de atendimentos pedagógicos de todos os pedagogos em ordem decrescente de número de atendimentos, ou seja, o primeiro pedagogo listado deve ser o de maior número de atendimento.</p> 
  
- **VÍDEO**
  <p>Além do desenvolvimento deste sistema você deverá gravar um vídeo (tempo máximo de 2 minutos) abordando os itens abaixo:</p>
  
    - Como foi a sua experiência desenvolvendo o sistema para o **Lab School**?
    - Qual foi a sua maior dificuldade?
    - Você acha que faltou algo no seu código que você poderia melhorar?
    - Como está sendo sua experiência no DEVinHouse?

## Link do vídeo [*apresentação projeto* 🖥](https://duckduckgo.com "Módulo I").
  



  
  


