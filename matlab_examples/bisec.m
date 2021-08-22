function bisec(a,b)

%  BISEC  bisec(a, b)
%
%  The Bisection Method
%  
%  This function is used to find a root of the equation f(x)=0 
%  in the interval [a, b] by bisection method.
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
Satisfied=0;
k=0;

ya=fnx(a);
yb=fnx(b);

Max=1+floor( (log(b-a)-log(Delta)/log(2)) );

disp(' ');
disp(['Date = ', date]);
disp(['The Bisection method with Delta=', num2str(Delta)]);
disp(['The maximum number of iterations needed is ', num2str(Max)]);
disp(' ');

if sign(ya) == sign(yb),
    disp(['The values f(', num2str(a), ') = ', num2str(ya), ...
        '  and   f(', num2str(b), ') = ', num2str(yb), '  DO NOT DIFFER IN SIGN']);
return;
end;

    disp('   k                   ak                   ck                    bk                  f(ck)                  ek=|bk-ak|');
    disp('|---|--------------------|--------------------|---------------------|----------------------|-------------------------');

while k<=Max & Satisfied==0,
   
    c=(a+b)/2;
    yc=fnx(c);
    
%    disp(num2str([k, a, c, b, yc]));
 
ds_i=sprintf('%4d %20.10g %20.10g  %20.10g  %21.10g  %21.10g', k, a, c, b, yc, abs(b-a));
disp(ds_i);

    if yc==0,
        a=c;
        b=c;
    elseif sign(yb)==sign(yc),
        b=c;
        yb=yc;
    else
        a=c;
        ya=yc;
    end
    
    if (b-a) < Delta,
        Satisfied=1;
    end;
      
    k=k+1;
end

disp(' ');
disp(['The computed root of f(x)=0 is ', num2str(c, 10.5)]);
disp(['The accurancy is +- ', num2str(b-a)]);
disp(['The value of function f(', num2str(c,10.5), ') is ', num2str(yc,10.5)]);