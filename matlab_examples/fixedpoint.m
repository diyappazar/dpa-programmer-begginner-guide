function fixedpoint(pterm, a, b)

%  Fixed Point fixedpoint(pterm)
%
%  The Fixed-Point Iteration
%  
%  This function is used to find a root of the equation x=g(x)
%  by starting with p0 by Fixed-Point Iteration.
%
%  pterm  : Initial approximation
%
%  Implemented by Fatos Rizaner on 22-July-2006
%
%  Reference:
%     John H. Mathews
%     Numerical Methods, For Mathematics, Science and Engineering
%     Second Editon
%     Prentice Hall


Tol=1e-2;

Max=100;
k=0;
RelErr=1;

[nn ft1]=fny(a);
[nn ft2]=fny(b);


if sign(ft1) ~= sign(ft1)
    disp('The signs are different, try different values');
    return;
end;

M=max(abs([ft1 ft2]));
ld=1/M;


disp(' ');
disp(['Date = ', date]);
disp(['The Fixed-Point Iteration with Tol=', num2str(Tol)]);   
disp(['The maximum number of iterations allowed is ', num2str(Max)]);
disp(' ');

error=1;


disp('   k                 p(k)          p(k+1)-p(k)               f(p(k))');
disp('|---|--------------------|--------------------|---------------------|');

ds_i=sprintf('%4d %20.10g %20.10s  %20.10g', k, pterm, '-------------' , fny(pterm));
disp(ds_i);

while error>=Tol,
    
    k=k+1;
    
    pold=pterm;
    
    pnew=pterm-sign(ft1)*ld*fny(pterm);
    
    pterm=pnew;
    
    pokis(k)=(pterm);
    
    error=abs(pold-pnew);
    
    ds_i=sprintf('%4d %20.10g %20.10g  %20.10g', k, pterm, pold-pnew, fny(pterm));
    disp(ds_i);
  end
  

disp(' ');
disp(['The computed fixed point of g(x) is ', num2str(pnew,10.5),]);
disp(' ');



% plot(1:k,pokis)
% title('Convergence Graph')
% xlabel('Number of iterations, k');
% ylabel('Pterm');