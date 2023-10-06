package Lab3.src;

import java.util.*;

public class Hall {
    private ArrayList<ArrayList<Boolean>> _seats = new ArrayList<ArrayList<Boolean>>(); //кресла (занято/не занято)
    private ArrayList<Movie> _movieSessions = new ArrayList<Movie>();
    private Queue<Movie> _movies = new Queue<Movie>() {
        @Override
        public boolean add(Movie movie) {
            return false;
        }

        @Override
        public boolean offer(Movie movie) {
            return false;
        }

        @Override
        public Movie remove() {
            return null;
        }

        @Override
        public Movie poll() {
            return null;
        }

        @Override
        public Movie element() {
            return null;
        }

        @Override
        public Movie peek() {
            return null;
        }

        @Override
        public int size() {
            return 0;
        }

        @Override
        public boolean isEmpty() {
            return false;
        }

        @Override
        public boolean contains(Object o) {
            return false;
        }

        @Override
        public Iterator<Movie> iterator() {
            return null;
        }

        @Override
        public Object[] toArray() {
            return new Object[0];
        }

        @Override
        public <T> T[] toArray(T[] a) {
            return null;
        }

        @Override
        public boolean remove(Object o) {
            return false;
        }

        @Override
        public boolean containsAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean addAll(Collection<? extends Movie> c) {
            return false;
        }

        @Override
        public boolean removeAll(Collection<?> c) {
            return false;
        }

        @Override
        public boolean retainAll(Collection<?> c) {
            return false;
        }

        @Override
        public void clear() {

        }
    };

    public static void createMovie(){
        System.out.println("------Movie Creation-------");

    };
    public static void printInfo(){}; //печатает план зала с  указанием занятых и свободных мест
    public static void createSeatsConfiguration(){};
}
