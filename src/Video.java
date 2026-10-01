// one class can inherit a class but implement multiple interfaces - comma separated

public class Video extends File implements Utility {

    @Override
    public void openAndExecute(){
        System.out.println("playing a video");
    }

    @Override
    public void transfer() {

    }

    @Override
    public void compress() {
        System.out.println("Compressing the video")
    }

    @Override
    public void delete() {

    }
}
