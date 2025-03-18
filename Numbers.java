package edu.arapahoe.csc245;

    import java.util.*;
    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;


    public class Numbers {
        //add logger
        private static final Logger logger = LogManager.getLogger(Numbers.class);
        public static void main(String[] args) {
            //logger provides info message about application
            logger.info("Random number generator application started!");
            int[] data = new int[100];

            // Initialize array
            for (int i = 0; i < 100; i++)
                data[i] = (int)(Math.random() * 10000);

            Scanner input = new Scanner(System.in);

            System.out.print("Enter an index: ");
            int index = input.nextInt();

            try {
                System.out.println("The element is " + data[index]);
            }
            catch (Exception ex) {
                System.out.println("Out of Bounds");
            }
        }
    }
