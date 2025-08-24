<html>
     <?php
           $a=array("Sophia"=>"31","Jacob"=>"41","William"=>"39","Ramesh"=>"40");
           echo"<br>Original array : ";
           echo"<b>";
           print_r($a);
           echo"</b>";
           asort($a);
           echo "<br>Ascending order sort by value : ";
           echo"<b>";   
           print_r($a);
           echo"</b>";
           ksort($a);
           echo "<br>Ascending order sort by key : ";
           echo"<b>";   
           print_r($a);
           echo"</b>";
           
           arsort($a);
           echo "<br>Decending order sort by value : ";
           echo"<b>";   
           print_r($a);
           echo"</b>";
           krsort($a);
           echo "<br>Decending order sort by key : ";
           echo"<b>";   
           print_r($a);
           echo"</b>"; 
     ?>
</html>
