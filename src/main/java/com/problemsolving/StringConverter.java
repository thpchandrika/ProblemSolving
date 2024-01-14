package com.problemsolving;

public class StringConverter {

    public static void main(String[] args) {
        String camelCase = "camelCaseString";
        String snakeCase = convertToSnakeCase(camelCase);
        System.out.println("Camel Case: " + camelCase);
        System.out.println("Snake Case: " + snakeCase);
    }

    private static String convertToSnakeCase(String camelCaseString) {
        StringBuilder snakeCase = new StringBuilder();

        for (int i = 0; i < camelCaseString.length(); i++) {
            char currentChar = camelCaseString.charAt(i);
            if (Character.isUpperCase(currentChar)) {
                snakeCase.append("_" + currentChar);
               // snakeCase.append(Character.toUpperCase(currentChar));
                //snakeCase.append(currentChar);
            } else {
                snakeCase.append(currentChar);
            }
        }
        return snakeCase.toString().toUpperCase();
    }

    private static String convertToSnakeCase1(String camelCase){
        String snakeCase = camelCase.replaceAll("(.)(\\p{Upper})", "$1_$2");
        // Convert to lowercase
        return snakeCase.toUpperCase();
    }
}
