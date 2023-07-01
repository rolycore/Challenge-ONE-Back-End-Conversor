package conversor;

import javax.swing.*;
import java.util.logging.*;

public class conversor {
    /**
     * Autor: Rolando Salinas
     * correo: rsalinas0890@gmail.com
     *
     * @param args
     */
    public static void main(String[] args) {
        /**
         *
         */
        /*Currency exchanges date 29-06-2023*/
        // Declaración de tasas de cambio para diferentes monedas

        // Declaración de las tasas de cambio para diferentes monedas en relación al dólar estadounidense
        double exchangeRateSameCurrency = 1;
        double exchangeRateUSDToEUR = 0.94;
        double exchangeRateUSDToGBP = 0.83;
        double exchangeRateUSDToJPY = 134.44;
        double exchangeRateUSDToKRW = 1295.18;
        double exchangeRateEURToGBP = 0.89;
        double exchangeRateEURToJPY = 143.54;
        double exchangeRateEURToKRW = 1382.38;
        double exchangeRateGBPToJPY = 161.71;
        double exchangeRateGBPToKRW = 1557.79;
        double exchangeRateJPYToKRW = 9.63;
        double amount;
        double result;
        String inputPrompt;
        //Metodo que valida las entradas que sean numeros o numeros decimales, reales
        class InputUtils {
            public static double obtenerNumeroDecimal(String in) {
                String input;
                boolean valid = false;
                double numero = 0.0;

                while (!valid) {
                    input = JOptionPane.showInputDialog(null, "Ingrese un valor en la unidad: ");

                    // Verificar si se ingresaron solo dígitos numéricos
                    if (input.matches("\\d+(\\.\\d+)?")) {
                        valid = true;
                        numero = Double.parseDouble(input);
                    } else {
                        JOptionPane.showMessageDialog(null, "Por favor, ingrese solo números.");
                    }
                }
                //Retorna el valor
                return numero;
            }
        }

        //Mensaje de bienvenida
        JOptionPane.showMessageDialog(null, "Bienvenidos al Conversor Universal de Unidades!");
        // Se muestra un cuadro de diálogo para que el usuario seleccione la unidad que desea convertir
        Object[] mainUnits = {"Temperatura", "Superficie", "Longitud", "Masa", "Volumen", "Tiempo", "Divisas", "Consumo de Combustible", "Consumo de Energía","Tasa de Transmision de Datos"};
        try {
            do {
                //Mensaje de seleccion de unidades.
                Object unitChoice = JOptionPane.showInputDialog(null, "Seleccione la unidad que desea convertir", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, mainUnits, mainUnits[6]);
                // Valida si el usuario ingresa un valor null
                if (unitChoice == null) {
                    JOptionPane.showMessageDialog(null, "Error, cerrando el programa");
                    return;
                }
                if (unitChoice.equals("Temperatura")) {
                    // Conversión de temperaturas
                    Object[] tempUnits = {"°C", "°F", "K"};
                    Object tempChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits, null);
                    Object tempChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, tempUnits, null);
                    inputPrompt = "Ingrese el valor en " + tempChoice1 + ": ";
                    try {
                        switch (tempChoice1 + " to " + tempChoice2) {
                            case "°C to °C" -> {
                                // Conversión de °C a °C
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " °C.");
                            }
                            case "°C to °F" -> {
                                // Conversión de °C a °F
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = (amount * 1.8) + 32;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " °F.");
                            }
                            case "°C to K" -> {
                                // Conversión de °C a K
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount + 273.15;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °C equivalen a " + String.format("%.3f", result) + " K.");
                            }
                            case "°F to °C" -> {
                                // Conversión de °F a °C
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = (amount - 32) / 1.8;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " °C.");
                            }
                            case "°F to °F" -> {
                                // Conversión de °F a °F
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " °F.");
                            }
                            case "°F to K" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = ((amount - 32) / 1.8) + 273.15;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " °F equivalen a " + String.format("%.3f", result) + " K.");
                            }
                            case "K to °C" -> {
                                // Conversión de °F a K
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount - 273.15;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " °C.");
                            }
                            case "K to °F" -> {
                                // Conversión de K a °C
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = ((amount - 273.15) * 1.8) + 32;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " °F.");
                            }
                            case "K to K" -> {
                                // Conversión de K a K
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " K equivalen a " + String.format("%.3f", result) + " K.");
                            }
                            // Agregar más conversiones de Temperaturas según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Superficie")) {
                    // Conversión de Superficie
                    Object[] surfaceUnits = {"m²", "km²", "ft²", "acre"};
                    Object surfaceChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, surfaceUnits, null);
                    Object surfaceChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, surfaceUnits, null);
                    inputPrompt = "Ingrese el valor en " + surfaceChoice1 + ": ";
                    try {
                        switch (surfaceChoice1 + " to " + surfaceChoice2) {
                            case "m² to m²" -> {
                                // Conversión de m² a m²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m² equivalen a " + String.format("%.3f", result) + " m².");
                            }
                            case "m² to km²" -> {
                                // Conversión de m² a km²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.000001;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m² equivalen a " + String.format("%.6f", result) + " km².");
                            }
                            case "m² to ft²" -> {
                                // Conversión de m² a ft²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 10.7639;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m² equivalen a " + String.format("%.3f", result) + " ft².");
                            }
                            case "m² to acre" -> {
                                // Conversión de m² a acre
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00024711;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m² equivalen a " + String.format("%.3f", result) + " acres.");
                            }
                            case "km² to m²" -> {
                                // Conversión de km² a m²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km² equivalen a " + String.format("%.3f", result) + " m².");
                            }
                            case "km² to km²" -> {
                                // Conversión de km² a km²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km² equivalen a " + String.format("%.3f", result) + " km².");
                            }
                            case "km² to ft²" -> {
                                // Conversión de km² a ft²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 10763910;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km² equivalen a " + String.format("%.3f", result) + " ft².");
                            }
                            case "km² to acre" -> {
                                // Conversión de km² a acre
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 247.11;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km² equivalen a " + String.format("%.3f", result) + " acres.");
                            }
                            case "ft² to m²" -> {
                                // Conversión de ft² a m²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.092903;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft² equivalen a " + String.format("%.3f", result) + " m².");
                            }
                            case "ft² to km²" -> {
                                // Conversión de ft² a km²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.000000092903;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft² equivalen a " + String.format("%.3f", result) + " km².");
                            }
                            case "ft² to ft²" -> {
                                // Conversión de ft² a ft²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft² equivalen a " + String.format("%.3f", result) + " ft².");
                            }
                            case "ft² to acre" -> {
                                // Conversión de ft² a acre
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.000022957;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft² equivalen a " + String.format("%.3f", result) + " acres.");
                            }
                            case "acre to m²" -> {
                                // Conversión de acre a m²
                                amount = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la superficie en acres"));
                                result = amount * 4046.85;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " acres equivalen a " + String.format("%.3f", result) + " m².");
                            }
                            case "acre to km²" -> {
                                // Conversión de acre a km²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00404685;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " acres equivalen a " + String.format("%.3f", result) + " km².");
                            }
                            case "acre to ft²" -> {
                                // Conversión de acre a ft²
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 43559.98;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " acres equivalen a " + String.format("%.3f", result) + " ft².");
                            }
                            case "acre to acre" -> {
                                // Conversión de acre a acre
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " acres equivalen a " + String.format("%.3f", result) + " acres.");
                            }
                            // Agregar más conversiones de Superficie según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Longitud")) {
                    // Conversión de Longitud
                    Object[] lengthUnits = {"m", "km", "ft", "mi"};
                    Object lengthChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits, null);
                    Object lengthChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, lengthUnits, null);
                    inputPrompt = "Ingrese el valor en " + lengthChoice1 + ": ";
                    try {
                        switch (lengthChoice1 + " to " + lengthChoice2) {
                            case "m to m" -> {
                                // Conversión de m a m
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m equivalen a " + String.format("%.3", result) + " m.");
                            }
                            case "m to km" -> {
                                // Conversión de m a km
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.001;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m equivalen a " + String.format("%.3", result) + " km.");
                            }
                            case "m to ft" -> {
                                // Conversión de m a ft
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3.2808;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m equivalen a " + String.format("%.3", result) + " ft.");
                            }
                            case "m to mi" -> {
                                // Conversión de m a mi
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00062137;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m equivalen a " + String.format("%.3", result) + " mi.");
                            }
                            case "km to m" -> {
                                // Conversión de km a m
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km equivalen a " + String.format("%.3", result) + " m.");
                            }
                            case "km to km" -> {
                                // Conversión de km a km
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km equivalen a " + String.format("%.3", result) + " km.");
                            }
                            case "km to ft" -> {
                                // Conversión de km a ft
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3280.84;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km equivalen a " + String.format("%.3", result) + " ft.");
                            }
                            case "km to mi" -> {
                                // Conversión de km a mi
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.621371;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km equivalen a " + String.format("%.3", result) + " mi.");
                            }
                            case "ft to m" -> {
                                // Conversión de ft a m
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.3048;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft equivalen a " + String.format("%.3", result) + " m.");
                            }
                            case "ft to km" -> {
                                // Conversión de ft a km
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.003048;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft equivalen a " + String.format("%.3", result) + " km.");
                            }
                            case "ft to ft" -> {
                                // Conversión de ft a ft
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft equivalen a " + String.format("%.3", result) + " ft.");
                            }
                            case "ft to mi" -> {
                                // Conversión de ft a mi
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00018939;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft equivalen a " + String.format("%.3", result) + " mi.");
                            }
                            case "mi to m" -> {
                                // Conversión de mi a m
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1609.34;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mi equivalen a " + String.format("%.3", result) + " m.");
                            }
                            case "mi to km" -> {
                                // Conversión de mi a km
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1.6093;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mi equivalen a " + String.format("%.3", result) + " km.");
                            }
                            case "mi to ft" -> {
                                // Conversión de mi a ft
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 5280;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mi equivalen a " + String.format("%.3", result) + " ft.");
                            }
                            case "mi to mi" -> {
                                // Conversión de mi a mi
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mi equivalen a " + String.format("%.3", result) + " mi.");
                            }
                            // Agregar más conversiones de Longitud según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Masa")) {
                    // Eleccion de Conversión de Masa
                    Object[] massUnits = {"gr", "kg", "lb", "oz"};
                    Object massChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, massUnits, null);
                    Object massChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, massUnits, null);

                    inputPrompt = "Ingrese el valor en " + massChoice1 + ": ";
                    try {
                        switch (massChoice1 + " to " + massChoice2) {
                            case "gr to gr" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gr equivalen a " + String.format("%.2f", result) + " gr.");
                            }
                            case "gr to kg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gr equivalen a " + String.format("%.2f", result) + " kg.");
                            }
                            case "gr to lb" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00220462;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gr equivalen a " + String.format("%.2f", result) + " lb.");
                            }
                            case "gr to oz" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.035274;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gr equivalen a " + String.format("%.2f", result) + " oz.");
                            }
                            case "kg to gr" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kg equivalen a " + String.format("%.2f", result) + " gr.");
                            }
                            case "kg to kg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kg equivalen a " + String.format("%.2f", result) + " kg.");
                            }
                            case "kg to lb" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 2.20462;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kg equivalen a " + String.format("%.2f", result) + " lb.");
                            }
                            case "kg to oz" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 35.274;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kg equivalen a " + String.format("%.2f", result) + " oz.");
                            }
                            case "lb to gr" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 453.592;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lb equivalen a " + String.format("%.2f", result) + " gr.");
                            }
                            case "lb to kg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.453592;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lb equivalen a " + String.format("%.2f", result) + " kg.");
                            }
                            case "lb to lb" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lb equivalen a " + String.format("%.2f", result) + " lb.");
                            }
                            case "lb to oz" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 16;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lb equivalen a " + String.format("%.2f", result) + " oz.");
                            }
                            case "oz to gr" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 28.3495;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " oz equivalen a " + String.format("%.2f", result) + " gr.");
                            }
                            case "oz to kg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.0283495;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " oz equivalen a " + String.format("%.2f", result) + " kg.");
                            }
                            case "oz to lb" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.0625;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " oz equivalen a " + String.format("%.2f", result) + " lb.");
                            }
                            case "oz to oz" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " oz equivalen a " + String.format("%.2f", result) + " oz.");
                            }
                            // Agregar más conversiones de masas según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Volumen")) {
                    // Eleccion de Conversión de Volumen
                    Object[] volUnits = {"lt", "ml", "m³", "ft³", "gal"};
                    Object volChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, volUnits, null);
                    Object volChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, volUnits, null);
                    inputPrompt = "Ingrese el valor en " + volChoice1 + ": ";
                    try {
                        switch (volChoice1 + " to " + volChoice2) {
                            case "lt to lt" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lt equivalen a " + String.format("%.2f", result) + " lt.");
                            }
                            case "lt to ml" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lt equivalen a " + String.format("%.2f", result) + " ml.");
                            }
                            case "lt to m³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lt equivalen a " + String.format("%.2f", result) + " m³.");
                            }
                            case "lt to ft³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.03531;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lt equivalen a " + String.format("%.2f", result) + " ft³.");
                            }
                            case "lt to gal" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.26417;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " lt equivalen a " + String.format("%.2f", result) + " gal.");
                            }
                            case "ml to lt" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ml equivalen a " + String.format("%.2f", result) + " lt.");
                            }
                            case "ml to ml" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ml equivalen a " + String.format("%.2f", result) + " ml.");
                            }
                            case "ml to m³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 1000000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ml equivalen a " + String.format("%.2f", result) + " m³.");
                            }
                            case "ml to ft³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.000035315;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ml equivalen a " + String.format("%.2f", result) + " ft³.");
                            }
                            case "ml to gal" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.000264172;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ml equivalen a " + String.format("%.2f", result) + " gal.");
                            }
                            case "m³ to lt" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m³ equivalen a " + String.format("%.2f", result) + " lt.");
                            }
                            case "m³ to ml" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 1000000;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m³ equivalen a " + String.format("%.2f", result) + " ml.");
                            }
                            case "m³ to m³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m³ equivalen a " + String.format("%.2f", result) + " m³.");
                            }
                            case "m³ to ft³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 35.3147;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m³ equivalen a " + String.format("%.2f", result) + " ft³.");
                            }
                            case "m³ to gal" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 264.172;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " m³ equivalen a " + String.format("%.2f", result) + " gal.");
                            }
                            case "ft³ to lt" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 28.3168;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft³ equivalen a " + String.format("%.2f", result) + " lt.");
                            }
                            case "ft³ to ml" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 28316.8;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft³ equivalen a " + String.format("%.2f", result) + " ml.");
                            }
                            case "ft³ to m³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.0283168;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft³ equivalen a " + String.format("%.2f", result) + " m³.");
                            }
                            case "ft³ to ft³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft³ equivalen a " + String.format("%.2f", result) + " ft³.");
                            }
                            case "ft³ to gal" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 7.48052;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft³ equivalen a " + String.format("%.2f", result) + " gal.");
                            }
                            case "gal to lt" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3.78541;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gal equivalen a " + String.format("%.2f", result) + " lt.");
                            }
                            case "gal to ml" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3785.41;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gal equivalen a " + String.format("%.2f", result) + " ml.");
                            }
                            case "gal to m³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.00378541;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gal equivalen a " + String.format("%.2f", result) + " m³.");
                            }
                            case "gal to ft³" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 0.133681;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gal equivalen a " + String.format("%.2f", result) + " ft³.");
                            }
                            case "gal to gal" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " gal equivalen a " + String.format("%.2f", result) + " gal.");
                            }
                            // Agregar más conversiones de volumen según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");


                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Tiempo")) {
                    // Eleccion de Conversión de Tiempo
                    Object[] timeUnits = {"seg", "min", "h", "d", "sem", "a"};
                    Object timeChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, timeUnits, null);
                    Object timeChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, timeUnits, null);


                    inputPrompt = "Ingrese el valor en " + timeChoice1 + ": ";

                    try {


                        switch (timeChoice1 + " to " + timeChoice2) {
                            case "seg to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "seg to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 60;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "seg to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 3600;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "seg to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (3600 * 24);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "seg to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (3600 * 24 * 7);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            case "seg to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (3600 * 24 * 365);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " seg equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "min to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "min to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 60;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "min to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 60;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "min to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (60 * 24);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "min to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (60 * 24 * 7);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            case "min to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (60 * 24 * 365);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " min equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "h to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "h to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3600;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "h to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 60;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "h to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 24;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "h to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (24 * 7);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            case "h to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / (24 * 365);
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " h equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "d to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "d to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3600 * 24;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "d to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 60 * 24;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "d to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 24;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "d to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 7;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            case "d to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 365;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " d equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "sem to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            case "sem to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3600 * 24 * 7;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "sem to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 60 * 24 * 7;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "sem to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 24 * 7;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "sem to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 7;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "sem to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / 52.143;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " sem equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "a to a" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " a.");
                            }
                            case "a to seg" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 3600 * 24 * 365;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " seg.");
                            }
                            case "a to min" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 60 * 24 * 365;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " min.");
                            }
                            case "a to h" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 24 * 365;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " h.");
                            }
                            case "a to d" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 365;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " d.");
                            }
                            case "a to sem" -> {
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * 52.143;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " a equivalen a " + String.format("%.2f", result) + " sem.");
                            }
                            // Agregar más conversiones de tiempo según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Divisas")) {
                    // Eleccion de Conversión de Divisas
                    Object[] currencyUnits = {"USD", "EUR", "GBP", "JPY", "KRW"};
                    Object currencyChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits, null);
                    Object currencyChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, currencyUnits, null);
                    inputPrompt = "Ingrese el valor en " + currencyChoice1 + ": ";
                    try {
                        switch (currencyChoice1 + " to " + currencyChoice2) {
                            case "USD to USD" -> {
                                // Conversión de USD a USD
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateSameCurrency;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " USD.");
                            }
                            case "USD to EUR" -> {
                                // Conversión de USD a EUR
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateUSDToEUR;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " EUR.");
                            }
                            case "USD to GBP" -> {
                                // Conversión de USD to GBP
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateUSDToGBP;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " GBP.");
                            }
                            case "USD to JPY" -> {
                                // Conversión de USD a JPY
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateUSDToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " JPY.");
                            }
                            case "USD to KRW" -> {
                                // Conversión de USD a KRW
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateUSDToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " USD equivalen a " + String.format("%.2f", result) + " KRW.");
                            }
                            case "GBP to USD" -> {
                                // Conversión de GBP a USD
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateUSDToGBP;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " USD.");
                            }
                            case "GBP to EUR" -> {
                                // Conversión de GBP a EUR
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateEURToGBP;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " EUR.");
                            }
                            case "GBP to GBP" -> {
                                // Conversión de GBP a GBP
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateSameCurrency;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " GBP.");
                            }
                            case "GBP to JPY" -> {
                                // Conversión de GBP a JPY
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateGBPToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " JPY.");
                            }
                            case "GBP to KRW" -> {
                                // Conversión de GBP a KRW
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateGBPToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " GBP equivalen a " + String.format("%.2f", result) + " KRW.");
                            }
                            case "EUR to USD" -> {
                                // Conversión de EUR a USD
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateUSDToEUR;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " USD.");
                            }
                            case "EUR to EUR" -> {
                                // Conversión de EUR a EUR
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateSameCurrency;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " EUR.");
                            }
                            case "EUR to GBP" -> {
                                // Conversión de EUR a GBP
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateEURToGBP;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " GBP.");
                            }
                            case "EUR to JPY" -> {
                                // Conversión de EUR a JPY
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateEURToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " JPY.");
                            }
                            case "EUR to KRW" -> {
                                // Conversión de EUR a KRW
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateEURToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " EUR equivalen a " + String.format("%.2f", result) + " KRW.");
                            }
                            case "JPY to USD" -> {
                                // Conversión de JPY a USD
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateUSDToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " USD.");
                            }
                            case "JPY to EUR" -> {
                                // Conversión de JPY a EUR
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateEURToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " EUR.");
                            }
                            case "JPY to GBP" -> {
                                // Conversión de JPY a GBP
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateGBPToJPY;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " GBP.");
                            }
                            case "JPY to JPY" -> {
                                // Conversión de JPY a JPY
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateSameCurrency;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " JPY.");
                            }
                            case "JPY to KRW" -> {
                                // Conversión de JPY a KRW
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateJPYToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " JPY equivalen a " + String.format("%.2f", result) + " KRW.");
                            }
                            case "KRW to USD" -> {
                                // Conversión de KRW a USD
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateUSDToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " USD.");
                            }
                            case "KRW to EUR" -> {
                                // Conversión de KRW a EUR
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateEURToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " EUR.");
                            }
                            case "KRW to GBP" -> {
                                // Conversión de KRW a GBP
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateGBPToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " GBP.");
                            }
                            case "KRW to JPY" -> {
                                // Conversión de KRW a JPY
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount / exchangeRateJPYToKRW;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " JPY.");
                            }
                            case "KRW to KRW" -> {
                                // Conversión de KRW a KRW
                                amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                result = amount * exchangeRateSameCurrency;
                                JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " KRW equivalen a " + String.format("%.2f", result) + " KRW.");
                            }
                            // Agregar más conversiones de divisas según sea necesario
                            // Mensaje si existe algun Error en el programa
                            default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                        }
                    } catch (NumberFormatException e) {
                        JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                        Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                    }
                }
                if (unitChoice.equals("Consumo de Combustible")) {
                    // Eleccion de Conversión de Consumo de Combustible
                    Object[] fuelUnits = {"Métrico", "Americano", "Británico", "Kilómetros por Litro"};
                    Object fuelChoice = JOptionPane.showInputDialog(null, "Seleccione el sistema de unidades", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, fuelUnits, null);

                    if (fuelChoice.equals("Métrico")) {
                        // Conversión en el sistema métrico
                        Object[] metricUnits = {"L/km", "mpg", "mpgi", "km/L"};
                        Object metricChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, metricUnits, null);
                        Object metricChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, metricUnits, null);

                        inputPrompt = "Ingrese el valor en " + metricChoice1 + ": ";
                        try {
                            switch (metricChoice1 + " to " + metricChoice2) {
                                case "L/km to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "L/km to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.214 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "L/km to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "L/km to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 1 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "mpg to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "mpg to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                   result = 235.215 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "mpg to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1.201;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "mpg to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.215 / (amount * 0.621371);
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "mpgi to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "mpgi to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "mpgi to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1.201;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "mpgi to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / (amount * 0.621371);
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "km/L to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "km/L to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.215 / (amount * 0.621371);
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "km/L to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / (amount * 0.621371);
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "km/L to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 1 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }
                    } else if (fuelChoice.equals("Americano")) {
                        // Conversión en el sistema americano
                        Object[] usUnits = {"mpg", "L/km", "mpgi", "km/L"};
                        Object usChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, usUnits, null);
                        Object usChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, usUnits, null);

                        inputPrompt = "Ingrese el valor en " + usChoice1 + ": ";
                        try {
                            switch (usChoice1 + " to " + usChoice2) {
                                case "mpg to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "mpg to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.214 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "mpg to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1.201;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "mpg to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 0.425144 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpg equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "L/km to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "L/km to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.215 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "L/km to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "L/km to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                     result = 1 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " L/km equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "mpgi to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "mpgi to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "mpgi to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1.201;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "mpgi to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / (amount * 0.621371);
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }
                    } else if (fuelChoice.equals("Británico")) {
                        // Conversión en el sistema británico
                        Object[] ukUnits = {"mpgi", "L/km", "mpg", "km/L"};
                        Object ukChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, ukUnits, null);
                        Object ukChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, ukUnits, null);

                        inputPrompt = "Ingrese el valor en " + ukChoice1 + ": ";
                        try {
                            switch (ukChoice1 + " to " + ukChoice2) {
                                case "mpgi to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "mpgi to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                case "mpgi to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1.201;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "mpgi to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 0.354006 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " mpgi equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");

                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }

                    } else if (fuelChoice.equals("Kilómetros por Litro")) {
                        // Conversión en kilómetros por litro
                        Object[] kmUnits = {"km/L", "mpg", "mpgi", "L/km"};
                        Object kmChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, kmUnits, null);
                        Object kmChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, kmUnits, null);

                        inputPrompt = "Ingrese el valor en " + kmChoice1 + ": ";
                        try {
                            switch (kmChoice1 + " to " + kmChoice2) {
                                case "km/L to km/L" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " km/L.");
                                }
                                case "km/L to mpg" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 235.214 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " mpg.");
                                }
                                case "km/L to mpgi" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 282.481 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " mpgi.");
                                }
                                case "km/L to L/km" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = 1 / amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " km/L equivalen a " + String.format("%.2f", result) + " L/km.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }

                        }catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }
                    }/*else {
                        JOptionPane.showMessageDialog(null, "Error, sistema no reconocido, cerrando programa");
                    }*/
                }
                if (unitChoice.equals("Consumo de Energía")) {
                    // Eleccion de Conversión de Consumo de Energia
                    Object[] systems = {"Métrico", "Americano"};
                    Object systemChoice = JOptionPane.showInputDialog(null, "Seleccione el sistema", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, systems, null);

                    if (systemChoice.equals("Métrico")) {
                        // Conversión en el sistema métrico
                        Object[] metricUnits = {"Wh", "kWh", "MWh", "J", "kJ", "MJ","cal", "kcal"};
                        Object metricChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, metricUnits, null);
                        Object metricChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, metricUnits, null);

                        inputPrompt = "Ingrese el valor en " + metricChoice1 + ": ";
                        try {
                            switch (metricChoice1 + " to " + metricChoice2) {
                                case "Wh to Wh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " Wh.");
                                }
                                case "Wh to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "Wh to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "Wh to J" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "Wh to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3.6;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "Wh to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.0036;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Wh equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "kWh to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "kWh to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "kWh to J" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600 * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "kWh to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "kWh to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3.6;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "MWh to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "MWh to Wh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " Wh.");
                                }
                                case "MWh to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "MWh to J" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600000000L;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "MWh to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "MWh to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MWh equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "J to J" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "J to Wh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " Wh.");
                                }
                                case "J to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "J to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600000000L;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "J to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "J to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " J equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "kJ to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "kJ to Wh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3.6;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " Wh.");
                                }
                                case "kJ to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "kJ to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "kJ to J" -> {
                                     amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "kJ to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kJ equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "MJ to MJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " MJ.");
                                }
                                case "MJ to Wh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 0.0036;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " Wh.");
                                }
                                case "MJ to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3.6;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "MJ to MWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 3600;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " MWh.");
                                }
                                case "MJ to J" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " J.");
                                }
                                case "MJ to kJ" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " MJ equivalen a " + String.format("%.2f", result) + " kJ.");
                                }
                                case "kWh to cal" -> {
                                   amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 860421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "kWh to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "cal to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "cal to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 860421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "cal to kcal" -> {
                                    amount = Double.parseDouble(JOptionPane.showInputDialog(inputPrompt));
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "kcal to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "kcal to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "kcal to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }
                    } else if (systemChoice.equals("Americano")) {
                        // Conversión en el sistema americano
                        Object[] usUnits = {"BTU", "ft-lb", "kWh", "cal", "kcal"};
                        Object usChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, usUnits, null);
                        Object usChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, usUnits, null);

                        inputPrompt = "Ingrese el valor en " + usChoice1 + ": ";
                        try{
                            switch (usChoice1 + " to " + usChoice2) {
                                case "BTU to BTU" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " BTU equivalen a " + String.format("%.2f", result) + " BTU.");
                                }
                                case "BTU to ft-lb" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 778;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " BTU equivalen a " + String.format("%.2f", result) + " ft-lb.");
                                }
                                case "BTU to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.000293;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " BTU equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "BTU to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 252;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " BTU equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "BTU to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.252;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " BTU equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "ft-lb to ft-lb" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft-lb equivalen a " + String.format("%.2f", result) + " ft-lb.");
                                }
                                case "ft-lb to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.000376616;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft-lb equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "ft-lb to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.323831;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft-lb equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "ft-lb to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 0.000323831;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " ft-lb equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "kWh to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                   result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "kWh to ft-lb" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 0.000376616;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " ft-lb.");
                                }
                                case "kWh to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "kWh to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kWh equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "cal to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                case "cal to ft-lb" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 0.323831;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " ft-lb.");
                                }
                                case "cal to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "cal to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " cal equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "kcal to kcal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " kcal.");
                                }
                                case "kcal to ft-lb" -> {
                                   amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 0.000323831;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " ft-lb.");
                                }
                                case "kcal to kWh" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 860.421;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " kWh.");
                                }
                                case "kcal to cal" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " kcal equivalen a " + String.format("%.2f", result) + " cal.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Error, sistema no reconocido, cerrando programa");
                    }
                }
                if (unitChoice.equals("Tasa de Transmision de Datos")) {
                    Object[] systems = {"Métrico"};
                    Object systemChoice = JOptionPane.showInputDialog(null, "Seleccione el sistema de conversión", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, systems, null);

                    if (systemChoice.equals("Métrico")) {
                        // Conversión en el sistema métrico
                        Object[] dataUnits = {"bps", "Kbps", "Mbps", "Gbps", "Tbps"};
                        Object dataChoice1 = JOptionPane.showInputDialog(null, "Seleccione la unidad", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, dataUnits, null);
                        Object dataChoice2 = JOptionPane.showInputDialog(null, "Convertir a", "Conversor de Unidades", JOptionPane.QUESTION_MESSAGE, null, dataUnits, null);

                        inputPrompt = "Ingrese el valor en " + dataChoice1 + ": ";
                        try {
                            switch (dataChoice1  + " to " + dataChoice2) {
                                case "bps to bps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " bps equivalen a " + String.format("%.2f", result) + " bps.");
                                }
                                case "bps to Kbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " bps equivalen a " + String.format("%.2f", result) + " Kbps.");
                                }
                                case "bps to Mbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1_000_000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " bps equivalen a " + String.format("%.2f", result) + " Mbps.");
                                }
                                case "bps to Gbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1_000_000_000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " bps equivalen a " + String.format("%.2f", result) + " Gbps.");
                                }
                                case "bps to Tbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1_000_000_000_000L;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " bps equivalen a " + String.format("%.2f", result) + " Tbps.");
                                }
                                case "Kbps to Kbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Kbps equivalen a " + String.format("%.2f", result) + " Kbps.");
                                }
                                case "Kbps to Mbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Kbps equivalen a " + String.format("%.2f", result) + " Mbps.");
                                }
                                case "Kbps to Gbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Kbps equivalen a " + String.format("%.2f", result) + " Gbps.");
                                }
                                case "Kbps to Tbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Kbps equivalen a " + String.format("%.2f", result) + " Tbps.");
                                }
                                case "Mbps to Mbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Mbps equivalen a " + String.format("%.2f", result) + " Mbps.");
                                }
                                case "Mbps to Kbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Mbps equivalen a " + String.format("%.2f", result) + " Kbps.");
                                }
                                case "Mbps to Gbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                     result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Mbps equivalen a " + String.format("%.2f", result) + " Gbps.");
                                }
                                case "Mbps to Tbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Mbps equivalen a " + String.format("%.2f", result) + " Tbps.");
                                }
                                case "Gbps to Gbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Gbps equivalen a " + String.format("%.2f", result) + " Gbps.");
                                }
                                case "Gbps to Kbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Gbps equivalen a " + String.format("%.2f", result) + " Kbps.");
                                }
                                case "Gbps to Mbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Gbps equivalen a " + String.format("%.2f", result) + " Mbps.");
                                }
                                case "Gbps to Tbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount / 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Gbps equivalen a " + String.format("%.6f", result) + " Tbps.");
                                }
                                case "Tbps to Tbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Tbps equivalen a " + String.format("%.2f", result) + " Tbps.");
                                }
                                case "Tbps to Kbps" -> {
                                     amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                     result = amount * 1000000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Tbps equivalen a " + String.format("%.2f", result) + " Kbps.");
                                }
                                case "Tbps to Mbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Tbps equivalen a " + String.format("%.2f", result) + " Mbps.");
                                }
                                case "Tbps to Gbps" -> {
                                    amount = InputUtils.obtenerNumeroDecimal(inputPrompt);
                                    result = amount * 1000;
                                    JOptionPane.showMessageDialog(null, String.format("%.2f", amount) + " Tbps equivalen a " + String.format("%.2f", result) + " Gbps.");
                                }
                                default -> JOptionPane.showMessageDialog(null, "Error, cerrando programa");
                            }
                        } catch (NumberFormatException e) {
                            JOptionPane.showMessageDialog(null, "El Valor ingresado fue un String " + inputPrompt, "Error del Sistema", JOptionPane.ERROR_MESSAGE);
                            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "El Valor ingresado fue un String", e.getMessage());
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Error, sistema no reconocido, cerrando programa");
                    }
                }
                // Preguntar al usuario si desea realizar otra conversión
                int choice = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra conversión?", "Conversor de Unidades Universal!", JOptionPane.YES_NO_OPTION);
                if (choice != JOptionPane.YES_OPTION) {
                    //Mensaje de salida (despedida)
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el Conversor!");
                    break; // Salir del bucle si el usuario no desea realizar otra conversión
                }
            } while (true);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Hubo un error porfavor consulte con soporte tecnico! " + e.getMessage());
            Logger.getLogger(conversor.class.getName()).log(Level.SEVERE, "Hubo un error porfavor consulte con un tecnico", e.getMessage());
        }
    }
}

