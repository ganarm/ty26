<html>
<?php

for ($i=0;$i<5;$i++)
{
   $no[$i]=$_POST['no'][$i];
   $name[$i]=$_POST['name'][$i];
   $marks[$i]=$_POST['marks'][$i];   
}
$avg=0;
?>
<table border="1">

     <tr colspan="2">
     <?php
       echo "<th> serial no </th>";
        echo "<th> subject name </th>";
         echo "<th> subject marks </th>";
     echo "</tr>";
     for ($i=0;$i<5;$i++)
     {
        echo "<tr>";
        echo "<td> $no[$i] </dt>";
        echo "<td> $name[$i] </dt>";
        echo "<td> $marks[$i] </dt>";
        echo "</tr>";
        $avg=$avg+$marks[$i];
     }
     ?>
     <tr>
     <td>Total</td>
     <?php
        echo "<td>$avg</td>";
     ?>
     </tr>

</table>

</html>
 <?php
     $per=$avg/5;
        echo "Percentage : $per";
        if ($per > 95)
           echo "O Grade";
        else if ($per > 85)
                echo "A+ Grade";
        else if ($per > 75)
                echo "A Grade";
        else if ($per > 65)
                echo "B Grade";
        else if ($per > 45)
                echo "C Grade";
        else if ($per > 35)
                echo "P Grade";
        else
           echo "Fail";
     ?>


