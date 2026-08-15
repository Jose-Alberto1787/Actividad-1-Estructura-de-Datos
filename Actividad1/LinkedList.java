public class LinkedList{
    Node head;
    LinkedList(){
        head=null;
    }
    public void insertAtBeggining(String value){
        Node newNode = new Node(value);
        newNode.next= head;
        head = newNode;
    }
    public void insertAtEnd(String data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next= newNode;
    }
    public void display(){
        Node current= head;
        if(head==null){
            System.out.println("Lista Vacia");
        }
        while(current!= null){
            System.out.println(current.data);
            current = current.next;
        }
    }
    public int size(){
        Node current = head;
        int cuenta = 0;
        while(current!= null){
            current = current.next;
            cuenta +=1;
        }
        return cuenta;
    }
    public void delete(String value){
        if (head==null){
            System.out.println("Lista Vacia");
            return;
        }
        if (head.data.equals(value)){
            head=head.next;
            return;
        }
        Node current = head;
        while(current.next!=null){
            if(current.next.data == value){
                current.next= current.next.next;
                return;
            }
            current=current.next;
        }
    }
    public boolean search(String value){
        Node current = head;
        if (head==null){
            System.out.println("Lista Vacia");
            return false;
        }
        while(current!=null){
            if(current.data.equals(value)){
                return true;
            }
            current = current.next;
        }
        return false;
    }
    public void insertAt(int index, String data){
        if( head== null){
            return;
        }
        Node newNode = new Node(data);
        Node current = head;
        if(index==0){
            insertAtBeggining(data);
            return;
        }
        if(index<0){
            return;
        }
        if(index>size()){
            insertAtEnd(data);
            return;
        }
        for( int i=0; i<index - 1; i++){
            current=current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }
    public void deleteIndex(int index){
        Node current = head;
        if(head==null){
        System.out.println("Lista Vacia");
            return;
        }
        if (index==0){
            head=head.next;
            return;
        }
        for( int i=0; i<index - 1; i++){
            if(current==null){
                return;
            }
            current=current.next;
        }
        current.next=current.next.next;
    }
    public String get(int index){
        Node current=head;
        String respuesta;
        if(head==null){
            return respuesta= "Lista vacia";
        }
        if (index==0){
            return head.data;
        }
        if (index<0){
            return respuesta="No se pueden valores negativos";
        }
        for( int i=0; i<index; i++){
            if(current==null){
                return respuesta="valor fuera de los mismas";
            }
            current=current.next;
        }
        return current.data;
    }
}