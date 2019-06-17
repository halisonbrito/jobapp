
<jsp:include page="/include/head.jsp" />
<jsp:include page="include/menu-topo.jsp" />


 <div class="main-content">


 <div class="main-content-inner">
              
  		<div class="row">
            <div class="col-md-12">
            
            
            <form role="form" id="formAlterarResponsavel" method="post" >

                    <!-- Form Elements -->
                    <div class="panel panel-default">
                        <div class="panel-heading">
                            <h3>Add Reference</h3>
                        </div>
                        <div class="panel-body">
                        
                        
	                        <div class="row">
	                            <div class="col-md-12">

                                   <div class="form-group">
                                           <div class="row">
                                               <div class="col-md-4">
                                                   <label>Student ID:</label>
                                                   <input  class="form-control" name="studentId" id="studentId" type="number"> 
                                               </div>
                                               <div class="col-md-4">
                                                   <label>First Name:</label>
                                                   <input  class="form-control" name="firstName" id="firstName" type="text"> 
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Last Name:</label>
                                                   <input  class="form-control" name="lastName" id="lastName" type="text"> 
                                               </div>
                                           
                                           </div>
                                    </div>

	                            
                                   <div class="form-group">
                                   		 <div class="row">
                                            <div class="col-md-4">
                                                <label>Relationship:</label>
                                                <input  class="form-control" name="relationship" id="relationship" type="text"> 
                                            </div>
                                           
                                               <div class="col-md-4">
                                                   <label>Company:</label>
                                                   <input  class="form-control" name="company" id="company" type="text"> 
                                               </div>
                                               <div class="col-md-4">
                                                   <label>Job Title:</label>
													<select  name="jobTitle" id="jobTitle" class="form-control">
						                                <option value="Developer">Developer</option>
						                                <option value="SoftwareTeamLeader">SoftwareTeamLeader</option>
						                                <option value ="SoftwareEngineer">SoftwareEngineer</option>
						                                <option value ="Tester">Tester</option>
						                                <option value ="QA">QA</option>
						                                <option value ="Manager">Manager</option>
						                            </select>
                                               </div>
                                               
                                           </div>
                                    </div>

                                   <div class="form-group">
                                           <div class="row">
                                               <div class="col-md-3">
                                                   <label>Company Email:</label>
                                                   <input  class="form-control" name="cemail" id="cemail" type="email"> 
                                               </div>
                                               <div class="col-md-3">
                                                   <label>Company Phone:</label>
                                                   <input  class="form-control" name="cphone" id="cphone" type="tel"> 
                                               </div>
	                                            <div class="col-md-3">
	                                                <label>Personal Email:</label>
	                                                <input  class="form-control" name="pemail" id="pemail" type="email"> 
	                                            </div>
	                                            <div class="col-md-3">
	                                                <label>Personal Phone:</label>
	                                                <input  class="form-control" name="pphone" id="pphone" type="tel"> 
	                                            </div>
                                               
                                           </div>
                                           
                                    </div>
	                            
		                        </div>
		                    </div>
		                    
                            <div class="form-group">
                              <div class="row">
                                  <div class="col-md-12">
                                      <div class="cal-control pull-left">
                                      	<button type="submit" data-loading-text="Loading..." class="btn btn-success pull-right" name="sbCadastrarGrupo"  id="sbCadastrarGrupo">Save</button>
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
            
<jsp:include page="include/footer.jsp" />
<script src="../assets/ajax/reference_add.js"></script>
