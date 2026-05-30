class Exponent{
    public static void main(String[] args) {
        int x=4,m=3;
        int val=1;
        while(m>0){
            val=x*val;
            m--;
        }
        System.out.println(val);
    }
}