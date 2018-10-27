Scrabble 
========

In the game of scrabble you create words from letter tiles and lay them on a board. You receive points for each word you place, that are added to your score.

Common letters have a lower value than rarer letters. The value shown on each letter tile is as follows:

    Letter                             Value
    A, E, I, O, U, L, N, R, S, T       1
    D, G                               2
    B, C, M, P                         3
    F, H, V, W, Y                      4
    K                                  5
    J, X                               8
    Q, Z                               10

In this repository there is starting code providing convenient access to this data. There is also a json version.

The first part of this Code Kata is to calculate the base score for any word using any combination of these letters. In Scrabble, the base score is the sum of the value for each letter. For example, if you took the word "Cabbage" the basic score is 14 (3+1+3+3+1+2+1)

Note: The shortest word you can play has two letters. The longest word that will fit on a scrabble board has 15 letters and you don't need to handle words longer than that. 

Part 2
------

Calculate the scrabble score for any word placed on the board, given the co-ordinates of the first letter, and the direction (vertical or horizontal).

The board is a 15x15 grid with rows labelled 1-15 and columns labelled A-O. The co-ordinates of a particular square would for example be (D, 3) or (F, 11). 

Most squares are blank and have no effect on the score for a word. There are five kinds of "premium" squares on the board: 

    - 2×LS - Double letter score: the score for this letter is doubled
    - 3×LS - Triple letter score: the score for this letter is tripled
    - star - Star: the score for this word is doubled
    - 2×WS - Double word score: the score for this word is doubled
    - 3×WS - Triple word score: the score for this word is tripled

If a word falls on several premium squares, apply the modifiers in the order above.

In this repository there is starting code providing convenient access to data about the positions of spremium squares on the board, in two data formats. There is also a version in json.

For example if you took the word "Cabbage" the basic score is 14 (3+1+3+3+1+2+1). If you lay it horizontally, with the first letter on square (I, 2), it ends up with these modifiers:

    C - blank
    A - 3xLS
    B - blank
    B - blank
    A - blank
    G - 2xWS
    E - blank

The score would be 32, calculated like this: (3+(1*3)+3+3+1+2+1)*2

If you instead laid it vertically with the first letter on (A, 4), it would have these modifiers:

    C - 2xLS
    A - blank
    B - blank
    B - blank
    A - 3xWS
    G - blank
    E - blank

The score would be 51, calculated like this: ((3*2)+1+3+3+1+2+1)*3

See also [wikipedia](https://en.wikipedia.org/wiki/Scrabble) for further explanations and a picture of the board with the actual layout.


