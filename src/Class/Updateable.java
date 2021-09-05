package Class;

import java.util.ArrayList;

public interface Updateable {
        
	public boolean create();
	public boolean delete();
	public boolean update();
	public boolean read();
        public ArrayList<String> getData();
        public ArrayList<String> getAllName();
}
