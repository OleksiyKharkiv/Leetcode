package FiveMinArrayMembers;

public class CustomExceptions {
    public static class ArrayIsNullExceptions extends Exception {
        public ArrayIsNullExceptions(String message) {
            super(message);
        }
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException(String message) {
            super(message);
        }
    }

    public static class ArrayElementTypeException extends Exception {
        public ArrayElementTypeException(String message) {
            super(message);
        }
    }

    public static class DuplicateElementsException extends Exception {
        public DuplicateElementsException(String message) {
            super(message);
        }
    }

    public static class InvalidElementValueException extends Exception {
        public InvalidElementValueException(String message) {
            super(message);
        }
    }
}