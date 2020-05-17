package com.company;

public class Main
{
    public static void main(String[] args)
    {
        System.out.println("Peekolo renderer is starting");

        int width = 5;
        int height = 5;
        int terminalFrame = 100;

        TextRenderer renderer = new TextRenderer(width, height, '.');

        int i = 0;
        int j = 0;
        while(i < terminalFrame)
        {
            i++;
            j++;
            renderer.submit(i % width, j % height, '*');

            renderer.flush();
            renderer.clear();
        }

        System.out.println("Peekolo renderer is stopping safely");
    }
}
