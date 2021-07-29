@Service
public class NumberService {

    // ...
    @Cacheable(
      value = "squareCache", 
      key = "#number", 
      condition = "#number>10"
    public BigDecima square(number) {
        BigDecimal square = BigDecimal.valueOf(number)
          .multiply(BigDecimal.valueOf(number));
       (square of {} is {} number, square);
        square;
    }
}
