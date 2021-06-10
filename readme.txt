Read me 

1) java -jar employee-service-0.0.1-SNAPSHOT.jar
2) Kafka and Cassandra 


http://localhost:9099/createEmployee
{
    "emp_id": 128,
    "emp_name": "Mac2",
    "emp_city": "NY",
    "emp_phone": "123456",
    "java_exp": 10.0,
    "spring_exp": 0.0
}



{
    "emp_id": 128,
    "emp_name": "Mac2",
    "emp_city": "NY",
    "emp_phone": "123456",
    "java_exp": 10.0,
    "spring_exp": 0.0,
    "status": "Already Exists"
}

http://localhost:9099/findEmpSkillset
{
    "java_exp": 10.0,
    "spring_exp": 1.0
}

[
    {
        "emp_id": 100,
        "emp_name": "Mac",
        "emp_city": "NY",
        "emp_phone": "123456",
        "java_exp": 10.0,
        "spring_exp": 1.2,
		...
    }
]