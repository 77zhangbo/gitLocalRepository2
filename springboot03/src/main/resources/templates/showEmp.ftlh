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
        <th>上级工号</th>
        <th>入职日期</th>
        <th>入职时间</th>
        <th>入职日期时间</th>
        <th>薪资</th>
        <th>补助</th>
        <th>部门号</th>
    </tr>
    <#-- 遍历数据 👇-->
    <#if empList??>
        <#list empList as emp>
            <tr <#if emp_index%2 == 0>style="background-color: gray" </#if>><#--偶数行背景色设置为灰色gray -->
                <td>${emp_index}</td>
                <td>${emp.empno}</td>
                <td <#if emp.ename == 'KING'>style="color: lawngreen" </#if>>${emp.ename}</td><#-- name属性一栏中名字为KING的标记亮色 -->
                <td>${emp.job}</td>
                <td>${emp.mgr!'无'}</td>
                <td>${emp.hiredate?date}</td>   <#--增加入职日期-->
                <td>${emp.hiredate?time}</td>   <#--增加入职时间，为0是因为数据库中没有设置具体时间-->
                <td>${emp.hiredate?string("yyyy年MM月dd日 HH:mm:ss")}</td> <#-- 自定义入职日期时间格式-->
                <td <#if emp.sal gte 2000>style="color: red" </#if>>${emp.sal}</td><#--sal属性中工资>=2000的数值标红-->
                <td>${emp.comm!'0'}</td>
                <td>${emp.deptno}</td>
            </tr>
        </#list>
    </#if>

</table>
</body>
</html>