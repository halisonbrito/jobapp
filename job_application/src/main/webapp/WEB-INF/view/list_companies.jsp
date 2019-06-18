<jsp:include page="/include/head.jsp" />
<jsp:include page="/include/menu-topo.jsp" />


 <div class="main-content">



 <div class="main-content-inner">
              
  		<div class="row">
            <div class="col-md-12">

                <!-- Form Elements -->
                <div class="panel panel-default">
                    <div class="panel-heading">
                        <h3>List of Companies</h3>
                    </div>
                    <div class="panel-body">
                    
					    <table id="tableCompany" class="table table-striped table-bordered table-sm" cellspacing="0" width="100%">
					        <thead>
					        <tr>
					            <th class="th-sm">Name</th>
					            <th class="th-sm">Business type</th>
					            <th class="th-sm">Description</th>
					            <th class="th-sm">Phone</th>
					        </tr>
					        </thead>
					    </table>
                    
                    </div>
                </div>
              </div>
          </div>
      </div>
 </div>
          
          
<jsp:include page="/include/footer.jsp" />
<script src="../assets/ajax/company_list.js"></script>