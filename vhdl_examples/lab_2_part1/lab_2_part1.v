module lab_2_part1(x,Clk,Y);
input Clk,x;
output Y;
reg Y;
reg [1:0] pstate,nstate;  // present and next state variables as registers
parameter S0=2'b00, S1=2'b01, S2=2'b10, S3=2'b11;  // state assignment 

always @(posedge Clk)
begin
	case(pstate)
		S0: if (x) begin nstate=S1; Y=0; end
		     else    begin nstate=S0; Y=0; end 
		S1: if (x) begin nstate=S2; Y=0; end
		     else    begin nstate=S0; Y=0; end 
		S2: if (x) begin nstate=S3; Y=1; end
		     else    begin nstate=S0; Y=0; end 
		S3: if (x) begin nstate=S3; Y=1; end
		     else    begin nstate=S0; Y=0; end 
	endcase
pstate<=nstate;
end
// sequential logic for state transitions
endmodule
