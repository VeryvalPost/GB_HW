package OOP2;

/*

Домашнее задание на закрепление :

1)Создайте три класса: Человек, Кот, Робот, которые не наследуются от одного класса но есть общий класс родитель.
Эти классы должны уметь бегать и прыгать, все также с выводом информации о действии в консоль.
2) Создайте два класса: беговая дорожка и стена, при прохождении через которые, участники
должны выполнять соответствующие действия (бежать или прыгать), результат выполнения
печатаем в консоль (успешно пробежал, не смог пробежать и т.д.). У препятствий есть длина
(для дорожки) или высота (для стены), а участников ограничения на бег и прыжки.
3) Создайте два массива: с участниками и препятствиями, и заставьте всех участников пройти
этот набор препятствий. Если участник не смог пройти одно из препятствий, то дальше по
списку он препятствий не идет.


 */


import OOP2.Creations.Cat;
import OOP2.Creations.EntityClass;
import OOP2.Creations.Human;
import OOP2.Creations.Robot;
import OOP2.Material.RunningTrack;
import OOP2.Material.Wall;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        Human vasiliy = new Human("vasiliy",1.84, 32000);
        Human alena = new Human("alena",1.62,22000);

        Cat chubais = new Cat("chubais", 0.8, 10000);

        Robot iRobot = new Robot("iRobot",0.0,15000);
        Robot r2d2 = new Robot("r2d2",0.0,3500);

        EntityClass[] entityClasses = {vasiliy,alena,chubais,iRobot,r2d2};
        Object[] materials = {new RunningTrack(3000),
                new RunningTrack(10000),
                new Wall(1.10),
                new RunningTrack(15000),
                new Wall(1.8)
        };

        tasks(entityClasses,materials);

    }

    public static void tasks (EntityClass[] entityClasses, Object[] materials){
        HashMap <EntityClass, ArrayList<Boolean>> results = new HashMap<>();

        //Заполняю таблицу рзультатов участниками
        for (EntityClass entity: entityClasses){
            results.put(entity, new ArrayList<>());
        }

        for (EntityClass entity: entityClasses
             ) {
            for (Object obj: materials
                 ) {
                if (obj.getClass().getName().equals(RunningTrack.class.getName())){
                    ArrayList<Boolean> tempArr = results.get(entity);
                    tempArr.add(entity.run(((RunningTrack) obj).length));
                    results.replace(entity,tempArr);
            } else if (obj.getClass().getName().equals(Wall.class.getName())){
                    ArrayList<Boolean> tempArr = results.get(entity);
                    tempArr.add(entity.jump(((Wall) obj).height));
                    results.replace(entity,tempArr);
                }
            }
        }
        ArrayList<EntityClass> winners = new ArrayList<>();
        for (EntityClass entity: entityClasses){
            if (!results.get(entity).contains(false)){

                if (!winners.contains(entity)){
                winners.add(entity);
            }
            }


        System.out.println(winners);
        }



    }



   }