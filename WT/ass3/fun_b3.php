<html>

<?php
$n=$_POST['name'];
$c=$_POST['college'];
$g=$_POST['greet'];
if (!empty($g))
{
   $out.= " ".$g;
}
if (!empty($n))
{
   $out.= " ".$n;
}
if (!empty($c))
{
   $out.= " at ".$c;
}
echo "".$out;
?>
</html>
