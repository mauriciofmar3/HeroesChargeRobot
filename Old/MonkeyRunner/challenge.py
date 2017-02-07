import game_mouse

def start_challenges():
	for x in range(0, 11):
		start_challenge()

def start_challenge():
	up_button()
	challenge_button()
	fight_button()
	auto_fight_button()
	next_button()
	chest()
	ok_button()

def up_button():
	game_mouse.click_and_sleep(1650, 420, 3)

def challenge_button():
	game_mouse.click_and_sleep(1500, 850, 2)

def fight_button():
	game_mouse.click_and_sleep(1700, 1000, 10)

def auto_fight_button():
	game_mouse.click_and_sleep(1800, 1000, 20)

def next_button():
	game_mouse.click_and_sleep(1650, 900, 10)

def chest():
	game_mouse.click_and_sleep(1100, 620, 4)

def ok_button():
	game_mouse.click_and_sleep(1000, 700, 1)
