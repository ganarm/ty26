<html>
     <?php
           $a=array("Sophia"=>31,"Jacob"=>41,"William"=>39,"Ramesh"=>40);
           echo"<br>Original array : ";
           echo"<b>";
           print_r($a);
           echo"</b>";
           echo"<br>Chunks of array : ";
           echo"<b>";
           print_r(array_chunk($a,2));
           echo"</b>";
           $b=array_values($a);
         
           function is_odd($val)
           {
                     
                     return($val%2);
           }
           $odd=array_filter($b,"is_odd");
           echo"<br>Odd Elements of array : ";
           echo"<b>";
           print_r($odd);
           echo"</b>";
           $b=array("Sophia"=>3,"Jacob"=>41,"Gana"=>20);
           echo"<br>Merge ";
           echo"<b>";
           print_r(array_merge($a,$b));
           echo"</b>";
           echo"<br>Intersect ";
           echo"<b>";
           $a=array("Sophia"=>31,"Jacob"=>41,"Gana"=>20);
           print_r(array_intersect($a,$b));
           echo"</b>";
           echo"<br>Union ";
           echo"</b>";
           print_r(array_unique(array_merge($a,$b)));
           echo"<br>difference ";
           echo"<b>";
           print_r(array_diff($a,$b));
           echo"</b>";
     ?>
</html>
