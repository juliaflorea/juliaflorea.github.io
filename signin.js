const signinForm = document.getElementById("signin-form");
const errorMsg = document.getElementById("error-msg");
const successMsg = document.getElementById("success-msg");
const btnSubmit = document.getElementById("btn-submit");

btnSubmit.addEventListener("click", (e) => {
  e.preventDefault();
  const email = signinForm.email.value;
  const password = signinForm.password.value;

  if (email === "test@gmail.com" && password === "test123") {
    successMsg.classList.remove("visually-hidden");
    errorMsg.classList.add("visually-hidden");
  } else {
    successMsg.classList.add("visually-hidden");
    errorMsg.classList.remove("visually-hidden");
  }
});
