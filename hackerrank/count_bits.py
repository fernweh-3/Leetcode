def getOneBits(n):
    # Write your code here
    binary_rep = bin(n)[2:]

    positions = [i+1 for i,bit in enumerate(binary_rep) if bit == '1']

    count = len(positions)

    return [count] + positions