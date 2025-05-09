import React, { useState, useEffect } from "react";
import BookForm from "./BookForm";
import BookList from "./BookList";
import "./index.css";

const App = () => {
  const [books, setBooks] = useState([]);
  const [editBook, setEditBook] = useState(null);

  const fetchBooks = async () => {
    const res = await fetch("http://localhost:5000/api/books");
    const data = await res.json();
    setBooks(data);
  };

  useEffect(() => {
    fetchBooks();
  }, []);

  const addBook = async (book) => {
    await fetch("http://localhost:5000/api/books", {
      method: "POST",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(book),
    });
    fetchBooks();
  };

  const updateBook = async (book) => {
    await fetch(`http://localhost:5000/api/books/${book.id}`, {
      method: "PUT",
      headers: { "Content-Type": "application/json" },
      body: JSON.stringify(book),
    });
    setEditBook(null);
    fetchBooks();
  };

  const deleteBook = async (id) => {
    await fetch(`http://localhost:5000/api/books/${id}`, { method: "DELETE" });
    fetchBooks();
  };

  return (
    <div className="container">
      <h1>Book Manager</h1>
      <BookForm onSubmit={editBook ? updateBook : addBook} editBook={editBook} />
      <BookList books={books} onEdit={setEditBook} onDelete={deleteBook} />
    </div>
  );
};

export default App;
