public class day1 {
    public static void main(String[] args) {
       /*  String intelligent = "boy";
        if(intelligent.equals("boy")){
            System.out.println("left");
        }
        else{
            System.out.println("right");
        }*/
    // #day2
   /*  int numbers[] = {5,6,0,9,8,6};
    for(int i =0;i<=5;i++){
        System.out.println(numbers[i]);
    }*/
   /* int arr[] = {5,6,0,9,8,6};
    int count = 0;
    for(int i = 0; i<arr.length;i++){
        if(arr[i]==6){
            count = count + 1;


        }

    }
    System.out.println(count);*/
    int arr[] = {5,6,9,8,6};
    int count = 0;
    for(int i = 0; i<arr.length;i++){
        if(arr[i]%3==0){
            count = count + 1;


        }

    }
    System.out.println(count);
    