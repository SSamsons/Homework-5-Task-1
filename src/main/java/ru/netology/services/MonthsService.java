package ru.netology.services;

public class MonthsService {

    public int calcMoney(int income, int expence, int trashold) {
        int count = 0; // счетчик месяцев отдыха
        int money = 0;
        for (int month = 0; month < 12; month++) {
            if (money >= trashold) {
                count++;
                money = (money - expence) / 3;
            } else {
                money = money + income - expence;
            }
        }
        return count;
    }
}