/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package simulatedhovering;

/**
 *
 * @author HP
 */
public class HoveringWorker implements Runnable{
    
    int timer_tick=0; MainForm parentForm;
    
    HoveringWorker(MainForm mf)
    {
        parentForm=mf;
    }
    
    @Override
    public void run()
    {
        timer_tick++;
        System.out.println("Timer Tick:" + timer_tick);
        
        if(timer_tick==3)
        {
            ///////////////////// The Hovering Event Goes here ////////////
            timer_tick=0;
            System.out.println("FUCK YEAH! Hover");
       
            parentForm.setMessage("Mouse Hover!");
        }
        else
        {
            parentForm.setMessage("No Hover!");
        }
    }
}
