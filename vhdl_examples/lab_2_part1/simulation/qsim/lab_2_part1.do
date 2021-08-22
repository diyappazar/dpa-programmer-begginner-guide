onerror {quit -f}
vlib work
vlog -work work lab_2_part1.vo
vlog -work work lab_2_part1.vt
vsim -novopt -c -t 1ps -L cycloneiv_ver -L altera_ver -L altera_mf_ver -L 220model_ver -L sgate work.lab_2_part1_vlg_vec_tst
vcd file -direction lab_2_part1.msim.vcd
vcd add -internal lab_2_part1_vlg_vec_tst/*
vcd add -internal lab_2_part1_vlg_vec_tst/i1/*
add wave /*
run -all
