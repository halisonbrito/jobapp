$(document).ready(function () {
	
	var url = "http://localhost:8080/companies";
	
	var table = $('#tableCompany').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "name"},
	            {"data": "businessType"},
	            {"data": "description"},
	            {"data": "phone"}
	            ]
	    });	
	
});