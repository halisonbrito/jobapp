// JavaScript Document


/*Função que Determina as expressões regulares dos objetos*/
function leech(v){
		v=v.replace(/o/gi,"0")
		v=v.replace(/i/gi,"1")
		v=v.replace(/z/gi,"2")
		v=v.replace(/e/gi,"3")
		v=v.replace(/a/gi,"4")
		v=v.replace(/s/gi,"5")
		v=v.replace(/t/gi,"7")
		return v
}

/*Função que permite apenas numeros*/
function soNumero(v){
		return v.replace(/\D/g,"")
}

/*Função que padroniza telefone (11) 4184-1241*/
function telefone(v){
	v=v.replace(/\D/g,"")                 //Remove tudo o que não é dígito
	v=v.replace(/^(\d\d)(\d)/g,"($1) $2") //Coloca parênteses em volta dos dois primeiros dígitos
	v=v.replace(/(\d{4})(\d)/,"$1-$2")    //Coloca hífen entre o quarto e o quinto dígitos
	return v
}				


/*Função que padroniza telefone (11) 41841241*/
function TelefoneCall(v){
		v=v.replace(/\D/g,"")                            
		v=v.replace(/^(\d\d)(\d)/g,"($1) $2")   
		return v
}

/*Função que padroniza CPF*/
function Cpf(v){
		v=v.replace(/\D/g,"")                                   
		v=v.replace(/(\d{3})(\d)/,"$1.$2")         
		v=v.replace(/(\d{3})(\d)/,"$1.$2")         
																						 
		v=v.replace(/(\d{3})(\d{1,2})$/,"$1-$2")

		return v
}

/*Função que padroniza CEP*/
function Cep(v){
		v=v.replace(/D/g,"")                            
		v=v.replace(/^(\d{5})(\d)/,"$1-$2") 
		return v
}

/*Função que padroniza CNPJ*/
function Cnpj(v){
		v=v.replace(/\D/g,"")                              
		v=v.replace(/^(\d{2})(\d)/,"$1.$2")      
		v=v.replace(/^(\d{2})\.(\d{3})(\d)/,"$1.$2.$3") 
		v=v.replace(/\.(\d{3})(\d)/,".$1/$2")              
		v=v.replace(/(\d{4})(\d)/,"$1-$2")                        
		return v
}

/*Função que permite apenas numeros Romanos*/
function Romanos(v){
		v=v.toUpperCase()                        
		v=v.replace(/[^IVXLCDM]/g,"") 
		
		while(v.replace(/^M{0,4}(CM|CD|D?C{0,3})(XC|XL|L?X{0,3})(IX|IV|V?I{0,3})$/,"")!="")
				v=v.replace(/.$/,"")
		return v
}

/*Função que padroniza o Site*/
function Site(v){
		v=v.replace(/^http:\/\/?/,"")
		dominio=v
		caminho=""
		if(v.indexOf("/")>-1)
				dominio=v.split("/")[0]
				caminho=v.replace(/[^\/]*/,"")
				dominio=dominio.replace(/[^\w\.\+-:@]/g,"")
				caminho=caminho.replace(/[^\w\d\+-@:\?&=%\(\)\.]/g,"")
				caminho=caminho.replace(/([\?&])=/,"$1")
		if(caminho!="")dominio=dominio.replace(/\.+$/,"")
				v="http://"+dominio+caminho
		return v
}

/*Função que padroniza DATA*/
function Data(v){
		v=v.replace(/\D/g,"") 
		v=v.replace(/(\d{2})(\d)/,"$1/$2") 
		v=v.replace(/(\d{2})(\d)/,"$1/$2") 
		return v
}

/*Função que padroniza DATA*/
function Hora(v){
		v=v.replace(/\D/g,"") 
		v=v.replace(/(\d{2})(\d)/,"$1:$2")  
		return v
}

/*Função que padroniza valor monétario*/
function Valor(v){
		v=v.replace(/\D/g,"") //Remove tudo o que não é dígito
		v=v.replace(/^([0-9]{3}\.?){3}-[0-9]{2}$/,"$1.$2");
		//v=v.replace(/(\d{3})(\d)/g,"$1,$2")
		v=v.replace(/(\d)(\d{2})$/,"$1.$2") //Coloca ponto antes dos 2 últimos digitos
		return v
}

/*Função que padroniza Area*/
function Area(v){
		v=v.replace(/\D/g,"") 
		v=v.replace(/(\d)(\d{2})$/,"$1.$2") 
		return v
		
}

function fmascara(o,f){
        v_obj=o
        v_fun=f
        setTimeout("execmascara()",1);
}

/*Função que Executa os objetos*/
function execmascara(){
        v_obj.value=v_fun(v_obj.value);
}

