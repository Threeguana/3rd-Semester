<?php
// Create a function to calculate age
function calculateAge($birthYear, $currentYear) {
    return $currentYear - $birthYear;
}

// Greeting function
function introduce($name, $greeting = "Hello") {
    echo $greeting . ", ";
    echo "My name is " . $name . "<br/>";

    // Calling another function
    echo "I am " . calculateAge(2006, 2025) . " years old<br/>";
    echo "Nice to meet you<br/>";
}

// Calling the introduce function
introduce("Andini");
?>
