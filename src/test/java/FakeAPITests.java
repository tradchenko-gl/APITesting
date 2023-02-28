import config.FakeAPIEndPoints;
import config.FakeAPIConfig;
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class FakeAPITests extends FakeAPIConfig {

    String productBodyJSON = "{\n" +
            "  \"title\": \"New one\",\n" +
            "  \"price\": 109.95,\n" +
            "  \"description\": \"Added on 23-02-2023\",\n" +
            "  \"category\": \"test\",\n" +
            "  \"image\": \"https://fakestoreapi.com/img/81fPKd-2AYL._AC_SL1500_.jpg\"\n" +
            "}";

    @Test
    public void getAllProducts() {
        given()
        .when()
                .get(FakeAPIEndPoints.ALL_PRODUCTS)
        .then();
    }

    @Test
    public void addNewProductByJSON() {

        given()
                .body(productBodyJSON)
        .when()
                .post(FakeAPIEndPoints.ALL_PRODUCTS)
        .then();
    }

    @Test
    public void updateProduct() {
        given()
                .body(productBodyJSON)
        .when()
                .put("products/9")
        .then();
    }

    @Test
    public void deleteProduct() {

    }


}
