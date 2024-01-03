package com.junitexemple.junit_exemple.entities;

public class Number {

    private Integer value;

    //Contrutor vazio para fazer o test com valor null
    public Number(){

    }

    //Construtor que inicializa o value
    public Number(Integer value){
        super();
        this.value = value;
    }

    public boolean isEven(){
        if (value % 2 == 0){
            return true;
        }
        return false;
    }

    public boolean isOdd(){
        if (!isEven()){
            return true;
        }
        return false;
    }

    public Integer getValue() {
        return value;
    }

}
