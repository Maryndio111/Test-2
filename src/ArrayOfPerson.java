public class ArrayOfPerson  {
    private Person[] array;
    private int size=0;  // сколько уже элементов в массиве

    public ArrayOfPerson(Person[] array) {
        this.array = array;
        size=array.length;
    }

    public ArrayOfPerson(){
        array = new Person[16];
    }

    public ArrayOfPerson(int capacity){
        array = new Person[capacity];
    }

    // метод добавления пользователя
    public void addPerson(Person person){
        if (size >= array.length) {    // если количество элементов больше размера массива
            enlargeArray();           // увеличиваем размер массива
        }
        array[size] = person;         // сохраняем персон в ячейку с индексом size
        size++;                       // увеличиваем size, что бы следующий раз писать в следующую ячейку
        // size - индекс текущей ячейки в которую пишем данные
    }

    // метод увеличения массива
    private void enlargeArray(){
        Person[] newArray = new Person[array.length*2];  // создаем новый большой массив

        for (int i=0; i<array.length; i++){  // перекидываем элементы из старого в новый массив
            newArray[i] = array[i];
        }

        array=newArray;      // теперь основной массив - новый массив, класс будет работать с новым массивом

    }

    public String toString(){
        String result="";
        for (int i=0; i< size; i++){
            Person person = array[i];
            result+= person + System.lineSeparator();
        }
        return result;
    }

    public String toStringByName(String name){
        String result="";
        for (int i=0; i< size; i++){
            Person person = array[i];
            if (person.getName().equalsIgnoreCase(name)) {
                result += person + System.lineSeparator();
            }
        }
        return result;
    }





}

