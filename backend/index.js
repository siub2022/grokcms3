const express = require('express');
const cors = require('cors');

const app = express();
const PORT = process.env.PORT || 3000;

// Middleware
app.use(cors()); // Enables cross-origin requests
app.use(express.json()); // Parses JSON request bodies

// Routes
app.get('/', (req, res) => {
    res.send('Backend is working!');
});

// Start Server
app.listen(PORT, () => {
    console.log(`Server running on port ${PORT}`);
});
