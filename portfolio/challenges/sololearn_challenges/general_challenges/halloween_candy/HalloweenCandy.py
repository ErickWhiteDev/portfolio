"""
The program calculates the probability of a house giving away a dollar bill given that
a.) All but three houses give away candy
b.) One house gives out toothbrushes
c.) Two houses give out dollar bills

Finished 8/18/21
"""

import math
houses = int(input())
print(math.ceil((2 / houses) * 100))