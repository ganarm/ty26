<html>
     <?php
         $a=array('G','N','E','S','H');
         echo " Original Array : <br>";
         $b=array('A');
         print_r($a);
         echo "<br>after adding 'A' in given string (G,N,E,S,H) : <br>";
         array_splice($a,1,0,$b);
         print_r($a);
     ?>
</html>
