package mtinh;

public class GPTB2 {
	 float a,b,c;
	    public GPTB2(float a, float b, float c){
	        this.a=a;
	        this.b=b;
	        this.c=c;
	    }
	    String GiaiPT(){
	        String kq="";
	        if(a==0)
	            if(b==0)
	                if(c==0)
	                    kq="Phương trình vô số nghiệm";
	                else
	                    kq="Phương trình vô nghiệm";
	            else
	                kq="Phương trình có 1 nghiệm x= "+(-c/b);
	        else
	        {
	            float d=b*b-4*a*c;
	            if(d<0)
	               kq="Phương trình vô nghiệm";
	            if (d==0)
	               kq="Phương trình có nghiệm kép x1=x2= "+(-b/(2*a)); 
	            if(d>0)
	            { 
	                float x1=((-b-(float)Math.sqrt(d))/(2*a)), 
	                      x2=((-b+(float)Math.sqrt(d))/(2*a));
	                kq="x1= "+x1+"; x2= "+x2; 
	            }
	        }
	        return kq;
	    }
	}

