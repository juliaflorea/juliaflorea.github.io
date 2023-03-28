-- Engineer: 
-- 
-- Create Date:      5:44:16 12/5/2022
-- Design Name: 
-- Module Name:    ROM32x24 - Behavioral 
-- Project Name: 
-- Target Devices: 
-- Tool versions: 
-- Description: 
--
-- Dependencies: 
--
-- Revision: 
-- Revision 0.01 - File Created
-- Additional Comments: 
--
----------------------------------------------------------------------------------

library IEEE;
use IEEE.STD_LOGIC_1164.ALL;
use IEEE.STD_LOGIC_ARITH.ALL;
use IEEE.STD_LOGIC_UNSIGNED.ALL;

---- Uncomment the following library declaration if instantiating
---- any Xilinx primitives in this code.
--library UNISIM;
--use UNISIM.VComponents.all;

entity ALU is
    Port ( RdData1 : in  STD_LOGIC_VECTOR (15 downto 0);  -- wb
           RdData2 : in  STD_LOGIC_VECTOR (15 downto 0);  -- ws
           ALUOP 	 : in  STD_LOGIC_VECTOR (2 downto 0);
			  lit5    : in	 STD_LOGIC_VECTOR (4 downto 0);
			  bit4    : in  STD_LOGIC_VECTOR (3 downto 0);
			  Clk     : in  STD_LOGIC;
			  C       : out STD_LOGIC;
			  N       : out STD_LOGIC;
			  OV      : out STD_LOGIC;
			  Z 		 : out STD_LOGIC;
			  C_EN : in  STD_LOGIC;
			  N_EN : in  STD_LOGIC;
			  OV_EN : in  STD_LOGIC;
			  Z_EN : in  STD_LOGIC;
           Y : out  STD_LOGIC_VECTOR (15 downto 0)
			  );
end ALU;
 
architecture Behavioral of ALU is
	 signal result    : STD_LOGIC_VECTOR(16 downto 0);  -- wd
    signal zero      : STD_LOGIC;
    signal overflow  : STD_LOGIC;
    signal carry     : STD_LOGIC;
	 signal FF1R      : STD_LOGIC_VECTOR(15 downto 0);
begin
    
	 FF1R <= x"0001" when RdData2(0)='1' else 
				x"0002" when RdData2(1)='1' else
				x"0003" when RdData2(2)='1' else
				x"0004" when RdData2(3)='1' else
				x"0005" when RdData2(4)='1' else
				x"0006" when RdData2(5)='1' else
				x"0007" when RdData2(6)='1' else
				x"0008" when RdData2(7)='1' else
				x"0009" when RdData2(8)='1' else
				x"000A" when RdData2(9)='1' else
				x"000B" when RdData2(10)='1' else
				x"000C" when RdData2(11)='1' else
				x"000D" when RdData2(12)='1' else
				x"000E" when RdData2(13)='1' else
				x"000F" when RdData2(14)='1' else
				x"0010" when RdData2(15)='1' else
				x"0000";  
				

    with ALUOP select
    
    result <= 	  (('0'&RdData1) + ('0'&RdData2)) when "000",                        --- ADD Wb, Ws, Wd
                 (('0'&RdData1) + ('0'&(not RdData2)) + 1) when "001",              --- SUB Wb, Ws, Wd 
                 (('0'&RdData1) and ('0'&RdData2)) when "010",                      --- AND Wb, Ws, Wd
					  (('0'&RdData1) or ('0'&RdData2)) when "011",	                     --- IOR Wb, Ws, Wd
					  (b"0" & FF1R) when "100",    					 						      --- FF1R Ws, Wnd
					  (x"0000" & b"0") when  "101",                                      --- CLR, Wd
					  not(b"0"& RdData2(15 downto conv_integer(bit4))) when "110",		   --- BTG Ws, #bit 4				
					  ((b"0"&lit5) + ('0'&(not RdData1)) + 1) when "111",			   		--- SUBR Wb,#lit5,Wd	
                 x"0000" & b"0" when others;    
    

	 zero <= '1' when result=x"0000" else '0';	 
    Z <= zero when rising_edge(Clk) and Z_En='1';
		
		
		
	 carry <= result(16) when (ALUOP ="000" or ALUOP = "001" or ALUOP="111") else
				 '1' when ( FF1R = x"0000" and ALUOP = "100") else
				 '0';	
				 
	 C <= carry when (rising_edge(Clk) and C_EN = '1');
		

		
	 overflow <= '1' when ((ALUOP = "000" and RdData1(15) = RdData2(15) and result(15) = (not RdData1(15))) or		-- ADD Wb ,Ws, Wd
								 ((ALUOP = "001" or ALUOP="111") and RdData1(15) = (not RdData2(15)) and result(15) = RdData2(15))) else   -- SUB Wb, Ws, Wd	
					'0';
	 OV <= overflow when (rising_edge(Clk) and OV_EN = '1');
	 
   
	 
	 N  <= result(15) when (rising_edge(Clk) and N_EN = '1');
		 
    Y  <= result(15 downto 0);              
	 

					
end Behavioral;

