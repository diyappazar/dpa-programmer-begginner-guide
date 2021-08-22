function [y, dy]=fny(x)

%  [y dy]=fnx(x)
%
%  A function needed for numerical algorithms
%  such as bisection method.
%  
%
%  Implemented by Fatos Rizaner on 20-July-2006
%

y=exp(x)-2-x;

dy=exp(x)-1;