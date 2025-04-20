require('dotenv').config();
const express = require('express');
const mysql = require('mysql2');
const nodemailer = require('nodemailer');
const bodyParser = require('body-parser');
const cors = require('cors');

const app = express();
app.use(cors());
app.use(bodyParser.json());
app.use(express.urlencoded({ extended: true }));

// MySQL Config
const db = mysql.createConnection({
  host: process.env.DB_HOST,
  user: process.env.DB_USER,
  password: process.env.DB_PASS,
  database: process.env.DB_NAME
});
db.connect(err => {
  if (err) {
    console.error('MySQL connection failed:', err);
  } else {
    console.log('✅ MySQL connected');
  }
});

// Nodemailer Config
const transporter = nodemailer.createTransport({
  service: 'gmail',
  auth: {
    user: process.env.EMAIL_USER,
    pass: process.env.EMAIL_PASS
  }
});

// POST Route for Contact Form
app.post('/api/contact', (req, res) => {
  const { name, email, phone, subject, message } = req.body;

  const sql = `INSERT INTO contact_messages (name, email, phone, subject, message) VALUES (?, ?, ?, ?, ?)`;

  db.query(sql, [name, email, phone, subject, message], async (err, result) => {
    if (err) {
      console.error('❌ DB Error:', err);
      return res.status(500).send('Database error');
    }

    const mailOptions = {
      from: process.env.EMAIL_USER,
      to: process.env.EMAIL_TO,
      subject: `📬 New Contact: ${subject}`,
      html: `
        <h3>New Contact Message</h3>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Phone:</strong> ${phone}</p>
        <p><strong>Subject:</strong> ${subject}</p>
        <p><strong>Message:</strong><br>${message}</p>
      `
    };

    try {
      await transporter.sendMail(mailOptions);
      res.status(200).send('Message saved and email sent!');
    } catch (err) {
      console.error('❌ Email Error:', err);
      res.status(500).send('Saved to DB, but failed to send email');
    }
  });
});

console.log("Connected as:", process.env.DB_USER); // should print: root
const PORT = process.env.PORT || 3000;
app.listen(PORT, () => {
  console.log(`🚀 Server running on http://localhost:${PORT}`);
});