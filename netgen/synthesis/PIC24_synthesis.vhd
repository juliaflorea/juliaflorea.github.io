--------------------------------------------------------------------------------
-- Copyright (c) 1995-2007 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____
--  /   /\/   /
-- /___/  \  /    Vendor: Xilinx
-- \   \   \/     Version: J.40
--  \   \         Application: netgen
--  /   /         Filename: PIC24_synthesis.vhd
-- /___/   /\     Timestamp: Wed Jan 18 15:42:50 2023
-- \   \  /  \ 
--  \___\/\___\
--             
-- Command	: -intstyle ise -ar Structure -tm PIC24 -w -dir netgen/synthesis -ofmt vhdl -sim PIC24.ngc PIC24_synthesis.vhd 
-- Device	: xc3s400-4-ft256
-- Input file	: PIC24.ngc
-- Output file	: \\vboxsvr\d_drive\Florea_Julia_PIC24\PIC24\netgen\synthesis\PIC24_synthesis.vhd
-- # of Entities	: 1
-- Design Name	: PIC24
-- Xilinx	: C:\Xilinx92i
--             
-- Purpose:    
--     This VHDL netlist is a verification model and uses simulation 
--     primitives which may not represent the true implementation of the 
--     device, however the netlist is functionally correct and should not 
--     be modified. This file cannot be synthesized and should only be used 
--     with supported simulation tools.
--             
-- Reference:  
--     Development System Reference Guide, Chapter 23
--     Synthesis and Simulation Design Guide, Chapter 6
--             
--------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
library UNISIM;
use UNISIM.VCOMPONENTS.ALL;
use UNISIM.VPKG.ALL;

entity PIC24 is
  port (
    Clk : in STD_LOGIC := 'X'; 
    OUTW0 : out STD_LOGIC_VECTOR ( 15 downto 0 ); 
    INW0 : in STD_LOGIC_VECTOR ( 15 downto 0 ); 
    INW1 : in STD_LOGIC_VECTOR ( 15 downto 0 ) 
  );
end PIC24;

architecture Structure of PIC24 is
  signal N0 : STD_LOGIC; 
  signal ALUOP : STD_LOGIC_VECTOR ( 2 downto 2 ); 
begin
  XST_GND : GND
    port map (
      G => ALUOP(2)
    );
  OUTW0_15_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(15)
    );
  OUTW0_14_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(14)
    );
  OUTW0_13_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(13)
    );
  OUTW0_12_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(12)
    );
  OUTW0_11_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(11)
    );
  OUTW0_10_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(10)
    );
  OUTW0_9_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(9)
    );
  OUTW0_8_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(8)
    );
  OUTW0_7_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(7)
    );
  OUTW0_6_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(6)
    );
  OUTW0_5_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(5)
    );
  OUTW0_4_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(4)
    );
  OUTW0_3_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(3)
    );
  OUTW0_2_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(2)
    );
  OUTW0_1_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(1)
    );
  OUTW0_0_OBUF : OBUF
    port map (
      I => ALUOP(2),
      O => OUTW0(0)
    );
  XST_VCC : VCC
    port map (
      P => N0
    );

end Structure;

