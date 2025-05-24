package Day_16_DSA_Impact;

public class Stack_implementetion {
    int[] arr;
    int idx = -1;
    Stack_implementetion(){
        arr = new int[5];
    }
    Stack_implementetion(int size){
        arr = new int[size];
    }

    public void push(int ele){
        try {
            if(isFull()){
                throw new Exception("Stack OverFlow");
            }
        }catch (Exception e){
            System.out.println(e);
        }
        arr[++idx] = ele;
    }

    public int pop(){
        try {
            if (isEmpty()){
                throw  new Exception("Stack UnderFlow");
            }

        }catch (Exception e){
            System.out.println(e);
        }
        int remove = arr[idx];
        idx--;
        return remove;
    }
    public int peek(){
        if (idx == -1){
            System.out.println("Stack is empty");
            return -1;
        }
        return arr[idx];
    }

    public int size(){
        return idx+1;
    }

    public boolean isEmpty(){
        return idx == -1;
    }

    public boolean isFull(){
        return idx == arr.length-1;
    }
    public void display(){
        for (int i = 0; i <= idx; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }


}
