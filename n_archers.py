from datetime import datetime
start_time =  datetime.now()   # code for printing the execution time of the test data

# Firstly, we take as input data  the size of the board where we will place the archers
print("Enter the size of the board : ")
n = int(input())
currentSolution = [0 for x in range(n)]  # List to store the current testing data
solutions = []  # List to store copies of all the solutions  found

"""
Function to check whether or not a certain position where we want to place the archer is safe( safe means that other
 archers which were already placed on the board can't shoot him)
"""
def isSafe(testRow, testCol):
# We do not need to check for row 0, so we return true ( we only need to check for rows above the current test row)
    if testRow == 0:
        return True

    for row in range(0, testRow):
        # We check on the vertical
        if testCol == currentSolution[row]:
            return False

        # We check on diagonals. If the the absolute values of the  differences in row numbers and column numbers are
        # the same, it means the diagonals are not safe

        if abs(testRow - row) == abs(testCol - currentSolution[row]):
            return False

    # If no archers can reach the position, we can return true
    return True


"""
Recursive function which places an archer  on a row and tests each column of that certain row, in order to find a safe 
position for the archer
"""
def placeArcher(row):
    # We need to have access to the list of total solutions ( it will add something to it), to the current solution and
    # to the number of archers
    global currentSolution, solutions, n
    # We loop through each column in the row and call the function "isSafe" to check if that position is safe
    for col in range(n):
        # If not safe, we continue to loop
        if not isSafe(row, col):
            continue
        else:
            # If safe, we store the position in our currentSolution list
            currentSolution[row] = col
            if row == (n - 1):
                # If we reach the  last row, we have obtained a solution and we save it
                solutions.append(currentSolution.copy())
                print( "Solution number ", len( solutions ), currentSolution )
            else:
                # If not, we recurse down one more row
                placeArcher(row + 1)


print("Solving for " + str(n) + " archers")
# After the function goes through all the solutions, it backtracks, then  places an archer on row 0 and returns a list
# of all the solutions found
placeArcher(0)
print(len(solutions), " solutions found")
for solution in solutions:
    print(solution)

end_time = datetime.now()
print(end_time - start_time)  # code for printing the execution time of the test data
