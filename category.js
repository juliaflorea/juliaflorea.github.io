let categories = [];

// We use local storage in order not to lose the categories submitted by the user
// when refreshing the page
// Retrieve categories from local storage if available
const storedCategories = localStorage.getItem("categories");
if (storedCategories) {
  categories = JSON.parse(storedCategories);
  displayCategories();
}

function addCategory() {
  const categoryName = document.getElementById("category-name").value.trim();
  const categoryType = document.getElementById("category-type").value;
  const categoryIcon = document.getElementById("category-icon").value.trim();
  const form = document.getElementById("form");
  if (!categoryName || !categoryIcon) {
    // Display error message if categoryName or categoryIcon is empty
    const errorMessage = document.createElement("p");
    errorMessage.innerText = "Please fill out all required fields.";
    form.appendChild(errorMessage);
    return;
  }

  const category = {
    name: categoryName,
    type: categoryType,
    icon: categoryIcon,
  };

  categories.push(category);

  // Save categories to local storage
  localStorage.setItem("categories", JSON.stringify(categories));

  displayCategories();
}

function displayCategories() {
  const categoryBoard = document.getElementById("category-board");
  categoryBoard.innerHTML = "";

  categories.forEach((category, index) => {
    const categoryItem = document.createElement("li");
    const categoryIcon = document.createElement("span");
    const categoryName = document.createElement("span");
    const deleteButton = document.createElement("button");

    categoryIcon.innerText = category.icon;
    categoryName.innerText = category.name;
    deleteButton.innerText = "Delete";
    deleteButton.onclick = () => deleteCategory(index);

    categoryItem.appendChild(categoryIcon);
    categoryItem.appendChild(categoryName);
    categoryItem.appendChild(deleteButton);

    categoryBoard.appendChild(categoryItem);
  });
}

function deleteCategory(index) {
  categories.splice(index, 1);
  displayCategories();
}
