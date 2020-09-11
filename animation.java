import java.awt.*;  
import java.awt.event.*;  
//import java.util.*;
import java.util.concurrent.*;
import java.lang.*;
public class animation extends Frame
{
	Button b;
	public void start(String shape,String pattern,String speed,int check)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
  		Dimension d=t.getScreenSize();
  		int width=d.width;
  		int height=d.height;
  		int randomx=(int)(Math.random()*(width+1));
  		int randomy=(int)(Math.random()*(height+1));
  		Graphics g1=getGraphics();
  		TimeUnit time = TimeUnit.MICROSECONDS; 
  		Color color = new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255));
  		g1.setColor(color);
		switch(shape)
		{
			case "circle":
			System.out.println("circle");
			int l=10;
  				int h=10;
			switch(pattern)
			{
				case "Hollow":
  			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  		{
      	  g1.setColor(color);
  				g1.fillOval(randomx,randomy,l,h);
          g1.setColor(new Color(255,255,255));
         
          	g1.fillOval(randomx+10,randomy+10,l-20,h-20);
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Filled":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillOval(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Spiral":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.drawOval(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
				 }
				 break;
			}
			break;
			case "Rectangle":
			System.out.println("Rectangle");
			l=10;
  			h=20;
			switch(pattern)
			{
				case "Hollow":
  			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  		{
      	  g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
          g1.setColor(new Color(255,255,255));
         
          	g1.fillRect(randomx+10,randomy+10,l-20,h-20);
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Filled":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Spiral":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.drawRect(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
				 }
				 break;
			}
			break;
			case "Oval":
			System.out.println("Oval");
				 l=10;
  				 h=20;
			switch(pattern)
			{
				case "Hollow":
  			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  		{
      	  g1.setColor(color);
  				g1.fillOval(randomx,randomy,l,h);
          g1.setColor(new Color(255,255,255));
         
          	g1.fillOval(randomx+10,randomy+10,l-20,h-20);
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Filled":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillOval(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Spiral":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.drawOval(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
				 }
				 break;
			}
			break;
			case "Square":
			System.out.println("Square");
			l=10;
  		    h=10;
			switch(pattern)
			{
				case "Hollow":
  			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  		{
      	  g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
          g1.setColor(new Color(255,255,255));
         
          	g1.fillRect(randomx+10,randomy+10,l-20,h-20);
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Filled":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "Spiral":
  					while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.drawRect(randomx,randomy,l,h);
  			
  			h+=10;
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
				 }
				 break;
			}
			break;
			case "Triangle":	
			int n=3;
			int a[]=new int[n];
			int b[]=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=(int)(Math.random()*width);
				b[i]=(int)(Math.random()*height);
			}
      		switch(pattern)
			{
				case "Hollow":
  				 g1.setColor(color);
  				g1.drawPolygon(a,b,3);
  				try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "Filled":
  					 g1.setColor(color);
  				g1.fillPolygon(a,b,3);
  				try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "Spiral":
  					 g1.setColor(color);
  				g1.drawPolygon(a,b,3);
  				try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 }

				 break;
			}
			break;
			case "Polygon":
			TimeUnit time2 = TimeUnit.SECONDS; 
			 n=(int)(Math.random()*(30-4+1)+4);
			a=new int[n];
			b=new int[n];
			for(int i=0;i<n;i++)
			{
				a[i]=(int)(Math.random()*width);
				b[i]=(int)(Math.random()*height);
			}
      		switch(pattern)
			{
				case "Hollow":
  				 g1.setColor(color);
  				g1.drawPolygon(a,b,n);
  				try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "Filled":
  					 g1.setColor(color);
  				g1.fillPolygon(a,b,n);
  				try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "Spiral":
  					 g1.setColor(color);
  				g1.drawPolygon(a,b,n);
  				try{
  					System.out.println("entered");
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 break;
				 case "mixed":
				 if(check!=2)
				 check=1;
				 while(true)
				 {
				 	start(shape,y.getItem((int)(Math.random()*3)),speed,check);
				 	if(check==2)
				 	{
				 		break;
				 	}
				 	try{
  				time.sleep(Integer.parseInt(speed)*100000);
  				}
  				catch(Exception e)
  				{

  				}
				 }

				 break;
			}
			break;
			case "mixed":
			check=2;
			while(true)
			{
			start(x.getItem((int)(Math.random()*5)),pattern,speed,check);	
			}
			//break;
			case "siphon-vertical":
			l=10;
			h=10;
			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
  			
  			h+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
			break;
			case "siphon-horizontal":
			l=10;
			h=10;
			while((randomy+h)<height && (randomy-h)>0 && (randomx+l)<width && (randomx-l)>0)
  				{
      	  			g1.setColor(color);
  				g1.fillRect(randomx,randomy,l,h);
  			
  			l+=10;	
  				try{
  				time.sleep(Integer.parseInt(speed)*2200);
  				}
  				catch(Exception e)
  				{

  				}
 				 }
			break;
			case "rainfall":
				int a1[]=new int[50];
				int b1[]=new int[50];
				g1.setColor(new Color(255,255,255));	
				for(int i=0;i<50;i++)
				{
					a1[i]=(int)(Math.random()*width);
					b1[i]=(int)(Math.random()*height);
				g1.fillOval(a1[i],b1[i],2,9);
				}
				try{
  				time.sleep(Integer.parseInt(speed)*12000);
  				}
  				catch(Exception e)
  				{

  				}
  				g1.setColor(new Color(0,0,0));	
  				for(int i=0;i<50;i++)
				g1.fillOval(a1[i],b1[i],2,9);
			break;
			
		}
		if(check==0)
		{
			//System.out.println("not mixed");
		start(shape,pattern,speed,check);
	}
	}
	public Choice x=new Choice();
	public Choice y=new Choice();
	public Choice z=new Choice();
	public Choice bg=new Choice();

	public animation()
	{
		b=new Button("play now");
		 x.add("circle");
		 x.add("Rectangle");
		 x.add("Oval");
		 x.add("Square");
		 x.add("Triangle");
		 x.add("Polygon");
		 x.add("mixed");
		 x.add("siphon-horizontal");
		 x.add("siphon-vertical");
		 x.add("rainfall");
		x.setBounds(50,100,150,100);
		
		 y.add("Hollow");
		 y.add("Spiral");
		 y.add("Filled");
		 y.add("mixed");
		 y.setBounds(350,100,150,100);
		
		z.add("1");
		z.add("2");
		 z.add("3");
		 z.add("4");
		 z.add("5");
		 z.add("6");
		 z.add("7");
		 z.add("8");
		 z.add("9");
		 z.add("10");
		 bg.add("white");
		 bg.add("black");
		 z.setBounds(550,100,50,50);
bg.setBounds(750,100,50,50);
		add(z);
		add(x);
		add(y);
		add(bg);

		b.setBounds(500,50,50,50);
		add(b);
		setBackground(Color.black);
		setSize(1000,1000);
		setLayout(null);
		setVisible(true);
	b.addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e)
		{
			if(bg.getItem(bg.getSelectedIndex()).equals("black"))
			setBackground(Color.black);

			start(x.getItem(x.getSelectedIndex()),y.getItem(y.getSelectedIndex()),z.getItem(z.getSelectedIndex()),0);
			//System.out.println(z.getItem(y.getSelectedIndex())+" "+y.getItem(y.getSelectedIndex())+" "+x.getItem(x.getSelectedIndex()));
		}
	});
	
	}

	public static void main(String args[])
	{
		new animation();
	}
}