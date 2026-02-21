package lucascarvy.com.github.booksystem.controller;

import lucascarvy.com.github.booksystem.model.entity.Order;
import lucascarvy.com.github.booksystem.model.service.OrderService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/orders")
public class OrderController {


    private final OrderService orderService;

    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @PostMapping("/create")
    public String createOrder() {
        return orderService.createOrder();
    }

    @PostMapping("/additemorder")
    public String addItemToOrder(String bookId, int quantity, String orderId){
        return orderService.addItemToOrder(bookId, quantity, orderId);
    }

}
