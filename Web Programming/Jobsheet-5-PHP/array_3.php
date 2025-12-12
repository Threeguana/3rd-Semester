<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="style.css"/>
    <title>Multidimensional Array</title>
</head>

<body>
    <h2>Multidimensional Array</h2>

    <table>
        <tr>
            <th>Movie Title</th>
            <th>Year</th>
            <th>Rating</th>
        </tr>

        <?php
            $movies = [
                ["Avengers: Infinity War", 2018, 8.7],
                ["The Avengers", 2012, 8.1],
                ["Guardians of the Galaxy", 2014, 8.1],
                ["Iron Man", 2008, 7.9]
            ];

            foreach ($movies as $film) {
                echo "<tr>";
                echo "<td>{$film[0]}</td>";
                echo "<td>{$film[1]}</td>";
                echo "<td>{$film[2]}</td>";
                echo "</tr>";
            }
        ?>
    </table>
</body>
</html>
