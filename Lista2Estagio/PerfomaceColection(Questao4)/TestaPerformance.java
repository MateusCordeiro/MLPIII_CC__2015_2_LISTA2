import java.util.ArrayList;
import java.util.Collection;

import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TestaPerformance	{	
		public static void	main(String[]	args)	{	
				System.out.println("Iniciando...");	
				Collection<Integer>	testeLHS	=	new LinkedHashSet<>();	
				Collection<Integer>	testetree	=	new TreeSet<>();	
					
				long inicio	=	System.currentTimeMillis();	
				int	total	=	30000;	
					
				for	(int	i	=	0;	i	<	total;	i++)	{	
						testeLHS.add(i);	
				}	
				for	(int	i	=	0;	i	<	total;	i++)	{	
						testeLHS.contains(i);	
				}	
				long	fim	=	System.currentTimeMillis();	
				long	tempo	=	fim	-	inicio;	
				System.out.println("Tempo	gasto LinkedHashSet:	"	+	tempo);	
				
				
				
				
				inicio	=	System.currentTimeMillis();	
				total	=	30000;	
					
				for	(int	i	=	0;	i	<	total;	i++)	{	
						testetree.add(i);	
				}	
				for	(int	i	=	0;	i	<	total;	i++)	{	
						testetree.contains(i);	
				}	
				fim	=	System.currentTimeMillis();	
					tempo	=	fim	-	inicio;	
				System.out.println("Tempo	gasto  TreeSet:	"	+	tempo);	
				
				
				
				
				
		
		
		
		
		
		
		}	}
		
		
		