<html>
     <?php
        $op=$_POST['op'];
        $se=$_POST['se'];
        $qe=$_POST['qe'];
        $oa=array('G','A','N','A');
        switch($op)
        {
             case "ins": array_push($oa,$se);
                         print_r($oa);
                         break;
             case "del": array_pop($oa);
                         print_r($oa);
                         break;
             case "sdis":print_r($oa);
                         break;
             case "deq": array_shift($oa);
                         print_r($oa);
                         break;
             case "enq": array_unshift($oa,$qe);
                         print_r($oa);
                         break;
             case "qdis":
                         print_r($oa);
                         break;
        }
     ?>
</html>
