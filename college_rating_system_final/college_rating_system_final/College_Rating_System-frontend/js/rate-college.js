document.getElementById('rating-form').addEventListener('submit', async (e) => {
    e.preventDefault();

    const collegeName = document.getElementById('college-name').textContent;
    const coursesRating = document.getElementById('courses-rating').value;
    const placementsRating = document.getElementById('placements-rating').value;
    const facultyRating = document.getElementById('faculty-rating').value;
    const infrastructureRating = document.getElementById('infrastructure-rating').value;
    const feedback = document.getElementById('feedback').value;

    try {
        const response = await fetch('http://localhost:8080/api/ratings', {
            method: 'POST',
            headers: { 'Content-Type': 'application/json' },
            body: JSON.stringify({
                collegeName,
                coursesRating,
                placementsRating,
                facultyRating,
                infrastructureRating,
                feedback,
            }),
        });

        if (response.ok) {
            alert('Thank you for your rating!');
        } else {
            alert('Failed to submit rating. Please try again.');
        }
    } catch (error) {
        console.error('Error:', error);
        alert('An error occurred. Please try again later.');
    }
});
