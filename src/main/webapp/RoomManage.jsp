<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>教室管理</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!-- 导入easyui的资源文件 -->
<script type="text/javascript" src="easyui/jquery.min.js"></script>
<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
<link id="themeLink" rel="stylesheet" type="text/css"
	href="easyui/themes/default/easyui.css">
</head>

<body>
    <table id="roomlist"></table>
	<!-- 工具条 -->
	<div id="tb">
		<a id="addBtn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-add',plain:true">添加</a> 
		<a id="editBtn"href="#" class="easyui-linkbutton"data-options="iconCls:'icon-edit',plain:true">修改</a> 
		<a id="deleteBtn" href="#" class="easyui-linkbutton"data-options="iconCls:'icon-remove',plain:true">删除</a>
	</div>

	<!-- 编辑窗口 -->
	<div id="win" class="easyui-window" title="教室数据编辑"
		style="width: 500px; height: 300px"
		data-options="iconCls:'icon-save',modal:true,closed:true">
		<form id="editForm" method="post">
		           <input type="hidden" name="room_id">
			教室名称：<input type="text" name="room_name" class="easyui-validatebox" data-options="required:true" /><br /> 
		           教室所拥有灯数量：<input type="text" name="room_lightquantity"class="easyui-validatebox" data-options="required:true" /><br />
		            电路状态：<input type="text" name="dianlustatus_name"class="easyui-validatebox" data-options="required:true" /><br />
		    <a id="saveBtn" href="#" class="easyui-linkbutton"data-options="iconCls:'icon-save'">保存</a>
		</form>
	</div>

	<script type="text/javascript">
		$(function(){
			$("#roomlist").datagrid({
				url : "managecontroller/roomlistbypage.do",

				columns : [ [ {
					field : "room_id",
					title : "教室编号",
					width : 100,
					checkbox : true
				}, {
					field : "room_name",
					title : "教室名称",
					width : 200,
				}, {
					field : "room_lightquantity",
					title : "教室所拥有灯数量",
					width : 200,
				}, {
					field : "dianlustatus_name",
					title : "电路状态",
					width : 200,
				}
				] ],
				pagination : true,
				toolbar : "#tb"

			});
			
			$("#addBtn").click(function(){
				$("#editForm").form("clear");
				$("#win").window("open");
				
			});
			
			$("#saveBtn").click(function(){
				$("#editForm").form("submit",{
					url:"managecontroller/saveroom.do",
					onSubmit:function(){
						return $("#editForm").form("validate");
					},
					success:function(data){
                        data = eval("("+data+")");
  						if(data.success){
  							$("#win").window("close");
  							$("#roomlist").datagrid("reload");
  							$.messager.alert("提示","保存成功","info");
  						}else{
  							$.messager.alert("提示","保存失败："+data.msg,"error");
  						}
						
					}
				});
			});
			$("#editBtn").click(function(){
  				//判断只能选择一行
  				var rows = $("#roomlist").datagrid("getSelections");
  				if(rows.length!=1){
  					$.messager.alert("提示","修改操作只能选择一行","warning");
  					return;
  				}
  				
  				//表单回显
  				$("#editForm").form("load","managecontroller/findRoomByID.do?room_id="+rows[0].room_id);
  				$("#win").window("open");
  			});
			$("#deleteBtn").click(function() {
				var rows = $("#roomlist").datagrid("getSelections");
				if (rows.length == 0) {
					$.messager.alert("提示", "删除操作至少选择一行", "warning");
					return;
				}
				$.messager.confirm("提示", "确认删除数据吗?", function(value) {
					if (value) {
						var idStr = "";
						$(rows).each(function(i) {
							idStr += ("id=" + rows[i].room_id + "&");
						});
						idStr = idStr.substring(0,idStr.length-1);
						$.post("managecontroller/deleteroom.do",idStr,function(data){
  							if(data.success){
  	  							//刷新datagrid
  	  							$("#roomlist").datagrid("reload");
  	  							
  	  							$.messager.alert("提示","删除成功","info");
  	  						}else{
  	  							$.messager.alert("提示","删除失败："+data.msg,"error");
  	  						}
  						},"json");
					}

				});
			 });
		});
	</script>



</body>
</html>
