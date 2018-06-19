package com.itrexgroup.workfusion;

public class UserInput {
    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }

    public static class TextInput {
        StringBuilder text = new StringBuilder();

        void add(char c) {
            this.text.append(c);
        }

        String getValue() {
            return this.text.toString();
        }
    }

    public static class NumericInput extends TextInput {
        void add(char c) {
            if (Character.isDigit(c)) {
                this.text.append(c);
            }
        }
        String getValue() {
            return this.text.toString();
        }
    }
}
