let list = document.getElementById("my-list");
let html = '';
['First', 'Second', 'Third', 'Fourth', 'Fifth']
    .forEach(e => html +=`<li>${e}</li>`);
list.innerHTML = html;
document.querySelector("h2").innerText = new Date().toLocaleString();