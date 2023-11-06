package ej1;

import java.io.*;
import java.util.Map;
import java.util.HashMap;

public class userAccDataBase {
    private HashMap<String, Account> userAccounts = new HashMap<>();
    private String username;
    private String filename;
    private String webSite;
    private static LogInView logIn = new LogInView();
    private static userAccDataBase instance;

    public static userAccDataBase getInstance() {
        if (instance == null) {
        	String username = logIn.getEnteredUsername();
            instance = new userAccDataBase(username); // Reemplaza con el nombre de usuario adecuado
        }
        return instance;
    }

    public userAccDataBase(String username) {
        super();
        this.username = username;
        this.filename = username + "_accounts.txt"; // Genera el nombre del archivo
    }
    
    // Constructor sobrecargado que recibe una lista de cuentas, nombre de usuario, nombre de archivo y un sitio web
    public userAccDataBase(HashMap<String, Account> userAccounts, String username, String filename, String webSite) {
        super();
        this.userAccounts = userAccounts;
        this.username = username;
        this.filename = filename;
        this.webSite = webSite;
    }

    // Métodos para obtener y establecer el sitio web
    public String getWebSite() {
        return webSite;
    }

    public void setWebSite(String webSite) {
        this.webSite = webSite;
    }

    // Constructor sobrecargado que recibe un nombre de usuario y un nombre de archivo
    public userAccDataBase(String username, String filename) {
        this.username = username;
        this.filename = filename;

        // Cargar cuentas desde el archivo al crear una instancia de userAccDataBase
        loadAccounts();
    }

    public void addAccount(String webSite, String username, String password) {
        Account account = new Account(webSite, username, password);
        userAccounts.put(webSite, account);
        saveAccounts(); // Guardar cuentas después de agregar una nueva
    }

    public boolean checkAccount(String webSite, String username, String password) {
        if (userAccounts.containsKey(webSite)) {
            Account account = userAccounts.get(webSite);
            return account.getUsername().equals(username) && account.getPassword().equals(password);
        }
        return false;
    }

    public Map<String, Account> getAccounts() {
        return userAccounts;
    }

    public String getUsername() {
        return username;
    }

    private void loadAccounts() {
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                // Supongamos que el archivo tiene un formato "webSite,username,password"
                String[] parts = line.split(",");
                if (parts.length == 3) {
                    String webSite = parts[0];
                    String username = parts[1];
                    String password = parts[2];
                    userAccounts.put(webSite, new Account(webSite, username, password));
                }
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de errores al leer el archivo
            e.printStackTrace();
        }
    }

    private void saveAccounts() {
        File file = new File(filename);

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
            for (Account account : userAccounts.values()) {
                bw.write(account.getWebSite() + "," + account.getUsername() + "," + account.getPassword());
                bw.newLine(); // Agregar una nueva línea para separar las cuentas
            }
        } catch (IOException e) {
            // Manejo de excepciones en caso de errores al escribir en el archivo
            e.printStackTrace();
        }
    }
}
