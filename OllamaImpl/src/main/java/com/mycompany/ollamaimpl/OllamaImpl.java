/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
//hola soy juanda
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

/**
 *
 * @author boolean
 */
public class OllamaImpl {
    
public static String ollamaInput(String firstInput) throws ProtocolException, IOException {
        String model = "gemma2:2b";
        int codigo_de_error=0;

        try {
            URL url = new URL("http://localhost:11434/api/generate");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("POST");
            connection.setRequestProperty("Content-Type","application/json; utf-8");
            connection.setRequestProperty("Accept", "application/json");
            connection.setDoOutput(true);

            String jsonInputString = String.format(
                    "{\"model\": \"%s\", \"prompt\":\"%s\", \"stream\": false}", model,firstInput);
            try(OutputStream outStream = connection.getOutputStream()) {
                byte[] input = jsonInputString.getBytes(StandardCharsets.UTF_8);
                outStream.write(input,0,input.length);
            }

            int responseCode = connection.getResponseCode();
            codigo_de_error=responseCode;
            System.out.println("Response code: " + responseCode);

            BufferedReader input = new BufferedReader(new InputStreamReader(connection.getInputStream(), StandardCharsets.UTF_8));
            StringBuilder response = new StringBuilder();
            String line;
            while((line = input.readLine()) != null) {
                response.append(line);
            }
            input.close();

            //Este es el JSON con la respuesta de la APi
            //System.out.println("Response: " + response.toString());

            JSONObject objectResponse = new JSONObject(response.toString());
            String responseText = objectResponse.getString("response");
            System.out.println("Respuesta: " + responseText);

            //le devolvemos la respuesta al usuario
            return responseText;







 

        } catch (MalformedURLException ex) {
            //Implementación para atrapar errores de la API
            JOptionPane.showMessageDialog(null, "No se ha podido conectar con la API Ollama",")"+"Error Critico (Codigo de error: "+codigo_de_error,JOptionPane.WARNING_MESSAGE);
        }
        return null;
    } 
}
