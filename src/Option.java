public class Option {
    String description;
    int number;

    public void showArray(Option[] options){
        for (int i = 0; i < options.length; i++) {
            System.out.println(options[i].number + ".- " + options[i].description);
        }
    }
}

