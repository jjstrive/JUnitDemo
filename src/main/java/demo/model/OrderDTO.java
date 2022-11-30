package demo.model;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class OrderDTO {
    private Long id;
    private UserDTO buyer;
    private UserDTO seller;
    private Long itemId;
    private Long count;
    private Double money;
}
