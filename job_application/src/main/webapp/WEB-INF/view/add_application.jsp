<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<jsp:include page="/include/head.jsp" />
<jsp:include page="/include/menu-topo.jsp" />


 <div class="main-content">


 <div class="main-content-inner">
              
  		<div class="row">
            <div class="col-md-12">
            
            
            <form role="form" id="formAlterarResponsavel" method="post" >

                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3>Add Application</h3>
                        </div>
                        <div class="panel-body">
                        
                        
	                        <div class="row">
	                            <div class="col-md-12">
	                            
                                   <div class="form-group">
                                           <div class="row">
                                               <div class="col-md-4">
                                                   <label>Begin date:</label>
                                                   <input  class="form-control" name="processBeginningDate" id="processBeginningDate" type="date">
                                                   <input  class="form-control" name="id" id="id" type="hidden">
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Description:</label>
                                                   <input  class="form-control" name="description" id="description" type="text">
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Position:</label>
                                                   <input  class="form-control" name="position" id="position" type="text">
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Salary:</label>
                                                   <input  class="form-control" name="salary" id="salary" type="number">
                                                   input class="form-control" name="approved" id="approved" type="hidden" value="false">
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Company:</label>
                                                   <input  class="form-control" name="company" id="company" type="text">
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Student:</label>
                                                   <input  class="form-control" name="company" id="student" type="text">
                                               </div>
                                           </div>
                                    </div>
		                        </div>
		                    </div>
		                    
                            <div class="form-group">
                              <div class="row">
                                  <div class="col-md-12">
                                      <div class="cal-control pull-left">
                                          <button type="button" data-loading-text="Loading..." class="btn btn-success pull-right" name="sbCadastrarGrupo"  id="sbCadastrarGrupo">Save</button>
                                    </div>
                                  </div>
                              </div>
                          </div>
		                    
                        
                        
                        </div>
                    </div>
            
            </form> 
          </div>
       </div>

     </div>
  </div>
            
<jsp:include page="/include/footer.jsp" />
<script src="../assets/ajax/add_application.js"></script>
