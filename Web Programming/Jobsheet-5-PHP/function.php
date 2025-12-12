<?php
function introduction() {
    echo "Assalamualaikum, ";
    echo "let me introduce myself, my name is Andin<br/>";
    echo "Nice to meet you<br/>";
}

// Calling the function
introduction();
echo "<br>";
introduction();


// Step 4
function greet($name, $greeting = "Assalamualaikum") {
    echo $greeting . ", ";
    echo "Let me introduce myself, my name is " . $name . "<br/>";
    echo "Nice to meet you<br/>";
}

echo "<hr>";
greet("Tribuana", "Hi");
echo "<hr>";

$me = "Andini";
$customGreeting = "Good night";

// Calling again
greet($me);
?>
