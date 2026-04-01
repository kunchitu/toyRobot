# Toy Robot

A console application simulating a toy robot moving on a 5x5 table.


## Constraints

- **Table Size**: 5x5 (coordinates from `0,0` to `4,4`)
- **Origin**: `(0,0)` is the bottom-left corner (SOUTH WEST)
- The robot ignores all commands until it receives a valid `PLACE`


## Commands

Commands are case-insensitive.

| Command        | Description                                  | Example          |
|----------------|----------------------------------------------|------------------|
| `PLACE X,Y,F` | Place robot at X,Y facing F                  | `PLACE 1,2,EAST` |
| `MOVE`        | Move forward 1 step                          | `MOVE`           |
| `LEFT`        | Turn left 90 degrees                         | `LEFT`           |
| `RIGHT`       | Turn right 90 degrees                        | `RIGHT`          |
| `REPORT`      | Show current position and direction          | `REPORT`         |
| `EXIT`        | Exit program                                 | `EXIT`           |


## Rules

- Ignore `MOVE` or `PLACE` if robot will fall off the table
- Ignore invalid commands

## Requirements

- Java JDK 11 or higher

## Run Project
1. Go to **Edit Configuration**
2. Click **Add New Configuration**
3. Choose **Application**
4. Set the following values:
    - **Main class**: `com.example.Main`
    - **Working directory**: `[your folder]/toyRobot`
5. Click **OK**

Then you can **Run** or **Debug** the `Main` class.

## Tests

The tests use JUnit.
