package app.model;


import app.entitites.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Model {
    private static Model instance = new Model();
    private List<User> model;


    private Model() {
        model = new ArrayList<>();
    }

    public static Model getInstance() {
        return instance;
    }

    public void add(User user) {
        model.add(user);
    }

    public String list2() {
        return "NamedName";
    }

    ;

    public List<String> list() {
        return model.stream()
                .map(User::getName)
                .collect(Collectors.toList());
    }
}
