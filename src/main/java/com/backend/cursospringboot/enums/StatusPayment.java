package com.backend.cursospringboot.enums;

public enum StatusPayment {
    PENDENTE(1, "Pendente"),
    QUITADO(2, "Quitado"),
    CANCELADO(3, "Cancelado");

    private Integer cod;
    private String description;

    private StatusPayment(Integer cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static StatusPayment toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null){
            return null;
        }

        for(StatusPayment x : StatusPayment.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalAccessException("Id invalid" + cod );
    }
}
