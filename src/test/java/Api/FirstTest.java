package Api;

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

public class FirstTest extends ApiBaseTest {

    @Test(description = "Создать доску")
    public void createBoardTest() {
        RestAssured
                .given().baseUri("https://api.trello.com")
                .log().all()
                .when()
                .post("/1/boards/?name=Board1&key=e7eba18e39782f6cb4e52d75f43e10bd&token=ATTA2f6f40b5c67f9e22939bf06d4f8f68a21ebc4a10bef263b5bac287396dc80184103BA47B")
                .then().assertThat()
                .log().body()
                .statusCode(200);
    }

    @Test(description = "Создать тэг для доски")
    public void createTagForBoardTest() {
        RestAssured
                .given().baseUri("https://api.trello.com")
                .log().all()
                .when()
                .post("/1/boards/{id}/idTags?value=5abbe4b7ddc1b351ef961414&key=e7eba18e39782f6cb4e52d75f43e10bd&token=ATTA2f6f40b5c67f9e22939bf06d4f8f68a21ebc4a10bef263b5bac287396dc80184103BA47B")
                .then().assertThat()
                .log().body()
                .statusCode(200);
    }

    @Test(description = "Создать карточку")
    public void createCardTest() {
        RestAssured
                .given().baseUri("https://api.trello.com")
                .header("Accept", "application/json")
                .log().all()
                .when()
                .post("/1/cards?idList=5abbe4b7ddc1b351ef961414&key=e7eba18e39782f6cb4e52d75f43e10bd&token=ATTA2f6f40b5c67f9e22939bf06d4f8f68a21ebc4a10bef263b5bac287396dc80184103BA47B")
                .then().assertThat()
                .log().body()
                .statusCode(200);
    }
}
