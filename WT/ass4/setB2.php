<html>
     <?php
         $a=array('G','N','E','S','H');
         echo " Original Array : <br>";
         print_r($a);
         $var='S';
         $p=in_array($var,$a);
         echo "<br>Check element present in given array (G,N,E,S,H) using in_array <br>";
        
         if ($p)
         {
            echo "<b>present.</b>";
         }
         else
            echo "<b>not present.</b>";
         $p=array_search($var,$a);
         echo "<br>Check element present in given array (G,N,E,S,H) using array_search <br>";
        
         if ($p)
         {
            echo "<b>present at $p</b>";
         }
         else
            echo "<b>not present</b>";
     ?>
</html>
