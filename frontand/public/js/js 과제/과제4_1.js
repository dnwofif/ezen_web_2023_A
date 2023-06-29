let boardlist = [ ]

onPrint()

function onWrite(){ console.log('onWrite()함수')

	let writerValue = document.querySelector('#writer').value;
	let passwordValue = document.querySelector('#password').value;
	let titleValue = document.querySelector('#title').value;
	let contentValue = document.querySelector('#content').value;
	
		
		let now = new Date(); 
		let year = now.getFullYear(); 	console.log('year : ' + year )		// 현재 연도 
		let month = now.getMonth()+1;	console.log('month : ' + month )	// 현재 월 0~11 [ 0:1월 / 1:2월 / 5:6월 / 11:12월 ]
		let week = now.getDay();		console.log('week : ' + week )		// 현재 요일 [ 0:일 1:월 ~~ 4:목요일 6:토요일 ]
		let day = now.getDate();		console.log('day : ' + day)			// 현재 일 
		let hour = now.getHours();	 	console.log('hour : ' + hour )		// 현재 시 
		let minute = now.getMinutes(); 	console.log('minute : ' + minute )	// 현재 분 
		let second = now.getSeconds(); 	console.log('second : ' + second )	// 현재 초
	
	
	let board = {
		writer : writerValue,
		password : passwordValue,
		title : titleValue,
		content : contentValue,
		date : ` ${now.getFullYear() }년 ${now.getMonth() }월 ${now.getDate() }일
				${now.getHours() }:${now.getMinutes() }:${now.getSeconds()}
				`,
		view : 0
				}
	console.log(board);
	boardlist.push(board); console.log(boardlist);
	
	onPrint()
}

function onPrint(){ console.log('onPrint()함수');
	let boardTable = document.querySelector('#boardTable')
	let html = `<tr><th> 번호 </th>	<th> 제목 </th>	<th> 작성자 </th>	<th> 작성일 </th>	<th> 조회수 </th>	</tr>`
	for(let i = 0; i<boardlist.length; i++){
		let board = boardlist[i];
		html += `<tr>
					<td> ${ i+1 } </td>
					<td onclick="onView( ${ i })"> ${ board.title } </td>
					<td> ${ board.date } </td>
					<td> ${ board.view } </td>
				</tr>`
	}
	boardTable.innerHTML = html	
}

function onView( index ){console.log('onView 함수'+index);
	let viewbox = document.querySelector('#viewbox')
	let board = boardlist[index]
	let html = `<div> 제목 : ${ board.title }</div>
				<div> 내용 : ${ board.content }</div>
				<div> 작성자 : ${ board.writer }</div>
				<button onclick="onDelete(${index})">삭제</button>`
	viewbox.innerHTML = html
	board.view++; onPrint();
}

function onDelete( index ){ console.log('onDelete()함수'+ index)
	let board = boardlist[index];
	let passowrd = prompt('비밀번호 : ')
	if(board.passowrd == passowrd){
		boardlist.splice(index,1);
		onPrint();
		document.querySelector('#viewbox').innerHTML = 	``
		alert('삭제성공')
	}else{
		alert('삭제실패')
	}
	
}