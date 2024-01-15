import java.io.Serializable;
import java.math.BigDecimal;

public class Product implements Serializable {

    private String productNumber;
    private String name;
    private long stockCount;
    private BigDecimal price;
    public String getName() {
      return name;
    }
    public long getStockCount() {
      return stockCount;
    }
    public String getProductNumber() {
      return productNumber;
    }

}
