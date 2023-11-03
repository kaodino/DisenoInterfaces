package ej1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class UsersDataBase {
    private HashMap<String, String> userCredentials = new HashMap<>();
    private String dataFilePath = "user_data.txt"; // Nombre del archivo donde se guardarán los datos

    public void addUserCredentials(String username, String password) {
        userCredentials.put(username, password);
        saveDataToFile();
    }

    public boolean checkUserCredentials(String username, String password) {
    	loadDataFromFile();
        return userCredentials.containsKey(username) && userCredentials.get(username).equals(password);
    }

    public void loadDataFromFile() {
        try (BufferedReader reader = new BufferedReader(new FileReader(dataFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                if (parts.length == 2) {
                    userCredentials.put(parts[0], parts[1]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void saveDataToFile() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(dataFilePath))) {
            for (String username : userCredentials.keySet()) {
                String password = userCredentials.get(username);
                writer.write(username + ":" + password);
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
