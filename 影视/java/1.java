Public class arr {
public static void main(String[] args){
int[] marks = new int[3];
marks[0]=97;
marks[1]=92;
marks[2]=90;
marks[3]=38;
int max = 0;
for(int i = 0 ; i<marks.length;i++){
    if( marks[i] > max){
        int max = marks[i];   
    }else{
        system.out.println("最大值为：" max)
    }
}
system.out.println(max)

