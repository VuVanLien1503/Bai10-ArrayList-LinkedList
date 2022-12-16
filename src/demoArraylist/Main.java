package demoArraylist;

import demoArraylist.model.Student;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> listArr=new ArrayList<>();



        listArr.add(new Student("Lien",88));
        listArr.add(new Student("Son",85));
        listArr.add(new Student("Vu",89));
        Student st = new Student("dung",90);
        listArr.add(st);
        listArr.remove(st);


        System.out.println(listArr.size());
        listArr.add(3,new Student("Lien1",99));
        listArr.add(new Student("Son1",99));

//        for (Student s:listArr) {
//            if(s.getName().equals("Lien")) {
//                listArr.remove(s);
//            }
//        }

//        for(int i=0; i< listArr.size(); i++){
//            if(listArr.get(i).getName().equals("Lien")) {
//                Student s = listArr.get(i);
//                listArr.remove(s);
//            }
//        }
//        for(Student s:listArr) {
//            System.out.println(s);
//        }




//        listArr.get(0);
//        System.out.println("Last Index Off ");
//        System.out.println(listArr.lastIndexOf(st));
//        System.out.println( listArr.isEmpty());

        System.out.println(listArr.size());

        MyArrayList<Student> listStudent=new MyArrayList<>();

        listStudent.add(new Student("Lien",88));
        listStudent.add(new Student("Son",85));
        listStudent.add(new Student("Vu",89));
        listStudent.add(new Student("dung",90));

        System.out.println(listStudent.size());
        listStudent.add(new Student("ngoc",99),2);
        System.out.println(listStudent.size());
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }

        for(int i=0; i< listStudent.size(); i++){
            if(listStudent.get(i).getName().equals("Lien")) {
                Student s = listStudent.get(i);
                listStudent.remove(s);
            }
        }
        System.out.println("sau khi xoa Name Lien");
        for (int i = 0; i < listStudent.size(); i++) {
            System.out.println(listStudent.get(i));
        }

        int[]arr1=new int[]{1,2,3,4,5};
        int[]arr2=new int[5];
        System.arraycopy(arr1,2,arr2,2,2);
        for (int a :
                arr2) {
            System.out.println(a);
        }

    }


}
