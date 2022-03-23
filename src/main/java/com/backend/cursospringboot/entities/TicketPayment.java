package com.backend.cursospringboot.entities;

import com.backend.cursospringboot.enums.StatusPayment;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.util.Date;

@Entity
@Table(name="tb_ticket_payment")
public class TicketPayment extends Payment {
    public static final Long serialVersionUID = 1L;
    private Date vencimento;
    private Date pagamento;

    public TicketPayment(){}

    public TicketPayment(Long id, StatusPayment status, Order order, Date vencimento, Date pagamento) {
        super(id, status, order);
        this.vencimento = vencimento;
        this.pagamento = pagamento;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

    public Date getPagamento() {
        return pagamento;
    }

    public void setPagamento(Date pagamento) {
        this.pagamento = pagamento;
    }


}
