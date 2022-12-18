package com.boot;

import com.boot.entity.Address;
import com.boot.entity.User;
import com.boot.repository.UserRepositoryImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {



        ApplicationContext context =SpringApplication.run(BootApplication.class, args);
        User user1 = new User();
        Address address = new Address();
        address.setCity("tehran");
        address.setProvince("yousef");
        address.setNumber(100);
        user1.setAddress(address);
        user1.setEmail("kia@shamaii");
        user1.setUsername("kia");

        var repo = context.getBean(UserRepositoryImp.class);
        repo.add(user1);


    }

}
