public class FrogSimulation
{
    private int goalDistance;
    private int maxHops;

    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        
    }

    public boolean simulate()
    {
        int totalDistance = 0;
        for(int i = 0; i < maxHops; i++)
        {
            totalDistance += hopDistance();
            if(totalDistance >= goalDistance)
            {
                return true;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        int successful = 0;
        for(int i = 0; i < num; i++)
        {
            if(simulate())
            {
                successful++;
            }
        }
        return (double) successful/num;
    }
}
