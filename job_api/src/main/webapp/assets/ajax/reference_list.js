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
	
	
	$('#tableReference').on( 'click', 'tbody tr', function () {

	    //id = table.row(this).data().id;
		//$('#tmSessionType').val(table.row(this).data().sessionType);
		
		$('#firstName').val(table.row(this).data().firstName);
		
	
	    $('#myModal').modal('show');

    } );	
	
	
});