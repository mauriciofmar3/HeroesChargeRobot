
from com.android.monkeyrunner import MonkeyRunner, MonkeyDevice
import game_mouse
import advanced_instances
import time

def printStuff():
	print "HELLO"

def printMouse():
	game_mouse.printMouse()

# Imports the monkeyrunner modules used by this program

# Connects to the current device, returning a MonkeyDevice object
device = MonkeyRunner.waitForConnection()

def touch():
	device.touch(300, 300, MonkeyDevice.DOWN_AND_UP)

def game_mouse_touch():
	game_mouse.click(300, 300)


def do_instances():
	advanced_instances.start_instances()

# Installs the Android package. Notice that this method returns a boolean, so you can test
# to see if the installation worked.
# device.installPackage('myproject/bin/MyApplication.apk')

# sets a variable with the package's internal name
# package = 'com.example.android.myapplication'

# sets a variable with the name of an Activity in the package
# activity = 'com.example.android.myapplication.MainActivity'

# sets the name of the component to start
# runComponent = package + '/' + activity

# Runs the component
# device.startActivity(component=runComponent)

# Presses the Menu button
# device.press('KEYCODE_MENU', MonkeyDevice.DOWN_AND_UP)

def screenshot():
	result = device.takeSnapshot()
	result.writeToFile('/Users/mau/HeroesChargeRobot/MonkeyRunner/screenshots/' + str(time.time()) + '.png','png')