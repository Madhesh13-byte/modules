const express = require('express');
const router = express.Router();
const db = require('../db');

// Get all books
router.get('/', (req, res) => {
  db.all('SELECT * FROM books', [], (err, rows) => {
    if (err) return res.status(500).json(err);
    res.json(rows);
  });
});

// Add new book
router.post('/', (req, res) => {
  const { title, author } = req.body;
  db.run('INSERT INTO books (title, author) VALUES (?, ?)', [title, author], function(err) {
    if (err) return res.status(500).json(err);
    res.json({ id: this.lastID });
  });
});

// Update book
router.put('/:id', (req, res) => {
  const { title, author } = req.body;
  db.run('UPDATE books SET title = ?, author = ? WHERE id = ?', [title, author, req.params.id], function(err) {
    if (err) return res.status(500).json(err);
    res.json({ updated: this.changes });
  });
});

// Delete book
router.delete('/:id', (req, res) => {
  db.run('DELETE FROM books WHERE id = ?', [req.params.id], function(err) {
    if (err) return res.status(500).json(err);
    res.json({ deleted: this.changes });
  });
});

module.exports = router;
