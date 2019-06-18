


/*=============================================================
    Authour URI: www.binarycart.com
    License: Commons Attribution 3.0

    http://creativecommons.org/licenses/by/3.0/

    100% To use For Personal And Commercial Use.
    IN EXCHANGE JUST GIVE US CREDITS AND TELL YOUR FRIENDS ABOUT US
   
    ========================================================  */


(function ($) {
    "use strict";
    var mainApp = {

        main_fun: function () {
            /*====================================
            METIS MENU 
            ======================================*/
            $('#main-menu').metisMenu();

            /*====================================
              LOAD APPROPRIATE MENU BAR
           ======================================*/
            $(window).bind("load resize", function () {
                if ($(this).width() <768) {
                    $('div.sidebar-collapse').addClass('collapse')
                } else {
                    $('div.sidebar-collapse').removeClass('collapse')
                }
            });
     
        },

        initialization: function () {
            mainApp.main_fun();

        }

    }
    // Initializing ///

    $(document).ready(function () {
        mainApp.main_fun();
    });

}(jQuery));

  
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}  

function preencherCheckbox(obj,form){
    if(obj.checked == true){
		for (i=0;i<form.elements.length;i++)
			if(form.elements[i].type == "checkbox")	
				form.elements[i].checked=true;   
	   }
	  else{
	  	for (i=0;i<form.elements.length;i++)
			if(form.elements[i].type == "checkbox")	
				form.elements[i].checked=false;   
	  }
}