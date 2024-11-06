class Database {
    private static Database instance;
    private Database() {}

    public static synchronized Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }
        return instance;
    }

    public void saveData(String data) {
        System.out.println("About Car => " + data);
    }
}
