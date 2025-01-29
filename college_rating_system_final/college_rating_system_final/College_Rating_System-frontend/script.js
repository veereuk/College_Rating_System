// JavaScript to handle adding new websites dynamically
const form = document.getElementById('website-form');
const websiteList = document.getElementById('website-list');

form.addEventListener('submit', (event) => {
  event.preventDefault(); // Prevent form submission

  // Get input values
  const name = document.getElementById('website-name').value;
  const link = document.getElementById('website-link').value;

  // Check if both name and link are provided
  if (name && link) {
    // Create a new list item
    const listItem = document.createElement('li');
    listItem.innerHTML = `<a href="${link}" target="_blank">${name}</a>`;

    // Add to the list
    websiteList.appendChild(listItem);

    // Clear form inputs
    form.reset();
  } else {
    alert('Please provide both website name and URL');
  }
});


function toggleAboutSection() {
  // Get the About dropdown content
  var aboutDropdownContent = document.getElementById("about-dropdown-content");

  // Toggle the visibility
  if (aboutDropdownContent.style.display === "none") {
      aboutDropdownContent.style.display = "block"; // Show the About section
  } else {
      aboutDropdownContent.style.display = "none"; // Hide the About section
  }
}



// Example: Add hover effect to buttons

const exploreButtons = document.querySelectorAll('.explore-btn');

exploreButtons.forEach(button => {
  button.addEventListener('mouseover', () => {
    button.style.backgroundColor = '#3e8e41';
  });

  button.addEventListener('mouseout', () => {
    button.style.backgroundColor = '#4CAF50';
  });
});


// Search Functionality
document.getElementById('search-colleges').addEventListener('input', function() {
  const query = this.value.toLowerCase();
  const colleges = document.querySelectorAll('.college-card');
  
  colleges.forEach(college => {
      const collegeName = college.querySelector('h2').textContent.toLowerCase();
      if (collegeName.includes(query)) {
          college.style.display = 'block';
      } else {
          college.style.display = 'none';
      }
  });
});

// View Details Function
function viewDetails(collegeName) {
  alert(`You clicked on ${collegeName}. Add functionality here to redirect to the college's details page.`);
}
