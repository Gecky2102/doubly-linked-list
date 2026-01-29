# Verifica Linked List Masiero

## Testo Verifica
Definisci in un progetto Java tutte le classi e i metodi necessari per implementare la struttura spiegata di seguito. Il progetto dovrebbe avere un nome simile a "verifica_cognome_gennaio".

La struttura è una lista doppiamente concatenata , il che significa che ogni nodo ha un riferimento sia al nodo a sinistra che a quello a destra. La classe Node è strutturata in questo modo:

public class Node {
    private char data;
    private Node prev;
    private Node next;
}

La classe DoublyLinkedList ha 2 riferimenti Node, uno per la testa (primo nodo della lista), uno per la coda (ultimo nodo della lista). Ricorda di implementare, dove necessario, costruttori, metodi getter e setter. 
Importante: non esiste un nodo successivo per la coda, non esiste un nodo precedente per la testa!

Devi implementare questi metodi:

-  print(boolean forward) , stampa ogni singolo nodo in una direzione specifica: a partire da head se il parametro è true (il che significa che la scansione viene eseguita in avanti), a partire da tail se il parametro è false (il che significa che la scansione viene eseguita all'indietro)

- int size( ) , conta quanti nodi sono presenti nella lista, indipendentemente dalla direzione

-  merge(DoublyLinkedList otherList) , riceve un'altra lista doppiamente concatenata come parametro di input e la aggiunge alla fine della lista corrente

- String slice(int start, int end) , crea una stringa con una "sottolista" dei caratteri aventi gli indici specificati, a partire da "start" (incluso) e terminando con "end" (escluso). L'indice conta da 0. Passando lo stesso indice si ottiene una stringa vuota.
Esempio:
ABCDE -> (slice 0,3) -> "ABC"
ABCD -> (slice 2,3) -> "C"
ABC -> (slice 1,1) -> ""
ABCD -> (slice 3,1) -> "DC"

[punto extra se fatto con ricorsione!]
-  boolean palindromo( ) , controlla se i dati memorizzati nei nodi formano una stringa palindroma, il che significa che i nodi sono simmetrici (considerando solo il valore all'interno!)

-  shift(int amount) , sposta molti elementi nell'elenco (uguali al parametro "amount") dall'ultima posizione alla prima posizione
Esempio:
ABCDE -> (viene applicato 1 spostamento) -> EABCD
ABCDE -> (vengono applicati 3 spostamenti) -> CDEAB

-  trim(int newSize) , imposta la nuova lunghezza dell'elenco sul parametro di input:
a. se newSize è minore della lunghezza effettiva, l'elenco viene ridotto rendendo la sua dimensione uguale ad essa, rimuovendo alcuni nodi
b. se newSize è maggiore della lunghezza effettiva, nuovi nodi vengono aggiunti alla coda per renderne la dimensione uguale. Ogni nodo aggiunto deve avere un contenuto specifico, che sarà costituito dai successivi caratteri ASCII a partire dalla coda.
Esempio:
ABCDEFG -> (newSize è 4) -> ABCD (la lista viene ridotta, ora la sua lunghezza è 4) 
FWIQ -> (newSize è 7) -> FWIQRST (la lista è ora composta da 7 nodi, quelli aggiunti seguono la regola ASCII).

Ricordarsi di aggiornare i riferimenti di testa e coda dove necessario.

## Metodi da implementare
- [ ] print()
- [ ] size()
- [ ] merge()
- [ ] slice()
- [ ] palindrome()
- [ ] shift() // boh non va
- [ ] trim() // non l'ho fatto

fine ❤️. (Fatto da [Gecky🦎](https://www.gmasiero.it) )