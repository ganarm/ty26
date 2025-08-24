<html>

<?php
$str=$_POST['str'];
$ch=$_POST['op'];
switch ($ch)
{
       case 1 : length($str);
                break;
       case 2 : vowels($str);
                break;
       case 3 : lower($str);
                break;
       case 4 : pad($str);
                break;
       case 5 : white($str);
                break;
       case 6 : reverse($str);
                break;
}
function length($str)
{
         $ls=strlen($str);
         echo "Length of String ".$str." is : ".$ls;
} 
function vowels($str)
{
        $vowels = array('a','e','i','o','u');
        $len = strlen($str);
        $num = 0;
        for($i=0; $i<$len; $i++)
           if(in_array($str[$i],$vowels))
               $num++;
        echo "Total no of VOWELS $num";    
}
function lower($str)
{
         $l=strtolower($str);
         $t=ucwords($str);
         echo "Lower case : $l"."<br>";  
         echo "Title case : $t";      
}
function pad($str)
{  
         $pad=str_pad($str,10,"*",STR_PAD_BOTH);
         echo $pad;
}
function white($str)
{  
         $w=trim($str);
         echo "after Remove Leading WHITE Spaces : $w";
}
function reverse($str)
{  
         $r=strrev($str);
         echo "reverse of string : $r";
}

?>
</html>
