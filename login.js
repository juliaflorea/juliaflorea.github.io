const loginForm = document.getElementById("login-form");
const errorMsg = document.getElementById("error-msg");
const successMsg = document.getElementById("success-msg");
const btnSubmit = document.getElementById("btn-submit");

btnSubmit.addEventListener("click", (e) => {
  e.preventDefault();
  const email = loginForm.email.value;
  const password = loginForm.password.value;

  if (this.email.value.trim() === "" && this.password.value.trim() === "") {
    successMsg.classList.add("visually-hidden");
    errorMsg.classList.remove("visually-hidden");
  } else {
    successMsg.classList.remove("visually-hidden");
    errorMsg.classList.add("visually-hidden");
  }
});
