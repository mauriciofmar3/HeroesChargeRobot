import game_mouse
import time
import game

def do_all_crusades():
	# enter_crusades()
	complete_crusade(0)
	complete_crusade(1)
	complete_crusade(2)
	game.screenshot_with_name('crusade_dragged_1')
	drag_left()
	game.screenshot_with_name('crusade_dragged_2')
	complete_crusade(3)
	complete_crusade(4)
	complete_crusade(5)
	complete_crusade(6)
	drag_left()
	game.screenshot_with_name('crusade_dragged_3')
	complete_crusade(7)
	complete_crusade(8)
	complete_crusade(9)
	complete_crusade(10)
	complete_crusade(11)
	drag_left()
	game.screenshot_with_name('crusade_dragged_4')
	complete_crusade(12)
	complete_crusade(13)
	complete_crusade(14)

def enter_crusades():
	game_mouse.click(1600, 400)

def drag_left():
	game_mouse.drag((1400, 400), (0, 400))
	game_mouse.drag((1400, 400), (0, 400))
	
def complete_crusade(crusade):
	complete_crusade_fight(crusade)
	complete_treasure(crusade)

def complete_crusade_fight(crusade):
	select_crusade_or_treasure(crusade_point(crusade))
	crusade_fight_button()
	fight_button()
	auto_fight_button()
	next_button()

def complete_treasure(crusade):
	select_crusade_or_treasure(treasure_point(crusade))
	if crusade % 3 == 2:
		treasure_lower_ok_button()
	else:
		treasure_ok_button()

def select_crusade_or_treasure(point):
	game_mouse.click(point[0], point[1])

def crusade_fight_button():
	game_mouse.click(950, 710)

def fight_button():
	game_mouse.click_and_sleep(1700, 1000, 8)

def auto_fight_button():
	game_mouse.click_and_sleep(1800, 1000, 40)

def next_button():
	game_mouse.click_and_sleep(1650, 900, 10)

def treasure_ok_button():
	game_mouse.click(950, 710)

def treasure_lower_ok_button():
	game_mouse.click(1000, 84)

def crusade_point(crusade):
	array = [(550, 400),
			 (500, 750),
			 (1300, 700),
			 (200, 750),
			 (440, 440),
			 (900, 300),
			 (1250, 550),
			 (500, 780),
			 (1260, 700),
			 (750, 550),
			 (450, 300),
			 (1250, 350),
			 (950, 470),
			 (900, 790),
			 (1550, 820)]
	return array[crusade]

def treasure_point(crusade):
	array = [(300, 600),
			(890, 770),
			(1520, 730),
			(420, 620),
			(120, 270),
			(1150, 330),
			(1500, 780),
			(870, 800),
			(1000, 640),
			(530, 450),
			(780, 300),
			(1580, 370),
			(1010, 620),
			(1220, 830),
			(1540, 420)]
	return array[crusade]






