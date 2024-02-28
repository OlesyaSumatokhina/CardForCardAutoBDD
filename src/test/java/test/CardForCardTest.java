package test;
import com.codeborne.selenide.Condition;
import data.DataHelper;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CardForCardTest {
    @BeforeEach
     void setup(){
        open("http://localhost:9999/");
          }
    @Test
    public void shouldAuthUser(){
        var authInfo = DataHelper.getAuthInfo();
        $("[data-test-id=login] input").setValue(authInfo.getLogin());
        $("[data-test-id=password] input").setValue(authInfo.getPassword());
        $("[data-test-id=action-login] input").click();
        $("[data-test-id=code] input").shouldBe(Condition.visible);
    }
}

