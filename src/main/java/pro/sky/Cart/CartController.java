package pro.sky.Cart;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/order")
public class CartController {
    CartService cartService;

    public CartController(CartService cartService){
        this.cartService = cartService;
    }

    @GetMapping("/add")
    public ResponseEntity add(@RequestParam("id") Integer id){
        return cartService.add(id);
    }

    @GetMapping("/get")
    public ResponseEntity get(){
        return cartService.get();
    }
}
