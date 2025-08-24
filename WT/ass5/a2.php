<?php
      $a=$_POST['te']; 
      $db_handle=pg_connect("dbname=ty26 password=ty26 user=ty26 ");
      var_dump(pg_connection_status($db_handle));
      if($db_handle) 
      { 
         echo 'Connection attempt succeeded. '; 
         $query = "SELECT * FROM Event";
         $rs = pg_query($db_handle, $query);
         echo"<br><br>Data After Updating : <b>";
         echo"<br><br>Data Before Updating : <br>";
         while($row=pg_fetch_row($rs))
         {
               
               echo "<br> eno : $row[0]";
                echo "<br>ename : $row[1]";
                 echo "<br>date : $row[2]";
                 echo "<br>---------------------------------------------<br>";
                 
         }
         
         $q="UPDATE Committee SET status='working' where cno IN (SELECT cno FROM E_C where eno IN (SELECT eno FROM Event where title='$a'))";
         $res=pg_query($db_handle,$q);
         if($res)
            echo "Updated Successfully........";
         else
            echo "Error...!!! Not Updated......";
         $query = "SELECT * FROM Event";
         $rs = pg_query($db_handle, $query);
         echo"<br><br>Data After Updating : <br>";
         while($row=pg_fetch_row($rs))
         {
               
               echo "<br> eno : $row[0]";
                echo "<br>ename : $row[1]";
                 echo "<br>date : $row[2]";
                 echo "<br>---------------------------------------------<br>";
                 
         }
         
      } 
      else 
      { 
      echo 'Connection attempt failed. '; 
      }

?>
