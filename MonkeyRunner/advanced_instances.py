import game_mouse

def start_instances():
	select_advanced_instances()
	select_time_rift()

# def complete_time_rift():


# def complete_trial():

def select_advanced_instances():
	game_mouse.click(1300, 600)

def select_time_rift():
	game_mouse.click(600, 600)

def select_trials():
	game_mouse.click(1400, 600)

def select_tidal_temple():
	game_mouse.click(600, 600)

def select_dwarf_arsenal():
	game_mouse.click(1400, 600)

def select_crashed_hill():
	game_mouse.click(500, 600)

def select_cursed_city():
	game_mouse.click(1000, 600)

def select_valkyrie():
	game_mouse.click(1450, 600)

def select_difficulty_six():
	game_mouse.click(1450, 800)

def enter_challenge():
	game_mouse.click(1450, 800)

def fight_button():
	game_mouse.click_and_sleep(1700, 1000, 10)

def auto_fight_button():
	game_mouse.click_and_sleep(1800, 1000, 20)
