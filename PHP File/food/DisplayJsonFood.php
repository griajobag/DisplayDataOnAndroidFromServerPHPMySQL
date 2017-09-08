<?php

/**
 * Created by PhpStorm.
 * User: putuguna
 * Date: 1/25/2017
 * Time: 10:33 AM
 */
require_once("../db/Connection.php");
class DisplayJsonFood{
    function getAllJsonFood(){
        $connection = new Connection();
        $conn = $connection->getConnection();

        $jsonFood = array();
        $status="status";
        $message = "message";

        try{
            $sqlQuery = "SELECT * FROM food";
            $getJson = $conn->prepare($sqlQuery);
            $getJson->execute();

            $result = $getJson->fetchAll(PDO::FETCH_ASSOC);

            foreach($result as $data){
                array_push($jsonFood,
                    array('idfood'=>$data['idfood'],
                        'foodname'=>$data['foodname'],
                        'foodqty'=>$data['foodqty']));
            }
        }catch (PDOException $e){
            echo "Error while displaying json : " . $e->getMessage();
        }

        if($sqlQuery){
            echo json_encode(array("food"=>$jsonFood,$status=>1,$message=>"Success"));
        }else{
            echo json_encode(array("food"=>null,$status=>0, $message=>"Failed while displaying data food"));
        }
    }
}

$json = new DisplayJsonFood();
$json->getAllJsonFood();