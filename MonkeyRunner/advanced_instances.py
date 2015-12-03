import game_mouse

def start_instances():	select_advanced_instances()
	select_time_rift()

def select_advanced_instances():
	game_mouse.click(1300, 600)

def select_time_rift():
	game_mouse.click(600, 600)

def select_valkyrie():
	game_mouse.click(1450, 600)

def select_tidal_temple():
	game_mouse.click(600, 600)

def select_difficulty_six():
	game_mouse.click(1450, 800)

def enter_challenge():
	game_mouse.click(1450, 800)

def fight_button():
	game_mouse.click_and_sleep(1700, 1000, 10)

def auto_fight_button():
	game_mouse.click_and_sleep(1800, 1000, 20)


