import ru.netology.domain.FormDate;
import ru.netology.domain.Post;

public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Алексей";
        post.passport = "2345 №675849";
        post.patronymic = "Анатольевич";
        post.phone = "+7(987)957-57-57";
        post.surname = "Козлов";
        post.subscription = true;
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 5;
        post.birthday.year = 1994;
    }
}
