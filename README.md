# Gobang/Gomoku

## History

***Gomoku*** , also called  *Five in a Row* , is an [abstract strategy](https://en.wikipedia.org/wiki/Abstract_strategy_game "Abstract strategy game") [board game](https://en.wikipedia.org/wiki/Board_game "Board game"). It is traditionally played with [Go](https://en.wikipedia.org/wiki/Go_(game)) "Go (game)") pieces (black and white stones) on a Go board. It is played using a 15×15 board ^[[1]](https://en.wikipedia.org/wiki/Gomoku#cite_note-1)^ ^[[2]](https://en.wikipedia.org/wiki/Gomoku#cite_note-2)^ while in the past a 19×19 board was standard. ^[[3]](https://en.wikipedia.org/wiki/Gomoku#cite_note-3)^ ^[[4]](https://en.wikipedia.org/wiki/Gomoku#cite_note-4)^ Because pieces are typically not moved or removed from the board, gomoku may also be played as a [paper-and-pencil game](https://en.wikipedia.org/wiki/Paper-and-pencil_game "Paper-and-pencil game"). The game is known in several countries under different names.

[Gomoku - Wikipedia](https://en.wikipedia.org/wiki/Gomoku)

## Logic

### Welcome to Gobang

1. Start Game
2. Quit Game

### Initialize Game Board

1. AI/PVP?
2. Board size
   1. 9*9
   2. 15*15
   3. 19*19(Standard)

### Play

1. Who first? Black first
2. 5 stones in a line, either straight or diagnol.

### Classes

1. Main
   1. Game,
      1. to run the model,
      2. initialize game,
      3. set who first
2. Player interface: IPlayer
   1. Abstract class Player
      1. AI
      2. Human
3. Chess
   1. White/Black
