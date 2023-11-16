import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static BufferedReader reader;
    static Iterator<String> inputLineBufferIterator;

    public static void main(String[] args) {
        reader = new BufferedReader(new InputStreamReader(System.in));
        inputLineBufferIterator = Arrays.stream((new String[0])).iterator();
        solutionA();
    }

    static short readShort() {
        if (inputLineBufferIterator.hasNext()) {
            return Short.parseShort(inputLineBufferIterator.next());
        } else {
            try {
                inputLineBufferIterator = Arrays.stream(reader.readLine().split(" ")).iterator();
                return readShort();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return 0;
            }
        }
    }

    static int readInt() {
        if (inputLineBufferIterator.hasNext()) {
            return Integer.parseInt(inputLineBufferIterator.next());
        } else {
            try {
                inputLineBufferIterator = Arrays.stream(reader.readLine().split(" ")).iterator();
                return readInt();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return 0;
            }
        }
    }

    static long readLong() {
        if (inputLineBufferIterator.hasNext()) {
            return Long.parseLong(inputLineBufferIterator.next());
        } else {
            try {
                inputLineBufferIterator = Arrays.stream(reader.readLine().split(" ")).iterator();
                return readLong();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return 0;
            }
        }
    }

    static String readString() {
        if (inputLineBufferIterator.hasNext()) {
            return inputLineBufferIterator.next();
        } else {
            try {
                inputLineBufferIterator = Arrays.stream(reader.readLine().split(" ")).iterator();
                return readString();
            } catch (IOException exception) {
                System.out.println(exception.getMessage());
                return "";
            }
        }
    }

    static String stringify(Object[] output) {
        StringBuilder stringBuilder = new StringBuilder();
        for (Object obj : output) {
            if (obj instanceof String) {
                stringBuilder.append((String) obj);
            } else if (obj instanceof Short || obj instanceof Integer || obj instanceof Long) {
                stringBuilder.append(obj);
            } else if (obj instanceof short[] arr) {
                for (short v : arr) stringBuilder.append(v).append(' ');
            } else if (obj instanceof int[] arr) {
                for (int v : arr) stringBuilder.append(v).append(' ');
            } else if (obj instanceof long[] arr) {
                for (long v : arr) stringBuilder.append(v).append(' ');
            } else if (obj instanceof String[] arr) {
                for (String v : arr) stringBuilder.append(v).append(' ');
            }
            stringBuilder.append('\n');
        }
        return stringBuilder.toString();
    }

    static void solutionA() {
    }

    static void solutionB() {
    }

    static void solutionC() {
    }

    static void solutionD() {
    }

    static void solutionE() {
    }
}
