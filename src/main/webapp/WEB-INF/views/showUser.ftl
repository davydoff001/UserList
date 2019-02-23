<!DOCTYPE html>

<html>
    <head>
        <title>User info</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <h1>User info</h1>
        <table>
            <tr>
                <td>ID</td>
                <td>${user.id}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td>${user.name}</td>
            </tr>
            <tr>
                <td>Email</td>
                <td>${user.email}</td>
            </tr>
            <tr>
                <td>Age</td>
                <td>${user.age}</td>
            </tr>
        </table>
        <br>
        <a href="/users">Back</a>
    </body>
</html>
