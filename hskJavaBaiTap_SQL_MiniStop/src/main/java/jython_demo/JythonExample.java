package jython_demo;

import org.python.util.PythonInterpreter;

public class JythonExample {
    public static void main(String[] args) 
    {
    	String codePython="numbers = [1, 2, 3, 4, 5]\r\n"
    			+ "for num in numbers:\r\n"
    			+ "    print(num)";
    	String codePython2="num = 6\r\n"
    			+ "if num % 2 == 0:\r\n"
    			+ "    print(\"So Chan.\")\r\n"
    			+ "else:\r\n"
    			+ "    print(\"So le.\")";
    	String codeMath="import math\r\n"
    			+ "\r\n"
    			+ "# Lấy giá trị của số Pi\r\n"
    			+ "pi_value = math.pi\r\n"
    			+ "print(\"Gia tri so pi la:\", pi_value)\r\n"
    			+ "\r\n"
    			+ "# Tính chu vi của hình tròn có bán kính là 5\r\n"
    			+ "radius = 5\r\n"
    			+ "circumference = 2 * pi_value * radius\r\n"
    			+ "print(\"Chu vi la:\", circumference)";
    	String codeGraph="for i in range(1, 10):\r\n"
    			+ "    print(i)";
    	try (PythonInterpreter interpreter = new PythonInterpreter()) 
    	{
            interpreter.exec(codePython);
            interpreter.exec(codePython2);
            interpreter.exec(codeMath);
            interpreter.exec(codeGraph);
        }catch(Exception e)
    	{
        	e.printStackTrace();
        	System.out.println(e.getMessage());
    	}
    }
}
