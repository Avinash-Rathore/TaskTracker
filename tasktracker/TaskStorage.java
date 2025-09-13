package tasktracker;

//import java.io.FileReader;
//import java.io.FileWriter;
//import java.io.IOException;
//import java.lang.reflect.Type;
//import java.util.ArrayList;
//import java.util.List;
//import com.google.gson.Gson;
//import com.google.gson.GsonBuilder;
//import com.google.gson.reflect.TypeToken;

public class TaskStorage {
	public static final String FILE_NAME = "C:\\Users\\asus\\OneDrive\\task.json";
//	private static final Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
//	public static List<Task> loadTask(){
//		try{
//			FileReader read = new FileReader(FILE_NAME);
//			Type listType = new TypeToken<List<Task>>() {}.getType();
//			  List<Task> tasks = gson.fromJson(read, listType);
//			  return tasks != null ? tasks : new ArrayList<>();
//		}
//		catch(Exception e) {
//			return new ArrayList<>();
//		}
//		
//	}
//	public static void saveTask(List<Task> tasks) {
//		 try (FileWriter writer = new FileWriter(FILE_NAME)) {
//	            gson.toJson(tasks, writer);
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	}
}
