/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.ollamaimpl;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import org.json.JSONObject;
//Se importan las librerias necesarias para que el programa conecte con la API//
/**
 *
 * @author boolean
 */
public class OllamaImpl {
    
public static String ollamaInput(String firstInput) throws ProtocolException, IOException {
        String model = "gemma2:2b";
        int codigo_de_error=0;
//Se crea una funcion que reciba un input del usuario y se establecen unas excepciones en caso de error al momento de interactuar con la API//
        try {
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"model\": \"%s\", \"prompt\":\"%s\", \"stream\": false}", model,firstInput);
//Se implementa un try que esta configurado para realizar una conexión HTTP a una URL específica utilizando la clase HttpURLConnection de Java//
            try(OutputStream outStream = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                outStream.write(input,0,input.length);
            }
            //Se implemente un try para enviar datos (una cadena JSON) a un servidor a través de una conexión HTTP utilizando el flujo de salida (OutputStream)//

            int responseCode = connection.getResponseCode();
            codigo_de_error=responseCode;
            System.out.println("Response code: " + responseCode);
//Se obtiene el codigo de respuesta de una solicitud HTTP realizada a un servidor, que arroja un codigo de estado, en este caso de exito//
            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;
            while((line = input.readLine()) != null) {
                response.append(line);
            }
            input.close();

        //Se refleja el JSON con la respectiva respuesta de la API//
    
            JSONObject objectResponse = new JSONObject(response.toString());
            String responseText = objectResponse.getString("response");
            System.out.println("Respuesta: " + responseText);
//Se utiliza la libreria JSONObject para solamente tomar la respuesta del objeto.JSON que nos devuelve la API//
//Mostramos la respuesta al usuario//
            return responseText;







 

        } catch (MalformedURLException ex) {
            //Implementación para atrapar errores de la API
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la API Ollama",")"+"Error Critico (Codigo de error: "+codigo_de_error,JOptionPane.WARNING_MESSAGE);
        }
        return null;
    } 
}
