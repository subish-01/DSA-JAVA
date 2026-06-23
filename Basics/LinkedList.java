package Basics;


class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}
public class LinkedList 
{
    Node head = null;

    void insertBegining(int data)
    {
        Node newnode = new Node(data);
        newnode.next = head;
        head = newnode;
    }

    void insertEnd(int data)
    {
        if(head == null) insertBegining(data);
        Node newnode = new Node(data);
        Node temp = head;
        while(temp.next != null)
        {
            temp = temp.next;
        }
        temp.next = newnode;
    }
    void insertIndex(int index,int data)
    {
        if(index < 0) System.out.println("Invalid index");
        Node newnode = new Node(data);
        Node temp = head;
        for(int i = 0; i < index - 1; i++)
        {
            temp = temp.next;
        }
        newnode.next = temp.next;
        temp.next = newnode;
    }
    void deleteIndex(int index)
    {
        Node temp = head;
        if(index < 0) System.out.println("Invalid index to delete ");

        if(index == 0){head = head.next; return;}

        for(int i = 0; i < index - 1; i++)
        {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    void search(int data)
    {
        Node temp = head;
        while(temp != null)
        {
            if(temp.data == data)
            {
                System.out.println("Found");
                return;
            }
            temp = temp.next;
        }
        System.out.println("Not found");
    }


    void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");
    }
    public static void main(String[] args) 
    {
        LinkedList list = new LinkedList();
        list.insertBegining(1); //1
        list.insertBegining(3); // 3  1
        list.insertBegining(5); // 5  3  1
        list.insertEnd(7);      // 5  3  1  7
        list.insertIndex(2,5);  // 5   3   5  1  7
        list.deleteIndex(2);
        list.search(1);

        list.display();
    }
}
