<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title>修复申请的回复</title>
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
    <table id="orderofrepairlist"></table>
	<!-- 工具条 -->
	
	<div id="index_listMissionBenchmarking_datagrids_action" style="display: none;">
	<a href="#" class="easyui-linkbutton actions editResources" data-options="iconCls:'icon-search'">维护任务资源库</a>
    </div>

	<!-- 编辑窗口 -->
	<div id="win" class="easyui-window" title="修复申请编辑"
		style="width: 500px; height: 300px"
		data-options="iconCls:'icon-save',modal:true,closed:true">
		<form id="replyForm" method="post">
		           修复回复人ID：<input type="text" id="replyuser_id" name="replyuser_id" class="easyui-validatebox" data-options="required:true" /><br />
		           修复回复人姓名：<input type="text" id="replyuser_name" name="replyuser_name" class="easyui-validatebox" data-options="required:true" /><br />
		           选择回复类型： <select id="replytype_name" name="replytype_name" class="validate-selection" title="选择回复类型">
                    <option>修复中</option>
                    <option>修复成功</option>
                </select><br/>
		    <a id="saveBtn" href="#" class="easyui-linkbutton" data-options="iconCls:'icon-save'">保存</a>
		</form>
	</div>
	

	<script type="text/javascript">
		$(function(){
			$("#orderofrepairlist").datagrid({
				url : "managecontroller/orderofrepairlistbypage.do",
				columns : [ [ 
					{field : "orderofrepair_id",title : "修复申请编号",width : 80}, 
				    {field : "room_name",title : "修复申请教室名称",width : 80}, 
				    {field : "user_id",title : "修复申请人ID",width : 80},
				    {field : "user_name",title : "修复申请人姓名",width : 80},
				    {field : "orderofrepair_text",title : "修复申请备注",width : 200,},
				    {field : "orderofrepair_time",title : "修复申请时间",width : 200,},
				    {
			             field: 'opt', title: '操作', width: 100, align: 'center',
			             formatter: function (val, row, index) {
			             var btn = '<a class="detail" onclick="replyofRepair(\'' + row.orderofrepair_id + '\')"  href="javascript:void(0)">查看详情</a>';
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
			
			
			replyofRepair = function (orderofrepair_id) {
				 $.ajax({
		                type:"POST",
		                url:"managecontroller/findOrderofreply.do",
		                data:{"orderofrepair_id":orderofrepair_id},
		                dataType:"json",
		                success:function(data){
		                    if(data.success){
		                    	$("#replyForm").form("clear");
		        				$("#win").window("open");
		                    }else{//删除失败
		                    	$.messager.alert("提示","回复失败："+data.msg,"error");
		                    };
		                },
		            });
		        }
			$("#saveBtn").click(function(){
				$("#replyForm").form("submit",{
					url:"managecontroller/saveOrderofreply.do",
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
