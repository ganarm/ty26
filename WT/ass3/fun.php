<html>

<?php
$a=$_POST['no1'];
$b=$_POST['no2'];
$ch=$_POST['op'];
switch ($ch)
{
       case 1 : mod($a,$b);
                break;
       case 2 : power($a,$b);
                break;
       case 3 : sumN($a);
                break;
       case 4 : fact($b);
                break;
}
function mod($a,$b)
{
         $c=$a%$b;
         echo $a." mod ".$b.' = '.$c;
} 
function power($a,$b)
{
         $c=pow($a,$b);
         echo $a."^".$b.' = '.$c;
}
function sumN($a)
{
         $num=$a;
         $sum=0;
         while ($num!=0)
         {
               $sum=$sum+$num;
               $num--;
         }
         echo "sum of first N no. : ".$sum;        
}
function fact($b)
{  
         $num=$b;
         $factorial=1;
         while($num!=0)
         { 
              $factorial=$factorial*$num;
              $num--;
         }
         echo "Factorial : ".$factorial; 
}
?>
</html>
