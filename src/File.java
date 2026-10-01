public class File {
    String file_name;
    String file_type;
    int creation_time;

    // Default constructor
    File() {
        this.file_name = "null";
        this.file_type = "null";
        this.creation_time = 8;
    }

    // Overloaded constructor
    File(String file_name, String file_type, int creation_time) {
        this.file_name = file_name;
        this.file_type = file_type;
        this.creation_time = creation_time;
    }

    // Setter for creation_time
    void setCreationTime(int creation_time) {
        this.creation_time = creation_time;
    }

    // Getter for creation_time
    int getCreationTime() {
        return creation_time;
    }

    // Abstract method
    public abstract void openAndExecute();
}





