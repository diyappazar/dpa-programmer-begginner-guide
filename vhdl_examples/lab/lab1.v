module lab1(CLK, X, Z);
input CLK;
input X;
output Z;
reg Q0, Q1;
wire J0, K0, J1, K1;
wire Z;

// Combinational logic
assign J0 = X | Q1;
assign K0 = ~X;
assign J1 = ~X & Q0;
assign K1 = X | Q0;

assign Z = X & Q1 & Q0;

always @(posedge CLK)
  begin
    Q0 <= (J0 & ~Q0) | (~K0 & Q0);
    Q1 <= (J1 & ~Q1) | (~K1 & Q1);
  end

endmodule