function falsepos(a,b)

%  FALSEPOS  falsepos(a, b)
%
%  The False Position Method
%  
%  This function is used to find a root of the equation f(x)=0 
%  in the interval [a, b] by false position method.
%
%  a  : Left endpoint
%  b  : Right endpoint
%
%  Implemented by Fatos Rizaner on 20-July-2006
%
%  Reference:
%     John H. Mathews
%     Numerical Methods, For Mathematics, Science and Engineering
%     Second Editon
%     Prentice Hall

Delta=10e-6;
Epsilon=10e-6;
Max=199;
Satisfied=0;
k=0;

disp(' ');
disp(['Date = ', date]);
disp(['The False Position method with Delta=', num2str(Delta), ' and Epsilon=', num2str(Epsilon)]);
disp(['The maximum number of iterations allowed is ', num2str(Max)]);
disp(' ');

    ya=fnx(a);
    yb=fnx(b);
    
     disp('   k                   ak                   ck                    bk                  f(ck)');
     disp('|---|--------------------|--------------------|---------------------|----------------------|');

while k<=Max & Satisfied==0,
    
    dx=yb*(b-a)/(yb-ya);
    c=b-dx;
    yc=fnx(c);
    
    ds_i=sprintf('%4d %20.10g %20.10g  %20.10g  %21.10g', k, a, c, b, yc);
    disp(ds_i);

    if yc==0,
        Satisfied=1;
    elseif sign(yb)==sign(yc),
        b=c;
        yb=yc;
    else
        a=c;
        ya=yc;
    end
    
    if abs(dx)<Delta & abs(yc)<Epsilon,
        Satisfied=1;
    end
    
    k=k+1;
    
end

disp(' ');
disp(['The computed root of f(x)=0 is ', num2str(c,10.5)]);
disp(['Consecutive iterates differ by ', num2str(dx,10.5)]);
disp(['The value of function f(', num2str(c,10.5), ') is ', num2str(yc,10.5)]);
        