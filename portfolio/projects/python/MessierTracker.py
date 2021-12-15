"""
This project was initially made in Python 2, and was later converted to Python 3.
The original project received a 4/5 on the AP Computer Science Principles Exam.
The project has been modified slightly for improved legibility.
"""

# Sources:
# https://www.messier-objects.com/messier-object-list/
# http://www.messier.seds.org/data1.html

Objects = ["Crab Nebula", "No Name", "No Name", "No Name", "No Name", "Butterfly Cluster", "Ptolemy Cluster", "Lagoon Nebula", "No Name", "No Name", "Wild Duck Cluster", "Gumball Globular", "Hercules Globular Cluster", "No Name", "Great Pegasus Cluster", "Eagle Nebula", "Omega Nebula", "No Name", "No Name", "Trifid Nebula", "No Name", "Sagittarius Cluster", "No Name", "Sagitarius Star Cloud", "No Name", "No Name", "Dumbbell Nebula", "No Name", "No Name", "No Name", "Andromeda Galaxy", "Le Gentil", "Triangulum Galaxy", "No Name", "No Name", "Pinwheel Cluster", "No Name", "Starfish Cluster", "No Name", "Winnecke 4", "No Name", "Orion Nebula", "De Mairan's Nebula", "Beehive Cluster", "Pleiades", "No Name", "No Name", "No Name", "No Name", "Heart-Shaped Cluster", "Whirlpool Galaxy", "No Name", "No Name", "No Name", "Summer Rose Star", "No Name", "Ring Nebula", "No Name", "No Name", "No Name", "No Name", "No Name", "Sunflower Galaxy", "Black Eye Galaxy", "No Name", "No Name", "King Cobra Cluster", "No Name", "No Name", "No Name", "No Name", "No Name", "No Name", "Phantom Galaxy", "No Name", "Little Dumbbell Nebula", "Cetus A", "No Name", "No Name", "No Name", "Bode's Galaxy", "Cigar Galaxy", "Southern Pinwheel Galaxy", "No Name", "No Name", "No Name", "Virgo A", "No Name", "No Name", "No Name", "No Name", "No Name", "No Name", "Cat's Eye Galaxy", "No Name", "No Name", "Owl Nebula", "No Name", "Coma Pinwheel", "No Name", "Pinwheel Galaxy", "Spindle Galaxy", "No Name", "Sombrero Galaxy", "No Name", "No Name", "No Name", "Surfboard Galaxy", "No Name", "Edward Young Star"]
Type = ["Supernova Remnant", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Open Cluster", "Open Cluster", "Emission Nebula With Cluster", "Globular Cluster", "Globular Cluster", "Open Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Emission Nebula With Cluster", "Emission Nebula With Cluster", "Open Cluster", "Globular Cluster", "Emission, Reflection, And Dark Nebula With Cluster", "Open Cluster", "Globular Cluster", "Open Cluster", "Milky Way Star Cloud", "Open Cluster", "Open Cluster", "Planetary Nebula", "Globular Cluster", "Open Cluster", "Globular Cluster", "Sprial Galaxy", "Dwarf Elliptical Galaxy", "Spiral Galaxy", "Open Cluster", "Open Cluster", "Open Cluster", "Open Cluster", "Open Cluster", "Open Cluster", "Double Star", "Open Cluster", "Emission-Reflection Nebula", "Emission-Reflection Nebula", "Open Cluster",  "Open Cluster",  "Open Cluster",  "Open Cluster", "Open Cluster", "Elliptical Galaxy",  "Open Cluster", "Spiral Galaxy",  "Open Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Planetary Nebula", "Barred Spiral Galaxy", "Elliptical Galaxy", "Elliptical Galaxy", "Spiral Galaxy", "Globular Cluster", "Spiral Galaxy", "Spiral Galaxy", "Barred Spiral Galaxy", "Barred Spiral Galaxy",  "Open Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Globular Cluster", "Asterism", "Spiral Galaxy", "Globular Cluster", "Planetary Nebula", "Spiral Galaxy", "Reflection Nebula", "Globular Cluster", "Globular Cluster", "Spiral Galaxy", "Starburst Irregular Galaxy", "Barred Spiral Galaxy", "Lenticular Or Elliptical Galaxy", "Lentcular Or Elliptical Galaxy", "Lentcular Or Elliptical Galaxy", "Elliptical Galaxy", "Spiral Galaxy", "Elliptical Galaxy", "Spiral Galaxy", "Barred Spiral Galaxy", "Globular Cluster", "Open Cluster", "Spiral Galaxy", "Barred Spiral Galaxy", "Spiral Galaxy", "Planetary Nebula", "Spiral Galaxy", "Spiral Galaxy", "Spiral Galaxy", "Spiral Galaxy", "Lenticular Galaxy", "Open Cluster", "Spiral Galaxy", "Elliptical Galaxy", "Spiral Galaxy", "Glocular Cluster", "Barred Spiral Galaxy", "Barred Spiral Galaxy", "Dwarf Elliptical Galaxy"]
Constellation = ["Taurus", "Aquarius", "Canes Venatici", "Scorpius", "Serpens", "Scorpius", "Scorpius", "Sagittarius", "Ophiuchus", "Ophiuchus", "Scutum", "Ophiuchus", "Hercules", "Ophiuchus", "Pegasus", "Serpens", "Sagittarius", "Sagittarius", "Ophiuchus", "Sagittarius", "Sagittarius", "Sagittarius", "Sagittarius", "Sagittarius", "Sagittarius", "Scutum", "Vulpecula", "Sagittarius", "Cygnus", "Capricornus", "Andromeda", "Andromeda", "Triangulum", "Perseus", "Gemini", "Auriga", "Auriga", "Auriga", "Cygnus", "Ursa Major", "Canis Major", "Orion", "Orion", "Cancer", "Taurus", "Puppis", "Puppis", "Hydra", "Virgo", "Monoceros", "Canes Venatici", "Cassiopeia", "Coma Berenicecs", "Sagittarius", "Sagittarius", "Lyra", "Lyra", "Virgo", "Virgo", "Virgo", "Virgo", "Ophiuchus", "Canes Venatici", "Coma Berenices", "Leo", "Leo", "Cancer", "Hydra", "Sagittarius", "Sagittarius", "Sagitta", "Aquarius", "Aquarius", "Pisces", "Sagittarius", "Perseus", "Cetus", "Orion", "Lepus", "Scorpius", "Ursa Major", "Ursa Major", "Hydra", "Virgo", "Coma Berenices", "Virgo", "Virgo", "Coma Berenices", "Virgo", "Virgo", "Coma Berenices", "Hercules", "Puppis", "Canes Venatici", "Leo", "Leo", "Ursa Major", "Coma Berenices", "Coma Berenices", "Coma Berenices", "Ursa Major", "Draco", "Cassiopeia", "Virgo", "Leo", "Canes Venatici", "Ophiuchus", "Ursa Major", "Ursa Major", "Andromeda"]

winter = [1, 45, 36, 37, 38, 42, 43, 78, 79, 35, 41, 50, 46, 47, 93, 48]
spring = [44, 67, 40, 81, 82, 97, 101, 108, 109, 65, 66, 95, 96, 105, 53, 64, 85, 88, 91, 98, 99, 100, 49, 58, 59, 60, 61, 84, 86, 87, 89, 90, 104, 3, 51, 63, 94, 106, 68, 83, 102, 5]
summer = [13, 92, 9, 10, 12, 14, 19, 62, 107, 4, 6, 7, 80, 16, 8, 17, 18, 20, 21, 22, 23, 24, 25, 28, 54, 55, 69, 70, 75, 11, 26, 56, 57, 71, 27, 29, 39]
autumn = [2, 72, 73, 15, 30, 52, 103, 31, 32, 110, 33, 74, 77, 34, 76]

RaH = [5, 21, 13, 16, 15, 17, 17, 18, 17, 16, 18, 16, 16, 17, 21, 18, 18, 18, 17, 18, 18, 18, 17, 18, 18, 18, 19, 18, 20, 21, 0, 0, 1, 2, 6, 5, 5, 5, 21, 12, 6, 5, 5, 8, 3, 7, 7, 8, 12, 7, 13, 23, 13, 18, 19, 19, 18, 12, 12, 12, 12, 17, 13, 12, 11, 11, 8, 12, 18, 18, 19, 20, 20, 1, 20, 1, 2, 5, 5, 16, 9, 9, 13, 12, 12, 12, 12, 12, 12, 12, 12, 17, 7, 12, 10, 10, 11, 12, 12, 12, 14, 15, 1, 12, 10, 12, 16, 11, 11, 0]
RaM = [34.5, 33.5, 42.2, 23.6, 18.6, 40.1, 53.9, 3.8, 19.2, 57.1, 51.1, 47.2, 41.7, 37.6, 30, 18.8, 20.8, 19.9, 2.6, 2.6, 4.6, 36.4, 56.8, 16.9, 31.6, 45.2, 59.6, 24.5, 23.9, 40.4, 42.7, 42.7, 33.9, 42, 8.9, 36.1, 52.4, 28.4, 32.2, 22.4, 46, 35.4, 35.6, 40.1, 47, 41.8, 36.6, 13.8, 29.8, 3.2, 29.9, 24.2, 12.9, 55.1, 40, 16.6, 53.6, 37.7, 42, 43.7, 21.9, 1.2, 15.8, 56.7, 18.9, 20.2, 50.4, 39.5, 31.4, 43.2, 53.8, 53.5, 58.9, 36.7, 6.1, 42.4, 42.7, 46.7, 24.2, 17, 55.6, 55.8, 37, 25.1, 25.4, 26.2, 30.8, 32, 35.7, 36.8, 35.4, 17.1, 44.6, 50.9, 44, 46.8, 14.8, 13.8, 18.8, 22.9, 3.2, 6.5, 33.2, 40, 47.8, 19, 32.5, 11.5, 57.6, 40.4]
DecDeg = ["+22", "-00", "+28", "-26", "+02", "-32", "-34", "-24", "-18", "-04", "-06", "-01", "+36", "-03", "+12", "-13", "-16", "-17", "-26", "-23", "-22", "-23", "-19", "-18", "-19", "-09", "+22", "-24", "+38", "-23", "+41", "+40", "+30", "+42", "+24", "+34", "+32", "+35", "+48", "+58", "-20", "-05", "-05", "+19", "+24", "-14", "-14", "-05", "+08", "-08", "+47", "+61", "+18", "-30", "-30", "+30", "+33", "+11", "+11", "+11", "+04", "-30", "+42", "+21", "+13", "+12", "+11", "-26", "-32", "-32", "+18", "-12", "-12", "+15", "-21", "+51", "-00", "+00", "-24", "-22", "+69", "+69", "-29", "+12", "+18", "+12", "+12", "+14", "+12", "+13", "+14", "+43", "-23", "+41", "+11", "+11", "+55", "+14", "+14", "+15", "+54", "+55", "+60", "-11", "+12", "+47", "-13", "+55", "+53", "+41"]
DecMin = ["01", "49", "23", "32", "05", "13", "49", "23", "31", "06", "16", "57", "28", "15", "10", "47", "11", "08", "16", "02", "30", "54", "01", "29", "15", "24", "43", "52", "32", "11", "16", "52", "39", "47", "20", "08", "33", "50", "26", "05", "44", "27", "16", "59", "07", "49", "30", "48", "00", "20", "12", "35", "10", "29", "58", "11", "02", "49", "39", "33", "28", "07", "02", "42", "05", "59", "49", "45", "21", "18", "47", "32", "38", "47", "55", "34", "01", "03", "31", "59", "04", "41", "52", "53", "11", "57", "24", "25", "33", "10", "30", "08", "52", "07", "42", "49", "01", "54", "25", "49", "21", "46", "42", "37", "35", "18", "03", "40", "23", "41"]

Mag = [8.4, 6.5, 6.2, 5.6, 5.6, 4.2, 4.1, 6.0, 7.7, 6.6, 6.3, 6.7, 5.8, 7.6, 6.2, 6.4, 7.0, 7.5, 6.8, 9.0, 6.5, 5.1, 6.9, 4.6, 4.6, 8.0, 7.4, 6.8, 7.1, 7.2, 3.4, 8.1, 5.7, 5.5, 5.3, 6.3, 6.2, 7.4, 4.6, 8.4, 4.6, 4.0, 9.0, 3.7, 1.6, 6.0, 5.2, 5.5, 8.4, 6.3, 8.4, 7.3, 7.6, 7.6, 6.3, 8.3, 8.8, 9.7, 9.6, 8.8, 9.7, 6.5, 8.6, 8.5, 9.3, 8.9, 6.1, 7.8, 7.6, 7.9, 8.2, 9.3, 9.0, 9.4, 8.5, 10.1, 8.9, 8.3, 7.7, 7.3, 9.9, 8.4, 7.6, 9.1, 9.1, 8.9, 8.6, 9.6, 9.8, 9.5, 10.2, 6.4, 6.0, 8.2, 9.7, 9.2, 9.9, 10.1, 9.9, 9.3, 7.9, 9.9, 7.4, 8.0, 9.3, 8.4, 7.9, 10.0, 9.8, 8.5]

x = 0

import random
import time
import datetime

print("\n\n\nWelcome to the Messier Hunter Introductory App! Please select an action from below by typing its corresponding number.\n\n!!!IMPORTANT!!! This app is designed for use by Northern hemisphere viewers. !!!IMPORTANT!!!\n")

def Return():
    time.sleep(1.5)
    MenuSelect()

def Object():
    global x
    x = x
    Season = ""

    if int(x) in winter:
        Season = "Winter"
    elif int(x) in spring:
        Season = "Spring"
    elif int(x) in summer:
        Season = "Summer"
    else:
        Season = "Autumn"

    print("------------------------\nCatalog Name: M" + str(x) + "\nCommon Name: " + Objects[int(x) - 1] + "\nObject Type: " + Type[int(x) - 1] + "\nConstellation: " + Constellation[int(x) - 1] + "\nOptimal Viewing Season: " + Season + "\nRight Ascenison: " + str(RaH[int(x) - 1]) + " hours " + str(RaM[int(x) - 1]) + " minutes\nDeclination: " + DecDeg[int(x) - 1] + " degrees " + DecMin[int(x) - 1] + " arcminutes\nApparent Visual Magnitude: +" + str(Mag[int(x) - 1]) + "\n------------------------\n")

def MenuSelect():
    global x

    print("\n1. What is the Messier Catalog?\n2. Find an object\n3. List all objects\n4. Pick a random object\n5. Show best objects for current viewing\n6. Program details\n7. Quit the program\n")
    
    try:
        Choice = int(input("Pick An Item: \n"))
        
        if Choice > 7 or Choice < 1:
            print("Oops! Looks like you've entered an invalid option! Please try again!")
            MenuSelect()
        
        elif Choice == 1: # Returns information on the Messier catalog
            print("\nThe Messier Catalog is a list of objects compiled by astronomer Charles Messier and his colleagues during his search for comets. Ironically, it was originally designed as a list of things not to look at - a catalog of objects which comet hunters might mistake for true comets. The catalog contains a mix of galaxies, nebulae, and various types of clusters, most of which can be easily found by any backyard astronomer using an average telescope. Nowadays, no longer a list of things to avoid, the Messier catalog is an excellent jumping-off point for beginners to dive deeper into astronomy.\n")
            time.sleep(5)
            Return()
        
        elif Choice == 2: # Rreturns a specific object from the list
            print("\nType the number of the Messier object you wish to view the details on below.\n")
            x = input("Object: ")
            int(x)
            
            if int(x) > 110 or int(x) < 1:
                print("Please enter a number between 1 and 100!")
            
            else:
                Object()
                time.sleep(1.5)
            MenuSelect()
        
        elif Choice == 3: # Returns all objects
            for i in range(110):
                x = i + 1
                Object()
            Return()
        
        elif Choice == 4: # Returns a random object from the list
            x = random.randint(1,110)
            Object()
            Return()
        
        elif Choice == 5: # Returnss best objects for current viewing
            month = datetime.datetime.now()
            print("\n")
            
            if month.month == 12 or month.month == 1 or month.month == 2:
                for i in range(len(winter)):
                    x = winter[i]
                    Object()
            
            elif month.month == 3 or month.month == 4 or month.month == 5:
                for i in range(len(spring)):
                    x = spring[i]
                    Object()
            
            elif month.month == 6 or month.month == 7 or month.month == 8:
                for i in range(len(summer)):
                    x = summer[i]
                    Object()
            
            else:
                for i in range(len(autumn)):
                    x = autumn[i]
                    Object()
            time.sleep(1.5)        
            MenuSelect()
        
        elif Choice == 6: # Returns information on the program
            print("\nThe Messier list object information was taken from the Royal Astronomical Society of Canada's database, and common names were found from an online database. RA and Dec are approximated as per the RASC catalog. \nhttps://www.messier-objects.com/messier-object-list\nhttp://www.messier.seds.org/data1.html")
            Return()
        
        elif Choice == 7: # Ends the program
            print("\n\nGoodbye!")
            time.sleep(1.5)
            for i in range(1000):
                print("\n")
            pass
    
    except:
        print("Whoops, that's not an integer! Please try again!")
        MenuSelect()

MenuSelect()