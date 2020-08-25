package com.mashibing.dp.abstractfactory;


/**
 * 抽象工厂模式 包含多个抽象类 有一种抽象族的概念 当想要创建一系列对象时可以使用  抽象工厂中包含的各个抽象类可以自由单独扩展
 * */
public abstract class AbastractFactory {
    abstract Food createFood();
    abstract Vehicle createVehicle();
    abstract Weapon createWeapon();
}
