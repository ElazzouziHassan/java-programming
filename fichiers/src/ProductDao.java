import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class ProductDao {

    public static void save(List<Product> products, String filePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) {
            for (Product product : products) {
                writer.println(product.getProductNumber() + "#" +
                        product.getName() + "#" +
                        product.getStockCount() + "#" +
                        product.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
