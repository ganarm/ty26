<html>
<?php
$filename=$_POST['fn'];
$op=$_POST['op'];
    if(!$file=fopen($filename,'r'))
      die("Error...!!!File may be not Exists");
  //  echo $content=fread($file,filesize($filename));
    echo"<br>";
    switch($op)
    {
          case "1":$ft=filetype($filename);
                   echo "type of file : $ft";
                   break;
          case "2":$ft=fileatime($filename);
                   echo "last access time of file : $ft";
                   break; 
          case "3":$ft=filesize($filename);
                   echo "size of file : $ft";
                   break; 
          case "4":unlink($filename);
                   echo "File Deleted!!!!";
                   break; 
    }
    
?>
</html>
