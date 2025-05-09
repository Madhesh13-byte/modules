
# 📚 Book Manager App

A full-stack Book Manager app using **React** (frontend), **Node.js + Express** (backend), and **SQLite** (database).

---

## 📁 Project Structure

```
book-manager/
├── backend/
│   └── server.js          # Express server with SQLite database
├── frontend/
│   ├── public/
│   │   └── index.html     # HTML entry point for React
│   └── src/
│       ├── App.js         # Main React component
│       ├── BookForm.js    # Form to add/edit books
│       ├── BookList.js    # Displays book list
│       └── index.css      # Styling for the app
```

---

## 🚀 Setup Instructions

### 1. Clone or unzip the project

```bash
git clone <your-repo-url>
cd book-manager
```

### 2. Backend Setup

```bash
cd backend
npm init -y
npm install express sqlite3 cors body-parser
node server.js
```

Server runs at: `http://localhost:5000`

### 3. Frontend Setup

```bash
cd ../frontend
npx create-react-app .
# Replace generated /src and /public with files from this repo
npm install
npm start
```

Frontend runs at: `http://localhost:3000`

---

## 🧠 Features

- ✅ View all books
- ➕ Add a book
- ✏️ Update a book
- 🗑️ Delete a book

---

## 📸 Screenshots

_Add screenshots here if needed._

---

## 🛠 Tech Stack

- **Frontend:** React
- **Backend:** Node.js, Express.js
- **Database:** SQLite

---

## 📄 License

This project is open source and free to use.

---

> Created for learning and practice.
