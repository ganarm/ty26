<html>
     <?php
        $a=array(70,72,73,60,65,63,61,75,78,79,80,85,84,81,87,86,75,76,77,78,79,68,67,66,72,75,74,73,64,63);
        $c=count($a);
        $sum=array_sum($a);
        $avg=$sum/$c;
        echo "Average Temperature : $avg &deg;F";
        asort($a);
        $low=array_slice($a,0,5);
        $high=array_slice($a,-5,5);
        echo "<br>5 Coolest Temperatures : <br>";
      //  print_r($low);
        foreach ($low as $value) 
        {
                 echo "$value &deg;F<br>";
        } 
        echo "<br>5 Highest Temperatures : <br>";
      //  print_r($high);
        foreach ($high as $value) 
        {
                 echo "$value &deg;F<br>";
        } 
        
     ?>
</html>