function mascara(campo)
   {
       var texto = campo.value;
	   if(texto.length == 2 || texto.length ==5)
       campo.value += "/";
   }
   
  function mascaramesano(campo)
   {
       var texto = campo.value;
	   if(texto.length == 2)
       campo.value += "/";
   }
   
   function validardata(campo){
   var meses = new Array(); 
   meses[1]=31;  
   meses[2]=28;  
   meses[3]=31;  
   meses[4]=30;  
   meses[5]=31;  
   meses[6]=30;  
   meses[7]=31;  
   meses[8]=31;  
   meses[9]=30;  
   meses[10]=31;  
   meses[11]=30;  
   meses[12]=31;  
   var vdata = campo.value;
   
   if (vdata.length == 0) return true;
   
    	   var dia = vdata.split("/");
		   
		   if(parseInt(dia[2]) % 4 == false)
			  meses[2] = 29;
			  

		   if(isNaN(dia[0]) || isNaN(dia[1]) || isNaN(dia[2])){
			  alert("O Campo '" +campo.id+ "' est\u00e1 com a data incorreta '" + vdata + "'.\n Coloque uma data v\u00e1lida no formato dd/mm/aaaa.");
			  return false;
		   }
		   
		   if(dia[0] > meses[parseInt(dia[1])] ){
			  alert("O Campo '" +campo.id+ "' est\u00e1 com a data incorreta '" + vdata + "'.\n Coloque uma data v\u00e1lida no formato dd/mm/aaaa.");
			  return false;
		   }
		   
		   if(parseInt(dia[0]) > 31 || parseInt(dia[1]) > 12 || parseInt(dia[2]) > 2019){
			   alert("Segue os valores para a data:\nDia: at\u00E9 31.\nM\u00eas: at\u00E9 12.\nAno: at\u00E9 2019.");
			   return false;
			}
   
   return true;
  }
  
function MM_openBrWindow(theURL,winName,features) { //v2.0
  window.open(theURL,winName,features);
}  
 function validarmesano(campo){
   var vdata = campo.value;
   
   if (vdata.length == 0) return false;
   
    	   var mesano = vdata.split("/");

		   if(isNaN(mesano[0]) || isNaN(mesano[1])){
			  alert("O Campo '" +campo.id+ "' est\u00e1 com a data incorreta '" + vdata + "'.\n Coloque uma data v\u00e1lida no formato mm/aaaa.");
			  return false;
		   }
		   
   
		   if(parseInt(mesano[0]) > 12 || parseInt(mesano[1]) != 2019){
			   alert("Segue os valores para a data:\nM\u00eas: at\u00E9 12.\nAno: 2019.");
			   return false;
			}
   
   return true;
  }
  

function MM_findObj(n, d) { //v4.01
  var p,i,x;  if(!d) d=document; if((p=n.indexOf("?"))>0&&parent.frames.length) {
    d=parent.frames[n.substring(p+1)].document; n=n.substring(0,p);}
  if(!(x=d[n])&&d.all) x=d.all[n]; for (i=0;!x&&i<d.forms.length;i++) x=d.forms[i][n];
  for(i=0;!x&&d.layers&&i<d.layers.length;i++) x=MM_findObj(n,d.layers[i].document);
  if(!x && d.getElementById) x=d.getElementById(n); return x;
}

