<?php
$message = "I am from Malang";

// Reverse the entire string
echo strrev($message) . "<br>";

// Split the string into words
$words = explode(" ", $message);

// Reverse each word individually
$wordsReversed = array_map(fn($word) => strrev($word), $words);

// Join the reversed words back into a string
$reversedMessage = implode(" ", $wordsReversed);

echo $reversedMessage . "<br>";
?>
