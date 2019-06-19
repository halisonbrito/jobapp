$(document).ready(function () {

    var url = "http://localhost:8080/report";

    var table = $('#tableReport').DataTable({
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
            {"data": "company"},
            {"data": "description"},
            {"data": "students"},
            {"data": "salary"},
            {"data": "salaryMax"}

        ]
    });

    function format ( report ) {

        var table1 = '<table cellpadding="5" cellspacing="0" width="100%" border="0" style="padding-left:50px;">'+
            "<thead>" +
            "<tr>" +
            "<th class='th-sm'>Name</th>" +
            "<th class='th-sm'>Entry</th>" +
            "<th class='th-sm'>Salary</th>" +
            "<th class='th-sm'></th>" +
            "</tr>" +
            "</thead>" +

            "<tbody>";


        var rows = "";

        report.studentList.forEach( stu => {

            rows += '<tr>'+
                '<td>'+stu.name+'</td>'+
                '<td>'+stu.entry+'</td>'+
                '<td>'+stu.salary+'</td>'+
                '</tr>';


    });

        var table3 ="</tbody>"+'</table>';


        return table1 + rows + table3;

    }

    $('#tableReport tbody').on('click', 'td.details-control', function () {

        var tr = $(this).closest('tr');
        var row = table.row( tr );

        if ( row.child.isShown() ) {
            // This row is already open - close it
            row.child.hide();
            tr.removeClass('shown');
        }
        else {
            // Open this row
            students = row.data().studentList;
            row.child( format ( row.data() ) ).show();
            tr.addClass('shown');
        }

    });
});