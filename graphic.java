import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
public class GraphicScreenAssignment { 
public static void main(String[] args) throws FileNotFoundException { 
	GraphicScreenAssignment obj = new GraphicScreenAssignment();	
		obj.go(); 
	}
GraphicsScreen g = new GraphicsScreen(); 
int param1 = 0;
int param2 = 0;
int param3 = 0;
public void go() throws FileNotFoundException
		{	
			
			while(true)
			{				
			System.out.println("Enter Command: "); 
			Scanner scan = new Scanner(System.in);
			String cmd = scan.nextLine(); 
			String [] userParam = cmd.split(" ");

			for(int i = 0; i < userParam.length; i++) { 
				String currentText = userParam[i]; 
				currentText = currentText.trim(); 
				currentText = currentText.toLowerCase();	
				userParam[i] = currentText;
			}
				if (userParam[0].equals("load")){
					Scanner s = new Scanner(new File("I:\\Level 5\\FINALFINAL\\Programming\\src\\Load.txt"));	
				
				String line;	
				
				while ( s.hasNext() ) {
					
					line = s.nextLine();		
					
					userParam = line.split(" ");
					processCmd(userParam);
					
				}
				
				System.out.println("\nEOF");	
				
				
				
				}
				else 
				{
					processCmd(userParam);
				}
			}	
		}
		public void processCmd (String[] userParam){
			if (userParam[0].equals("circle")) 
			{         if (userParam.length == 2) 
				
			{
				
				System.out.println("Drawing circle with the radius you have provided ");
				param1 = Integer.parseInt(userParam[1]);
				g.circle(param1);
			}
			
			else if (userParam.length != 2) 
			{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: circle 200 (also refer to help) ");					
			}								
			}
			
			else if (userParam[0].equals("rectangle"))
			{	if (userParam.length == 3) 
			
			{
				System.out.println("Drawing a rectangle with the co-ordinates inserted");
				param1 = Integer.parseInt(userParam[1]);
				param2 = Integer.parseInt(userParam[2]);
				g.Rect(param1, param2);
			}
			
			else if (userParam.length != 3) 
			{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: rectangle 200 200 (also refer to help) ");	
			}
			}
			
			else if (userParam[0].equals("fillrect"))
			{	if (userParam.length == 3)
			
			{
			    System.out.println("The Rectangle is being coloured...");
			    param1 = Integer.parseInt(userParam[1]);
			    param2 = Integer.parseInt(userParam[2]);
			    g.fillRect(param1, param2);
			}
			
			else if (userParam.length != 3) 
			{			
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: fillrect 200 200 (also refer to help) ");			
			}
			}
			
			else if (userParam[0].equals("triangle"))
			{  if (userParam.length == 2) 
			
			{
					param1 = Integer.parseInt(userParam[1]);
					g.triangle(param1);
					System.out.println("triangle is currently being drawn at "+param1+"...");
			}


		   else if (userParam.length != 2) 
				{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: triangle 200 (also refer to help) ");
				}
			    }
			
			
			else if (userParam[0].equals("filltriangle"))
			{  if (userParam.length == 2) 
			
			{
					param1 = Integer.parseInt(userParam[1]);
					g.fillTriangle(param1);
					System.out.println("triangle is currently being coloured at "+param1+"...");
			}

				
		   else if (userParam.length != 2) 
				{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: filltriangle 200 200 (also refer to help) ");
				}
			    }
			

			else if (userParam[0].equals("move"))
			{
				if (userParam.length == 3) 
			
			{
				System.out.println("The pen position is now moving to the given co-ordinates");
				param1 = Integer.parseInt(userParam[1]);
				param2 = Integer.parseInt(userParam[2]);
				g.moveTo(param1,param2);
			}
				else if (userParam.length != 3) 
				{
					System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: move 200 200 (also refer to help) ");
				}
			}
			
			else if (userParam[0].equals("line"))
			{	if (userParam.length == 3) 
				
			{
				System.out.println("A line is being drawn with the numbers given...");
				param1 = Integer.parseInt(userParam[1]);
				param2 = Integer.parseInt(userParam[2]);
				g.lineTo(param1, param2);
			}	
			
			else if (userParam.length != 3) 
			{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: line 200 200 (also refer to help) ");
			}
			}
			
			else if (userParam[0].equals("colour"))
			{	if (userParam.length == 4) 

			{
				param1 = Integer.parseInt(userParam[1]);
				param2 = Integer.parseInt(userParam[2]);
				param3 = Integer.parseInt(userParam[3]);
				g.penColour(param1, param2, param3);
				System.out.println("The pen colour is now being changed..");
			}

			else if (userParam.length != 4) 
			{
				System.out.println ("ERROR!!!! The correct number of parameters must be entered, For example type: colour 45 100 56  (also refer to help) ");	
			}
			}

			else if (userParam[0].equals("help")==true)
			{
					System.out.println("Welcome to the HELP information");
					System.out.println("if you input 'line' this will draw line: Moves the current pen position to the given X,Y position For example type: line 200 200");
					System.out.println("if you input 'clear' this clears the drawing area and resets the pen position to 0,0 For example type: clear");
					System.out.println("if you type in 'end' this ends the drawing programFor example type: end");
					System.out.println("if you type in 'move' this would move the pointer based on the co-ordiates chosen For example type: move 200 200");
					System.out.println("if you type in 'circle' this would create the circle. For example type: circle 200");
					System.out.println("if you type in 'colour' this would then set the colour.For example type: colour 100 98 20 ");
					System.out.println("if you type in 'rectangle' this would then create the rectangle. For example type: rectangle 200 200");
					System.out.println("if you type in 'fillrect' this would then colour in the rectangle. For example type: fillrect 200 200 ");
					System.out.println("if you type in 'triangle' this would then create a triangle. For example type: triangle 200 ");
					System.out.println("if you type in 'filltriangle' this would then colour the triangle. For example type: filltriangle 200 ");					
			}
			

			else if (userParam[0].equals("colour")==true)
			{
				System.out.println("You colour is now being set");
				param1 = Integer.parseInt(userParam[1]);
				param2 = Integer.parseInt(userParam[2]);
				param3 = Integer.parseInt(userParam[3]);
				g.penColour(param1, param2, param3);
			}
			

			else if (userParam[0].equals("clear")) 
			{
				g.clear();
			}

			else if (userParam[0].equals("end"))
			{
				System.out.println("Ending the Graphics Screen Programme");
				g.close();
			}
					
			else
			{
				System.out.println ("Input Not Recognised!!: Please type in 'help' for more information");
			}
		}
          
	}
