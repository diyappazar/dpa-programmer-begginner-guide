function newton(p)

%  NEWTON newton(p)
%
%  The Newton-Raphson Iteration
%  
%  This function is used to find a root of the equation f(x)=0 
%  given initial approximation p by Newton-Raphson Iteration.
%
%  p  : Initial approximation
%
%  Implemented by Fatos Rizaner on 22-July-2006
%
%  Reference:
%     John H. Mathews
%     Numerical Methods, For Mathematics, Science and Engineering
%     Second Editon
%     Prentice Hall


Delta=10e-2;
Epsilon=10e-2;
Small=10e-3;
Max=99;

Cond=0;
k=0;

y0=fny(p);

disp(' ');
disp(['Date = ', date]);
disp(['The Newton-Raphson Iteration with Delta=', num2str(Delta), ' , Epsilon=', num2str(Epsilon)...
        ,' and Small=', num2str(Small)]);   
disp(['The maximum number of iterations allowed is ', num2str(Max)]);
disp(' ');



    disp('   k                 p(k)          p(k+1)-p(k)               f(p(k))');
    disp('|---|--------------------|--------------------|---------------------|');

while k<=Max & Cond==0,
       
    [y_, Df]=fny(p);

    if Df==0,
       Cond=1;
       Dp=0;
   else
       Dp=y0/Df;
   end
   
   p1=p-Dp;
   y1=fny(p1);
   
   RelErr=2*abs(Dp)/(abs(p1)+Small);
    
   ds_i=sprintf('%4d %20.10g %20.10g  %20.10g', k, p, abs(p1-p), fny(p));
   disp(ds_i);

   
   if RelErr<Delta & abs(y1)<Epsilon,
       
       if Cond~=1,
           Cond=2;
       end
   end
   
   p=p1;
   y0=y1;
      
k=k+1;

pokis(k)=(p);

end

ds_i=sprintf('%4d %20.10g %20.10g  %20.10g', k, p, p1-p, fny(p));
disp(ds_i);

disp(' ');
disp(['The current root at the ', num2str(k),'-th iterate is ', num2str(p1, 10.5)]);
disp(['Consecutive iterates differ by ', num2str(Dp,10.5)]);
disp(' ');

if Cond==0,
   disp('The maximum number of iteration was exceeded! ');
elseif Cond==1,
    disp('Division by zero was encountered!');
elseif Cond==2,
    disp('The root was found with the disired tolerances!');
end

% plot(1:k,pokis)
% title('Convergence Graph')
% xlabel('Number of iterations, k');
% ylabel('P');