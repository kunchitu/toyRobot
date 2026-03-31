# Toy Robot

A console application simulating a toy robot moving on a 5x5 table top.

[//]: # (## Requirements)

[//]: # ()
[//]: # (- Java JDK 11 or higher)

## Setup & Run

### Compile

```bash
cd src
javac *.java
```

### Run

```bash
java Main
```

[//]: # ()
[//]: # (## Commands)

[//]: # ()
[//]: # (| Command | Description |)

[//]: # (|---|---|)

[//]: # (| `PLACE X,Y,F` | Place robot at position X,Y facing NORTH/SOUTH/EAST/WEST |)

[//]: # (| `MOVE` | Move robot one unit forward |)

[//]: # (| `LEFT` | Rotate robot 90° to the left |)

[//]: # (| `RIGHT` | Rotate robot 90° to the right |)

[//]: # (| `REPORT` | Print current position and direction |)

[//]: # (| `EXIT` | Quit the application |)

[//]: # ()
[//]: # (## Rules)

[//]: # ()
[//]: # (- Table size is **5x5** units &#40;origin `0,0` is the SOUTH WEST corner&#41;)

[//]: # (- First valid command must be a `PLACE` command)

[//]: # (- Any command before a valid `PLACE` is ignored)

[//]: # (- Robot must not fall off the table — any move that would cause this is ignored)

[//]: # ()
[//]: # (## Examples)

[//]: # ()
[//]: # (```)

[//]: # (PLACE 0,0,NORTH)

[//]: # (MOVE)

[//]: # (REPORT)

[//]: # (> 0,1,NORTH)

[//]: # (```)

[//]: # ()
[//]: # (```)

[//]: # (PLACE 0,0,NORTH)

[//]: # (LEFT)

[//]: # (REPORT)

[//]: # (> 0,0,WEST)

[//]: # (```)

[//]: # ()
[//]: # (```)

[//]: # (PLACE 1,2,EAST)

[//]: # (MOVE)

[//]: # (MOVE)

[//]: # (LEFT)

[//]: # (MOVE)

[//]: # (REPORT)

[//]: # (> 3,3,NORTH)

[//]: # (```)

[//]: # ()
[//]: # (## Project Structure)

[//]: # ()
[//]: # (```)

[//]: # (toyRobot/)

[//]: # (├── src/)

[//]: # (│   ├── Main.java           # Entry point, input loop)

[//]: # (│   ├── Robot.java          # Robot state and movement logic)

[//]: # (│   ├── Direction.java      # Enum for NORTH/SOUTH/EAST/WEST)

[//]: # (│   └── CommandParser.java  # Parses and executes commands)

[//]: # (├── test/)

[//]: # (│   └── RobotTest.java      # Unit tests)

[//]: # (└── README.md)

[//]: # (```)

[//]: # ()
[//]: # (## Running Tests)

[//]: # ()
[//]: # (Tests can be run via IntelliJ IDEA by right-clicking `RobotTest.java` and selecting **Run**.)
