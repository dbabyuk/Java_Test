package framework;

import java.io.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

class PrepareDB {

    void main() throws IOException {

        String[] table_list = {"users", "contact", "address", "claim", "company", "education", "job",
                "pdf_resume", "person", "photo", "requirement", "resume", "roles",
                "skill", "user_role", "vacancy", "vacancy_resume",
                "verificationtoken"};
// Establishing connection to the DB and erasing old data
        try (Connection connection = DriverManager.getConnection("jdbc:postgresql://localhost:5432/rabotyNET", "postgres", "postgres")) {
            Statement statement = connection.createStatement();
            for (String i : table_list) {
                final String commandForDeleteData = "TRUNCATE" + " public." + i + " CASCADE";
                statement.execute(commandForDeleteData);
            }
// Updating the data read from backup.sql file
            File file = new File("C:/Users/Dima/IdeaProjects/Java_Test/src/framework/backup.sql");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String st;
            while ((st = br.readLine()) != null) {
                statement.executeUpdate(st);
            }
            System.out.println("DataBase has been updated");
        }
        catch(SQLException e){
                System.out.println("Connection failure.");
                e.printStackTrace();
            }
    }
}
