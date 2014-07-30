
    <html>
       <head>
         <title>Employee Details</title>
         <script type="text/javascript">
            function validate()
            {
                var username = document.getElementById("empId");
                var password = document.getElementById("empName");
                var email = document.getElementById("salary");
                var email = document.getElementById("email");
                var mobile = document.getElementById("mobile");
                var birthdy = document.getElementById("address");
                var valid = true;
                if(empId.value.length<=0||empName.value.length<=0 || salary.value.length<=0 || email.value.length<=0 || mobile.value.length<=0 || address.value.length<=0)
                    {
                        alert("Don't leave the field empty!");
                        valid = false;
                    }
                return valid;
            };

        </script>
       </head>
       
       <body>
       <div align="center">
       <form action="employee" method="post" onsubmit="return validate();">
         <table border="0">
            <tr>
               <td colspan="2" align="center"> <h3>Enter Employee Details</h3></td>
            </tr>
            <tr>
                <td>Employee Id :</td>
                <td><input type="text" id="empId" name="empId"/></td>
            </tr>
            <tr>
                <td>Employee Name :</td>
                <td><input type="text" id="empName" name="empName"/></td>
            </tr>
            <tr>
                <td>Basic Salary :</td>
                <td><input type="text" id="salary" name="salary"/></td>
            </tr>
            <tr>
                <td>E-Mail :</td>
                <td><input type="text" id="email" name="email"/></td>
            </tr>
            <tr>
                <td>Mobile :</td>
                <td><input type="text" id="mobile" name="mobile"/></td>
            </tr>
            <tr>
            <td>Address :</td>
                <td><input type="text" id="address" name="address"/></td>
             </tr>
            <tr>
                    <td colspan="2" align="center"><input type="submit" value="SaveEmployeeDetails" /></td>
                </tr>
         </table>
       </form>
       </div>
       </body>
    </html>