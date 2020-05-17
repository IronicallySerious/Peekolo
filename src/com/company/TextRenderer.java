package com.company;

public class TextRenderer implements Renderer
{
	private int m_Width;
	private int m_Height;
	private	char m_Screen[][];
	private char m_ClearChar;

	TextRenderer(int width, int height, char clear)
	{
		m_Width = width;
		m_Height = height;
		m_ClearChar = clear;

		m_Screen = new char[height][width];

		for(int x = 0; x < height; x++)
		{
			for(int y = 0; y < width; y++)
			{
				m_Screen[x][y] = m_ClearChar;
			}
		}
	}

	@Override
	public void submit(int x, int y, char character)
	{
		m_Screen[x][y] = character;
	}

	@Override
	public void flush()
	{
		for(int x = 0; x < m_Height; x++)
		{
			for (int y = 0; y < m_Width; y++)
			{
				System.out.print(m_Screen[x][y]);
			}
			System.out.print("\n");
		}
	}

	@Override
	public void clear()
	{
		for(int x = 0; x < m_Height; x++)
		{
			for(int y = 0; y < m_Width; y++)
			{
				m_Screen[x][y] = m_ClearChar;
			}
		}

		for(int i = 0; i < (m_Width * m_Height) + m_Height; i++)
		{
			System.out.print('\b');
		}
	}
}
