
package com.javarush.task.task13.task1328;

public class Robot extends AbstractRobot {


    public Robot(String name) {
        setName(name);
    }

    public String getName() {
        return name;
    }

    @Override
    public BodyPart attack() {
        return super.attack();
    }

    @Override
    public BodyPart defense() {
        return super.defense();
    }
}