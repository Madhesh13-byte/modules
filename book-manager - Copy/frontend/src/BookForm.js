import React, { useEffect, useState } from "react";

const BookForm = ({ onSubmit, editBook }) => {
  const [title, setTitle] = useState("");
  const [author, setAuthor] = useState("");

  useEffect(() => {
    if (editBook) {
      setTitle(editBook.title);
      setAuthor(editBook.author);
    }
  }, [editBook]);

  const handleSubmit = (e) => {
    e.preventDefault();
    if (!title || !author) return;
    onSubmit({ id: editBook?.id, title, author });
    setTitle("");
    setAuthor("");
  };

  return (
    <form className="form" onSubmit={handleSubmit}>
      <input
        type="text"
        placeholder="Book Title"
        value={title}
        onChange={(e) => setTitle(e.target.value)}
      />
      <input
        type="text"
        placeholder="Author"
        value={author}
        onChange={(e) => setAuthor(e.target.value)}
      />
      <button type="submit">{editBook ? "Update" : "Add"} Book</button>
    </form>
  );
};

export default BookForm;
