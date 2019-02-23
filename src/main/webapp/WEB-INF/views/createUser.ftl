<!DOCTYPE html>

<html>
    <head>
        <title>Create user page</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form name="user" action="/addUser" method="post">
            <p>Name</p>
            <input title="Name" type="text" name="name">
            <p>Email</p>
            <input title="Email" type="text" name="email">
            <p>Age</p>
            <input title="Age" type="int" name="age">
            <input type="submit" value="OK">
        </form>
    </body>
</html>
