package ej1;

public class AppData {
    private static userAccDataBase userDataBase;

    public static userAccDataBase getUserDataBase() {
        if (userDataBase == null) {
            // Inicializa userDataBase si es nulo
            userDataBase = new userAccDataBase("nombre_de_usuario"); // Reemplaza con el nombre de usuario adecuado
        }
        return userDataBase;
    }
}

