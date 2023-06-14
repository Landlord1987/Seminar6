package org.example.SingleResponsibilityPrinciple;

/**
 * Класс расчета заработной платы
 */
public class CalculateSalary {
    private int baseSalary;

    /**
     * Конструктор класса рассчета заработной платы
     * @param baseSalary заработная плата до вычета налогов
     */
    public CalculateSalary(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public int calculateNetSalary() {
        int tax = (int) (baseSalary * 0.25);//calculate in otherway
        return baseSalary - tax;
    }
}
