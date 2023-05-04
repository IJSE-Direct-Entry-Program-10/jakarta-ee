<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport"
        content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
  <meta http-equiv="X-UA-Compatible" content="ie=edge">
  <title>To-do List App</title>
  <link rel="stylesheet" href="css/reset.css">
  <link rel="preconnect" href="https://fonts.googleapis.com">
  <link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
  <link href="https://fonts.googleapis.com/css2?family=Ubuntu:ital,wght@0,300;0,400;0,500;0,700;1,300;1,400;1,500;1,700&display=swap" rel="stylesheet">
  <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@48,400,0,0" />
  <link rel="stylesheet" href="css/style.css">
</head>
<body>
  <header>
    <h1>
      <span class="material-symbols-outlined">
        task_alt
      </span>
      To-do List App</h1>
    <form action="#">
      <input type="text" placeholder="Enter a new task (Eg. Finalize the UI)">
      <button>Add New Task</button>
    </form>
  </header>
  <main>
    <section id="tasks">
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a title="Delete Task" href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a title="Delete Task" href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a title="Delete Task" href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
    </section>
    <section id="completed-tasks">
      <h2>Completed Tasks</h2>
      <div class="task completed">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task completed">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
      <div class="task completed">
        <a href="#">
          <label>
            <input type="checkbox"> Finish the project
          </label>
        </a>
        <a href="#">
          <span class="material-symbols-outlined">
            delete
          </span>
        </a>
      </div>
    </section>
  </main>
  <footer>
    Copyright &copy; 2023 DEP-10. All Rights Reserved.
  </footer>
</body>
</html>