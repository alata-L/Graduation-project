<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <title>自动灯光管理系统</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script type="text/javascript" src="easyui/jquery.min.js"></script>
	<script type="text/javascript" src="easyui/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="easyui/locale/easyui-lang-zh_CN.js"></script>
	<link rel="stylesheet" type="text/css" href="easyui/themes/icon.css">
	<link id="themeLink" rel="stylesheet" type="text/css" href="easyui/themes/default/easyui.css">

	<style type="text/css">
		ul{
			line-height: 30px;
		}
	</style>
  </head>
  
  <body class="easyui-layout"> 
  	 <!-- 顶部 --> 
    <div data-options="region:'north',split:true" style="height:80px;">
    	
    	<!-- logo -->
    	<div id="logo">
    		<img src="images/logo.jpg"/>
    	</div>
    	
    	<!-- 登录用户信息 -->
    	<div id="loginDiv" style="position: absolute;right: 20px;top: 20px;">
    		 欢迎你，[超级管理员],你使用[192.156.21.22]IP登录!
    	</div>
    	
    	<div id="themesDiv" style="position: absolute;right: 20px;top:40px;">
	    	<a href="javascript:void(0)" id="mb" class="easyui-menubutton"     
			        data-options="menu:'#Themesmeus',iconCls:'icon-edit'">切换风格</a>   
			<div id="Themesmeus" style="width:150px;">   
			    <div>default</div>   
			    <div>gray</div>   
			    <div>black</div>   
			    <div>bootstrap</div>   
			    <div>material</div>   
			    <div>metro</div>   
			</div>  
		</div>		
    </div>   
    
    <!-- 底部 -->
    <div data-options="region:'south',split:true" style="height:30px;">
    	<div id="copyrightDiv" style="text-align: center;">
    		刘阿拉塔&copy;2020版权所有
    	</div>
    </div>   
    
     <!-- 左边系统菜单 -->
    <div data-options="region:'west',title:'系统菜单',split:true" style="width:200px;">
    	<div id="aa" class="easyui-accordion" style="width:193px;" data-options="border:0,multiple:true" >   
		    <div title="系统管理" data-options="iconCls:'icon-save'" style="overflow:auto;padding:10px;">   
		       <ul>
		       	 <li><a href="javascript:void(0)" pageUrl="usermanage.jsp">用户信息管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="RoomManage.jsp">教室灯光管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="LighttypeManage.jsp">灯泡类型管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="ReplyTypeManage.jsp">修复回复类型管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="DianlustatusManage.jsp">电路状态类型管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="OrderofrepairManage.jsp">报修订单管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="ReplyrepairManage.jsp">报修回复管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="AsklightManage.jsp">灯光申请管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="ReplyasklightManage.jsp">灯光申请回复管理</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="categroy.jsp">权限管理</a></li>
		       </ul>
		    </div>   
		    <div title="我的灯光管理" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
		       <ul>
		         <li><a href="javascript:void(0)" pageUrl="Asklight.jsp">申请例外灯光</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="Askrepair.jsp">申请报修</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="Myrepairandrequest.jsp">查看我的</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="xiu'gai'm">修改密码</a></li>
		       </ul>
		    </div>
		    <div title="修护管理" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
		       <ul>
		       	 <li><a href="javascript:void(0)" pageUrl="Replyaskrepair.jsp">报修表单与回复</a></li>
		       	 <li><a href="javascript:void(0)" pageUrl="LightManage.jsp">灯光情况</a></li>
		       </ul>
		    </div>
		    <div title="电路管理" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
		       <ul>
		          <li><a href="javascript:void(0)" pageUrl="Replyasklight.jsp">灯光申请与回复</a></li>
		          <li><a href="javascript:void(0)" pageUrl="DianlustatusManage.jsp">电路连通与切断</a></li>
		       </ul>
		    </div>
		    <div title="数据统计" data-options="iconCls:'icon-reload',selected:true" style="padding:10px;">   
		       <ul>
		       	 <li><a href="javascript:void(0)" pageUrl="customermanage.jsp">电路通电情况</a></li>
		       </ul>
		    </div>        
		</div>  
    </div>   
    
    <!-- 中间编辑区域 -->
    <div data-options="region:'center'" style="padding:5px;background:#eee;">
    	<div id="tt" class="easyui-tabs" style="width:500px;height:250px;" data-options="fit:true">   
		    <div title="起始页" style="padding:20px;display:none;">   
		       欢迎登录自动灯光管理系统    
		    </div>     
		</div>  
    </div> 
    
    
    <script type="text/javascript">
    	$(function(){
    		//给a标签绑定时间
    		$("a[pageUrl]").click(function(){
    			//1.获取pageUrl属性值（需要跳转的页面地址）
    			var pageUrl = $(this).attr("pageUrl");
    			//获取a标签的内容，标题
    			var title = $(this).text();

    			//2.判断是否存在指定标题的选项卡
    			if( $("#tt").tabs("exists",title)  )  {
	    			//3.如果存在，则选项该选项卡
    				$("#tt").tabs("select",title);				
    			}else{
	    			//4.如果不存在，则添加选项卡
    				$("#tt").tabs("add",{
    					title:title,
    					content:"<iframe src='"+pageUrl+"' width='100%' height='100%' frameborder='0'><iframe>",
    					closable:true
    				});				
    			}
    		});
    		
    		//点击切换模块菜单的时候，进行切换模块
    		$("#Themesmeus").menu({
    			onClick:function(item){
    				//1.获取需要改变的模块名称
    				var themeName = item.text;
    				
    				//2.获取link标签的href属性
    				var href= $("#themeLink").attr("href");
    				
    				//3.更改href的属性值
    				// easyui/themes/default/easyui.css
    				href = href.substring(0,href.indexOf("themes"))+"themes/"+themeName+"/easyui.css";
    				
    				//4.更新link的href属性
    				$("#themeLink").attr("href",href);
    			}
    		});
    	});
    
    </script>  
  </body>  
</html>
