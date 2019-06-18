var references;
var referenceId;
var contactCompany = {};
var contactPersonal = {};

function openModal(idReference){
	load(references.filter( r => r.id == idReference )[0]);
	$('#myModal').modal('show');
}


function load(ref){
	referenceId = ref.id;
	$("#studentId").val(ref.studentId);
    $("#firstName").val(ref.firstName);
    $("#lastName").val(ref.lastName);
    $("#relationship").val(ref.relationship);
    $("#company").val(ref.company);
    $("#jobTitle").val(ref.jobTitle);
    
    ref.contacts.forEach( cot => { 
    	if(cot.type == "Company"){
    		contactCompany =cot;
            $("#cemail").val(cot.email);
            $("#cphone").val(cot.phone);
    	}else{
    		contactPersonal = cot;
            $("#pemail").val(cot.email);
            $("#pphone").val(cot.phone);
    	}
    });
}


$(document).ready(function () {
	
	var url = "http://localhost:888/students";
	
	var table = $('#tableReference').DataTable({
		 	"paging":false,
		
			"columnDefs": [
	            {
	                "targets": [ 3 ],
	                "visible": false,
	                "searchable": false
	            }
	        ],
		
	       dom: 'lBfrtip',
	        "processing": true,
	        "ajax": {
	            "url": url,
	            dataSrc: ''
	        },
	        "columns": [
	        	 {
	                 "className":      'details-control',
	                 "orderable":      false,
	                 "data":           null,
	                 "defaultContent": ''
	             },	        		        
	            {"data": "name"},
	            {"data": "name"},
	            {"data": "references"},
	            {"data": "entry"}

	            ]
	    });	
	


	
	function format ( student ) {
		
		var table1 = '<table cellpadding="5" cellspacing="0" width="100%" border="0" style="padding-left:50px;">'+
        "<thead>" +
        "<tr>" +
            "<th class='th-sm'>Full name</th>" +
            "<th class='th-sm'>Job Title</th>" +
            "<th class='th-sm'>Company</th>" +
            "<th class='th-sm'>Relationship</th>" +
            "<th class='th-sm'></th>" +
        "</tr>" +
        "</thead>" +

        "<tbody>";
 

		var rows = "";
		
		student.references.forEach( ref => {
			
			rows += '<tr>'+
		        '<td>'+ref.firstName+' '+ ref.lastName+'</td>'+
		        '<td>'+ref.jobTitle+'</td>'+
		        '<td>'+ref.company+'</td>'+
		        '<td>'+ref.relationship+'</td>'+
		        `<td><a href="#" onclick="openModal(${ref.id})">Edit</a></td>`+
            '</tr>';

			
		});
		
		var table3 ="</tbody>"+'</table>';

		
		return table1 + rows + table3;
		
	}
	
    //Update Ajax
    $('#update').on('click', function () { 
    	
        var studentId = $("#studentId").val();
        var firstName = $("#firstName").val();
        var lastName = $("#lastName").val();
        var relationship = $("#relationship").val();
        var company = $("#company").val();
        var jobTitle = $("#jobTitle").val();
        var cemail = $("#cemail").val();
        var cphone = $("#cphone").val();
        var pemail = $("#pemail").val();
        var pphone = $("#pphone").val();
        
        var listContact = [{email:cemail,phone:cphone,type:'Company',id:contactCompany.id}
        				  ,{email:pemail,phone:pphone,type:'Personal',id:contactPersonal.id}];

		var dataObject = {id:referenceId,studentId:studentId,lastName:lastName, firstName:firstName, contacts:listContact,
					 relationship:relationship, company:company, jobTitle:jobTitle };
		
		var jsonData = JSON.stringify(dataObject);
		
		
        $.ajax({
            url: "http://localhost:888/references",
            type: 'PUT',
            data: jsonData,
            contentType: 'application/json',   // Sends
            success: function (session) {
            	alert("Success !!")
            },
            error: function (data) {
            	alert("Error !!")
            }
        })		
    	
    	
    	
    });

	
	 $('#tableReference tbody').on('click', 'td.details-control', function () {
		 
		 var tr = $(this).closest('tr');
	        var row = table.row( tr );
	 
	        if ( row.child.isShown() ) {
	            // This row is already open - close it
	            row.child.hide();
	            tr.removeClass('shown');
	        }
	        else {
	            // Open this row
	        	references = row.data().references;
	            row.child( format ( row.data() ) ).show();
	            tr.addClass('shown');
	        }
		 
	 });
	
	/** $('#tableReference').on( 'click', 'tbody tr', function () {

	    //id = table.row(this).data().id;
		//$('#tmSessionType').val(table.row(this).data().sessionType);
		
		
		
	
	    

    } );*/	
	
	
});