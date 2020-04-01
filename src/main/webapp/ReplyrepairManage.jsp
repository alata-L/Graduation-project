<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>修复回复管理</title>
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
    <table id="orderofreplylist"></table>
	<!-- 工具条 -->
	<div id="tb">
		<a id="editBtn"href="#" class="easyui-linkbutton"data-options="iconCls:'icon-edit',plain:true">修改</a> 
		<a id="deleteBtn" href="#" class="easyui-linkbutton"data-options="iconCls:'icon-remove',plain:true">删除</a>
	</div>
	
	<div id="index_listMissionBenchmarking_datagrids_action" style="display: none;">
	<a href="#" class="easyui-linkbutton actions editResources" data-options="iconCls:'icon-search'">维护任务资源库</a>
    </div>

	<!-- 编辑窗口 -->
	<div id="win" class="easyui-window" title="修复申请编辑"
		style="width: 500px; height: 300px"
		data-options="iconCls:'icon-save',modal:true,closed:true">
		<form id="replyFrom" method="post">
		         <input type="hidden" id="orderofreply_id" name="orderofreply_id">
		           修复申请单号ID：<input type="text" name="orderofrepair_id" class="easyui-validatebox" data-options="required:true" /><br /> 
			修复申请教室名称：<input type="text" name="room_name" class="easyui-validatebox" data-options="required:true" /><br /> 
		           修复申请人ID：<input type="text" name="user_id"class="easyui-validatebox" data-options="required:true" /><br />
		           修复申请人姓名：<input type="text" name="user_name"class="easyui-validatebox" data-options="required:true" /><br />
		           修复申请备注：<input type="text" name="orderofrepair_text"class="easyui-validatebox" data-options="required:true" /><br />
		           修复申请时间：<input type="text" name="orderofrepair_time"class="easyui-validatebox" data-options="required:true" /><br />
		           回复人ID：<input type="text" name="replyuser_id"class="easyui-validatebox" data-options="required:true" /><br />
		           回复人姓名：<input type="text" name="replyuser_name"class="easyui-validatebox" data-options="required:true" /><br /> 
		           回复类型：<input type="text" name="replytype_name"class="easyui-validatebox" data-options="required:true" /><br /> 
		    <a id="saveBtn" href="#" class="easyui-linkbutton"data-options="iconCls:'icon-save'">保存</a>
		</form>
	</div>
	

	<script type="text/javascript">
		$(function(){
			$("#orderofreplylist").datagrid({
				url : "managecontroller/orderofreplylistByPage.do",
				columns : [ [ 
					{field : "orderofreply_id",title : "回复编号",width : 80,checkbox : true}, 
					{field : "orderofrepair_id",title : "修复申请编号",width : 80}, 
				    {field : "room_name",title : "修复申请教室名称",width : 80}, 
				    {field : "user_id",title : "修复申请人ID",width : 80},
				    {field : "user_name",title : "修复申请人姓名",width : 80},
				    {field : "orderofrepair_text",title : "修复申请备注",width : 200},
				    {field : "orderofrepair_time",title : "修复申请时间",width : 200},
				    {field : "replyuser_id",title : "回复人ID",width : 200},
				    {field : "replyuser_name",title : "回复人姓名",width : 200},
				    {field : "replytype_name",title : "回复类型",width : 200},
				    {field : "orderofreply_time",title : "回复时间",width : 200}
				] ],
				pagination : true,
				toolbar : "#tb"
			});
			$("#saveBtn").click(function(){
				$("#replyFrom").form("submit",{
					url:"managecontroller/saveupdatereply.do",
					onSubmit:function(){
						return $("#replyFrom").form("validate");
					},
					success:function(data){
                        data = eval("("+data+")");
  						if(data.success){
  							$("#win").window("close");
  							$("#orderofreplylist").datagrid("reload");
  							$.messager.alert("提示","保存成功","info");
  						}else{
  							$.messager.alert("提示","保存失败："+data.msg,"error");
  						}
						
					}
				});
			});
			$("#editBtn").click(function(){
  				//判断只能选择一行
  				var rows = $("#orderofreplylist").datagrid("getSelections");
  				if(rows.length!=1){
  					$.messager.alert("提示","修改操作只能选择一行","warning");
  					return;
  				}
  				//表单回显
  				$("#replyFrom").form("load","managecontroller/findOrderofreplyByID.do?orderofreply_id="+rows[0].orderofreply_id);
  				$("#win").window("open");
  			});
			$("#deleteBtn").click(function() {
				var rows = $("#orderofreplylist").datagrid("getSelections");
				if (rows.length == 0) {
					$.messager.alert("提示", "删除操作至少选择一行", "warning");
					return;
				}
				$.messager.confirm("提示", "确认删除数据吗?", function(value) {
					if (value) {
						var idStr = "";
						$(rows).each(function(i) {
							idStr += ("id=" + rows[i].orderofreply_id + "&");
						});
						idStr = idStr.substring(0,idStr.length-1);
						$.post("managecontroller/deleteOrderreply.do",idStr,function(data){
  							if(data.success){
  	  							//刷新datagrid
  	  							$("#orderofreplylist").datagrid("reload");
  	  							
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
