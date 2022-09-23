<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Product Discount Calculator</title>
</head>
<body>
<h2>Product Discount Calculator</h2>
<form action="/discount" method="post">
    <label>List Price: </label><br/>
    <input type="text" name="Price" placeholder="Price" value="1550"/><br/>
    <label>Discount Percent: </label><br/>
    <input type="text" name="Percent" placeholder="Percent" value="0"/><br/>
    <input type="submit" id="submit" value="Calculate Discount"/>
</form>

</body>
</html>