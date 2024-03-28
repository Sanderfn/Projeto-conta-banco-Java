# Projeto conta banco Java

## Um breve resumo!
Este programa em Java serve como um sistema básico de criação de uma conta bancária que solicita informações do usuário e as exibe de volta para a confirmação.

1. O programa começa importando as classes necessárias, incluindo **Locale** e **Scanner**, para lidar com a entrada de dados dos usuários.
2. Na função **main**, o programa cria um objeto *Scanner* chamado scanner para ler a entrada do usuário. Ele também configura o **Scanner** para usar o padrão de ponto flutuante americano (**Locale.US**), garantindo que os números reais sejam interpretados corretamente, independentemente das configurações regionais do sistema.
3. Em seguida, o programa solicita ao usuário que insira o númeor da agência bancária, o número da conta, seu nome, sobrenome e saldo inicial da conta, por meio da função **println** do **System.out**.
4. O programa lê os valores informados pelo usuário usando os métodos **next()** para strings e **nextInt()** para inteiros do objeto **Scanner**. Para leitura do saldo da conta é utilizado o método **nextFloat()** que lê o número de ponto flutuante.
5. Depois de coletar todas as informações necessárias, o programa exibe uma menssagem de boas vindas ao usuário, junto com os dados fornecidos. Ele mostra o nome completo do usuário, número da agência, número da conta e saldo da conta, usando novamnete **println** dos **System.out**.
6. Em seguida o programa termina a execução.
