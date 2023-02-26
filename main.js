var slider_img = document.querySelector(".slider-img");
var images = [
  "subSection2_1.png",
  "subSection2_2.png",
  "subSection2_3.png",
  "subSection2_4.png",
  "subSection2_5.png",
];
var i = 0;

function prev() {
  if (i <= 0) i = images.length;
  i--;
  return setImg();
}

function next() {
  if (i >= images.length - 1) i = -1;
  i++;
  return setImg();
}

function setImg() {
  return slider_img.setAttribute("src", "images/" + images[i]);
}
