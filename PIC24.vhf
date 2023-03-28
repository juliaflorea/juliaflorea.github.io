--------------------------------------------------------------------------------
-- Copyright (c) 1995-2007 Xilinx, Inc.  All rights reserved.
--------------------------------------------------------------------------------
--   ____  ____ 
--  /   /\/   / 
-- /___/  \  /    Vendor: Xilinx 
-- \   \   \/     Version : 9.2.04i
--  \   \         Application : sch2vhdl
--  /   /         Filename : PIC24.vhf
-- /___/   /\     Timestamp : 01/17/2023 11:10:49
-- \   \  /  \ 
--  \___\/\___\ 
--
--Command: C:\Xilinx92i\bin\nt\sch2vhdl.exe -intstyle ise -family spartan3 -flat -suppress -w Y:/Florea_Julia_PIC24/PIC24/PIC24.sch PIC24.vhf
--Design Name: PIC24
--Device: spartan3
--Purpose:
--    This vhdl netlist is translated from an ECS schematic. It can be 
--    synthesis and simulted, but it should not be modified. 
--

library ieee;
use ieee.std_logic_1164.ALL;
use ieee.numeric_std.ALL;
library UNISIM;
use UNISIM.Vcomponents.ALL;

entity PIC24 is
   port ( Clk   : in    std_logic; 
          INW0  : in    std_logic_vector (15 downto 0); 
          INW1  : in    std_logic_vector (15 downto 0); 
          OUTW0 : out   std_logic_vector (15 downto 0));
end PIC24;

architecture BEHAVIORAL of PIC24 is
   signal ALUOP   : std_logic_vector (2 downto 0);
   signal ALUOut  : std_logic_vector (15 downto 0);
   signal Branch  : std_logic;
   signal C       : std_logic;
   signal C_EN    : std_logic;
   signal Instr   : std_logic_vector (23 downto 0);
   signal MemOut  : std_logic_vector (15 downto 0);
   signal MemWr   : std_logic;
   signal Mem2Reg : std_logic;
   signal N       : std_logic;
   signal New_PC  : std_logic_vector (5 downto 0);
   signal N_EN    : std_logic;
   signal OV      : std_logic;
   signal OV_EN   : std_logic;
   signal PC      : std_logic_vector (5 downto 0);
   signal RdData2 : std_logic_vector (15 downto 0);
   signal RegDest : std_logic;
   signal RegWr   : std_logic;
   signal WRData  : std_logic_vector (15 downto 0);
   signal WrReg   : std_logic_vector (3 downto 0);
   signal XLXN_49 : std_logic_vector (15 downto 0);
   signal Z       : std_logic;
   signal Z_EN    : std_logic;
   component ALU
      port ( Clk     : in    std_logic; 
             C_EN    : in    std_logic; 
             N_EN    : in    std_logic; 
             OV_EN   : in    std_logic; 
             Z_EN    : in    std_logic; 
             RdData1 : in    std_logic_vector (15 downto 0); 
             RdData2 : in    std_logic_vector (15 downto 0); 
             ALUOP   : in    std_logic_vector (2 downto 0); 
             lit5    : in    std_logic_vector (4 downto 0); 
             bit4    : in    std_logic_vector (3 downto 0); 
             C       : out   std_logic; 
             N       : out   std_logic; 
             OV      : out   std_logic; 
             Z       : out   std_logic; 
             Y       : out   std_logic_vector (15 downto 0));
   end component;
   
   component DataMem
      port ( Clk     : in    std_logic; 
             Wr      : in    std_logic; 
             INW0    : in    std_logic_vector (15 downto 0); 
             INW1    : in    std_logic_vector (15 downto 0); 
             Addr    : in    std_logic_vector (4 downto 0); 
             DataIn  : in    std_logic_vector (15 downto 0); 
             OUTW0   : out   std_logic_vector (15 downto 0); 
             DataOut : out   std_logic_vector (15 downto 0));
   end component;
   
   component MUX2V4
      port ( Sel : in    std_logic; 
             I0  : in    std_logic_vector (3 downto 0); 
             I1  : in    std_logic_vector (3 downto 0); 
             Y   : out   std_logic_vector (3 downto 0));
   end component;
   
   component MUX2V16
      port ( Sel : in    std_logic; 
             I0  : in    std_logic_vector (15 downto 0); 
             I1  : in    std_logic_vector (15 downto 0); 
             Y   : out   std_logic_vector (15 downto 0));
   end component;
   
   component PC_Update
      port ( N           : in    std_logic; 
             OV          : in    std_logic; 
             Z           : in    std_logic; 
             C           : in    std_logic; 
             Branch      : in    std_logic; 
             Offset      : in    std_logic_vector (4 downto 0); 
             PC          : in    std_logic_vector (5 downto 0); 
             New_PC      : out   std_logic_vector (5 downto 0); 
             Branch_Type : in    std_logic_vector (2 downto 0));
   end component;
   
   component ProgCnt
      port ( Clk    : in    std_logic; 
             New_PC : in    std_logic_vector (5 downto 0); 
             PC     : out   std_logic_vector (5 downto 0));
   end component;
   
   component ctrl
      port ( OP      : in    std_logic_vector (4 downto 0); 
             MemWr   : out   std_logic; 
             Mem2Reg : out   std_logic; 
             RegWr   : out   std_logic; 
             RegDest : out   std_logic; 
             Branch  : out   std_logic; 
             C_EN    : out   std_logic; 
             Z_EN    : out   std_logic; 
             OV_EN   : out   std_logic; 
             N_EN    : out   std_logic; 
             ALUOP   : out   std_logic_vector (2 downto 0));
   end component;
   
   component ROM32x24ZFlag
      port ( Addr : in    std_logic_vector (4 downto 0); 
             Data : out   std_logic_vector (23 downto 0));
   end component;
   
   component File_Regs
      port ( Clk     : in    std_logic; 
             WrEn    : in    std_logic; 
             RdReg1  : in    std_logic_vector (3 downto 0); 
             RdReg2  : in    std_logic_vector (3 downto 0); 
             WrReg   : in    std_logic_vector (3 downto 0); 
             WRData  : in    std_logic_vector (15 downto 0); 
             RdData1 : out   std_logic_vector (15 downto 0); 
             RdData2 : out   std_logic_vector (15 downto 0));
   end component;
   
