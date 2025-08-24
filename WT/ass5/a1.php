<html>
<?php
    if(!$file=fopen("gana.txt",'r'))
      die("Error...!!!File may be not Exists");
    echo $content=fread($file,filesize("gana.txt"));
    echo"<br>";
    echo "File Size :  ".filesize("gana.txt");
?>
</html>
