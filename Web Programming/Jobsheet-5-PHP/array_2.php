<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" type="text/css" href="style.css"/>

    <style>
        table {
            border-collapse: collapse;
            width: 50%;
            border: 1px solid #ddd;
        }

        th, td {
            text-align: left;
            padding: 6px;
        }

        th {
            background-color: rgb(121, 168, 255);
        }

        tr:nth-child(even) {
            background-color: #b0d6ea9e;
        }
    </style>
</head>

<body>
    <table>
        <tr>
            <th>Name</th>
            <th>Residence</th>
            <th>Gender</th>
        </tr>

        <?php
            $lecturers = [
                ["Elok Nur Hamdana", "Malang", "Female"]
            ];

            foreach ($lecturers as $person) {
                echo "<tr>";
                echo "<td>{$person[0]}</td>";
                echo "<td>{$person[1]}</td>";
                echo "<td>{$person[2]}</td>";
                echo "</tr>";
            }
        ?>
    </table>
</body>
</html>
