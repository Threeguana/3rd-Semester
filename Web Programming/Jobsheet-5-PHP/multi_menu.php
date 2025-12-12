<?php
$menu = [
    ["name" => "Home"],
    [
        "name" => "News",
        "subMenu" => [
            [
                "name" => "Tourism",
                "subMenu" => [
                    ["name" => "Beach"],
                    ["name" => "Mountain"]
                ]
            ],
            ["name" => "Culinary"],
            ["name" => "Entertainment"]
        ]
    ],
    ["name" => "About"],
    ["name" => "Contact"],
];

/**
 * Display a multi-level menu as nested unordered lists
 *
 * @param array $menu
 */
function displayNestedMenu(array $menu) {
    echo "<ul>";
    foreach ($menu as $item) {
        echo "<li>{$item['name']}";

        // Recursively display submenus if available
        if (isset($item['subMenu']) && is_array($item['subMenu'])) {
            displayNestedMenu($item['subMenu']);
        }
        echo "</li>";
    }
    echo "</ul>";
}

// Display the menu
displayNestedMenu($menu);
?>