function MM_validateForm() { //v4.0
  var i,p,q,nm,test,num,min,max,campo,errors='',args=MM_validateForm.arguments;
  for (i=0; i<(args.length-2); i+=3) { test=args[i+2]; campo=MM_findObj(args[i]);
    if (campo) { nm=campo.id; if ((val=campo.value)!="") {
      if (test.indexOf('isEmail')!=-1) { p=val.indexOf('@');
        if (p<1 || p==(val.length-1)) errors+='- '+nm+' est\u00e1 incorreto.\n';
      } else if (test!='R') {val = val.replace(",","."); campo.value = val; num = parseFloat(val);
        if (isNaN(val)) errors+='- '+nm+' deve conter apenas n\u00fameros.\n';
        if (test.indexOf('inRange') != -1) { p=test.indexOf(':');
          min=test.substring(8,p); max=test.substring(p+1);
          if (num<min || max<num) errors+='- '+nm+' deve conter um n\u00famero entre '+min+' e '+max+'.\n';
    } } } else if (test.charAt(0) == 'R') errors += '- '+nm+' \u00E9 obrigat\u00f3rio o preenchimento.\n'; }
  } if (errors) alert('Foi(ram) encontrado(s) o(s) seguinte(s) erro(s):\n'+errors);
  document.MM_returnValue = (errors == '');
}


  
function mascacaraa(tipo, campo, teclaPress) {
	if (window.event)  {
		var tecla = teclaPress.keyCode;        
	} else {
		tecla = teclaPress.which;
	}
	var s = new String(campo.value); 
	s = s.replace(/(\.|\(|\)|\/|\-| )+/g,'');
	tam = s.length + 1;
	if ( tecla != 9 && tecla != 8 ) {
		switch (tipo){
			case 'CPF' :
				if (tam > 3 && tam < 7) campo.value = s.substr(0,3) + '.' + s.substr(3, tam);
				if (tam >= 7 && tam < 10) campo.value = s.substr(0,3) + '.' + s.substr(3,3) + '.' + s.substr(6,tam-6);
				if (tam >= 10 && tam < 12) campo.value = s.substr(0,3) + '.' + s.substr(3,3) + '.' + s.substr(6,3) + '-' + s.substr(9,tam-9);
				break;
			case 'CNPJ' :
				if (tam > 2 && tam < 6) campo.value = s.substr(0,2) + '.' + s.substr(2, tam);
				if (tam >= 6 && tam < 9) campo.value = s.substr(0,2) + '.' + s.substr(2,3) + '.' + s.substr(5,tam-5);
				if (tam >= 9 && tam < 13) campo.value = s.substr(0,2) + '.' + s.substr(2,3) + '.' + s.substr(5,3) + '/' + s.substr(8,tam-8);
				if (tam >= 13 && tam < 15) campo.value = s.substr(0,2) + '.' + s.substr(2,3) + '.' + s.substr(5,3) + '/' + s.substr(8,4)+ '-' + s.substr(12,tam-12);
				break;
			case 'TEL' :
				if (tam > 2 && tam < 4) campo.value = '(' + s.substr(0,2) + ') ' + s.substr(2,tam);
				if (tam >= 7 && tam < 11) campo.value = '(' + s.substr(0,2) + ') ' + s.substr(2,4) + '-' + s.substr(6,tam-6)
				break;
			case 'DATA' :
				if (tam > 2 && tam < 4) campo.value = s.substr(0,2) + '/' + s.substr(2, tam);
				if (tam > 4 && tam < 11) campo.value = s.substr(0,2) + '/' + s.substr(2,2) + '/' + s.substr(4,tam-4);
				break;
			case 'CEP' :
				if (tam > 5 && tam < 7) campo.value = s.substr(0,5) + '-' + s.substr(5, tam);
				break;
			case 'HORA' :
				if (tam > 2 && tam < 4) campo.value = s.substr(0,2) + ':' + s.substr(2, tam);
				if (tam > 4 && tam < 11) campo.value = s.substr(0,2) + ':' + s.substr(2,2) + ':' + s.substr(4,tam-4);
				break;
		}
	}
}

function digitos(event){
	if (window.event) {
	// IE
		key = event.keyCode;
	} else if ( event.which ) {
	// netscape
		key = event.which;
	}
	if ( key != 8 || key != 13 || key < 48 || key > 57 )
		return ( ( ( key > 47 ) && ( key < 58 ) ) || ( key == 8 ) || ( key == 13 ) );
	return true;
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
	


   var validaCPF =  function ValidaCPF(campo) {      
	        if(campo.length == 0){
	        	return true;
	        }

  		return cpfValido(campo);
    }

   var validaCpfOBrigatorio = function validaCpfOBrigatorio(campo) {
   		return cpfValido(campo);
    }


    function cpfValido(campo){

 		var i;
        var cpf = campo;
        cpf = cpf.replace('.', '').replace('.', '').replace('-', '');

        if (cpf.length != 11 || cpf == "00000000000" || cpf == "11111111111" || cpf == "22222222222" || cpf == "33333333333" || cpf == "44444444444" || cpf == "55555555555" || cpf == "66666666666" || cpf == "77777777777" || cpf == "88888888888" || cpf == "99999999999")
            return false;
        add = 0;
        for (i = 0; i < 9; i++)
            add += parseInt(cpf.charAt(i)) * (10 - i);
        rev = 11 - (add % 11);
        if (rev == 10 || rev == 11)
            rev = 0;
        if (rev != parseInt(cpf.charAt(9)))
            return false;
        add = 0;
        for (i = 0; i < 10; i++)
            add += parseInt(cpf.charAt(i)) * (11 - i);
        rev = 11 - (add % 11);
        if (rev == 10 || rev == 11)
            rev = 0;
        if (rev != parseInt(cpf.charAt(10))){
			  return false;
        }
          

        return true;
    }

    function money(field){
    	field.maskMoney({prefix:'R$ ', allowNegative: false, thousands:'', decimal:',', affixesStay: false});
    }

    function decimal(field){
    	field.maskMoney({allowNegative: false, thousands:'', decimal:',', affixesStay: false});
    }    