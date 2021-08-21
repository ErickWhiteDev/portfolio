/* The program calculates whether the number of popsicles is evenly distributed among the siblings and outputs accordingly

Finished 8/18/21 */

using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace portfolio{
    class popsicles{
        static void Main(string[] args){
            int siblings, popsicles;
            siblings = Console.ToInt32(Console.ReadLine());
            popsicles = Console.ToInt32(Console.ReadLine());
            Console.write(popsicles % siblings == 0 ? "give away" : "eath them yourself");
        }
    }
} 