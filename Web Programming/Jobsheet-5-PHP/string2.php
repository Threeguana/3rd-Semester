<?php
// 10.a: Double quotes interpret escape sequences (\n)
echo "New line\n<br>";

// 10.b: Single quotes treat escape sequences as literal text
echo 'New line\n<br>';

// 10.c: Carriage return with double quotes (\r)
echo "Hello\rWorld <br>";

// 10.d: Carriage return with single quotes (literal)
echo 'Hello\rWorld <br>';

// 10.e: Tab with double quotes, using <pre> to preserve formatting
echo "<pre>Hello\tWorld!</pre>";

// 10.f: Tab with single quotes, using <pre> (literal \t)
echo '<pre>Hello\tWorld!</pre>';

// 10.g: Double quotes with escaped double quotes
echo "Say \"No to drugs!\" <br>";

// 10.h: Single quotes with escaped single quotes
echo 'Say \'No to drugs!\' <br>';
?>
