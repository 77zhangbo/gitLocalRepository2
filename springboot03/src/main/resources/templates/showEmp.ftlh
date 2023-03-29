<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <style type="text/css">
        #empTable{
            width: 80%;
            border: 1px solid blue;
            margin: 0px auto;
        }
        #empTable th,td{
            border: 1px solid green;
            text-align: center;
        }
    </style>
</head>
<body>
<table id="empTable" cellpadding="0px" cellspacing="0px">
    <tr>
        <th>索引</th>
        <th>工号</th>
        <th>姓名</th>
        <th>岗位</th>
        <th>薪资</th>
        <th>部门号</th>
    </tr>
    <#-- 遍历数据 👇-->
    <#list empList as emp>
        <tr>
            <td>${emp_index}</td>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.sal}</td>
            <td>${emp.deptno}</td>
        </tr>
    </#list>
</table>
</body>
</html>