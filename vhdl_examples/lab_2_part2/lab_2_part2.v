module lab_2_part2(x,Clk,Y);
input Clk,x;
output Y;

reg [1:0] state;  // state variables as register
parameter S0=2'b00, S1=2'b01, S2=2'b10, S3=2'b11; // state assignment 

always @(posedge Clk)
	case(state)
		S0: if (x) state <= S1;
		     else   state <= S0;
		S1: if (x) state <= S2;
		     else   state <= S0; 
		S2: if (x) state <= S3; 
		     else   state <= S0; 
		S3: if (x) state <= S3; 
		     else   state <= S0;
	endcase

// define the output
	assign Y=(state == S3);
endmodule
