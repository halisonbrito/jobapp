$(document).ready(function () {
	
	var url = "http://localhost:8080/applications";
	
	var table = $('#tableApplications').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "processBeginningDate"},
	            {"data": "description"},
	            {"data": "position"},
	            {"data": "salary"},
				{"data": "studentName"},
				{"data": "companyName"},
	            ]
	    });	
	
});

