package ru.geekbrains.architecture;

public class DocumentExecutorMediator {
    private Resolution resolution;


//    public Resolution setResolution(Resolution resolution){
//        return resolution;
//    }

    public void documentationAgree(Document document,Executor executor, Executor director, Resolution resolution){
        System.out.println ("Документ №" + document.getDocumentNumber () + " от " + document.getDocumentDate () + " Исполнитель: " + executor.getSurname () + " Резолюция " + resolution + " " + director.getSurname ());

    }


}
