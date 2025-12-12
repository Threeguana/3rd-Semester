<?php
$x = 75;
$y = 25;

function addition() {
    // Access global variables and create a new one
    $GLOBALS['z'] = $GLOBALS['x'] + $GLOBALS['y'];
}

addition();
echo $z;
?>
