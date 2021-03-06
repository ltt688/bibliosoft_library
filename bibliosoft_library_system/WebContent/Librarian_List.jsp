<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page import ="entity.Librarian" %>
<%@taglib uri="http://jsptags.com/tags/navigation/pager" prefix="pg" %>
<!DOCTYPE html>
<html>
<head>
<title>Librarian List</title>
<meta
	content='width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no'
	name='viewport' />

<!--[if lt IE 9]>
    <script src='assets/javascripts/html5shiv.js' type='text/javascript'></script>
    <![endif]-->
    
<link href='assets/stylesheets/bootstrap/bootstrap.css' media='all'
	rel='stylesheet' type='text/css' />
<link href='assets/stylesheets/bootstrap/bootstrap-responsive.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / jquery ui -->
<link href='assets/stylesheets/jquery_ui/jquery-ui-1.10.0.custom.css'
	media='all' rel='stylesheet' type='text/css' />
<link href='assets/stylesheets/jquery_ui/jquery.ui.1.10.0.ie.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / switch buttons -->
<link
	href='assets/stylesheets/plugins/bootstrap_switch/bootstrap-switch.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / xeditable -->
<link href='assets/stylesheets/plugins/xeditable/bootstrap-editable.css'
	media='all' rel='stylesheet' type='text/css' />
<link href='assets/stylesheets/plugins/common/bootstrap-wysihtml5.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / wysihtml5 (wysywig) -->
<link href='assets/stylesheets/plugins/common/bootstrap-wysihtml5.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / jquery file upload -->
<link
	href='assets/stylesheets/plugins/jquery_fileupload/jquery.fileupload-ui.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / full calendar -->
<link href='assets/stylesheets/plugins/fullcalendar/fullcalendar.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / select2 -->
<link href='assets/stylesheets/plugins/select2/select2.css' media='all'
	rel='stylesheet' type='text/css' />
<!-- / mention -->
<link href='assets/stylesheets/plugins/mention/mention.css' media='all'
	rel='stylesheet' type='text/css' />
<!-- / tabdrop (responsive tabs) -->
<link href='assets/stylesheets/plugins/tabdrop/tabdrop.css' media='all'
	rel='stylesheet' type='text/css' />
<!-- / jgrowl notifications -->
<link href='assets/stylesheets/plugins/jgrowl/jquery.jgrowl.min.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / datatables -->
<link
	href='assets/stylesheets/plugins/datatables/bootstrap-datatable.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / dynatrees (file trees) -->
<link href='assets/stylesheets/plugins/dynatree/ui.dynatree.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / color picker -->
<link
	href='assets/stylesheets/plugins/bootstrap_colorpicker/bootstrap-colorpicker.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / datetime picker -->
<link
	href='assets/stylesheets/plugins/bootstrap_datetimepicker/bootstrap-datetimepicker.min.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / daterange picker) -->
<link
	href='assets/stylesheets/plugins/bootstrap_daterangepicker/bootstrap-daterangepicker.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / flags (country flags) -->
<link href='assets/stylesheets/plugins/flags/flags.css' media='all'
	rel='stylesheet' type='text/css' />
<!-- / slider nav (address book) -->
<link href='assets/stylesheets/plugins/slider_nav/slidernav.css'
	media='all' rel='stylesheet' type='text/css' />
<!-- / fuelux (wizard) -->
<link href='assets/stylesheets/plugins/fuelux/wizard.css' media='all'
	rel='stylesheet' type='text/css' />
<!-- / flatty theme -->
<link href='assets/stylesheets/light-theme.css'
	id='color-settings-body-color' media='all' rel='stylesheet'
	type='text/css' />
