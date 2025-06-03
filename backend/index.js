const express = require('express'); // Import Express framework
const app = express(); // Initialize Express app

// Define a route
app.get('/', (req, res) => {
    res.send('Backend is working!');
});

// Start the server
app.listen(3000, () => {
    console.log('Server running on port 3000');
});
