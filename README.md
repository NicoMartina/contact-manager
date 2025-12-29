# Contact Manager

A simple command-line contact management system built in Java that allows users to store, view, search, and delete contacts with persistent data storage.

## Features

- **Add Contact**: Create new contacts with first name, last name, and phone number
- **View All Contacts**: Display a list of all saved contacts
- **Search Contact**: Find contacts by first name
- **Delete Contact**: Remove contacts from the system
- **Data Persistence**: Contacts are automatically saved to a file and loaded when the program starts

## How to Run

1. Make sure you have Java installed on your system
2. Clone this repository
3. Navigate to the project directory
4. Compile the Java files:
```
   javac Main.java Contact.java ContactManager.java
```
5. Run the program:
```
   java Main
```

## Usage

When you run the program, you'll see a menu with 5 options:
```
=== Contact Manager ===
1. Add Contact
2. View All Contacts
3. Search Contact
4. Delete Contact
5. Exit
```

Simply enter the number corresponding to the action you want to perform.

## Technologies Used

- Java
- File I/O for data persistence

## What I Learned

- Object-oriented programming with multiple classes
- ArrayList for data management
- File I/O (reading and writing to files)
- User input handling with Scanner
- Exception handling with try-catch blocks
- Git version control

## Future Improvements

- Add ability to edit existing contacts
- Search by phone number or last name
- Export contacts to CSV format
- Add email field to contacts
```

---

**To add this to your GitHub:**

1. In your project folder, create a new file called `README.md`
2. Copy-paste the above content
3. Customize it if you want (add/remove sections)
4. Save it
5. Git commands:
```
   git add README.md
   git commit -m "Add README documentation"
   git push
