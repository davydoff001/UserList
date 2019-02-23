<!DOCTYPE html>

<html>
    <head>
        <title>Create user page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form name="user" action="/updateUser" method="post">
            <p>ID</p>
            <input title="ID" type="text" name="id" value="${user.id}">
            <p>Name</p>
            <input title="Name" type="text" name="name" value="${user.name}">
            <p>Email</p>
            <input title="Email" type="text" name="email" value="${user.email}">
            <p>Age</p>
            <input title="Age" type="int" name="age" value="${user.age}">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
