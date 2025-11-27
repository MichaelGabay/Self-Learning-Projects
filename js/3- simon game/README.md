# Simon Game Project Instructions

This document provides instructions on how to create the Simon game using the provided starting files.

## Project Goal

The goal is to create a web-based Simon game where the player has to repeat a sequence of colors and sounds. The sequence gets longer with each correct round.

## File Structure

You start with the following files:

- `index.html`: The main HTML file containing the structure of the game.
- `styles.css`: The CSS file for styling the game.
- `sounds/`: A directory containing the sound files for each color and for a wrong guess.

## Implementation Steps

### 1. Link JavaScript and jQuery

First, you need to create a `game.js` file for your game logic. Then, link it and the jQuery library to your `index.html` file. Add these lines just before the closing `</body>` tag:

```html
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script src="game.js" charset="utf-8"></script>
```

### 2. Game Logic (`game.js`)

#### Starting the Game

- The game should start only when a key is pressed for the first time.
- When the game starts, the title should change from "Press A Key to Start" to "Level 1".
- Call a function `nextSequence()` to start the first round.

#### Generating the Next Sequence

- Create a function called `nextSequence()`.
- Inside this function, generate a random number between 0 and 3.
- Create an array of button colors (`["red", "blue", "green", "yellow"]`).
- Use the random number to select a color from the array.
- Add the chosen color to a `gamePattern` array that stores the game's sequence.
- Animate the chosen button (e.g., with a flash) and play its corresponding sound.

#### User Interaction

- Use jQuery to detect when any of the buttons are clicked.
- When a button is clicked, get its `id`.
- Add the `id` of the clicked button to a `userClickedPattern` array.
- Play the sound for the clicked button.
- Animate the button press.

#### Checking the User's Answer

- After each click, you need to check the user's answer against the game's sequence.
- Create a function `checkAnswer()` that takes the current level (the index of the last answer) as an argument.
- Check if the last answer from the user is the same as the corresponding answer in the `gamePattern`.
- **If the answer is correct:**
  - Check if the user has finished their sequence (i.e., the lengths of `userClickedPattern` and `gamePattern` are the same).
  - If they have finished, call `nextSequence()` again after a short delay (e.g., 1000ms) to move to the next level.
- **If the answer is wrong:**
  - Play the "wrong" sound.
  - Add the `game-over` class to the `body` for a visual effect, and remove it after a short delay.
  - Change the `h1` title to "Game Over, Press Any Key to Restart".
  - Call a function to restart the game.

#### Restarting the Game

- Create a `startOver()` function.
- In this function, reset the game state:
  - Reset the `level`.
  - Reset the `gamePattern` array.
  - Reset the `started` flag.

## Good luck👍
