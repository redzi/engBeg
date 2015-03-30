<html>
    <title>play on ftl</title>
    <link type="text/css" href="/resources/main.css" rel="stylesheet" />
    <#import "/spring.ftl" as spring />
<head>

    <div class="everything">
        <form class="userform" name="newuser" action="list" method="post">
            <div class="textHolder">
                Firstname: <input type="text" name="firstname"> <br>
                Lastname: <input type="text" name="lastname"> <br>
            </div>
            <div class="buttonHolder">
                <input value="Save" type="submit">
            </div>
        </form>


        <table class="datatable">
            <tr>
                <th>Firstname</th>  <th>Lastname</th>
            </tr>
        <#list users as user>
            <tr>
                <td>${user.firstname}</td><td>${user.lastname}</td>
            </tr>
        </#list>
        </table>
    </div>

</head>
</html>