class numberisSrtong{
    public static void main(String[] args) {
        int number = 10;
        int count = 0;
        for(int i=1; i<=number; i++){
            if(i%5==0 || i%7==0){
                count++;
            }
        }
        System.out.println(count);
    }
}