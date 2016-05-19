<%--
  Created by IntelliJ IDEA.
  User: mgustran
  Date: 03/05/2016
  Time: 12:15
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Conversor Rulando con JBoss</title>
  </head>
  <body>
  <form target="_top" action='http://www.webservicex.net/ConvertSpeed.asmx/ConvertSpeed' method="POST">

    <table cellspacing="0" cellpadding="4" frame="box"  rules="none" style="border-collapse: collapse;">
      <tr>
        <td class="frmHeader" style="border-right: 2px solid white;">Parameter</td>
        <td class="frmHeader" >Value</td>
      </tr>


      <tr>
        <td class="frmText" style="color: #000000; font-weight: normal;">speed:</td>
        <td><input class="frmInput" type="text" size="50" name="speed"/></td>
      </tr>

      <tr>
        <td class="frmText" style="color: #000000; font-weight: normal;">FromUnit:</td>
        <td><select name="FromUnit" class="frmInput" >
          <option value="centimetersPersecond">centimetersPersecond</option>
          <option value="metersPersecond">metersPersecond</option>
          <option value="feetPersecond">feetPersecond</option>
          <option value="feetPerminute">feetPerminute</option>
          <option value="milesPerhour">milesPerhour</option>
          <option value="kilometersPerhour">kilometersPerhour</option>
          <option value="furlongsPermin">furlongsPermin</option>
          <option value="knots">knots</option>
          <option value="leaguesPerday">leaguesPerday</option>
          <option value="Mach">Mach</option>

        </select></td>
      </tr>

      <tr>
        <td class="frmText" style="color: #000000; font-weight: normal;">ToUnit:</td>
        <td><select name="ToUnit" class="frmInput" >
          <option value="centimetersPersecond">centimetersPersecond</option>
          <option value="metersPersecond">metersPersecond</option>
          <option value="feetPersecond">feetPersecond</option>
          <option value="feetPerminute">feetPerminute</option>
          <option value="milesPerhour">milesPerhour</option>
          <option value="kilometersPerhour">kilometersPerhour</option>
          <option value="furlongsPermin">furlongsPermin</option>
          <option value="knots">knots</option>
          <option value="leaguesPerday">leaguesPerday</option>
          <option value="Mach">Mach</option>

        </select></td>
      </tr>

      <tr>
        <td></td>
        <td align="right"> <input type="submit" value="Invoke" class="button"/></td>
      </tr>
    </table>


  </form>

  </body>
</html>
