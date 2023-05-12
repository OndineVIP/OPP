package ru.netology;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Иван";
        post.surname = "Иванов";
        post.patronymic = "Иванович";
        post.phone = "+7 (999)-999-99-99";
        post.passport = "4444 № 44444444";
        post.subscription = Boolean.valueOf("true");


        post.birthday = new FormDate();
        post.day = "13";
        post.month = "6";
        post.year = "1999";
    }

    {

    }
}





