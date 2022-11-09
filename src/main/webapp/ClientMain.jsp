<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

    <style>
      .modal {
        position: absolute;
        top: 0%;
        left: 50%;

        width: 500px;
        height: 1000px;

        display: none;

        background-color: rgba(0, 0, 0, 0.4);
      }
    </style>
  </head>
  <body>
  <form action="ClientMain.do"  method = "post" name="ClientMain">
    <div class="modal">
      <div class="modal_body">Modal</div>
    </div>
    <button class="btn-open-popup">호스트 모드 </button>
    <script>
      const modal = document.querySelector('.modal');
      const btnOpenPopup = document.querySelector('.btn-open-popup');

      btnOpenPopup.addEventListener('click', () => {
        modal.style.display = 'block';
      });
    </script>
    </form>
  </body>
</html>