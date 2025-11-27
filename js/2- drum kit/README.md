# Drum Kit Project - Assignment Instructions 🥁

Welcome to the Drum Kit project! In this assignment, you will start by styling the buttons to look like drums, and then use JavaScript and DOM Manipulation to make them interactive—playing sounds via both mouse clicks and keyboard presses.

## 📂 Folder Structure

Please note that the project files are organized into folders:

- Images are located in: `images/`
- Audio files are located in: `sounds/`

---

## 📝 Workflow Steps

### Step 1: Styling the Buttons (CSS & Images) 🎨

Before writing any JavaScript, we need to add the appropriate drum image as a background (`background-image`) to each button.
Each button has a unique class representing its key: `w`, `a`, `s`, `d`, `j`, `k`, `l`.

**The Task:**
Open the `styles.css` file and add the correct image from the `images` folder to each class.

- For example, for the `.w` class, set the `background-image` property with the path to the corresponding image.
- Repeat this for all buttons.

---

### Step 2: JavaScript - Selecting Elements

Now, let's move to the Script file. You need to "grab" all the drum buttons on the page so we can add interactivity to them.

- Use `document.querySelectorAll` to select all elements with the class `.drum`.

### Step 3: Listening to Mouse Clicks 🖱️

Loop through the list of buttons you selected and add a `click` event listener to each one.

**The Task:**
When a specific button is clicked:

1.  Identify which button was clicked (e.g., by checking its `innerHTML` or Class).
2.  Trigger the sound corresponding to that letter (detailed in the next step).

### Step 4: Sound Logic (Make Sound) 🔊

Create a central function responsible for receiving a character (key) and playing the matching audio file from the `sounds` folder.

**Important:** When creating the `Audio` object, make sure to use the full relative path, for example: `sounds/tom-1.mp3`.

**Sound Mapping (Example):**

- `w` -> `sounds/tom-1.mp3`
- `a` -> `sounds/tom-2.mp3`
- `s` -> `sounds/tom-3.mp3`
- `d` -> `sounds/tom-4.mp3`
- `j` -> `sounds/snare.mp3`
- `k` -> `sounds/crash.mp3`
- `l` -> `sounds/kick-bass.mp3`

### Step 5: Listening to Keyboard Events ⌨️

We want the drums to play when pressing keys on the keyboard as well.

**The Task:**

1.  Add an event listener to the entire `document` that listens for the `keydown` event.
2.  Check which key was pressed (`event.key`).
3.  Call the sound function you created in Step 4 and pass the pressed key to it.

### Step 6: Bonus - Animations ✨

To provide visual feedback to the user when a button is pressed (via mouse or keyboard):

1.  Create a function that accepts the relevant key.
2.  Find the corresponding button in the HTML.
3.  Add the `pressed` class to it (this class is already defined in the CSS).
4.  Use `setTimeout` to remove this class after approximately 100 milliseconds to create a "pressed" effect.

---

## 💡 Tips for Success

- **Check Your Paths:** If an image doesn't load or a sound doesn't play, the first thing to check is whether the path to `images/` or `sounds/` is correct.
- **DRY (Don't Repeat Yourself):** Try to avoid writing the same code twice. Use the same function to play sound for both the mouse click and the keyboard press.

Good Luck! 🎶
