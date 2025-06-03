// backend/db.js - PostgreSQL Configuration
const { Pool } = require('pg');
require('dotenv').config();

// Configure database connection
const pool = new Pool({
  connectionString: process.env.DATABASE_URL || 'postgres://postgres:postgres@localhost:5432/grokcms3_dev',
  ssl: process.env.DATABASE_URL ? { rejectUnauthorized: false } : false
});

// Test the connection
pool.query('SELECT NOW()', (err, res) => {
  if (err) {
    console.error('❌ Database connection error:', err