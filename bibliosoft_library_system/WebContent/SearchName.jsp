<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import ="bean.AddMessageBean" %>  

<%@ page import ="java.util.List" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="https://cdn.staticfile.org/jquery/2.1.1/jquery.min.js"></script>
	<script src="https://cdn.staticfile.org/twitter-bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>Book detials!</title>
<script type="text/javascript">
  function changeB(obj){
       obj.innerHTML="you have ordered.";
obj.class="btn btn-warning";
  }

</script>
<link rel="stylesheet" type="text/css" href="css.css" />
<style>
body{text-align:center}
</style>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="renderer" content="webkit">
<link type="text/css" rel="stylesheet" href="../tpl/css/style.css">
<link type="text/css" rel="stylesheet" href="../tpl/css/mylib.css" />
<link type="text/css" rel="stylesheet" href="../tpl/css/ui-lightness/jquery-ui-1.8.13.custom.css">
<link type="text/css" rel="stylesheet" href="../tpl/css/font-awesome.css">


<script  type="text/javascript" src="../tpl/js/jquery.1.7.1.min.js"></script>
<script  type="text/javascript" src="../tpl/js/jquery-ui-1.8.13.custom.min.js"></script>
<script  type="text/javascript" src="../tpl/js/highlighter.js"></script>


<script type="text/javascript" src="../tpl/js/md5.js"></script>
<script type="text/javascript" src="../tpl/js/base64.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Bibliosoft!</title>
	<style type="text/css">
		.head{  color:#fff;position:absolute;right:0;top:0;margin:19px 0 5px;padding:0 96px 0 0;float:left;}
        .mav{position: fixed;right: 100px;top:10px;color: #00BFFF;font-weight: 700;line-height: 24px;margin-left: 20px;font-size: 13px;text-decoration:underline;}
		.head a:hover{color:#00c}
		.centers{text-align: center;float:left;}
		.gen{position: fixed;right: 10px;width: 60px;top:10px;float: left;color: #fff;background: #00BFFF;line-height: 24px;font-size: 13px;text-align: center;border-bottom: 1px solid #38f;margin-left: 19px;text-decoration: none}
		.imgs{margin-top: 30px}
		.sone{border: 1px solid #b6b6b6;background: #fff;display: inline-block;vertical-align:top;width: 539px;height:34px;border-color: #b8b8b8 #ccc #ccc #b8b8b8;overflow: hidden;}
		span{margin: 0;padding: 0}
		input{border: 0;padding: 0;}
		.sn{height: 16px;width: 18px;}
		.sou{width: 526px;height: 22px;font: 16px/18px arial;line-height: 18px;margin: 6px 0 0 7px;padding: 0;outline: 0;}
		.btn{width: 100px; height: 36px; color: #fff; font-size: 15px; letter-spacing: 1px; background:#00BFFF;} 
		.tail{text-align: center;}
		.one{height: 191.5px;}
                .baidu{background:white}
		p,p>a{color: #999; line-height: 22px; font: 12px arial;}
		#lh a{margin-right:12px;}
		i{width: 14px;height: 17px;display: inline-block;}
                a{display: inline}
	</style>
<link rel="stylesheet" type="text/css" href="css.css" />
</head>
<body>

<div class="baidu" id="fix">
	
<form  action="SearchName" method="post" name="f" onsubmit="return chkForm(this)" id="f">    
      <div class="search_bgimg"><select class="option" name="choice" style="width:80px;height:35.78px;"BACKGROUND-COLOR: #FFFFF0;color: #003366;>
                                <option value="title">Title</option>
                                <option value="author">Author</option>
                                <option value="isbn">ISBN</option>
                              </select>
              <input type="hidden" id="historyCount" name="historyCount" value="1" />
          <span class="sone">
		  <input  type="text" name="strText"class="sou" maxlength="255">
		  </span>
			 <span>
			<input class="btn" type="submit" value="search">
		    </span>
             
              <br>
              <p><span id="msg" style="color:red"></span><br></p>
       
    					
                       
    	</div></form>
</div>

	 <br>
    <div class="ui_content">
				<div class="ui_tb">

		<table class="table" cellspacing="0" cellpadding="0" width="100%" align="center" border="0">
		

			<tr><th>id</th>
							<th>Title</th>
							<th>Author</th>
							<th>ISBN</th>
							<th>Publisher</th>
							<th>Book_info</th>
							<th>China_type</th>
							<th>Science_type</th>
							<th>Publish_date</th>
							<th>Book_price</th>
							<th>Book_state</th>
        
			<%

			//新建一个AddMessageBean类的列表，名字为SearchName

			//getAttribute：将SearchName信息的值给SearchName

				List<AddMessageBean> SearchName=(List<AddMessageBean>)request.getAttribute("SearchName");

				if(SearchName!=null&&!SearchName.isEmpty()){

					for(AddMessageBean times : SearchName){

			%>

			<tr>

			<td><%=times.getBook_ID() %></td>	<!-- 用对应的get方法，将times类的值返回 -->

			<td><%=times.getTitle() %></td>

			<td><%=times.getAuthor() %></td>
			
			<td><%=times.getISBN() %></td>

			<td><%=times.getPublisher() %></td>

			<td><%=times.getBook_ifo() %></td>

			<td><%=times.getChina_type() %></td>

			<td><%=times.getScience_type() %></td>
			
			
			<td><%=times.getPublish_date() %></td>
			
			<td><%=times.getBook_price() %></td>
			
			<td><%=times.getBook_state() %></td>



			<%

					}

				}

			%>

		</table>

	</div>
	</div>

</body>
</body>
</html>
<script type="text/javascript">
<!--
	var bShow = false;
	
	function input_me(str){
		$("#strText").val(str);
		$("#historyCount").val("0"); 
		document.f.submit(); 
	}

	
	


    function chkForm(theForm){
      if (theForm.strText.value=="") {
        alert("Can't be empty ");
        theForm.strText.focus();
        return (false);
      }
    }

    
    
</script> 