begin
   U_ALU : ALU
      port map (ALUOP(2 downto 0)=>ALUOP(2 downto 0),
                bit4(3 downto 0)=>Instr(15 downto 12),
                Clk=>Clk,
                C_EN=>C_EN,
                lit5(4 downto 0)=>Instr(4 downto 0),
                N_EN=>N_EN,
                OV_EN=>OV_EN,
                RdData1(15 downto 0)=>XLXN_49(15 downto 0),
                RdData2(15 downto 0)=>RdData2(15 downto 0),
                Z_EN=>Z_EN,
                C=>C,
                N=>N,
                OV=>OV,
                Y(15 downto 0)=>ALUOut(15 downto 0),
                Z=>Z);
   
   U_DataMem : DataMem
      port map (Addr(4 downto 0)=>Instr(8 downto 4),
                Clk=>Clk,
                DataIn(15 downto 0)=>RdData2(15 downto 0),
                INW0(15 downto 0)=>INW0(15 downto 0),
                INW1(15 downto 0)=>INW1(15 downto 0),
                Wr=>MemWr,
                DataOut(15 downto 0)=>MemOut(15 downto 0),
                OUTW0(15 downto 0)=>OUTW0(15 downto 0));
   
   U_MUX2V4Dest : MUX2V4
      port map (I0(3 downto 0)=>Instr(3 downto 0),
                I1(3 downto 0)=>Instr(10 downto 7),
                Sel=>RegDest,
                Y(3 downto 0)=>WrReg(3 downto 0));
   
   U_MUX2V16 : MUX2V16
      port map (I0(15 downto 0)=>ALUOut(15 downto 0),
                I1(15 downto 0)=>MemOut(15 downto 0),
                Sel=>Mem2Reg,
                Y(15 downto 0)=>WRData(15 downto 0));
   
   U_New_PC : PC_Update
      port map (Branch=>Branch,
                Branch_Type(2 downto 0)=>Instr(18 downto 16),
                C=>C,
                N=>N,
                Offset(4 downto 0)=>Instr(4 downto 0),
                OV=>OV,
                PC(5 downto 0)=>PC(5 downto 0),
                Z=>Z,
                New_PC(5 downto 0)=>New_PC(5 downto 0));
   
   U_PC : ProgCnt
      port map (Clk=>Clk,
                New_PC(5 downto 0)=>New_PC(5 downto 0),
                PC(5 downto 0)=>PC(5 downto 0));
   
   XLXI_14 : ctrl
      port map (OP(4 downto 0)=>Instr(23 downto 19),
                ALUOP(2 downto 0)=>ALUOP(2 downto 0),
                Branch=>Branch,
                C_EN=>C_EN,
                MemWr=>MemWr,
                Mem2Reg=>Mem2Reg,
                N_EN=>N_EN,
                OV_EN=>OV_EN,
                RegDest=>RegDest,
                RegWr=>RegWr,
                Z_EN=>Z_EN);
   
   XLXI_15 : ROM32x24ZFlag
      port map (Addr(4 downto 0)=>PC(5 downto 1),
                Data(23 downto 0)=>Instr(23 downto 0));
   
   XLXI_16 : File_Regs
      port map (Clk=>Clk,
                RdReg1(3 downto 0)=>Instr(18 downto 15),
                RdReg2(3 downto 0)=>Instr(3 downto 0),
                WRData(15 downto 0)=>WRData(15 downto 0),
                WrEn=>RegWr,
                WrReg(3 downto 0)=>WrReg(3 downto 0),
                RdData1(15 downto 0)=>XLXN_49(15 downto 0),
                RdData2=>open);
   
end BEHAVIORAL;


