package strategy;

public class Main {
    public static void main(String[] args) {
        ImageManager imageManager = new ImageManager();
        imageManager.setRenderer(new SmartPhoneRenderer());
        imageManager.show();
        imageManager.setRenderer(new LaptopRenderer());
        imageManager.show();
        imageManager.setRenderer(new TVRenderer());
        imageManager.show();
    }
}
