-- 
-- Create Date:     5:39:44 12/5/2022
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

entity ctrl is
    Port ( OP : in  STD_LOGIC_VECTOR (4 downto 0);
           ALUOP : out  STD_LOGIC_VECTOR (2 downto 0);
           MemWr : out  STD_LOGIC;
           Mem2Reg : out  STD_LOGIC;
           RegWr : out  STD_LOGIC;
           RegDest : out  STD_LOGIC;
			  Branch : out STD_LOGIC;
			  C_EN	: out STD_LOGIC;
			  Z_EN	: out STD_LOGIC;
			  OV_EN	: out STD_LOGIC;
			  N_EN	: out STD_LOGIC
			  );
end ctrl;

architecture Behavioral of ctrl is

begin
           
	MemWr <= '1' when OP = b"10001" else 
	         '0'; 
	
	Mem2Reg <= '1' when OP = b"10000" else 
				  '0'; 
	
	RegWr <= '0' when OP = b"10001" or 
							OP = b"00110" else 
				'1'; 
	
	RegDest <= '0' when OP = b"10000" or
							  OP = b"10100" else
				  '1';
							  
			
	C_EN <= '1' when (OP = b"01000") or     -- ADD Wb, Ws, Wd
						  (OP = b"01010") or     -- SUB Wb, Ws, Wd
						  (OP = b"11001") or	    -- FF1R Ws, Wnd
						  (OP = b"00010") else   -- SUBR Wb, #lit5, wd
				'0';
	
	Z_EN <= '1' when (OP = b"01000") or     -- ADD Wb, Ws, Wd
	                 (OP = b"01010") or     -- SUB Wb, Ws, Wd
	                 (OP = b"01100") or     -- AND Wb, Ws, Wd
	                 (OP = b"01110") or     -- IOR Wb, Ws, Wd
	                 (OP = b"00010") else   -- SUBR Wb, #lit5, wd
			  '0';
			  
			  
	N_EN <= '1' when (OP = b"01000") or     -- ADD Wb, Ws, Wd
	                 (OP = b"01010") or     -- SUB Wb, Ws, Wd
	                 (OP = b"01100") or     -- AND Wb, Ws, Wd
	                 (OP = b"01110") or     -- IOR Wb, Ws, Wd
						  (OP = b"00010") else   -- SUBR Wb, #lit5, wd
	  
			  '0';        

   OV_EN <= '1' when (OP = b"01000") or     -- ADD Wb, Ws, Wd
						   (OP = b"01010") or     -- SUB Wb, Ws, Wd
							(OP = b"00010") else   -- SUBR Wb, #lit5, wd
			  '0';
	
			
	ALUOP <= "000" when OP = b"01000" else   -- ADD Wb, Ws, Wd
			   "001" when OP = b"01010" else   -- SUB Wb, Ws, Wd
			   "010" when OP = b"01100" else   -- AND Wb, Ws, Wd
			   "011" when OP = b"01110" else   -- IOR Wb, Ws, Wd
			   "100" when OP = b"11001" else	  -- FF1R Ws, Wnd
				"101" when OP = b"11101" else   -- CLR Wd
				"110" when OP = b"10100" else   -- BTG Ws, #bit4
			   "111" when OP = b"00010" else       -- SUBR Wb,#lit5,Wd
			   "000";
	Branch <= '1' when (OP = b"00110") else 
				 '0';

end Behavioral;