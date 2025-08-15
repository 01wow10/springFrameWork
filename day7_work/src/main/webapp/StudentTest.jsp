<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Student Controller Test</title>
    <script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
    <style>
        .section {
            margin: 20px;
            padding: 15px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .result {
            background-color: #f5f5f5;
            padding: 10px;
            margin-top: 10px;
            border-radius: 3px;
        }
        input {
            margin-bottom: 10px;
        }
    </style>
</head>
<body>
<h1>Student Controller Test</h1>

<!-- 插入学生 -->
<div class="section">
    <h2>1. 添加学生</h2>
    <form id="insertForm">
        姓名: <input type="text" name="name"><br>
        年龄: <input type="number" name="age"><br>
        性别: <input type="text" name="gender"><br>
        <button type="button" onclick="insertStudent()">添加</button>
    </form>
    <div class="result" id="insertResult"></div>
</div>

<!-- 查询学生 -->
<div class="section">
    <h2>2. 查询学生</h2>
    <form id="selectForm">
        学生ID: <input type="number" name="id"><br>
        <button type="button" onclick="selectStudent()">查询</button>
    </form>
    <div class="result" id="selectResult"></div>
</div>

<!-- 查询所有学生 -->
<div class="section">
    <h2>3. 查询所有学生</h2>
    <button type="button" onclick="selectAllStudents()">查询所有</button>
    <div class="result" id="selectAllResult"></div>
</div>

<!-- 更新学生 -->
<div class="section">
    <h2>4. 更新学生</h2>
    <form id="updateForm">
        ID: <input type="number" name="id"><br>
        姓名: <input type="text" name="name"><br>
        年龄: <input type="number" name="age"><br>
        性别: <input type="text" name="gender"><br>
        <button type="button" onclick="updateStudent()">更新</button>
    </form>
    <div class="result" id="updateResult"></div>
</div>

<!-- 删除学生 -->
<div class="section">
    <h2>5. 删除学生</h2>
    <form id="deleteForm">
        学生ID: <input type="number" name="id"><br>
        <button type="button" onclick="deleteStudent()">删除</button>
    </form>
    <div class="result" id="deleteResult"></div>
</div>

<script>
    // 基础URL
    const baseUrl = "${pageContext.request.contextPath}/StudentOperation";

    // 添加学生
    function insertStudent() {
        const formData = $("#insertForm").serialize();
        $.post(baseUrl + "/insert", formData, function(data) {
            $("#insertResult").html("添加成功: " + data);
            // 清空表单
            $("#insertForm")[0].reset();
        }).fail(function() {
            $("#insertResult").html("添加失败");
        });
    }

    // 查询学生
    function selectStudent() {
        const id = $("#selectForm input[name='id']").val();
        $.post(baseUrl + "/select", {id: id}, function(data) {
            if (data) {
                $("#selectResult").html(
                    "ID: " + data.id + "<br>" +
                    "姓名: " + data.name + "<br>" +
                    "年龄: " + data.age + "<br>" +
                    "性别: " + data.gender
                );
            } else {
                $("#selectResult").html("未找到该学生");
            }
        }, "json").fail(function() {
            $("#selectResult").html("查询失败");
        });
    }

    // 查询所有学生
    function selectAllStudents() {
        $.post(baseUrl + "/selectList", function(data) {
            $("#selectAllResult").html("所有学生: " + data);
        }).fail(function() {
            $("#selectAllResult").html("查询失败");
        });
    }

    // 更新学生
    function updateStudent() {
        const formData = $("#updateForm").serialize();
        $.post(baseUrl + "/update", formData, function(data) {
            $("#updateResult").html("更新成功: " + data);
            // 清空表单
            $("#updateForm")[0].reset();
        }).fail(function() {
            $("#updateResult").html("更新失败");
        });
    }

    // 删除学生
    function deleteStudent() {
        const id = $("#deleteForm input[name='id']").val();
        $.post(baseUrl + "/delete", {id: id}, function(data) {
            $("#deleteResult").html("删除成功: " + data);
            // 清空表单
            $("#deleteForm")[0].reset();
        }).fail(function() {
            $("#deleteResult").html("删除失败");
        });
    }
</script>
</body>
</html>