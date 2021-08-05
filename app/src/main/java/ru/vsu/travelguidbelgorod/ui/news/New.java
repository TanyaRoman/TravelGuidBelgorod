package ru.vsu.travelguidbelgorod.ui.news;

import ru.vsu.travelguidbelgorod.R;

public class New {
    private String title;
    private String text;
    private int photo;
    private String address;

    public static New[] news = {
            new New("День города", "Фестиваль по случаю празднования дня города...", R.drawable.ic_home_black_24dp, "ret"),
            new New("Футбол", "Гороская футбольныя команда победила в чемпионате России", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Крименал", "Вечнось - это наверное тык долно", R.drawable.ic_home_black_24dp, "try"),
            new New("Дети", "А моря о краев наполнялись по каплям", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Ротдом", "И сраслись по пещинкам камни", R.drawable.ic_home_black_24dp, "try"),
            new New("Лес", "Вечность - это наврно так долго", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Экология", "Я незамтна на дереве в листьях", R.drawable.ic_home_black_24dp, "try"),
            new New("Цвета", "И каждый рожен шелкопряом", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Актеры", "Мне бы только  мой крошечный вклад внести", R.drawable.ic_home_black_24dp, "try"),
            new New("Ниндзя", "За короткую жизнь сплести хотя бы ниточку шелка", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Ветер", "Ктото в паутину религий попался", R.drawable.ic_home_black_24dp, "try"),
            new New("Вечность", "Кото раскрывает секрет мирозания", R.drawable.ic_dashboard_black_24dp, "try"),
            new New("Шелкопряд", "Я не у мею чего то еще, я маленький червячек", R.drawable.ic_home_black_24dp, "try"),
    };

    private New(String title, String text, int photo, String address){
        this.title = title;
        this.text = text;
        this.photo = photo;
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getPhoto() {
        return photo;
    }
}
