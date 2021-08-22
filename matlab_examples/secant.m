function secant(p0,p1)

%  SECANT secant(p0,p1)
%
%  The Secant Method
%  
%  This function is used to find a root of the equation f(x)=0 
%  given two initial approximations p0 and p1 by Secant Method.
%
%  po,p1  : Initial approximations
%
%  Implemented by Fatos Rizaner on 22-July-2006
%
%  Reference:
%     John H. Mathews
%     Numerical Methods, For Mathematics, Science and Engineering
%     Second Editon
%     Prentice Hall


Delta=10e-8;
Epsilon=10e-8;
Small=10e-8;
Max=149;
Cond=0;
k=0;

y0=fnx(p0);
y1=fnx(p1);

disp(' ');
disp(['Date = ', date]);
disp(['The Newton-Raphson Iteration with Delta=', num2str(Delta), ' , Epsilon=', num2str(Epsilon)...
        ,' and Small=', num2str(Small)]);   
disp(['The maximum number of iterations allowed is ', num2str(Max)]);
disp(' ');



    disp('   k                 p(k)               p(k+1)          p(k+1)-p(k)               f(p(k))');
    disp('|---|--------------------|--------------------|--------------------|---------------------|');

while k<=Max & Cond==0,
   
    Df=(y1-y0)/(p1-p0);
    
    if Df==0,
        Cond=1;
        Dp=0;
    else
        Dp=y1/Df;
    end
    
     ds_i=sprintf('%4d %20.10g %20.10g  %20.10g %20.10g', k, p0, p1, p1-p0, fnx(p0));
       disp(ds_i);
    
    p2=p1-Dp;
    y2=fnx(p2);
    
    RelErr=2*abs(Dp)/(abs(p2)+Small);
    
    if RelErr<Delta & abs(y2)<Epsilon,
        
        if Cond~=1
            Cond=2;
        end
    end
    
        
      p0=p1;
      p1=p2;
      y0=y1;
      y1=y2;
       
       k=k+1; 
      
  end
  
 ds_i=sprintf('%4d %20.10g %20.10g  %20.10g %20.10g', k, p0, p1, p1-p0, fnx(p0));
 disp(ds_i);

disp(' ');
disp(['The current root at the ', num2str(k),'-th iterate is ', num2str(p2, 10.5)]);
disp(['Consecutive iterates differ by ', num2str(Dp,10.5)]);
disp(['The value of f(x) = ',num2str(y2, 10.5)]);

disp(' ');

if Cond==0,
   disp('The maximum number of iteration was exceeded! ');
elseif Cond==1,
    disp('Division by zero was encountered!');
elseif Cond==2,
    disp('The root was found with the disired tolerances!');
end
