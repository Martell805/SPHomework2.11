package pro.sky.Cart;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.SessionScope;

import java.util.HashSet;
import java.util.Set;

@Service
@SessionScope
public class CartService {
    Set<Integer> cart = new HashSet<>();

    public ResponseEntity add(Integer id){
        cart.add(id);
        return new ResponseEntity<>(id + " was added", HttpStatus.OK);
    }

    public ResponseEntity get(){
        return new ResponseEntity<>(cart, HttpStatus.OK);
    }
}
