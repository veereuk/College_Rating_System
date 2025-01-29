function fetchData() {
    fetch('http://localhost:8080/api/data', {
        method: 'GET',
    })
        .then(response => {
            if (!response.ok) {
                throw new Error('Network response was not ok ' + response.statusText);
            }
            return response.text(); // Parse response as text
        })
        .then(data => {
            console.log('GET Response:', data); // Handle the response data
        })
        .catch(error => {
            console.error('There has been a problem with your GET operation:', error);
        });
}



