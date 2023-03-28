--------------------------------------------------------------------------------
-- Copyright (c) 1995-2007 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____
--  /   /\/   /
-- /___/  \  /    Vendor: Xilinx
-- \   \   \/     Version: J.40
--  \   \         Application: netgen
--  /   /         Filename: PIC24_timesim.vhd
-- /___/   /\     Timestamp: Tue Jan 17 11:34:02 2023
-- \   \  /  \ 
--  \___\/\___\
--             
-- Command	: -intstyle ise -s 4 -pcf PIC24.pcf -rpw 100 -tpw 0 -ar Structure -tm PIC24 -insert_pp_buffers false -w -dir netgen/par -ofmt vhdl -sim PIC24.ncd PIC24_timesim.vhd 
-- Device	: 3s400ft256-4 (PRODUCTION 1.39 2007-10-19)
-- Input file	: PIC24.ncd
-- Output file	: \\vboxsvr\d_drive\Florea_Julia_PIC24\PIC24\netgen\par\PIC24_timesim.vhd
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
library SIMPRIM;
use SIMPRIM.VCOMPONENTS.ALL;
use SIMPRIM.VPACKAGE.ALL;

entity PIC24 is
  port (
    Clk : in STD_LOGIC := 'X'; 
    OUTW0 : out STD_LOGIC_VECTOR ( 15 downto 0 ); 
    INW0 : in STD_LOGIC_VECTOR ( 15 downto 0 ); 
    INW1 : in STD_LOGIC_VECTOR ( 15 downto 0 ) 
  );
end PIC24;

architecture Structure of PIC24 is
  signal GLOBAL_LOGIC0 : STD_LOGIC; 
  signal OUTW0_0_O : STD_LOGIC; 
  signal OUTW0_1_O : STD_LOGIC; 
  signal OUTW0_2_O : STD_LOGIC; 
  signal OUTW0_3_O : STD_LOGIC; 
  signal OUTW0_4_O : STD_LOGIC; 
  signal OUTW0_5_O : STD_LOGIC; 
  signal OUTW0_6_O : STD_LOGIC; 
  signal OUTW0_7_O : STD_LOGIC; 
  signal OUTW0_8_O : STD_LOGIC; 
  signal OUTW0_9_O : STD_LOGIC; 
  signal OUTW0_10_O : STD_LOGIC; 
  signal OUTW0_11_O : STD_LOGIC; 
  signal OUTW0_12_O : STD_LOGIC; 
  signal OUTW0_13_O : STD_LOGIC; 
  signal OUTW0_14_O : STD_LOGIC; 
  signal OUTW0_15_O : STD_LOGIC; 
begin
  OUTW0_0_OBUF : X_OBUF
    generic map(
      LOC => "PAD205"
    )
    port map (
      I => OUTW0_0_O,
      O => OUTW0(0)
    );
  OUTW0_1_OBUF : X_OBUF
    generic map(
      LOC => "PAD206"
    )
    port map (
      I => OUTW0_1_O,
      O => OUTW0(1)
    );
  OUTW0_2_OBUF : X_OBUF
    generic map(
      LOC => "PAD209"
    )
    port map (
      I => OUTW0_2_O,
      O => OUTW0(2)
    );
  OUTW0_3_OBUF : X_OBUF
    generic map(
      LOC => "PAD210"
    )
    port map (
      I => OUTW0_3_O,
      O => OUTW0(3)
    );
  OUTW0_4_OBUF : X_OBUF
    generic map(
      LOC => "PAD211"
    )
    port map (
      I => OUTW0_4_O,
      O => OUTW0(4)
    );
  OUTW0_5_OBUF : X_OBUF
    generic map(
      LOC => "PAD212"
    )
    port map (
      I => OUTW0_5_O,
      O => OUTW0(5)
    );
  OUTW0_6_OBUF : X_OBUF
    generic map(
      LOC => "PAD213"
    )
    port map (
      I => OUTW0_6_O,
      O => OUTW0(6)
    );
  OUTW0_7_OBUF : X_OBUF
    generic map(
      LOC => "PAD214"
    )
    port map (
      I => OUTW0_7_O,
      O => OUTW0(7)
    );
  OUTW0_8_OBUF : X_OBUF
    generic map(
      LOC => "PAD215"
    )
    port map (
      I => OUTW0_8_O,
      O => OUTW0(8)
    );
  OUTW0_9_OBUF : X_OBUF
    generic map(
      LOC => "PAD216"
    )
    port map (
      I => OUTW0_9_O,
      O => OUTW0(9)
    );
  OUTW0_10_OBUF : X_OBUF
    generic map(
      LOC => "PAD217"
    )
    port map (
      I => OUTW0_10_O,
      O => OUTW0(10)
    );
  OUTW0_11_OBUF : X_OBUF
    generic map(
      LOC => "PAD218"
    )
    port map (
      I => OUTW0_11_O,
      O => OUTW0(11)
    );
  OUTW0_12_OBUF : X_OBUF
    generic map(
      LOC => "PAD219"
    )
    port map (
      I => OUTW0_12_O,
      O => OUTW0(12)
    );
  OUTW0_13_OBUF : X_OBUF
    generic map(
      LOC => "PAD220"
    )
    port map (
      I => OUTW0_13_O,
      O => OUTW0(13)
    );
  OUTW0_14_OBUF : X_OBUF
    generic map(
      LOC => "PAD221"
    )
    port map (
      I => OUTW0_14_O,
      O => OUTW0(14)
    );
  OUTW0_15_OBUF : X_OBUF
    generic map(
      LOC => "PAD222"
    )
    port map (
      I => OUTW0_15_O,
      O => OUTW0(15)
    );
  GLOBAL_LOGIC0_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_0_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_0_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_0_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD205",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_0_O
    );
  OUTW0_1_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_1_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_1_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD206",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_1_O
    );
  OUTW0_2_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_2_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_2_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD209",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_2_O
    );
  OUTW0_3_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_3_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_3_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD210",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_3_O
    );
  OUTW0_4_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_4_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_4_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD211",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_4_O
    );
  OUTW0_5_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_5_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_5_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD212",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_5_O
    );
  OUTW0_6_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_6_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_6_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD213",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_6_O
    );
  OUTW0_7_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_7_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_7_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD214",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_7_O
    );
  OUTW0_8_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_8_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_8_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD215",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_8_O
    );
  OUTW0_9_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_9_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_9_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD216",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_9_O
    );
  OUTW0_10_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_10_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_10_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD217",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_10_O
    );
  OUTW0_11_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_11_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_11_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD218",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_11_O
    );
  OUTW0_12_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_12_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_12_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD219",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_12_O
    );
  OUTW0_13_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_13_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_13_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD220",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_13_O
    );
  OUTW0_14_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_14_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_14_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD221",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_14_O
    );
  OUTW0_15_OUTPUT_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_15_OUTPUT_OFF_O1_GND : X_ZERO
    port map (
      O => GLOBAL_LOGIC0
    );
  OUTW0_15_OUTPUT_OFF_OMUX : X_BUF
    generic map(
      LOC => "PAD222",
      PATHPULSE => 757 ps
    )
    port map (
      I => GLOBAL_LOGIC0,
      O => OUTW0_15_O
    );
  NlwBlockROC : X_ROC
    generic map (ROC_WIDTH => 100 ns)
    port map (O => GSR);
  NlwBlockTOC : X_TOC
    port map (O => GTS);

end Structure;

