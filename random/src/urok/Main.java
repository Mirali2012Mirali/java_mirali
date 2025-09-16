package urok;


    public class Main {
        public static void main(String[] args) {
            Library outer = new Library("Научная библиотека");
            Library.Book inner = outer.new Book("1984");
            inner.printInfo();

            Computer.Info.about();
        }
    }

    class Library {
        private String name;

        public Library(String name) {
            this.name = name;
        }

        public class Book {
            private String title;

            public Book(String title) {
                this.title = title;
            }

            public void printInfo() {
                System.out.println("Книга: " + title + ", находится в библиотеке: " + name);
            }
        }
    }


    class Computer {
        public static class Info {
            public static void about() {
                System.out.println("Это информация о классе Computer.");
            }
        }
    }