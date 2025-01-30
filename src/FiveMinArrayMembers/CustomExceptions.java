package FiveMinArrayMembers;

public class CustomExceptions {
    public static class ArrayIsNullException extends Exception {
        public ArrayIsNullException() {
            super(ErrorMessages.ARRAY_IS_NULL);
        }
    }

    public static class InvalidElementValueException extends Exception {
        public InvalidElementValueException() {
            super(ErrorMessages.INVALID_ELEMENT_VALUE);
        }
    }

    public static class ArraySizeException extends Exception {
        public ArraySizeException() {
            super(ErrorMessages.ARRAY_SIZE_EXCEPTION);
        }
    }
}
