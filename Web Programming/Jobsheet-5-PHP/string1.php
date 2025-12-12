<?php
$text = "Lorem ipsum dolor sit amet consectetur adipisicing elit. Qui, error!";

// Display the original text
echo "<p>{$text}</p>";

// Display the length of the string (number of characters)
echo "Character length: " . strlen($text) . "<br>";

// Display the number of words
echo "Word count: " . str_word_count($text) . "<br>";

// Display the text in uppercase
echo "<p>" . strtoupper($text) . "</p>";

// Display the text in lowercase
echo "<p>" . strtolower($text) . "</p>";
?>
