import phonebook.PhoneBook;
import phonebook.Record;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        // Додавання записів
        phoneBook.add(new Record("John Doe", "123-456-7890") {
            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        });
        phoneBook.add(new Record("Jane Smith", "987-654-3210") {
            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        });
        phoneBook.add(new Record("John Doe", "555-555-5555") {
            @Override
            public boolean equals(Object obj) {
                return false;
            }

            @Override
            public int hashCode() {
                return 0;
            }

            @Override
            public String toString() {
                return null;
            }
        });

        // Пошук за іменем (повертає перший знайдений запис)
        Record foundRecord = phoneBook.find("John Doe");
        if (foundRecord != null) {
            System.out.println("Знайдено: " + foundRecord.getName() + " - " + foundRecord.getPhoneNumber());
        } else {
            System.out.println("Запис не знайдено.");
        }

        // Пошук всіх записів за іменем
        List<Record> foundRecords = phoneBook.findAll("John Doe");
        if (foundRecords != null) {
            System.out.println("Знайдено записів: " + foundRecords.size());
            for (Record record : foundRecords) {
                System.out.println(record.getName() + " - " + record.getPhoneNumber());
            }
        } else {
            System.out.println("Записів не знайдено.");
        }
    }
}
    //У цьому прикладі ми створюємо PhoneBook, додаємо записи, а потім виконуємо пошук записів за іменем, повертаючи перший знайдений запис або всі знайдені записи за допомогою методів find та findAll.





