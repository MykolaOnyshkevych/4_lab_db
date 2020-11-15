package com.onyshkevych;

import java.sql.SQLException;
import com.onyshkevych.view.MyView;

public class Application {
    public static void main(String[] args) throws SQLException {
        new MyView().show();
    }
}