Scanner sc=new Scanner(System.in);
	System.out.print("Enter how many strings");
	int n=sc.nextInt();
	String x[]=new String[n];
	System.out.print("Enter "+n+" strings");
	for(int i=0;i<n;i++)
	{
	x[i]=sc.next();
	}
	
	for(int i=0;i<n-1;i++)
	{
		int sz1=x[i].length();	
	    char a[]=new char[sz1];
	   
	    for (int y = 0; y< sz1; y++)
	      {
                a[y]=x[i].charAt(y);
	      } 
	
	  for(int j=i+1;j<n;j++)
	  {
		  
		  
		  int sz2=x[j].length();	
		  char b[]=new char[sz2];
		  for (int y = 0; y< sz2; y++)
		     {
	             b[y]=x[j].charAt(y);
	         }
		  int s=0;
		 if(sz1<sz2)
			 s=sz1;
		 else
			 s=sz2;
		  
	       for (int z = 0;z<s ; z++)
	       {    
	    	   
	    	    if(a[z]==b[z]){
	    	    	
	    	    	continue;
	    	    }
	    	    
                if(a[z]>b[z])
                {
                	
                	String temp=x[i];
                	x[i]=x[j];
                	x[j]=temp;
                	break ;
                	
                }
                	
                	
                }
              
	  } 
           }
	
	for(int i=0;i<n;i++)
	{
	System.out.println(x[i]);
	}
	}
}


