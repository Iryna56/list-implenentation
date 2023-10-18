public class MyArrayListHomeWork {
    private Object[] array;
    private int size;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayListHomeWork() {
        array = new Object[DEFAULT_CAPACITY];
        size = 0;
    }

    public int size() {
        return size;
    }

    public void add(int index,int value) {
        if (index < 0 || index > size) {            // если вз\ходной параметр- индекс меньше нуля или меньше чем длина массива
                                                    //  то выбрасываем ошибку
            throw new IndexOutOfBoundsException();
        }
        if (size == array.length) {                  //если размер массива равен длине, то увеличиваем емкость
            expandArray();
        }
        shiftElementsRight(index);                  // сдвигаем элементы, чтобы освободить место под новый элемент
        array[index] = value;
        size++;                                      // увеличиваем длину массива на единицу
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();    // если указанный индекс вне диапазона коллекции, выбрасываем ошибку
        }
        for (int i = index; i < size - 1; i++) {      // сдвигаем элементы влево, чтобы удалить текущий элемент
            array[i] = array[i + 1];
        }
        array[size - 1] = null;                       // удаленному индексу присваиваем null
        size--;                                       // длину коллекции уменьшаем на единицу
    }

    private void expandArray() {                         // увеличение емкости(капасити) массива
        Object[] newArray = new Object[array.length * 2];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }

    private void shiftElementsRight(int index) {       // сдвиг массива влево, чтобы освободить место для нового элемента
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
    }
}
