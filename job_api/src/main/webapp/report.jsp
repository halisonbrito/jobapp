<jsp:include page="/include/head.jsp"/>
<jsp:include page="/include/menu-topo.jsp"/>


<div class="main-content">


    <div class="main-content-inner">

        <div class="row">
            <div class="col-md-12">

                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3>Report</h3>
                    </div>

                    <table id="tableReport" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
                        <thead>
                        <tr>
                            <th class="th-sm"></th>
                            <th class="th-sm">Company name</th>
                            <th class="th-sm">Description</th>
                            <th class="th-sm">Students</th>
                            <th class="th-sm">Salary(avr)</th>
                            <th class="th-sm">Max salary</th>
                        </tr>
                        </thead>
                    </table>



                    </div>
                </div>
            </div>
        </div>
    </div>
</div>


<jsp:include page="/include/footer.jsp"/>
<script src="../assets/ajax/report_list.js"></script>