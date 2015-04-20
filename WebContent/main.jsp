<!DOCTYPE html>
<html>

<head>
    <title>main.jsp Loaded</title>
</head>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CodeMirror/lib/codemirror.css">
    <link rel="stylesheet" href="${pageContext.request.contextPath}/CodeMirror/theme/mbo.css">
    <style type="text/css">
    * {
        padding: 0px;
        margin: 0px;
    }
    .selectedWidget {
        border: 2px solid blue;
    }
    html,
    body {
        height: 100%;
        font-family: 'Segoe UI';
    }
    .cm-s-mbo {
        font-family: 'Menlo', 'Consolas', monospace !important;
        font-weight: bold;
        font-size: 15px;
    	width:80% !important;
    	height:718px !important; 
    	height: 200%;
    }
    #usersOnline
    {
    	position:fixed;
    	top:0;
    	right:0;
    	border-left: 1px solid white;
    	width:20%;
    	height: 100%;
    	overflow-y:scroll;
    	background-color: rgba(86,164,246,0.5);
    	color: black;
    }
    .online
    {
	    vertical-align:middle;
    }
    .greenDot
    {
    	margin-right:5px;
    	width:32px;
    	height:32px;
    }
    </style>
<body style="height: 107px; ">
  <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>

    <script src="${pageContext.request.contextPath}/scripts/DisplayShared.js"></script>
	
	
	
    <script src="${pageContext.request.contextPath}/CodeMirror/lib/codemirror.js"></script>
    <script src="${pageContext.request.contextPath}/CodeMirror/mode/javascript/javascript.js"></script>
    <script src="${pageContext.request.contextPath}/dojo/dojo.js" data-dojo-config="async:true"></script>
  
    <form>
    	<textarea id='myTextArea'>
        	//Enter your code here
    	</textarea>
    	
    	<div id = 'store' myattr=''> </div>
    	
    	<div id='usersOnline'>	
    	</div>
    </form>
    <script>
    var cm = CodeMirror.fromTextArea(myTextArea, {
        lineNumbers: true,
        theme: "mbo",
        autoCloseBrackets: true,
        keymap: 'sublime',
        foldGutter: true,
        gutters: ["CodeMirror-linenumbers", "CodeMirror-foldgutter"]
    });
    </script>
    <script src="${pageContext.request.contextPath}/scripts/main.js"></script>
    
</body>

</html>

