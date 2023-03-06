package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Contract {

    private Integer number;
    private LocalDate date;
    private Double value;

    private List<Installment> installmentList = new ArrayList<>();

    public Contract() {
    }

    public Contract(Integer number, LocalDate date, Double value) {
        this.number = number;
        this.date = date;
        this.value = value;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Double getValue() {
        return value;
    }

    public void setValue(Double value) {
        this.value = value;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }
}
