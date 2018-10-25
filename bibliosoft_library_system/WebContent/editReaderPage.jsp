<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" import="java.util.*"%>
<!DOCTYPE html>
<html lang="zh-cn">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />
<meta name="renderer" content="webkit">
<title></title>
<link rel="stylesheet" href="css/pintuer.css">
<link rel="stylesheet" href="css/admin.css">
<script src="js/jquery.js"></script>
<script src="js/pintuer.js"></script>
</head>
<body>
	<div class="panel admin-panel">
		<div class="panel-head" id="add">
			<strong><span class="icon-pencil-square-o"></span>Edit Reader</strong>
		</div>
		<div class="body-content">
			<form method="get" class="form-x" action="editReaderPageWeb">
				<div class="form-group">
					<div class="label">
						<label>Reader ID:</label>
					</div>
					<div class="field">
				        <%
				        String id=request.getAttribute("reader_id").toString();
				        %>
				        <div class="input w50" style="background-color:grey;"><%out.println(id);%></div>		
					</div>
				</div>


				<div class="form-group">
					<div class="label">
						<label>Name:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="reader_name"
							data-validate="required:Please input reader Name" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Password:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="password"
							data-validate="required:Please input password" />
						<div class="tips"></div>
					</div>
				</div>
				
				
				<div class="form-group">
					<div class="label">
						<label>Phone:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="phone"
							data-validate="required:Please input reader phone" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Email:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="email"
							data-validate="required:Please input email" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Shengxiao date:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="shengxiao_date"
							data-validate="required:Please input shengxiao_date" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Banzheng date:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="banzheng_date"
							data-validate="required:Please input banzheng_date" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Daoqi date:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="daoqi_date"
							data-validate="required:Please input daoqi_date" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Yj:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="yj"
							data-validate="required:Please input yj" />
						<div class="tips"></div>
					</div>
				</div>
				
				<div class="form-group">
					<div class="label">
						<label>Ljjs:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="ljjs"
							data-validate="required:Please input ljjs" />
						<div class="tips"></div>
					</div>
				</div>
				<div class="form-group">
					<div class="label">
						<label>Rule id:</label>
					</div>
					<div class="field">
						<input type="text" class="input w50" value="" name="rule_id"
							data-validate="required:Please input rule_id" />
						<div class="tips"></div>
					</div>
				</div>
				
				
				
				<div class="form-group">
					<div class="label">
						<label></label>
					</div>
					<div class="field">
						<button class="button bg-main icon-check-square-o" type="submit">
							submit</button>
					</div>
				</div>
			</form>
		</div>
	</div>

</body>
</html>