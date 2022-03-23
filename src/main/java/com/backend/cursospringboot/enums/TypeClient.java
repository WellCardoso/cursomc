package com.backend.cursospringboot.enums;

public enum TypeClient {
    PESSOAFISICA(0, "Pessoa Fisica"),
    PESSOAJURIDIC(1, "Pessoa Juridica");

    private Integer cod;
    private String description;

    private TypeClient(Integer cod, String description) {
        this.cod = cod;
        this.description = description;
    }

    public Integer getCod() {
        return cod;
    }

    public String getDescription() {
        return description;
    }

    public static TypeClient toEnum(Integer cod) throws IllegalAccessException {
        if(cod == null){
            return null;
        }

        for(TypeClient x : TypeClient.values()){
            if(cod.equals(x.getCod())){
                return x;
            }
        }

        throw new IllegalAccessException("Id invalid" + cod );
    }
}
