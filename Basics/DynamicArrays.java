package Basics;

public class DynamicArrays 
{
    //creating array
    int[] arr;      //creating array as abstract datatype
    int capacity;
    int size = 0;
    DynamicArrays(int capacity)
    {
        arr = new int[capacity];
        this.capacity = capacity;
    }

    //inserting element
    boolean insert(int index,int element)
    {
        if(index < 0 || index > size)
        {
            return false;
        }
        if(size >= capacity)
        {
            resize();
            return true;
        }
        else
        {
            for(int i = size; i > index; i--)
            {
                arr[i] = arr[i-1];
            }
            arr[index] = element;
            size++;
            return true;
        }
    }
    void display()
    {
        for(int i = 0; i < size ; i++)
        {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    //get element

    int get(int index)
    {
        if(index < 0 || index >= size)
        {
            return -1;
        }
        return arr[index];
    }

    //set element
    void set(int index, int element)
    {
        if(index < 0 || index >= size)
        {
            System.out.println("Invalid index");
        }
        arr[index] = element;
    }

    //searching element
    int search(int target)
    {
        for(int i = 0; i <= size; i++)
        {
            if(arr[i] == target)
            {
                return i;
            }
        }
        return -1;
    }

    //deleting element
    boolean delete(int index)
    {
        if(index < 0 || index >= size) System.out.println("Can't delete element at this index");
        for(int i = index; i < size - 1; i++)
        {
            arr[i] = arr[i + 1];
        }
        size--;
        return true;
    }

    //resizing array
    void resize()
    {
        capacity = capacity * 2;
        int[] newarr = new int[capacity];
        for(int i = 0; i < size ; i++)
        {
            newarr[i] = arr[i];
        }
        arr = newarr;
    }
    public static void main(String[] args) 
    {
        DynamicArrays arr1 = new DynamicArrays(5);
        arr1.insert(0, 1);
        arr1.insert(1, 2);
        arr1.insert(2, 3);
        arr1.insert(3, 4);
        arr1.insert(4, 5);
        arr1.insert(5, 6);
        //System.out.println(arr1.get(2));
        // arr1.set(3, 4);
        arr1.display();
        System.out.println("Target element found at index :" +arr1.search(5));
        System.out.println(arr1.delete(0));
        arr1.display();
    }
}
