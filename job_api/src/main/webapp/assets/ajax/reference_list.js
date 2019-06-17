$(document).ready(function () {
	
	var url = "http://localhost:888/references/1";
	
	var table = $('#tableReference').DataTable({
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	            {"data": "firstName"},
	            {"data": "firstName"},
	            {"data": "firstName"},
	            {"data": "firstName"}

	            ]
	    });	
	
});