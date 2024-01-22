function searchFunction() {
    let input = document.getElementById('searchBar').value;
    input = input.toLowerCase();
    let x = document.getElementsByClassName('items');
  
    for (i = 0; i < x.length; i++) {
      if (!x[i].innerHTML.toLowerCase().includes(input)) {
        x[i].style.display = 'none';
      } else {
        x[i].style.display = 'list-item';
      }
    }
  
    // Create a new tag with the search input
    let tag = document.createElement('span');
    tag.textContent = input;
    document.getElementById('tagContainer').appendChild(tag);
  }
  