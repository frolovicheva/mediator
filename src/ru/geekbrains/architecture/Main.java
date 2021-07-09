package ru.geekbrains.architecture;

public class Main {

    public static void main(String[] args) {
        Document contract1 = new Contract (1L, "Rosneft", "125/2", "12/03/2021", 100.00);
        Executor executor = new Manager (10L, "Ivanov", "Ivan");
        Executor director = new Director (05L, "Petrov", "Viktor");
        DocumentExecutorMediator mediator = new DocumentExecutorMediator ();
        mediator.documentationAgree (contract1, executor, director, Resolution.PODPISANO);
    }
}
