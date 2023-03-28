VERSION 6
BEGIN SCHEMATIC
    BEGIN ATTR DeviceFamilyName "spartan3"
        DELETE all:0
        EDITNAME all:0
        EDITTRAIT all:0
    END ATTR
    BEGIN NETLIST
        SIGNAL PC(5:0)
        SIGNAL Clk
        SIGNAL Branch
        SIGNAL PC(5:1)
        SIGNAL Instr(4:0)
        SIGNAL Instr(18:16)
        SIGNAL Instr(18:15)
        SIGNAL RegDest
        SIGNAL Instr(3:0)
        SIGNAL Instr(10:7)
        SIGNAL WrReg(3:0)
        SIGNAL Instr(23:19)
        SIGNAL MemWr
        SIGNAL Mem2Reg
        SIGNAL RegWr
        SIGNAL C_EN
        SIGNAL Z_EN
        SIGNAL OV_EN
        SIGNAL N_EN
        SIGNAL ALUOP(2:0)
        SIGNAL XLXN_49(15:0)
        SIGNAL RdData2(15:0)
        SIGNAL N
        SIGNAL OV
        SIGNAL Z
        SIGNAL C
        SIGNAL INW0(15:0)
        SIGNAL INW1(15:0)
        SIGNAL WRData(15:0)
        SIGNAL ALUOut(15:0)
        SIGNAL MemOut(15:0)
        SIGNAL OUTW0(15:0)
        SIGNAL Instr(8:4)
        SIGNAL Instr(23:0)
        SIGNAL Instr(15:12)
        SIGNAL New_PC(5:0)
        PORT Input Clk
        PORT Input INW0(15:0)
        PORT Input INW1(15:0)
        PORT Output OUTW0(15:0)
        BEGIN BLOCKDEF PC_Update
            TIMESTAMP 2023 1 7 12 1 44
            LINE N 64 240 0 240 
            LINE N 64 320 0 320 
            LINE N 64 400 0 400 
            LINE N 64 480 0 480 
            LINE N 0 -112 64 -112 
            RECTANGLE N 0 -124 64 -100 
            RECTANGLE N 320 148 384 172 
            LINE N 384 160 320 160 
            LINE N 384 -32 320 -32 
            RECTANGLE N 320 52 384 76 
            LINE N 384 64 320 64 
            RECTANGLE N 64 -136 320 592 
            RECTANGLE N 320 548 384 572 
            LINE N 384 560 320 560 
        END BLOCKDEF
        BEGIN BLOCKDEF ProgCnt
            TIMESTAMP 2023 1 7 12 21 22
            RECTANGLE N 64 -128 320 0 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 320 -108 384 -84 
            LINE N 320 -96 384 -96 
        END BLOCKDEF
        BEGIN BLOCKDEF File_Regs
            TIMESTAMP 2023 1 9 17 17 15
            RECTANGLE N 64 -384 384 0 
            LINE N 64 -352 0 -352 
            LINE N 64 -288 0 -288 
            RECTANGLE N 0 -236 64 -212 
            LINE N 64 -224 0 -224 
            RECTANGLE N 0 -172 64 -148 
            LINE N 64 -160 0 -160 
            RECTANGLE N 0 -108 64 -84 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 384 -364 448 -340 
            LINE N 384 -352 448 -352 
            RECTANGLE N 384 -44 448 -20 
            LINE N 384 -32 448 -32 
        END BLOCKDEF
        BEGIN BLOCKDEF ALU
            TIMESTAMP 2023 1 7 11 33 7
            RECTANGLE N 64 -640 320 0 
            LINE N 64 -608 0 -608 
            LINE N 64 -544 0 -544 
            LINE N 64 -480 0 -480 
            LINE N 64 -416 0 -416 
            LINE N 64 -352 0 -352 
            RECTANGLE N 0 -300 64 -276 
            LINE N 64 -288 0 -288 
            RECTANGLE N 0 -236 64 -212 
            LINE N 64 -224 0 -224 
            RECTANGLE N 0 -172 64 -148 
            LINE N 64 -160 0 -160 
            RECTANGLE N 0 -108 64 -84 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            LINE N 320 -608 384 -608 
            LINE N 320 -464 384 -464 
            LINE N 320 -320 384 -320 
            LINE N 320 -176 384 -176 
            RECTANGLE N 320 -44 384 -20 
            LINE N 320 -32 384 -32 
        END BLOCKDEF
        BEGIN BLOCKDEF DataMem
            TIMESTAMP 2023 1 7 11 46 21
            RECTANGLE N 64 -384 368 0 
            LINE N 64 -352 0 -352 
            LINE N 64 -288 0 -288 
            RECTANGLE N 0 -236 64 -212 
            LINE N 64 -224 0 -224 
            RECTANGLE N 0 -172 64 -148 
            LINE N 64 -160 0 -160 
            RECTANGLE N 0 -108 64 -84 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 368 -364 432 -340 
            LINE N 368 -352 432 -352 
            RECTANGLE N 368 -44 432 -20 
            LINE N 368 -32 432 -32 
        END BLOCKDEF
        BEGIN BLOCKDEF MUX2V16
            TIMESTAMP 2023 1 7 11 58 8
            RECTANGLE N 64 -192 320 0 
            LINE N 64 -160 0 -160 
            RECTANGLE N 0 -108 64 -84 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 320 -172 384 -148 
            LINE N 320 -160 384 -160 
        END BLOCKDEF
        BEGIN BLOCKDEF MUX2V4
            TIMESTAMP 2023 1 7 11 53 52
            RECTANGLE N 64 -192 320 0 
            LINE N 64 -160 0 -160 
            RECTANGLE N 0 -108 64 -84 
            LINE N 64 -96 0 -96 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 320 -172 384 -148 
            LINE N 320 -160 384 -160 
        END BLOCKDEF
        BEGIN BLOCKDEF ctrl
            TIMESTAMP 2023 1 7 11 41 33
            RECTANGLE N 64 -704 320 -60 
            RECTANGLE N 0 -684 64 -660 
            LINE N 64 -672 0 -672 
            LINE N 320 -672 384 -672 
            LINE N 320 -608 384 -608 
            LINE N 320 -544 384 -544 
            LINE N 320 -480 384 -480 
            LINE N 320 -416 384 -416 
            LINE N 320 -352 384 -352 
            LINE N 320 -288 384 -288 
            LINE N 320 -224 384 -224 
            LINE N 320 -160 384 -160 
            RECTANGLE N 320 -108 384 -84 
            LINE N 320 -96 384 -96 
        END BLOCKDEF
        BEGIN BLOCKDEF ROM32x24ZFlag
            TIMESTAMP 2023 1 7 12 38 8
            RECTANGLE N 64 -64 320 0 
            RECTANGLE N 0 -44 64 -20 
            LINE N 64 -32 0 -32 
            RECTANGLE N 320 -44 384 -20 
            LINE N 320 -32 384 -32 
        END BLOCKDEF
        BEGIN BLOCK U_New_PC PC_Update
            PIN N N
            PIN OV OV
            PIN Z Z
            PIN C C
            PIN Branch Branch
            PIN Offset(4:0) Instr(4:0)
            PIN PC(5:0) PC(5:0)
            PIN New_PC(5:0) New_PC(5:0)
            PIN Branch_Type(2:0) Instr(18:16)
        END BLOCK
        BEGIN BLOCK U_PC ProgCnt
            PIN Clk Clk
            PIN New_PC(5:0) New_PC(5:0)
            PIN PC(5:0) PC(5:0)
        END BLOCK
        BEGIN BLOCK U_ALU ALU
            PIN Clk Clk
            PIN C_EN C_EN
            PIN N_EN N_EN
            PIN OV_EN OV_EN
            PIN Z_EN Z_EN
            PIN RdData1(15:0) XLXN_49(15:0)
            PIN RdData2(15:0) RdData2(15:0)
            PIN ALUOP(2:0) ALUOP(2:0)
            PIN lit5(4:0) Instr(4:0)
            PIN bit4(3:0) Instr(15:12)
            PIN C C
            PIN N N
            PIN OV OV
            PIN Z Z
            PIN Y(15:0) ALUOut(15:0)
        END BLOCK
        BEGIN BLOCK U_DataMem DataMem
            PIN Clk Clk
            PIN Wr MemWr
            PIN INW0(15:0) INW0(15:0)
            PIN INW1(15:0) INW1(15:0)
            PIN Addr(4:0) Instr(8:4)
            PIN DataIn(15:0) RdData2(15:0)
            PIN OUTW0(15:0) OUTW0(15:0)
            PIN DataOut(15:0) MemOut(15:0)
        END BLOCK
        BEGIN BLOCK U_MUX2V16 MUX2V16
            PIN Sel Mem2Reg
            PIN I0(15:0) ALUOut(15:0)
            PIN I1(15:0) MemOut(15:0)
            PIN Y(15:0) WRData(15:0)
        END BLOCK
        BEGIN BLOCK U_MUX2V4Dest MUX2V4
            PIN Sel RegDest
            PIN I0(3:0) Instr(3:0)
            PIN I1(3:0) Instr(10:7)
            PIN Y(3:0) WrReg(3:0)
        END BLOCK
        BEGIN BLOCK XLXI_14 ctrl
            PIN OP(4:0) Instr(23:19)
            PIN MemWr MemWr
            PIN Mem2Reg Mem2Reg
            PIN RegWr RegWr
            PIN RegDest RegDest
            PIN Branch Branch
            PIN C_EN C_EN
            PIN Z_EN Z_EN
            PIN OV_EN OV_EN
            PIN N_EN N_EN
            PIN ALUOP(2:0) ALUOP(2:0)
        END BLOCK
        BEGIN BLOCK XLXI_15 ROM32x24ZFlag
            PIN Addr(4:0) PC(5:1)
            PIN Data(23:0) Instr(23:0)
        END BLOCK
        BEGIN BLOCK XLXI_16 File_Regs
            PIN Clk Clk
            PIN WrEn RegWr
            PIN RdReg1(3:0) Instr(18:15)
            PIN RdReg2(3:0) Instr(3:0)
            PIN WrReg(3:0) WrReg(3:0)
            PIN WRData(15:0) WRData(15:0)
            PIN RdData1(15:0) XLXN_49(15:0)
            PIN RdData2(15:0)
        END BLOCK
    END NETLIST
    BEGIN SHEET 1 7040 5440
        BEGIN INSTANCE U_New_PC 576 416 R0
            BEGIN DISPLAY 0 -292 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN INSTANCE U_PC 576 1264 R0
            BEGIN DISPLAY 0 -248 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN BRANCH Clk
            WIRE 544 1168 576 1168
        END BRANCH
        IOMARKER 544 1168 Clk R180 28
        BEGIN BRANCH PC(5:0)
            WIRE 960 576 1072 576
            WIRE 1072 576 1072 704
            WIRE 1072 704 1072 864
            WIRE 1072 864 1072 1168
            WIRE 960 1168 1072 1168
            BEGIN DISPLAY 1072 864 ATTR Name
                ALIGNMENT SOFT-TVCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1072 704 1168 704
        BEGIN BRANCH PC(5:1)
            WIRE 1168 704 1280 704
            WIRE 1280 704 1392 704
            BEGIN DISPLAY 1280 704 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Branch
            WIRE 960 384 1008 384
            WIRE 1008 384 1056 384
            BEGIN DISPLAY 1008 384 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1984 480 1888 480
        BEGIN BRANCH Instr(4:0)
            WIRE 960 480 1408 480
            WIRE 1408 480 1888 480
            BEGIN DISPLAY 1408 480 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1984 976 1888 976
        BEGIN BRANCH Instr(18:16)
            WIRE 960 976 1488 976
            WIRE 1488 976 1888 976
            BEGIN DISPLAY 1488 976 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1984 624 2080 624
        BEGIN BRANCH RegDest
            WIRE 2080 880 2208 880
            WIRE 2208 880 2272 880
            BEGIN DISPLAY 2208 880 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1984 752 2080 752
        BUSTAP 1984 1008 2080 1008
        BEGIN BRANCH Instr(10:7)
            WIRE 2080 1008 2160 1008
            WIRE 2160 1008 2272 1008
            BEGIN DISPLAY 2160 1008 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        IOMARKER 2944 576 Clk R180 28
        BUSTAP 1984 1360 2080 1360
        BEGIN INSTANCE U_ALU 4048 1040 R0
            BEGIN DISPLAY 208 72 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN BRANCH Instr(4:0)
            WIRE 3888 944 3952 944
            WIRE 3952 944 4048 944
            BEGIN DISPLAY 3952 944 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH XLXN_49(15:0)
            WIRE 3520 576 3776 576
            WIRE 3776 576 3776 752
            WIRE 3776 752 4048 752
        END BRANCH
        BEGIN BRANCH RdData2(15:0)
            WIRE 3520 864 3696 864
            WIRE 3696 864 3776 864
            WIRE 3776 816 3776 864
            WIRE 3776 816 4048 816
            BEGIN DISPLAY 3696 864 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Z_EN
            WIRE 3936 688 3984 688
            WIRE 3984 688 4048 688
            BEGIN DISPLAY 3984 688 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH OV_EN
            WIRE 3936 624 3984 624
            WIRE 3984 624 4048 624
            BEGIN DISPLAY 3984 624 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH N_EN
            WIRE 3936 560 3984 560
            WIRE 3984 560 4048 560
            BEGIN DISPLAY 3984 560 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH C_EN
            WIRE 3936 496 3984 496
            WIRE 3984 496 4048 496
            BEGIN DISPLAY 3984 496 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Clk
            WIRE 3936 432 3952 432
            WIRE 3952 432 4048 432
            BEGIN DISPLAY 3952 432 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH ALUOP(2:0)
            WIRE 3856 880 3968 880
            WIRE 3968 880 4048 880
            BEGIN DISPLAY 3968 880 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH N
            WIRE 496 656 528 656
            WIRE 528 656 576 656
            BEGIN DISPLAY 528 656 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH OV
            WIRE 496 736 528 736
            WIRE 528 736 576 736
            BEGIN DISPLAY 528 736 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Z
            WIRE 496 816 528 816
            WIRE 528 816 576 816
            BEGIN DISPLAY 528 816 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH C
            WIRE 496 896 528 896
            WIRE 528 896 576 896
            BEGIN DISPLAY 528 896 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH C
            WIRE 4432 432 4480 432
            WIRE 4480 432 4528 432
            BEGIN DISPLAY 4480 432 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH N
            WIRE 4432 576 4464 576
            WIRE 4464 576 4512 576
            BEGIN DISPLAY 4464 576 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH OV
            WIRE 4432 720 4480 720
            WIRE 4480 720 4512 720
            BEGIN DISPLAY 4480 720 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Z
            WIRE 4432 864 4480 864
            WIRE 4480 864 4512 864
            BEGIN DISPLAY 4480 864 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN INSTANCE U_DataMem 5072 896 R0
            BEGIN DISPLAY 0 -504 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN BRANCH INW0(15:0)
            WIRE 4928 672 4944 672
            WIRE 4944 672 5072 672
        END BRANCH
        BEGIN BRANCH INW1(15:0)
            WIRE 4928 736 4944 736
            WIRE 4944 736 5072 736
        END BRANCH
        IOMARKER 4928 672 INW0(15:0) R180 28
        IOMARKER 4928 736 INW1(15:0) R180 28
        BEGIN BRANCH Clk
            WIRE 4800 544 4816 544
            WIRE 4816 544 5072 544
        END BRANCH
        IOMARKER 4800 544 Clk R180 28
        IOMARKER 3936 432 Clk R180 28
        BEGIN INSTANCE U_MUX2V16 5088 1200 R0
            BEGIN DISPLAY 0 -312 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN BRANCH Mem2Reg
            WIRE 4944 1040 5024 1040
            WIRE 5024 1040 5088 1040
            BEGIN DISPLAY 5024 1040 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH WRData(15:0)
            WIRE 5472 1040 5552 1040
            WIRE 5552 1040 5632 1040
            BEGIN DISPLAY 5552 1040 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH ALUOut(15:0)
            WIRE 4432 1008 4688 1008
            WIRE 4688 1008 4752 1008
            WIRE 4752 1008 4752 1104
            WIRE 4752 1104 5088 1104
            BEGIN DISPLAY 4688 1008 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH MemOut(15:0)
            WIRE 5040 944 5040 1168
            WIRE 5040 1168 5088 1168
            WIRE 5040 944 5584 944
            WIRE 5504 864 5584 864
            WIRE 5584 864 5584 912
            WIRE 5584 912 5584 944
            BEGIN DISPLAY 5584 912 ATTR Name
                ALIGNMENT SOFT-TVCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH OUTW0(15:0)
            WIRE 5504 544 5632 544
            WIRE 5632 544 5648 544
        END BRANCH
        BEGIN BRANCH RdData2(15:0)
            WIRE 4912 864 4992 864
            WIRE 4992 864 5072 864
            BEGIN DISPLAY 4992 864 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BUSTAP 1984 1184 2080 1184
        BEGIN BRANCH Instr(8:4)
            WIRE 2080 1184 3264 1184
            WIRE 3264 1184 4496 1184
            WIRE 4496 800 4496 1184
            WIRE 4496 800 5072 800
            BEGIN DISPLAY 3264 1184 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH MemWr
            WIRE 4832 608 4960 608
            WIRE 4960 608 5072 608
            BEGIN DISPLAY 4960 608 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        IOMARKER 5648 544 OUTW0(15:0) R0 28
        BEGIN BRANCH Instr(23:0)
            WIRE 1776 704 1984 704
            WIRE 1984 704 1984 752
            WIRE 1984 752 1984 976
            WIRE 1984 976 1984 1008
            WIRE 1984 1008 1984 1184
            WIRE 1984 1184 1984 1264
            WIRE 1984 1264 1984 1360
            WIRE 1984 1360 1984 1664
            WIRE 1984 240 1984 480
            WIRE 1984 480 1984 624
            WIRE 1984 624 1984 704
            BEGIN DISPLAY 1984 1264 ATTR Name
                ALIGNMENT SOFT-TVCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Instr(15:12)
            WIRE 3872 1008 3952 1008
            WIRE 3952 1008 4048 1008
            BEGIN DISPLAY 3952 1008 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH New_PC(5:0)
            WIRE 320 304 576 304
            WIRE 320 304 320 752
            WIRE 320 752 320 1216
            WIRE 320 1216 320 1232
            WIRE 320 1232 576 1232
            BEGIN DISPLAY 320 752 ATTR Name
                ALIGNMENT SOFT-TVCENTER
            END DISPLAY
        END BRANCH
        BEGIN INSTANCE U_MUX2V4Dest 2272 1040 R0
            BEGIN DISPLAY 112 72 ATTR InstName
                FONT 28 "Arial"
            END DISPLAY
        END INSTANCE
        BEGIN BRANCH ALUOP(2:0)
            WIRE 2576 1936 2672 1936
            WIRE 2672 1936 2768 1936
            BEGIN DISPLAY 2672 1936 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH N_EN
            WIRE 2576 1872 2672 1872
            WIRE 2672 1872 2768 1872
            BEGIN DISPLAY 2672 1872 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH OV_EN
            WIRE 2576 1808 2672 1808
            WIRE 2672 1808 2768 1808
            BEGIN DISPLAY 2672 1808 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Z_EN
            WIRE 2576 1744 2672 1744
            WIRE 2672 1744 2768 1744
            BEGIN DISPLAY 2672 1744 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH C_EN
            WIRE 2576 1680 2672 1680
            WIRE 2672 1680 2768 1680
            BEGIN DISPLAY 2672 1680 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Branch
            WIRE 2576 1616 2672 1616
            WIRE 2672 1616 2768 1616
            BEGIN DISPLAY 2672 1616 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH RegDest
            WIRE 2576 1552 2672 1552
            WIRE 2672 1552 2768 1552
            BEGIN DISPLAY 2672 1552 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH RegWr
            WIRE 2576 1488 2672 1488
            WIRE 2672 1488 2768 1488
            BEGIN DISPLAY 2672 1488 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Mem2Reg
            WIRE 2576 1424 2672 1424
            WIRE 2672 1424 2768 1424
            BEGIN DISPLAY 2672 1424 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH MemWr
            WIRE 2576 1360 2672 1360
            WIRE 2672 1360 2768 1360
            BEGIN DISPLAY 2672 1360 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Instr(23:19)
            WIRE 2080 1360 2112 1360
            WIRE 2112 1360 2192 1360
            BEGIN DISPLAY 2112 1360 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN INSTANCE XLXI_14 2192 2032 R0
        END INSTANCE
        BEGIN INSTANCE XLXI_15 1392 736 R0
        END INSTANCE
        BEGIN BRANCH WRData(15:0)
            WIRE 2832 896 2960 896
            WIRE 2960 896 3072 896
            BEGIN DISPLAY 2960 896 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH WrReg(3:0)
            WIRE 2656 880 2752 880
            WIRE 2752 832 2752 880
            WIRE 2752 832 2768 832
            WIRE 2768 832 3072 832
            BEGIN DISPLAY 2768 832 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Instr(3:0)
            WIRE 2032 800 2032 944
            WIRE 2032 944 2272 944
            WIRE 2032 800 2160 800
            WIRE 2080 752 2160 752
            WIRE 2160 752 2432 752
            WIRE 2432 752 2432 768
            WIRE 2432 768 3072 768
            WIRE 2160 752 2160 800
            BEGIN DISPLAY 2432 752 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Instr(18:15)
            WIRE 2080 624 2176 624
            WIRE 2176 624 2624 624
            WIRE 2624 624 2624 704
            WIRE 2624 704 3072 704
            BEGIN DISPLAY 2176 624 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH RegWr
            WIRE 2912 640 3008 640
            WIRE 3008 640 3072 640
            BEGIN DISPLAY 3008 640 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN BRANCH Clk
            WIRE 2944 576 2992 576
            WIRE 2992 576 3072 576
            BEGIN DISPLAY 2992 576 ATTR Name
                ALIGNMENT SOFT-BCENTER
            END DISPLAY
        END BRANCH
        BEGIN INSTANCE XLXI_16 3072 928 R0
        END INSTANCE
    END SHEET
END SCHEMATIC
