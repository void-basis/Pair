import java.util.Objects;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Pair<Integer, String> pair = Pair.of(1, "hello");
        Integer i = pair.getFirst(); // 1
        String s = pair.getSecond(); // "hello"
        Pair<Integer, String> pair2 = Pair.of(1, "hello");
        boolean mustBeTrue = pair.equals(pair2); // true!
        boolean mustAlsoBeTrue = pair.hashCode() == pair2.hashCode(); // true!
    }
}
        class Pair <T,V> {
            private T value;
            private  V value2;

            private Pair(T value, V value2) {
                this.value = value;
                this.value2 = value2;
            }
            public T getFirst() {
                return value;
            }
            public V getSecond() {
                return value2;
            }
            public static <T, V> Pair <T, V> of(T value, V value2) {
                return new Pair<>(value, value2);
            }

            @Override
            public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Pair<?, ?> pair = (Pair<?, ?>) o;
                return Objects.equals(value, pair.value) && Objects.equals(value2, pair.value2);
            }

            @Override
            public int hashCode() {
                return Objects.hash(value, value2);
            }
        }
