
//Question: 1 


/*
// Function to reverse every word in a sentence
function reverseWords(sentence) {
    let words = [];              // An array to store reversed words
    let currentWord = '';        // A variable to build the current word
    let reversedSentence = '';   // The final reversed sentence
    
    for (let i = 0; i < sentence.length; i++) {
        if (sentence[i] === ' ' || i === sentence.length - 1) {
            // If a space is encountered or we reach the end of the sentence, handle the current word
            if (i === sentence.length - 1) {
                currentWord += sentence[i];
            }

            let reversedWord = '';
            // Reverse the current word by iterating through its characters in reverse order
            for (let j = currentWord.length - 1; j >= 0; j--) {
                reversedWord += currentWord[j];
            }
            words.push(reversedWord); // Add the reversed word to the array
            currentWord = '';         // Reset the current word for the next word
        } else {
            currentWord += sentence[i]; // Build the current word character by character
        }
    }

    reversedSentence = words.join(' '); // Join the reversed words to create the reversed sentence

    return reversedSentence;
}

const inputSentence = "My name is Manisha";
const reversed = reverseWords(inputSentence);
console.log(reversed);*/




//**************************************************************************************************************************************** */
//***************************************************************************************************************************************** */




//Quetion 2

/*function sortArrayDescending(arr) {
    const n = arr.length;

    // Outer loop to iterate through each element in the array
    for (let i = 0; i < n - 1; i++) {
        // Inner loop to compare the current element with the rest of the elements
        for (let j = i + 1; j < n; j++) {
            if (arr[i] < arr[j]) {
                // Swap arr[i] and arr[j] if the current element is smaller
                const temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
    }
}

const inputArray = [5, 2, 9, 1, 5, 6];

// Call the sorting function
sortArrayDescending(inputArray);

// Print the sorted array in descending order
console.log(inputArray);
*/