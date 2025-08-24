<html>

<?php
$str1=$_POST['str1'];
$str2=$_POST['str2'];
$ch=$_POST['op'];
switch ($ch)
{
       case 1 : appear($str1,$str2);
                break;
       case 2 : pos($str1,$str2);
                break;
       case 3 : comparision($str1,$str2);
                break;
       case 4 : casesenc($str1,$str2);
                break;
}
function appear($str1,$str2)
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
