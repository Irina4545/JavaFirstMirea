package ru.mirea.task25;

public class Bonuses extends OptionDecorator{
    public Bonuses(Service service){
        super(service,1000,"Акционерная безопасность" );
    }
}
