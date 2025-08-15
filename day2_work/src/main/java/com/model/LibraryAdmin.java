package com.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Map;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryAdmin {
    private Map<String, String> books;
    private List< User> users;
    public void check()
    {
        for (User user : users)
        {
            System.out.println(user.getUsername() + "可以借阅：" + books.get(user.getCard()));
        }
    }
}
