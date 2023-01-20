package Homework.JAVA_HW7_OOP;

/**
 * Реализовать, с учетом ООП подхода, приложение Для проведения исследований с
 * генеалогическим древом.
 * Идея: описать некоторое количество компонент, например: модель человека
 * компонента хранения
 * связей и отношений между людьми: родитель, ребёнок - классика, но можно
 * подумать и про отношение,
 * брат, свекровь, сестра и т. д. компонент для проведения исследований
 * дополнительные компоненты,
 * например отвечающие за вывод данных в консоль, загрузку и сохранения в файл,
 * получение\построение отдельных моделей человека Под “проведением
 * исследования” можно понимать
 * получение всех детей выбранного человека.
 * 
 */

class Person {

    private  String name; // Имя

    private String patronymic; // Отчество

    private String surname; // Фамилия

    private String dateOfBirth; // Дата рождения

    Person(String n, String p, String s, String dob)// Создание конструктора (И.О.Ф. ДР)
    {
        this.name = n;
        this.patronymic = p;
        this.surname = s;
        this.dateOfBirth = dob;
    }

    Person(String n, String s, String dob)// Создание конструктора (И.Ф. ДР)
    {
        this.name = n;
        this.patronymic = null;
        this.surname = s;
        this.dateOfBirth = dob;
    }
    Person(String n, String s)// Создание конструктора (И.Ф.)
    {
        this.name = n;
        this.patronymic = null;
        this.surname = s;
        this.dateOfBirth = null;
    }

    Person(String n)// Создание конструктора (И.)
    {
        this.name = n;
        this.patronymic = null;
        this.surname = null;
        this.dateOfBirth = null;
    }

    public String getName() {
        // Метод для доступа к имени
        return name;
    }

    public String getPatronymic() {
        // Метод для доступа к отчеству
        return patronymic;
    }

    public String getSurname() {
        // Метод для доступа к фамилии
        return surname;
    }

    public String getDateOfBirth() {
        // Метод для доступа к дате рождения
        return dateOfBirth;
    }

    public void setName(String name) // Метод для ввода имени
    {
        this.name = name;

    }

    public void setPatronymic(String patronymic) // Метод для ввода отчества
    {
        this.patronymic = patronymic;

    }

    public void setSurname(String surname) // Метод для ввода фамилии
    {
        this.surname = surname;

    }

    public void setDateOfBirth(String dateOfBirth) // Метод для ввода даты рождения
    {
        this.dateOfBirth = dateOfBirth;

    }

    void showPersonData (){
        System.out.print(name+" ");
        if (patronymic!=null) {System.out.print(patronymic+" ");}
        if (surname!=null) {System.out.print(surname+ " ");}
        if (dateOfBirth!=null) {System.out.print(dateOfBirth+ " ");}
        System.out.println("");
    }

}


class Father extends Person{

    private String kinship; // Тип родства

    Father (String k, String n, String p, String s, String dob){
        super(n, p, s, dob);
        this.kinship = k;
    };

    Father ( String n, String p, String s, String dob){
        super(n, p, s, dob);
           
    };

    

    public String getKinship(){
        return kinship;
    }

    public void setKinship(String kinship) {
        this.kinship = kinship;
        
    }

    void showFather() {
        if(kinship!=null)  System.out.print(kinship+" ");
        showPersonData ();
        
    }

}

class FamilyTree extends Father{

    String child1Ki;
    String child1Ne;
    String child1Pa;
    String child1Se;
    String child1DaOB;

    Father child1 =  new Father(child1Ki,child1Ne,child1Pa,child1Se,child1DaOB);

    String child2Ki;
    String child2Ne;
    String child2Pa;
    String child2Se;
    String child2DaOB;

    Father child2 =  new Father(child2Ki,child2Ne,child2Pa,child1Se,child2DaOB);

    String fatherKi;
    String fatherNe;
    String fatherPa;
    String fatherSe;
    String fatherDaOB;

    Father father =  new Father(fatherKi,fatherNe,fatherPa,fatherSe,fatherDaOB);

    String motherKi;
    String motherNe;
    String motherPa;
    String motherSe;
    String motherDaOB;

    Father mother =  new Father(motherKi,motherNe,motherPa,motherSe,motherDaOB);

        
    FamilyTree(String n, String p, String s, String dob,
    String child1K, String child1N,String child1P,String child1S, String child1DOB,
    String child2K, String child2N,String child2P,String child2S, String child2DOB,
    String fatherK, String fatherN,String fatherP,String fatherS, String fatherDOB,
    String motherK, String motherN,String motherP,String motherS, String motherDOB) {
        super(n,p, s, dob);

        child1.setKinship(child1K);
        child1.setName(child1N);
        child1.setPatronymic(child1P);
        child1.setSurname(child1S);
        child1.setDateOfBirth(child1DOB);

        child2.setKinship(child2K);
        child2.setName(child2N);
        child2.setPatronymic(child2P);
        child2.setSurname(child2S);
        child2.setDateOfBirth(child2DOB);

        father.setKinship(fatherK);
        father.setName(fatherN);
        father.setPatronymic(fatherP);
        father.setSurname(fatherS);
        father.setDateOfBirth(fatherDOB);

        mother.setKinship(motherK);
        mother.setName(motherN);
        mother.setPatronymic(motherP);
        mother.setSurname(motherS);
        mother.setDateOfBirth(motherDOB);
        
        
    }
    void showFamily() {
        System.out.println();
        showFather();
        System.out.println("Семья");
        if (child1.getKinship()!=null){child1.showFather();}
        if (child2.getKinship()!=null){child2.showFather();}
        if (father.getKinship()!=null){father.showFather();}
        if (mother.getKinship()!=null){mother.showFather();}
                      
    }
    
    void showChildren() {
        System.out.println();
        showFather();
        System.out.println("Дети");
        if (child1.getKinship()!=null){child1.showFather();}
        if (child2.getKinship()!=null){child2.showFather();}                     
    }

    void showParents() {
        System.out.println();
        showFather();
        System.out.println("Родители");
        if (father.getKinship()!=null){father.showFather();}
        if (mother.getKinship()!=null){mother.showFather();}                     
    }

};

public class Java_HW7_OOP_Example001 {

    public static void main(String[] args) {

        Father man1 = new Father("Артём","Сергеевич","Ермилов", "17.12.1984");
        //man1.showFather();

        FamilyTree man2 = new FamilyTree("Артём","Сергеевич","Ермилов", "17.12.1984",
         "Дочь", "Юлиана","Артёмовна","Ермилова","4.10.2007",
         "Сын","Ярослав",null,"Ермилов","08.07.2009",
         "Отец","Сергей","Геннадьевич","Ермилов","18.03.1960",
         "Мать","Марина","Александровна","Ермилова","02.06.1963");
        man2.showFamily();

        man2.showChildren();
    }

   

}
