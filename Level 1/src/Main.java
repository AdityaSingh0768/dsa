import java.io.*;
//import java.util.*;
public class Main {
    public static class Node{// this class h as only data members
        int data;
        Node next;
    }
    public static class LinkedList{  //this class has data memebr = different function like display, add last
        Node head;
        Node tail;
        int size;
        //0(1)
       public int size(){
             return size;
        }
        //0(1)
        void addlast(int val){ // time complexity is O(1)
             Node node= new Node();
             node.data=val;
             node.next=null;
             if(size==0){
                 tail=head=node;
             }else{
                 tail.next=node;
                 tail=node;
             }
                size++;

        }
          //0(n)
       public void display(){// we are usig loooop so timr comlexity is O(n)
             if(size==0){
                 return;
             }
       for (Node temp=this.head;temp!=null;temp=temp.next){
           System.out.print(temp.data+" ");
       }
        System.out.println();
        }
         //0(1)
        public int getfirst(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }
            else
                return head.data ;
        }
        //0(1)
        public int getlast(){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }
            else
                return tail.data ;
        }
        //0(n)
        public int getAt(int indx ){
            if(size==0){
                System.out.println("list is empty");
                return -1;
            }else if (indx<0||indx>=size){
                System.out.println("invalidarguments");
                return -1;
            }
            else {
                 Node temp=head;
                for (int i = 0;i<indx;i++) {
                    temp=temp.next;
                }
                return  temp.data;
            }
        }
        //0(1)
       public void addfirst(int val) {
           Node node = new Node();
           node.data = val;
           if (size == 0) {
               head = tail = node;
           } else {
               node.next = head;
               head = node;
           }
       }

       public void addAt(int indx,int val){
              if(indx==0){
                  addfirst(val);
              }else if ( indx==size){
                  addlast(val);
              }else if ( indx<0||indx>size){
                  System.out.println("invalid arguments");
              }else {
                  Node nm1=head;
                  for ( int i=0;i<indx-1;i++){
                      nm1=nm1.next;
                  }
                  Node  np1=nm1.next;
                  Node node = new Node();
                  node.data=val;
                  node.next=np1;
                  nm1.next=node;
                  size++;
              }
       }

    }
    public static void main(String[] args) throws Exception {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        LinkedList list= new LinkedList();
        list.addlast(100);
        list.addlast(4567);
        list.addlast(35);
        list.addfirst(20);
        int indx = Integer.parseInt(br.readLine()); // input no string me tha to usse no me convert krne ke liye integer.parseint use kiya
        int val= Integer.parseInt(br.readLine());
        list.addAt( indx,val);
      list.display();
//         int f=list.getAt(indx);
//         System.out.println(f);
//        String str = br.readLine();
//        while(str.equals("quit")==false){
//            if(str.startsWith("addlast")){
//                int val= Integer.parseInt(str.split(" ")[1]);
//                list.addlast(val);
//            } else if (str.startsWith("size")){
//                System.out.println(list.size());
//            } else if (str.startsWith("display")){
//                list.display();
//            }
//            str=br.readLine();
        }
    }


