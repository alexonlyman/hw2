package Config;

import org.springframework.core.io.InputStreamResource;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnectionConfig {
    public static Properties loadProperties(String resoureFileName) throws IOException {
        Properties configurations = new Properties();
        InputStream inputStream = ConnectionConfig.class
                .getClassLoader()
                .getResourceAsStream(resoureFileName);
        configurations.load(inputStream);
        if (inputStream != null) {
            inputStream.close();
        }
        return configurations;
    }

    public static Connection getConnection() {
        Properties properties;
        Connection connection;
        try {
            properties = loadProperties("application.properties");
            String user = properties.getProperty("datasourse.username");
            String pass = properties.getProperty("datasourse.password");
            String url = properties.getProperty("datasourse.url=jdbc:postgresql://localhost:5432/skypro;");
            connection = DriverManager.getConnection(user, pass, url);
        } catch (SQLException | IOException e) {
            throw new RuntimeException(e);
        }
        return connection;
    }

}
