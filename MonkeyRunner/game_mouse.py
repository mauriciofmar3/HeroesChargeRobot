
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice
import game
import time

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
	# game.device.drag(point1, point2, 1, 30)
	game.device.touch(point1[0], point1[1], MonkeyDevice.DOWN)
	time.sleep(2.5)
	game.device.touch(point2[0], point2[1], MonkeyDevice.DOWN)
	time.sleep(2.5)
	game.device.touch(point2[0], point2[1], MonkeyDevice.UP)
	time.sleep(2.5)

def back_button():
	game.device.press("KEYCODE_BACK", "DOWN_AND_UP")
    
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

#     public static int dayOfWeek() {
#         final Calendar c = Calendar.getInstance();
#         return c.get(Calendar.DAY_OF_WEEK) - 1;
#     }

#     public static void addTask(Task task) {
#         operationQueue.addTask(task);
#     }
# }