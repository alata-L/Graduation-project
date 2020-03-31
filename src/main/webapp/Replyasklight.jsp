<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>例外灯光申请的回复</title>
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
    <table id="asklightlist"></table>
	<!-- 工具条 -->
	
	<div id="index_listMissionBenchmarking_datagrids_action" style="display: none;">
	<a href="#" class="easyui-linkbutton actions editResources" data-options="iconCls:'icon-search'">维护任务资源库</a>
    </div>

	<!-- 编辑窗口 -->
	<div id="win" class="easyui-window" title="灯光申请回复"
		style="width: 500px; height: 300px"
		data-options="iconCls:'icon-save',modal:true,closed:true">
		<form id="replyForm" method="post">
		           回复人ID：<input type="text" id="replyuser_id" name="replyuser_id" class="easyui-validatebox" data-options="required:true" /><br />
		           回复人姓名：<input type="text" id="replyuser_name" name="replyuser_name" class="easyui-validatebox" data-options="required:true" /><br />
		           回复类型： <select id="replytype_name" name="replytype_name" class="validate-selection" title="选择回复类型">
                    <option>同意</option>
                    <option>拒绝</option>
                </select><br/>
		    <a id="saveBtn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a>
		</form>
	</div>
	

	<script type="text/javascript">
		$(function(){
			$("#asklightlist").datagrid({
				url : "managecontroller/asklightlistByPage.do",
				columns : [ [ 
					{field : "asklight_id",title : "灯光申请单编号",width : 80}, 
				    {field : "room_name",title : "申请教室名称",width : 80}, 
				    {field : "user_id",title : "申请人ID",width : 80},
				    {field : "user_name",title : "申请人姓名",width : 80},
				    {field : "asklight_text",title : "申请备注",width : 200,},
				    {field : "asklight_time",title : "申请时间",width : 200,},
				    {
			             field: 'opt', title: '操作', width: 100, align: 'center',
			             formatter: function (val, row, index) {
			             var btn = '<a class="detail" onclick="replyofLight(\'' + row.asklight_id + '\')"  href="javascript:void(0)">查看详情</a>';
			             return btn;
			            }
			        }
				] ],
				 onLoadSuccess: function (data) {
			          $('.detail').linkbutton({ text: '回复', plain: true, iconCls: 'icon-add' });
			       },
				pagination : true,
				toolbar : "#tb"

			});
			
			
			replyofLight = function (asklight_id) {
				 alert(asklight_id);
				 $.ajax({
		                type:"POST",
		                url:"managecontroller/findreplylight.do",
		                data:{"asklight_id":asklight_id},
		                dataType:"json",
		                success:function(data){
		                    if(data.success){
		                    	$("#replyForm").form("clear");
		        				$("#win").window("open");
		                    }else{
		                    	$.messager.alert("提示","回复失败："+data.msg,"error");
		                    };
		                },
		            });
		        }
			$("#saveBtn").click(function(){
				$("#replyForm").form("submit",{
					url:"managecontroller/savereplylight.do",
					onSubmit:function(){
						return $("#replyForm").form("validate");
					},
					success:function(data){
                        data = eval("("+data+")");
  						if(data.success){
  							$("#win").window("close");
  							$.messager.alert("提示","回复成功","info");
  						}else{
  							$.messager.alert("提示","回复失败："+data.msg,"error");
  						}
						
					}
				});
			});
		});
	</script>



</body>
</html>
