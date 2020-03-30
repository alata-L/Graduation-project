<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<script src="scriptaculous/lib/prototype.js" type="text/javascript"></script>
<script src="scriptaculous/src/effects.js" type="text/javascript"></script>
<script type="text/javascript" src="js/validation.js"></script>
<script type="text/javascript">
//<![CDATA[
<!--
// Alternative Style: Working With Alternate Style Sheets
// http://www.alistapart.com/articles/alternate/
function setActiveStyleSheet(title) {
var i, a, main;
for(i=0; (a = document.getElementsByTagName("link")[i]); i++) {
if(a.getAttribute("rel").indexOf("style") != -1 && a.getAttribute("title")) {
a.disabled = true;
if(a.getAttribute("title") == title) a.disabled = false;
}
}
}
//-->
//]]>
</script>
<link title="style1" rel="stylesheet" href="css/style.css" type="text/css" />
</head>
<body>

	<div class="form_content">
    <form id="asklightform" action="${pageContext.request.contextPath }/managecontroller/saveasklight.do" method="post">
    <fieldset>
        <legend>例外灯光申请表</legend>
        <div class="form-row">
            <div class="field-label"><label for="field1">教室名称：</label>:</div>
            <div class="field-widget"><input name="room_name" id="room_name" class="required" title="教室名称" /></div>
        </div>
        
        <div class="form-row">
            <div class="field-label"><label for="field2">用户ID：</label>:</div>
            <div class="field-widget"><input name="user_id" id="user_id" class="required" title="用户ID" /></div>
        </div>
        <div class="form-row">
            <div class="field-label"><label for="field2">用户姓名：</label>:</div>
            <div class="field-widget"><input name="user_name" id="user_name" class="required" title="用户姓名" /></div>
        </div>
        <div class="form-row">
            <div class="field-label"><label for="field3">申请备注：</label>:</div>
            <div class="field-widget"><textarea id="asklight_text" name="asklight_text" class="required"></textarea></div>
        </div>
        
        
    </fieldset>
    
    <input type="submit" class="submit" value="Submit" /> <input class="reset" type="button" value="Reset" onclick="valid.reset(); return false" />
    </form>
    </div>
    <script type="text/javascript">
        function formCallback(result, form) {
            window.status = "valiation callback for form '" + form.id + "': result = " + result;
        }
        
        var valid = new Validation('test', {immediate : true, onFormValidate : formCallback});
        Validation.addAllThese([
            ['validate-password', '> 6 characters', {
                minLength : 7,
                notOneOf : ['password','PASSWORD','1234567','0123456'],
                notEqualToField : 'field1'
            }],
            ['validate-password-confirm', 'please try again.', {
                equalToField : 'field8'
            }]
        ]);
    </script>

</body>
</html>