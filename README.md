Enquanto o nosso aniversariante permutava balões, ele recebeu um e-mail de uma professora pedindo para enviar com urgência alguns dados estatísticos adicionais para incluir em relatório sobre um projeto do qual ele participa.

Prontamente o Tobias abriu a planilha do Excel onde os dados estavam salvos para fazer as contas necessárias e enviar o mais rápido possível os dados solicitados. Quanto antes ele terminar essa tarefa, mais tempo sobrará para ele aproveitar o dia do seu aniversário.

No Excel, cada coluna da planilha é indicada por letras. A primeira coluna é a letra “A”, a segunda coluna é a letra “B”, a terceira “C” e assim por diante até “Z”, onde a próxima coluna é “AA”. Depois vem “AB”, “AC”, “AD”, ..., até “AZ”. Daí vem “BA”, “BB”, “BC”, ..., e assim por diante até “ZZ”. Após vem “AAA”, “AAB”, ..., até chegar em “XFD” que é a última coluna da planilha. (Sim, existe uma última coluna! Desculpa destruir o sonho de quem achava que ela era infinita).

No Excel, existem ainda, fórmulas que realizam operações específicas e podem receber como parâmetros células da planilha. Uma dessas fórmulas é a =COL(), que se chamada sem parâmetros retorna a posição numérica da coluna em que ela foi chamada. Por exemplo, chamar a função =COL() em alguma linha qualquer da coluna “A” retornaria 1. Chamar na coluna “D” retornaria 4, na coluna “Z” retornaria 26, na coluna “AB” retornaria 28 e assim por diante.

Ao tentar realizar as operações necessárias para recuperar os dados solicitados, Tobias notou que a fórmula =COL() não estava funcionando.

Você consegue ajudá-lo a resolver esse problema escrevendo um algoritmo que dado o conjunto de letras que identifica a coluna retorne à posição numérica dela? Como ele está com um pouco de pressa em terminar isso, é possível que digite por engano algum código de coluna que não exista (fora do intervalo “A” – “XFD”), nesse caso você deve avisá-lo disso.
