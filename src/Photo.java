public class Photo extends File implements Utility {

    public void openAndExecute(){
        System.out.println("opening a photo");
    }

    @Override
    public void transfer() {

    }

    @Override
    public void compress() {
        System.out.println("Compressing the video");
    }

    @Override
    public void delete() {

    }
}
