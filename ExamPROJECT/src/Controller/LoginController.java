package Controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import Model.LoginDAOImp;
import Model.Login;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

@RestController
@RequestMapping( "LoginController/do")
public class LoginController {

    @Autowired
    private LoginDAOImp LoginDAOImp;
    Map<String, Object> map = new HashMap<>();
    Login login;
    
    @PostMapping(value = "/index")
    public Callable<ResponseEntity<?>> login(@RequestBody Login log){
        return ()->{
            map.clear();
            login =LoginDAOImp.findusername(null);
            if (login!=null){
                map.put("message","Login successfully");
                map.put("user",login);
                return ResponseEntity.ok(map);
            }
            else {
                map.put("message","Try again later");
                return new ResponseEntity<Object>(map,HttpStatus.BAD_REQUEST);
            }
            
            
        };
    }
}