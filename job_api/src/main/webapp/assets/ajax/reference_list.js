$(document).ready(function () {
	
	var url = "http://localhost:8080/references/1";
	
	var table = $('#tableReference').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "name"},
	            {"data": "name"},
	            {"data": "name"},
	            {"data": "name"}

	            ]
	    });	
	
});