<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Current Time</title>
</head>
<body>
    <h3>Current Time</h3>
    <?php
        // Set the default timezone to Jakarta
        date_default_timezone_set("Asia/Jakarta");

        // Display the current time in 12-hour format 
        echo date("h:i:sa");
    ?>
</body>
</html>
