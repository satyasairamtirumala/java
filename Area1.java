class Area1{
    int l,b,h;
    public Area1(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }
    public Area1(int l,int b){
        this.l=l;
        this.b=b;
    }
    public void res(){
       System.out.println(this.l*this.b*this.h);
    }
}