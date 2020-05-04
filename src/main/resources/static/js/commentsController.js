			document.getElementById('comment_button').onclick = function(){
				var text = document.getElementById("commentBox").value;
                
				var userName = document.getElementById("commentUserBox").value;
				var element = document.getElementById("comments_window");    
				var para = document.createElement("p");
				var node = document.createTextNode(userName + " : " + text);
				para.appendChild(node);
				element.appendChild(para);
                
				document.getElementById("commentBox").value = " ";
				document.getElementById("commentUserBox").value = " ";
			}