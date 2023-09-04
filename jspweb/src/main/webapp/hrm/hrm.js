let checkList = [false, false, false, false, false]

//사진 유효성
function preimg(o){console.log('사진 선택 변경');
	console.log(o);	
	console.log(o.files);		console.log(o.files[0]);
	let file = new FileReader();
	file.readAsDataURL(o.files[0]);
	console.log(file);
	
	file.onload = e =>{
		document.querySelector('.preimg').src = e.target.result;
		if(('.preimg').src !=""){checkList[0] = true};
		if(('.preimg').src ==""){checkList[0] = false};
	}
	
	
}

//이름 유효성검사
function idcheck(){
	let hname = document.querySelector('.hname').value;
		if(hname == null) checkList[1] = false;
		if(hname != null) checkList[1] = true;
}

// 전화번호 유효성
function phonecheck(){
	let phonecheckbox = document.querySelector('.phonecheckbox');
	let hphone = document.querySelector('.hphone').value
	let memailj = /^\d{2,3}-\d{3,4}-\d{4}$/ 
	if(memailj.test(hphone)){
		phonecheckbox.innerHTML = `등록가능한 전화번호입니다.`;
				checkList[2] = true;
	}else{
		phonecheckbox.innerHTML = `000-0000-0000 형식으로 입력해주세요.`;
		checkList[2] = false;
	}
}

let hrankValue=``;
//직급 유효성
function rankcheck(){
	let hrank = document.getElementById("hrank");
	hrankValue = hrank.value;
	console.log(hrankValue)
		if(hrankValue =="선택") checkList[3] = false;
		if(hrankValue == null) checkList[3] = false;
		if(hrankValue != null) checkList[3] = true;
}

//등록일 유효성
function datecheck(){
	let hdate = document.querySelector('.hdate').value;
	let datecheckbox = document.querySelector('.datecheckbox');
	
	let midj = /^(\d{4})-(\d{2})-(\d{2})$/;
	
	if(midj.test(hdate)){
		datecheckbox.innerHTML = '올바른 입력입니다.'; checkList[4] = true;
	}else{
		datecheckbox.innerHTML = 'YYYY-MM-DD 형식으로 입력해주세요.'; checkList[4] = false;
		
	}
}

//회원가입 메소드
function signup(){
	console.log(checkList);
	if(checkList[0] && checkList[1] && checkList[2] && checkList[3] && checkList[4]){
		console.log('회원가입 진행가능');
		let signupForm = document.querySelectorAll('.signupForm')[0];
		console.log(signupForm);
		
		
		
		let signupData = new FormData(signupForm);
			console.log(signupForm);
			signupData.append("hrank",hrankValue);
			$.ajax({
				url : "/jspweb/HrmController",
				method : "post",
				data : signupData,
				contentType : false,
				processData : false,
				success : r => { console.log('통신성공')
					if(r) {
						alert('회원가입 성공');
						hread();
					}else{
						alert('회원가입 실패[관리자에게문의]');
					}
				},
				error : e => {console.log('통신실패')}	
				})
	}else{
		alert('정상적으로 입력 안된 내용이 있습니다.');
	}
}

// 출력 기능
hread(); 
function hread() { 
	$.ajax({
		url : "/jspweb/HrmController" , 
		method : "get" ,
		data : "" ,
		success : function f(r){ console.log(r); 
			
			let output = document.querySelector('.hlist');
			let html = ``; 
			
				for( let i = 0; i< r.length; i++ ){
					
					html += `<div class="hlistbox"><!-- 방문록 1개의 표시구역 -->
								<div class="hlist_top">
									<div> ${ r[i].hno +" | " } </div>
									<img class="box_himg" src="/jspweb/hrm/img/${r[i].himg}">
									<div> ${ " | "+ r[i].hname +" | " } </div>
									<div> ${ r[i].hphone +" | " } </div>
									<div> ${ r[i].hrank +" | "} </div>
									<div> ${ r[i].hdate  } </div>
								</div>	
								<div class="bookbox_bottom">
									<button onclick="hupdate( ${ r[i].hno })" type="button">수정</button>
									<button onclick="hdelete( ${ r[i].hno })" type="button">삭제</button>
								</div>
							</div>`
				}
			output.innerHTML = html;
		
		},
		error : function f(r){}
	})
}