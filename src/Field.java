//Prototype implementation of Field class
//Mandatory assignment 2
//Course 02158 Concurrent Programming, DTU, Fall 2020

//Hans Henrik Lovengreen     Oct 2, 2020

public class Field {
	int h = 11;
	int w = 12;
	Semaphore field[][];
    public Field() {
    	field = new Semaphore[h][w];
    	for (int i = 0; i < h; i++) {
			for (int j = 0; j < w; j++) {
				field[i][j] = new Semaphore(1);
			}
		}
    }

    /* Block until car no. may safely enter tile at pos */
    public void enter(int no, Pos pos) throws InterruptedException { 
    	field[pos.row][pos.col].P();
    }

    /* Release tile at position pos */
    public void leave(Pos pos) {
    	field[pos.row][pos.col].V();
    }

}
