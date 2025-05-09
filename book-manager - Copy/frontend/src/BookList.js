import React from "react";

const BookList = ({ books, onEdit, onDelete }) => {
  return (
    <div className="book-list">
      {books.length === 0 && <p>No books found.</p>}
      {books.map((book) => (
        <div key={book.id} className="book-card">
          <h3>{book.title}</h3>
          <p>by {book.author}</p>
          <div className="actions">
            <button onClick={() => onEdit(book)}>Edit</button>
            <button onClick={() => onDelete(book.id)} className="delete">
              Delete
            </button>
          </div>
        </div>
      ))}
    </div>
  );
};

export default BookList;
