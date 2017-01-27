class AndySetup {
    public static void setupEmulator() {
    	// startAndy();

    	// startGame();
 		
        // GameMouse.drag(1439, 899, 800, 550);
        // GameMouse.drag(580, 291, 200, 291);
        // GameMouse.click(45, 155);
        // GameMouse.sleep(30000);
    }

    public static void resizeAndy() {
        GameMouse.drag(1439, 899, 800, 600);
    }

    public static void enlargeAndy() {
        GameMouse.drag(800, 600, 1439, 899);
    }

    public static void startAndy() {
        spotlight();
        GameMouse.type("andy");
        GameMouse.hitEnter();
        GameMouse.sleep(20000);
    }

    public static void startGame() {
        GameMouse.click(170, 220);
    	GameMouse.sleep(30000);
    }

    public static void spotlight() {
        GameMouse.click(1375, 10);
    }

    public static void closeAndy() {
        GameMouse.click(14, 33);
        GameMouse.click(491, 115);
    }
}