<!-- / demo -->
<link href='assets/stylesheets/demo.css' media='all' rel='stylesheet'
	type='text/css' />

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body class='contrast-blue '>
	<pg:pager url="LibrarianList" maxPageItems = "5" maxIndexPages="10" export="offset,currentPageNumber=pageNumber" isOffset="false"  index="half-full"  > 
	
	<div id='wrapper'>
		
		
			<div class='container-fluid'>
				<div class='row-fluid' id='content-wrapper'>
					<div class='span12'>
						<div class='row-fluid'>
							<div class='span12'>
								<div class='page-header'>
									<h1 class='pull-left'>
										<i class='icon-ok'></i> <span>Librarian List</span>
									</h1>
									<div class='pull-right'>
										<ul class='breadcrumb'>
											<li><a href="index.html"><i class='icon-bar-chart'></i>
											</a></li>
											<li class='separator'><i class='icon-angle-right'></i></li>
											<li>Librarian Manager</li>
											<li class='separator'><i class='icon-angle-right'></i></li>
											<li class='active'>Librarian List</li>
										</ul>
									</div>
								</div>
							</div>
						</div>
						<div class='row-fluid'>
							<div class='span12 box'>
								<div class='box-header blue-background'>
									<div class='title'>Librarian Information</div>
									<div class='actions'>
										<a href="#" class="btn box-remove btn-mini btn-link"><i
											class='icon-remove'></i> </a> <a href="#"
											class="btn box-collapse btn-mini btn-link"><i></i> </a>
									</div>
								</div>
								
								<div class='box-content box-no-padding'>
									<div class='responsive-table'>
										<div class='scrollable-area'>
					<div>
					<form  action="LibrarianList" method="get" />

					<div class='control-group'>
										<label class='control-label' for='validation_name'></label>
										<div class='controls'>
											<input data-rule-minlength='2' data-rule-required='true'
												id='=key' name='key' placeholder='Search by id'
												type='text' />
													<button class="btn btn-link icon-search" name="button"
						type="submit"></button>
										</div>
									
						
				
						</div>
					</form>
					</div>
											<table class='table' style='margin-bottom: 0;'>
												<thead>
													<tr>
														<th>Account</th>
														<th>Name</th>
														<th>phone</th>
														<th>type</th>

														<th></th>
													</tr>
												</thead>
												<tbody>
												<%List<Librarian> librarians=(List<Librarian>)request.getAttribute("librarians") ;%>
													<c:forEach items="${librarians}" var="librarian" varStatus="li">
													 <pg:item>
														<tr>
															<td>${librarian.getManager_ID()}</td>
															<td>${librarian.getManager_name()}</td>
															<td>${librarian.getManager_phone()}</td>
															<td>${librarian.getManager_type()}</td>
															<td>

																<form action="editLibrarian" method="post">
																	<a href="#"><button class="btn btn-default" name="edit_id"
																			value="${librarian.getManager_ID()}">Edit</button></a>
																</form>
																<form action="LibrarianList" method="post">
																	<a href="#"><button class="btn btn-default" name="delete_id"
																			value="${librarian.getManager_ID()}">Delete</button></a>
																</form>
															</td>
														</tr>
														 </pg:item>  
													</c:forEach>
												</tbody>
											</table>
											  <pg:index>
  <pg:first>  
    <a href="${pageUrl}">Home</a>  
  </pg:first>  
  <pg:prev>  
    <a href="${pageUrl }">Pre</a>  
  </pg:prev>  
  <pg:pages>  
    <c:choose>
         <%--当循环页码是当前页码，则该页码不可以导航，并显示为红色--%>
      <c:when test="${currentPageNumber eq pageNumber}">  
        <font color="red">[${pageNumber }]</font>  
      </c:when>
     
      <%-- 当循环页码不是当前页码，则该页码可以导航 --%>
      <c:otherwise>  
        <a href="${pageUrl }">[${pageNumber }]</a>  
      </c:otherwise>  
    </c:choose>  
  </pg:pages>  
  <pg:next>  
    <a href="${pageUrl }">Next</a>  
  </pg:next>  
  <pg:last>  
    <a href="${pageUrl }">Last</a>  
  </pg:last>
  </pg:index>
											<div>
