package ru.netology.data;


import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ScalarHandler;

import java.sql.DriverManager;
import java.sql.SQLException;

public class SqlHelper {
    private static String url = System.getProperty("db.url");
    private static String user = System.getProperty("db.user");
    private static String password = System.getProperty("db.password");


    public static String getPaymentStatus() {
        var codesSQL = "SELECT status FROM payment_entity;";
        return getData(codesSQL);
    }

    public static String getCreditStatus() {
        var codesSQL = "SELECT status FROM credit_request_entity;";
        return getData(codesSQL);
    }

    public static String getOrderCount() {
        Long count = null;
        var codesSQL = " SELECT COUNT(*) FROM order_entity;";
        var runner = new QueryRunner();
        try (var conn = DriverManager.getConnection(url, user, password)) {
            count = runner.query(conn, codesSQL, new ScalarHandler<>());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return Long.toString(count);

    }

    private static String getData(String query) {
        String data = "";
        var runner = new QueryRunner();
        try (var conn = DriverManager.getConnection(url, user, password)) {
            data = runner.query(conn, query, new ScalarHandler<>());
        } catch (SQLException sqlException) {
            sqlException.printStackTrace();
        }
        return data;

    }

    public static void cleanDataBase() {

        var runner = new QueryRunner();

        try (var conn = DriverManager.getConnection(url, user, password)) {

            runner.update(conn, "DELETE FROM credit_request_entity");
            runner.update(conn, "DELETE FROM order_entity");
            runner.update(conn, "DELETE FROM payment_entity");
        } catch (Exception sqlException) {
            System.out.println("SQL exception in cleanDataBase");
        }
    }
}
