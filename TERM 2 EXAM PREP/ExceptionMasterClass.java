import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * JAVA EXCEPTIONS MASTER GUIDE
 * Covers:
 * - What are exceptions
 * - Checked vs Unchecked exceptions
 * - try-catch-finally blocks
 * - throw vs throws
 * - Custom exceptions
 * - Exception best practices
 */
public class ExceptionMasterClass {

    public static void main(String[] args) {
        // =================================================================
        // 1. BASIC EXCEPTION HANDLING (try-catch)
        // =================================================================
        System.out.println("\n=== Basic Exception Handling ===");

        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }

        // =================================================================
        // 2. MULTIPLE CATCH BLOCKS
        // =================================================================
        System.out.println("\n=== Multiple Catch Blocks ===");

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);  // ArrayIndexOutOfBoundsException
            divide(10, 0);                  // ArithmeticException
        } catch (ArithmeticException e) {
            System.out.println("Math error: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic error: " + e.getMessage());
        }

        // =================================================================
        // 3. FINALLY BLOCK
        // =================================================================
        System.out.println("\n=== Finally Block ===");

        try {
            String fileName = "nonexistent.txt";
            readFile(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            System.out.println("This always executes, regardless of exceptions");
        }

        // =================================================================
        // 4. CHECKED vs UNCHECKED EXCEPTIONS
        // =================================================================
        System.out.println("\n=== Checked vs Unchecked Exceptions ===");

        // Unchecked exception (RuntimeException - doesn't need declaration)
        try {
            throw new RuntimeException("This is unchecked");
        } catch (RuntimeException e) {
            System.out.println("Caught unchecked: " + e.getMessage());
        }

        // Checked exception (must be declared or handled)
        try {
            throwCheckedException();
        } catch (IOException e) {
            System.out.println("Caught checked: " + e.getMessage());
        }

        // =================================================================
        // 5. THROW vs THROWS
        // =================================================================
        System.out.println("\n=== Throw vs Throws ===");

        try {
            validateAge(15);
        } catch (InvalidAgeException e) {
            System.out.println("Age validation failed: " + e.getMessage());
        }

        // =================================================================
        // 6. CUSTOM EXCEPTIONS
        // =================================================================
        System.out.println("\n=== Custom Exceptions ===");

        try {
            processPayment(-100);
        } catch (PaymentException e) {
            System.out.println("Payment error: " + e.getMessage());
            System.out.println("Error code: " + e.getErrorCode());
        }

        // =================================================================
        // 7. TRY-WITH-RESOURCES (AutoCloseable)
        // =================================================================
        System.out.println("\n=== Try-With-Resources ===");

        try (DatabaseConnection db = new DatabaseConnection()) {
            db.connect();
            db.query("SELECT * FROM users");
        } catch (SQLException e) {
            System.out.println("Database error: " + e.getMessage());
        }  // db.close() automatically called

        System.out.println("\n=== Exception Handling Complete ===");
    }

    // =====================================================================
    // SUPPORTING METHODS FOR DEMONSTRATIONS
    // =====================================================================

    /** Demonstrates basic exception */
    private static int divide(int a, int b) {
        return a / b;  // Throws ArithmeticException if b = 0
    }

    /** Demonstrates checked exception */
    private static void readFile(String filename) throws FileNotFoundException {
        if (!filename.equals("valid.txt")) {
            throw new FileNotFoundException("File not found: " + filename);
        }
    }

    /** Demonstrates 'throws' declaration */
    private static void throwCheckedException() throws IOException {
        throw new IOException("This is a checked exception");
    }

    /** Demonstrates 'throw' with validation */
    private static void validateAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18+");
        }
    }

    /** Demonstrates custom exception */
    private static void processPayment(double amount) throws PaymentException {
        if (amount <= 0) {
            throw new PaymentException("Invalid payment amount", 400);
        }
        System.out.println("Processing payment: $" + amount);
    }

    // =====================================================================
    // CUSTOM EXCEPTION CLASSES
    // =====================================================================

    /** Custom checked exception */
    static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    /** Custom exception with additional fields */
    static class PaymentException extends Exception {
        private final int errorCode;

        public PaymentException(String message, int errorCode) {
            super(message);
            this.errorCode = errorCode;
        }

        public int getErrorCode() {
            return errorCode;
        }
    }

    // =====================================================================
    // AUTO-CLOSEABLE RESOURCE DEMO
    // =====================================================================

    static class DatabaseConnection implements AutoCloseable {
        public void connect() {
            System.out.println("Database connected");
        }

        public void query(String sql) throws SQLException {
            System.out.println("Executing: " + sql);
            throw new SQLException("Syntax error in query");
        }

        @Override
        public void close() {
            System.out.println("Database connection closed");
        }
    }
}