# sorting_algorithm
About Implementação em Java de algortimos de ordenação, baseado em artigo de Leonardo Galler and Matteo Kimura de 21 de abril de 2019, disponível em &lt;https://lamfo-unb.github.io/2019/04/21/Sorting-algorithms/>, acesso em 17 de janeiro de 2023.

## Motivação
Implementação de algoritmo de ordenação como forma de treinar a criação de códigos em JAVA, utilizando conceitos como herança, interfaces e composição.

## Estrutura
A classe main que executará os testes está dentro da pasta /src, e se chama SortingTest. É ela que deve ser editada para execucação do ordenamento.

## Resultados
### Straight Insertion vs Shell Sorting
Foram testados os três métodos de ordenação, em semelhantes condições, para um array de 1.000.000 números aleatórios entre 0 e 999.999, gerados pela semente 1540.
Os resultados foram:
~~~ 
Shell Sorting (Método de Knuth) = 98.659ms;
Shell Sorting (Padrão) = 102.640 ms;
Straight Insertion = 161.332 ms; 
~~~
Obviamente, mais comparações deveriam ser feitas e métodos estatísticos poderiam estimar uma eficiência dentro de um grau de confiabilidade especifícado, mas essas execuções já demonstram as diferenças entre os métodos.