</div>
										</div>
									</div>
								</div>







							</div>
						</div>


					</div>
				</div>
			</div>
	</div>
	<!-- / jquery -->
	<script src='assets/javascripts/jquery/jquery.min.js'
		type='text/javascript'></script>
	<!-- / jquery mobile events (for touch and slide) -->
	<script
		src='assets/javascripts/plugins/mobile_events/jquery.mobile-events.min.js'
		type='text/javascript'></script>
	<!-- / jquery migrate (for compatibility with new jquery) -->
	<script src='assets/javascripts/jquery/jquery-migrate.min.js'
		type='text/javascript'></script>
	<!-- / jquery ui -->
	<script src='assets/javascripts/jquery_ui/jquery-ui.min.js'
		type='text/javascript'></script>
	<!-- / bootstrap -->
	<script src='assets/javascripts/bootstrap/bootstrap.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/flot/excanvas.js'
		type='text/javascript'></script>
	<!-- / sparklines -->
	<script
		src='assets/javascripts/plugins/sparklines/jquery.sparkline.min.js'
		type='text/javascript'></script>
	<!-- / flot charts -->
	<script src='assets/javascripts/plugins/flot/flot.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/flot/flot.resize.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/flot/flot.pie.js'
		type='text/javascript'></script>
	<!-- / bootstrap switch -->
	<script
		src='assets/javascripts/plugins/bootstrap_switch/bootstrapSwitch.min.js'
		type='text/javascript'></script>
	<!-- / fullcalendar -->
	<script
		src='assets/javascripts/plugins/fullcalendar/fullcalendar.min.js'
		type='text/javascript'></script>
	<!-- / datatables -->
	<script
		src='assets/javascripts/plugins/datatables/jquery.dataTables.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/datatables/jquery.dataTables.columnFilter.js'
		type='text/javascript'></script>
	<!-- / wysihtml5 -->
	<script src='assets/javascripts/plugins/common/wysihtml5.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/common/bootstrap-wysihtml5.js'
		type='text/javascript'></script>
	<!-- / select2 -->
	<script src='assets/javascripts/plugins/select2/select2.js'
		type='text/javascript'></script>
	<!-- / color picker -->
	<script
		src='assets/javascripts/plugins/bootstrap_colorpicker/bootstrap-colorpicker.min.js'
		type='text/javascript'></script>
	<!-- / mention -->
	<script src='assets/javascripts/plugins/mention/mention.min.js'
		type='text/javascript'></script>
	<!-- / input mask -->
	<script
		src='assets/javascripts/plugins/input_mask/bootstrap-inputmask.min.js'
		type='text/javascript'></script>
	<!-- / fileinput -->
	<script
		src='assets/javascripts/plugins/fileinput/bootstrap-fileinput.js'
		type='text/javascript'></script>
	<!-- / modernizr -->
	<script src='assets/javascripts/plugins/modernizr/modernizr.min.js'
		type='text/javascript'></script>
	<!-- / retina -->
	<script src='assets/javascripts/plugins/retina/retina.js'
		type='text/javascript'></script>
	<!-- / fileupload -->
	<script src='assets/javascripts/plugins/fileupload/tmpl.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/fileupload/load-image.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/canvas-to-blob.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/jquery.iframe-transport.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/jquery.fileupload.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/jquery.fileupload-fp.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/jquery.fileupload-ui.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/fileupload/jquery.fileupload-init.js'
		type='text/javascript'></script>
	<!-- / timeago -->
	<script src='assets/javascripts/plugins/timeago/jquery.timeago.js'
		type='text/javascript'></script>
	<!-- / slimscroll -->
	<script
		src='assets/javascripts/plugins/slimscroll/jquery.slimscroll.min.js'
		type='text/javascript'></script>
	<!-- / autosize (for textareas) -->
	<script
		src='assets/javascripts/plugins/autosize/jquery.autosize-min.js'
		type='text/javascript'></script>
	<!-- / charCount -->
	<script src='assets/javascripts/plugins/charCount/charCount.js'
		type='text/javascript'></script>
	<!-- / validate -->
	<script
		src='assets/javascripts/plugins/validate/jquery.validate.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/validate/additional-methods.js'
		type='text/javascript'></script>
	<!-- / naked password -->
	<script
		src='assets/javascripts/plugins/naked_password/naked_password-0.2.4.min.js'
		type='text/javascript'></script>
	<!-- / nestable -->
	<script src='assets/javascripts/plugins/nestable/jquery.nestable.js'
		type='text/javascript'></script>
	<!-- / tabdrop -->
	<script src='assets/javascripts/plugins/tabdrop/bootstrap-tabdrop.js'
		type='text/javascript'></script>
	<!-- / jgrowl -->
	<script src='assets/javascripts/plugins/jgrowl/jquery.jgrowl.min.js'
		type='text/javascript'></script>
	<!-- / bootbox -->
	<script src='assets/javascripts/plugins/bootbox/bootbox.min.js'
		type='text/javascript'></script>
	<!-- / inplace editing -->
	<script
		src='assets/javascripts/plugins/xeditable/bootstrap-editable.min.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/plugins/xeditable/wysihtml5.js'
		type='text/javascript'></script>
	<!-- / ckeditor -->
	<script src='assets/javascripts/plugins/ckeditor/ckeditor.js'
		type='text/javascript'></script>
	<!-- / filetrees -->
	<script
		src='assets/javascripts/plugins/dynatree/jquery.dynatree.min.js'
		type='text/javascript'></script>
	<!-- / datetime picker -->
	<script
		src='assets/javascripts/plugins/bootstrap_datetimepicker/bootstrap-datetimepicker.js'
		type='text/javascript'></script>
	<!-- / daterange picker -->
	<script
		src='assets/javascripts/plugins/bootstrap_daterangepicker/moment.min.js'
		type='text/javascript'></script>
	<script
		src='assets/javascripts/plugins/bootstrap_daterangepicker/bootstrap-daterangepicker.js'
		type='text/javascript'></script>
	<!-- / max length -->
	<script
		src='assets/javascripts/plugins/bootstrap_maxlength/bootstrap-maxlength.min.js'
		type='text/javascript'></script>
	<!-- / dropdown hover -->
	<script
		src='assets/javascripts/plugins/bootstrap_hover_dropdown/twitter-bootstrap-hover-dropdown.min.js'
		type='text/javascript'></script>
	<!-- / slider nav (address book) -->
	<script src='assets/javascripts/plugins/slider_nav/slidernav-min.js'
		type='text/javascript'></script>
	<!-- / fuelux -->
	<script src='assets/javascripts/plugins/fuelux/wizard.js'
		type='text/javascript'></script>
	<!-- / flatty theme -->
	<script src='assets/javascripts/nav.js' type='text/javascript'></script>
	<script src='assets/javascripts/tables.js' type='text/javascript'></script>
	<script src='assets/javascripts/theme.js' type='text/javascript'></script>
	<!-- / demo -->
	<script src='assets/javascripts/demo/jquery.mockjax.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/demo/inplace_editing.js'
		type='text/javascript'></script>
	<script src='assets/javascripts/demo/charts.js' type='text/javascript'></script>
	<script src='assets/javascripts/demo/demo.js' type='text/javascript'></script>
</pg:pager>
</body>
</html>
