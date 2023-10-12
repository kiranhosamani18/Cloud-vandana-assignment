function reverseWordsInSentence(sentence) {
    // Split the sentence into words using space as a delimiter
    const words = sentence.split(" ");

    // Iterate through each word and reverse it
    const reversedWords = words.map(word => reverseWord(word));

    // Join the reversed words to form the reversed sentence
    const reversedSentence = reversedWords.join(" ");

    return reversedSentence;
}

function reverseWord(word) {
    // Convert the word to an array of characters
    const charArray = word.split("");

    // Reverse the character array
    const reversedArray = charArray.reverse();

    // Join the characters back together to form the reversed word
    const reversedWord = reversedArray.join("");

    return reversedWord;
}

// Example
const inputSentence = "This is a sunny day";
const reversedSentence = reverseWordsInSentence(inputSentence);
console.log("Original sentence: " + inputSentence);
console.log("Reversed sentence: " + reversedSentence);