"use client";

import { useEffect, useState } from "react";

const Employee = () => {
  const [employees, setEmployees] = useState([]);

useEffect(()=>{
    fetchEmployees();
},[])


  const fetchEmployees = async () => {
    const response = await fetch("http://localhost:8094/Employees")
    const json = await response.json()
    // console.log(json)
    // setEmployees(json)
    //   .then((response) => response.json())
    //   .then((data) => console.log(data[0].firstName))
    //   .catch((error) => console.error("error"));
    setEmployees(json)
   
  };
 
console.log(employees)

  return <> {employees.length>0 && employees[0].firstName}</>;
};

export default Employee;
