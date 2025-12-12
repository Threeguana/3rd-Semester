<?php
$name = @$_GET['name'];  // @ hides warnings if the key does not exist
$age  = @$_GET['age'];   // @ hides warnings if the key does not exist

echo "Hello {$name}! Is it true that you are {$age} years old?";
?>
