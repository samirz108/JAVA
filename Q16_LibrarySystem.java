abstract class LibraryMember {
    private String name;
    private int borrowedBooks;

    public LibraryMember(String name, int borrowedBooks) {
        if (borrowedBooks < 0) throw new IllegalArgumentException("Invalid borrowed books");
        this.name = name;
        this.borrowedBooks = borrowedBooks;
    }

    public String getName() { return name; }
    public int getBorrowedBooks() { return borrowedBooks; }

    public abstract void borrowBook();
}

class Student extends LibraryMember {
    public Student(String name, int borrowedBooks) { super(name, borrowedBooks); }
    public void borrowBook() {
        if (getBorrowedBooks() >= 3) throw new IllegalArgumentException("Student borrowing limit reached");
        System.out.println(getName() + " borrowed a book");
    }
}

class Teacher extends LibraryMember {
    public Teacher(String name, int borrowedBooks) { super(name, borrowedBooks); }
    public void borrowBook() {
        if (getBorrowedBooks() >= 5) throw new IllegalArgumentException("Teacher borrowing limit reached");
        System.out.println(getName() + " borrowed a book");
    }
}

class Guest extends LibraryMember {
    public Guest(String name, int borrowedBooks) { super(name, borrowedBooks); }
    public void borrowBook() {
        if (getBorrowedBooks() >= 1) throw new IllegalArgumentException("Guest borrowing limit reached");
        System.out.println(getName() + " borrowed a book");
    }
}

public class Q16_LibrarySystem {
    public static void main(String[] args) {
        try {
            LibraryMember m1 = new Student("Ram", 2);
            LibraryMember m2 = new Teacher("Sita", 4);
            LibraryMember m3 = new Guest("Hari", 0);
            m1.borrowBook();
            m2.borrowBook();
            m3.borrowBook();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
