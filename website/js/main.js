document.addEventListener("DOMContentLoaded", function(event) { // https://www.pullrequest.com/blog/how-to-implement-dark-mode-with-css-js/
    document.documentElement.setAttribute("data-theme", "dark");

    var themeSwitch = document.getElementById("theme-switch");

    themeSwitch.onclick = function() {
      var changeTheme = document.documentElement.getAttribute("data-theme") === "dark" ? "light" : "dark"
      document.documentElement.setAttribute("data-theme", changeTheme);
    }
  });