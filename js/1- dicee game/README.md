# 🎲 Dice Game Challenge

Welcome to the Dice Game! Your goal is to use JavaScript to add logic to this static website. You will make the dice roll randomly and declare a winner every time the page is refreshed.

## 🎯 Objectives

1.  Generate random values for the dice.
2.  Manipulate the DOM to change the dice images.
3.  Implement game logic to determine the winner.

---

## 📝 Instructions

### Step 1: Generate Random Numbers

Inside your JavaScript file, you need to create the logic for the dice rolls.

- Create a variable for **Player 1** that generates a random number between **1 and 6**.
- Create a second variable for **Player 2** that also generates a random number between **1 and 6**.

> **Hint:** Remember to use `Math.random()` combined with `Math.floor()`.

### Step 2: Update the Images

Now that you have your random numbers, you need to update the HTML elements to show the correct dice image (`images/dice1.png`, `images/dice6.png`).

1.  Select the element with the class `.img1`.
2.  Select the element with the class `.img2`.
3.  Update the `src` attribute of both elements to match the random numbers you generated in Step 1.

> **Example:** If Player 1 rolls a `3`, the source should point to the image file `dice3.png`.

### Step 3: Declare the Winner

Finally, you need to tell the users who won the game by changing the main heading (`h1`) text.

- **If Player 1's number > Player 2's number:** Change the text to "🚩 Player 1 Wins!"
- **If Player 2's number > Player 1's number:** Change the text to "Player 2 Wins! 🚩"
- **If the numbers are equal:** Change the text to "Draw!"

---

## 🚀 Bonus Challenge (Optional)

If you finish early, try to add a "Roll Dice" button so the user doesn't have to refresh the page to play again!

Good luck! 🍀
