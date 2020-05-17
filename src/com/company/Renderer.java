package com.company;

public interface Renderer
{
	public void submit(int x, int y, char character);
	public void flush();
	public void clear();
}
