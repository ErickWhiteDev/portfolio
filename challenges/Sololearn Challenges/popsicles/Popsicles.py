# This program is from the Sololearn app
#
# The program calculates whether the number of popsicles is evenly distributed among the siblings and outputs accordingly
#
# Finished 8/18/21

siblings = int(input())
popsicles = int(input())
if (siblings % popsicles) == 0:
    print("give away")
else:
    print("eat them yourself")
    print(popsicles % siblings)