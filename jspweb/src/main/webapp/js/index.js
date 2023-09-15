
//1.N개 제품 최신순으로 출력 함수
function findByTop(count){
	$.ajax({
		url : "/jspweb/ProductInfoController",
		method : "get",
		data : { type : "findByTop" , count : count },
		success : jsonArray => { console.log( jsonArray )}
	})
}
//2.
function findByLatLng(east, west, south, sorth){
	$.ajax({
		url : "/jspweb/ProductInfoController",
		method : "get",
		data : { type : "findByLatLng" , east : east , west : west , south : south , sorth : sorth },
		success : jsonArray => { console.log( jsonArray )}
	})
}
//3.
function fundByPno(pno){
	$.ajax({
		url : "/jspweb/ProductInfoController",
		method : "get",
		data : { type : "fundByPno" , pno : pno },
		success : jsonArray => { console.log( jsonArray )}
	})
}
//4.
function findByAll(){
	$.ajax({
		url : "/jspweb/ProductInfoController",
		method : "get",
		data : { type : "findByAll" },
		success : jsonArray => { console.log( jsonArray )}
	})
}