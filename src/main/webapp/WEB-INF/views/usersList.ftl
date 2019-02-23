<!DOCTYPE html>

<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>Users list</h1>
        <table>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Email</th>
                <th>Age</th>
            </tr>
        <#list users as user>
            <tr>
                <td><a href="/user/${user.id}">${user.id}</a></td>
                <td>${user.name}</td>
                <td>${user.email}</td>
                <td>${user.age}</td>
                <td><a href="/delete/${user.id}">Delete</a></td>
                <td><a href="/update/${user.id}">Update</a></td>
            </tr>
        </#list>
        </table>
        <a href="/addUser">Create user</a>  
    </body>
</html>
