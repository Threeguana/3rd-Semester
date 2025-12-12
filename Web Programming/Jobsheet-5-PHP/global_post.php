<!DOCTYPE html>
<html lang="en">
<body>

    <form method="post" action="<?php echo $_SERVER['PHP_SELF']; ?>">
        Name: <input type="text" name="fname">
        <input type="submit" value="Submit">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        // Collect the value from the input field
        $name = $_POST['fname'];

        if (empty($name)) {
            echo "Name is empty";
        } else {
            echo "Hello, " . htmlspecialchars($name);
        }
    }
    ?>

</body>
</html>
