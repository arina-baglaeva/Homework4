//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //1 task
        byte age = 17;
        if (age >=18){
            System.out.println("Если возраст человека равен "+ age +" , то он совершеннолетний");
        }
        else{
            System.out.println(" «Если возраст человека равен "+ age + " , то он не достиг совершеннолетия, нужно немного подождать».");
        }
        //2 task
        byte temp = 15;
        if (temp<5){
            System.out.println("На улице "+temp+" градусов, нужно надеть шапку");
        }else{
            System.out.println("На улице "+temp+" градусов, можно идти без шапки");
        }
        //3 task
        short speed = 70;
        boolean speedMoreThan60 = (speed >60);
        if(speedMoreThan60){
            System.out.println("Если скорость "+speed+" , то придется заплатить штраф.");
        }else{
            System.out.println("Если скорость "+speed+" , то можно ездить спокойно.");
        }
        //4 task
        byte ag = 10;
        if( 2<= ag && ag <=6){
            System.out.println("Если возраст человека равен "+ag+" , то ему нужно ходить в детский сад" );
        }else if (7<=ag && ag <=17){
            System.out.println("Если возраст человека равен "+ag+" , то ему нужно ходить в школу" );
        }else if (18<=ag && ag <=24){
            System.out.println("Если возраст человека равен "+ag+" , то ему нужно ходить в университет" );
        }else if (25<=ag){
            System.out.println("Если возраст человека равен "+ag+" , то ему пора ходить на работу" );
        }
        //5 task
        ag = 17;
        if(ag <=5){
            System.out.println("Если возраст ребенка равен "+ag +", то ему нельзя кататься на аттракционе " );
        }else if (6<=ag && ag <14){
            System.out.println("Если возраст ребенка равен "+ag +", то ему можно кататься на аттракционе в сопровождении" );
        }else if (14<=ag){
            System.out.println("Если возраст ребенка равен "+ag +", то ему можно кататься на аттракционе без сопровождения");
        }
        //6 task
        byte kolPass = 54;
        if (kolPass <60){
            System.out.println("Есть и сидячие, и стоячие места");
        }else if (kolPass >=60 && kolPass <102){
            System.out.println("Есть только стоячие места");
        }else{
            System.out.println("Вагон уже полностью забит.");
        }
        //7 task при условии что все числа различны
        int one =5;
        int two=6;
        int three=7;
        if (one<two){
            if (two<three){
                System.out.println("Three is the biggest");
            }
            else if (two>three) {
                System.out.println("Two is the biggest");
            }
            else{
                System.out.println("Two and Three are equal and the biggest.");
            }
        }
        else if(one>two){
            if (one>three){
                System.out.println("One is the biggest");
            }else if (three> one){
                System.out.println("Three is the biggest");
            }else{
                System.out.println("One and Three are equal and the biggest. ");
            }
        }
        else{
            if (two<three){
                System.out.println("Three is the biggest");
            }
            else if (two>three) {
                System.out.println("Two and one are equal and the biggest");
            }
            else{
                System.out.println("One, Two and Three are equal.");
            }
        }


    }
}