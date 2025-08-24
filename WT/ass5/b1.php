<html>
<head> 
   <style>
   th,td
   {
      text-align:center;
   }
   </style>
</head>
<?php
    if(!$file=fopen("item.dat",'r'))
      die("Error...!!!File may be not Exists");
    echo "<table border=1>";
    echo "<tr><th>Code</th><th>Name</th><th>Unit Sold</th><th>Rate</th></tr>";
    while (($line = fgets($file)) !== false)
    {
           $data = explode("|", $line);
           echo"<tr><td>$data[0]</td><td>$data[1]</td><td>$data[2]</td><td>$data[3]</td></tr>";
    }
    echo "</table>";
?>
</html>



<!---
<?php
$file_path = "file.txt"; // Replace with the path to your file

// Open the file for reading
$file_handle = fopen($file_path, "r");

if ($file_handle) {
    // Get the file size
    $file_size = filesize($file_path);

    // Read the file contents
    $file_contents = fread($file_handle, $file_size);

    // Close the file
    fclose($file_handle);

    // Display the file contents and size
    echo "File Contents:<br>";
    echo "<pre>" . htmlspecialchars($file_contents) . "</pre><br>";
    echo "File Size: " . $file_size . " bytes";
} else {
    echo "Failed to open the file.";
}
?>


//A2
<?php
// Database connection details
$servername = "server1";
$username = "Darshan";
$password = "passme1234";
$database = "your_database";

// Create a connection to the database
$conn = new mysqli($servername, $username, $password, $database);

// Check the connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
}

// Function to update the committee status to "working" for a given event title
function updateCommitteeStatus($eventTitle, $conn) {
    // SQL query to update the committee status
    $sql = "UPDATE Committee SET status = 'working'
            WHERE cno IN (
                SELECT c.cno
                FROM Committee c
                JOIN Event_Committee ec ON c.cno = ec.cno
                JOIN Event e ON ec.eno = e.eno
                WHERE e.title = ?
            )";

    // Prepare the SQL statement
    $stmt = $conn->prepare($sql);
    
    if ($stmt === false) {
        echo "Error in preparing statement: " . $conn->error;
        return false;
    }

    // Bind the event title parameter
    $stmt->bind_param("s", $eventTitle);

    // Execute the statement
    if ($stmt->execute()) {
        echo "Committee status updated to 'working' for event '$eventTitle'";
    } else {
        echo "Error updating committee status: " . $stmt->error;
    }

    // Close the statement
    $stmt->close();
}

// Check if the form has been submitted
if (isset($_POST['eventTitle'])) {
    $eventTitle = $_POST['eventTitle'];
    updateCommitteeStatus($eventTitle, $conn);
}

// Close the database connection
$conn->close();
?>

<!DOCTYPE html>
<html>
<head>
    <title>Update Committee Status</title>
</head>
<body>
    <h1>Update Committee Status</h1>
    <form method="post">
        <label for="eventTitle">Enter Event Title:</label>
        <input type="text" name="eventTitle" required>
        <button type="submit">Update Status</button>
    </form>
</body>
</html>



//setB1
<?php
// File path
$file_path = "item.dat";

// Function to display the bill
function displayBill($file_path) {
    // Check if the file exists
    if (file_exists($file_path)) {
        // Open the file for reading
        $file_handle = fopen($file_path, "r");

        if ($file_handle) {
            // Display the table header
            echo "<table border='1'>";
            echo "<tr><th>Item Code</th><th>Item Name</th><th>Units Sold</th><th>Rate</th><th>Total</th></tr>";

            // Initialize total cost
            $total_cost = 0;

            // Read and display each line of the file
            while (($line = fgets($file_handle)) !== false) {
                $data = explode(",", $line);

                // Check if data array has 4 elements
                if (count($data) == 4) {
                    list($itemCode, $itemName, $unitsSold, $rate) = $data;

                    // Check if Units Sold and Rate are numeric
                    if (is_numeric($unitsSold) && is_numeric($rate)) {
                        $total = $unitsSold * $rate;
                        $total_cost += $total;

                        // Display item details in a table row
                        echo "<tr><td>$itemCode</td><td>$itemName</td><td>$unitsSold</td><td>$rate</td><td>$total</td></tr>";
                    } 
                }
            }

            // Display the total cost
            echo "<tr><td colspan='4'>Total Cost:</td><td>$total_cost</td></tr>";
            echo "</table>";

            // Close the file
            fclose($file_handle);
        } else {
            echo "Failed to open the file.";
        }
    } else {
        echo "The file 'item.dat' does not exist.";
    }
}

// Call the displayBill function
displayBill($file_path);
?>

//item.dat

ItemCode,ItemName,UnitsSold,Rate
101,Item1,2,10.99
102,Item2,3,5.49
103,Item3,1,20.99
104,Item4,4,3.99
105,Item5,2,8.99


//C1
<!DOCTYPE html>
<html>
<head>
    <title>File Operations</title>
</head>
<body>
    <h1>File Operations</h1>
    <form method="post" action="">
        <label for="filename">Enter the filename:</label>
        <input type="text" id="filename" name="filename" required>
        <br><br>
        <label>Select an operation:</label>
        <select name="operation">
            <option value="a">Display file type</option>
            <option value="b">Display last access time</option>
            <option value="c">Display file size</option>
            <option value="d">Delete the file</option>
        </select>
        <br><br>
        <input type="submit" value="Submit">
    </form>

    <?php
    if ($_SERVER["REQUEST_METHOD"] == "POST") {
        $filename = $_POST["filename"];
        $operation = $_POST["operation"];

        switch ($operation) {
            case 'a':
                displayFileType($filename);
                break;
            case 'b':
                displayLastAccessTime($filename);
                break;
            case 'c':
                displayFileSize($filename);
                break;
            case 'd':
                deleteFile($filename);
                break;
            default:
                echo "<p>Invalid choice.</p>";
                break;
        }
    }

    // Function to display the file type
    function displayFileType($filename) {
        $fileInfo = pathinfo($filename);
        if (isset($fileInfo['extension'])) {
            echo "<p>File type: " . $fileInfo['extension'] . "</p>";
        } else {
            echo "<p>File type: Unknown</p>";
        }
    }

    // Function to display the last access time of the file
    function displayLastAccessTime($filename) {
        if (file_exists($filename)) {
            $accessTime = fileatime($filename);
            echo "<p>Last access time: " . date("Y-m-d H:i:s", $accessTime) . "</p>";
        } else {
            echo "<p>File does not exist.</p>";
        }
    }

    // Function to display the size of the file
    function displayFileSize($filename) {
        if (file_exists($filename)) {
            $size = filesize($filename);
            echo "<p>File size: " . $size . " bytes</p>";
        } else {
            echo "<p>File does not exist.</p>";
        }
    }

    // Function to delete the file
    function deleteFile($filename) {
        if (file_exists($filename)) {
            if (unlink($filename)) {
                echo "<p>File deleted successfully.</p>";
            } else {
                echo "<p>Error deleting the file.</p>";
            }
        } else {
            echo "<p>File does not exist.</p>";
        }
    }
    ?>
</body>
</html>-->
