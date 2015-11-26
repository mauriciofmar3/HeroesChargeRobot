
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice
import game
import time

def printMouse():
	print "Mouse"

    # public static OperationQueue operationQueue;
    # static {
    #     operationQueue = new OperationQueue();
    # }

def click(x, y):
	click_and_sleep(x, y, 2.5)

def click_and_sleep(x, y, sleep):
	game.device.touch(x, y, MonkeyDevice.DOWN_AND_UP)
	time.sleep(sleep)

def drag(point1, point2):
	game.device.drag(point1, point2, 1, 10)
    
#     public static void drag(int x1, int y1, int x2, int y2) {
#         try {
#             Robot bot = new Robot();
#             bot.mouseMove(x1, y1);
#             bot.mousePress(InputEvent.getMaskForButton(1));
#             Thread.sleep(1000);
#             bot.mouseMove(x2, y2);
#             bot.mouseRelease(InputEvent.getMaskForButton(1));
#             Thread.sleep(1500);
#         } catch (Exception e) { }
#     }

#     public static void clickSimulator() {
#         click(40, 510, 750);
#     }

#     public static void sleep(int sleepTime) {
#         try {
#             Thread.sleep(sleepTime);
#             if (sleepTime > 2100) {
#                 clickSimulator();
#             }
#         } catch (Exception e) { }
#     }

#     public static void type(String s) {
#         try {
#             Robot bot = new Robot();
#             for (int i = 0; i < s.length(); i++) {
#                 char c = s.charAt(i);
#                 if (Character.isUpperCase(c)) {
#                     bot.keyPress(KeyEvent.VK_SHIFT);
#                 }
#                 bot.keyPress(Character.toUpperCase(c));
#                 bot.keyRelease(Character.toUpperCase(c));

#                 if (Character.isUpperCase(c)) {
#                     bot.keyRelease(KeyEvent.VK_SHIFT);
#                 }
#             }
#             sleep(1000);
#         } catch (Exception e) { }
#     }

#     public static void hitEnter() {
#         try {
#             Robot bot = new Robot();
#             bot.keyPress(KeyEvent.VK_ENTER);
#             bot.keyRelease(KeyEvent.VK_ENTER);
#         } catch (Exception e) { }
#     }

#     public static int dayOfWeek() {
#         final Calendar c = Calendar.getInstance();
#         return c.get(Calendar.DAY_OF_WEEK) - 1;
#     }

#     public static void addTask(Task task) {
#         operationQueue.addTask(task);
#     }
# }