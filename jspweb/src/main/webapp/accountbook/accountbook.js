console.log('visitlog.js 열림');

// 1. Create (저장)
function vwrite() {
	let vcontentInput = document.querySelector('.vcontent');		console.log('vcontentInput : '+vcontentInput);
	let vamountInput = document.querySelector('.vamount');			console.log('vamountInput : '+vamountInput);
	let vdateInput = document.querySelector('.vdate');				console.log('vdateInput : '+vdateInput);
	
	let info = {
		vcontent : vcontentInput.value ,
		vamount : vamountInput.value ,
		vdate : vdateInput.value
	}; console.log(info);
	
	$.ajax({
      url : "/jspweb/Accountbook",
      method : "post",
      data : info ,
      success : function f(r){	console.log(r);
		  if(r == true){
			  alert('등록성공'); vread();
			  vcontentInput.value = ''; vamountInput.value=''; vdateInput.value='';
		  }else{alert('등록실패');}
	  } ,
      error : function f(r){}
   })
}
// 2. Read(호출)
vread();
function vread() {
	 $.ajax({
	      url : "/jspweb/Accountbook",
	      method : "get",
	      data : "" ,
	      success : function f(r){ console.log(r);
	      	let output = document.querySelector('.visit_Bottom');
	      	let html = ``;
	      		for(let i=0; i<r.length; i++){
					  html += `
					<div class="visitbox"> <!-- 방문록 1개의 표시구역 -->
						<div class="visitbox_top">
							<div class="visitbox_center"> ${ r[i].vcontent } </div>
							<div class=""> ${ r[i].vamount } </div>
							<div class="visitdate"> ${ r[i].vdate } </div>
					
						</div>
					<div class="visitbox_bottom">
						<button onclick="vupdate( ${ r[i].vno } )" type="button">수정</button>
						<button onclick="vdelete( ${ r[i].vno } )" type="button">삭제</button>
					</div>
				</div> `}
			output.innerHTML = html;
	     } ,
	      error : function f(r){}
   })
 }
 //3. update(수정)
 function vupdate(vno){console.log('vupdate() open : '+vno);
 	let vcontent = prompt('수정할 내용 : ');
 	 $.ajax({
	      url : "/jspweb/Accountbook",
	      method : "put",
	      data : {vno : vno , vcontent: vcontent} ,
	      success : function f(r){ console.log('doPot통신성공');
	      	if(r == true){ alert('수정성공'); vread();}
			else{alert('수정실패');}
		  } ,
	      error : function f(r){ console.log(r);}
   })
	 
 }
 
//4. delete(삭제)
function vdelete(vno){console.log('vdelete() open : '+vno);
	$.ajax({
	      url : "/jspweb/Accountbook",
	      method : "delete",
	      data : {vno : vno} ,
	      success : function f(r){ console.log("deDelete통신성공")
	      	if(r == true){alert('삭제성공'); vread();}
	      	else{alert('삭제실패')}
	      } ,
	      error : function f(r){console.log(r);}
   })
}
