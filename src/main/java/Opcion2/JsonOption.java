package Opcion2;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;


import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonOption {

    private String nombre;
    private String apellido;
    private String email;
    private String genero;
    private String ciudad;
    private String fecha_nacimiento;
    private String peso;
    private String direccion_ip;

    JSONParser jsonParser = new JSONParser();

        try (FileReader reader = new FileReader("personas.json"))
    {
        //Leer archivo JSON
        Object obj = jsonParser.parse(reader);

        JSONArray personasList = (JSONArray) obj;
        System.out.println(personasList);

        //Iteracion del arreglo JSON
        personasList.forEach( emp -> parsePersonaObject( (JSONObject) emp ) );

    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    } catch (ParseException e) {
        e.printStackTrace();
    }

    private static void parsePersonaObject(JSONObject persona)
    {
        //Obtener a persona de la lista
        JSONObject personaObject = (JSONObject) persona.get("persona");

        String nombre = (String) personaObject.get("nombre");
        System.out.println(nombre);

        String apellido = (String) personaObject.get("apellido");
        System.out.println(apellido);

        String email = (String) personaObject.get("email");
        System.out.println(email);

        String genero = (String) personaObject.get("genero");
        System.out.println(genero);

        String ciudad = (String) personaObject.get("ciudad");
        System.out.println(ciudad);

        String fecha_nacimiento = (String) personaObject.get("fecha_nacimiento");
        System.out.println(fecha_nacimiento);

        String peso = (String) personaObject.get("peso");
        System.out.println(peso);

        String direccion_ip = (String) personaObject.get("direccion_ip");
        System.out.println(direccion_ip);
    }

    private static void addPersonaObject(JSONObject persona, String nombre, String apellido, String email, String ciudad, String fecha_nacimiento, String peso, String direccion_ip)
    {
        JSONObject jo = new JSONObject;
        Collection<JSONObject> items = new ArrayList<JSONObject>();
        
        
        jo.add("nombre", nombre);
        jo.add("apellido", apellido);
        jo.add("email", genero);
        jo.add("ciudad", ciudad);
        jo.add("fecha_nacimiento", fecha_nacimiento);
        jo.add("peso", nombre);
        jo.add("direccion_ip", nombre);

        





    }






}

