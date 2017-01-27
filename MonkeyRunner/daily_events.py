import game_mouse

def do_daily_events():
	do_daily_sign_in()
	do_daily_midas()
	claim_daily_events()


######### midas #########

def claim_daily_events():
	daily_events_button()
	for x in xrange(1, 2):
		daily_events_claim_button()
		daily_events_ok_button
	game_mouse.back_button()

def daily_events_button():
	game_mouse.click(100, 700)

def daily_events_claim_button():
	game_mouse.click(1000, 300)

def daily_events_ok_button():
	game_mouse.click(1000, 600)



######### midas #########

def do_daily_midas():
	midas_coin_button()
	midas_use_button()
	midas_exit_button()

def midas_coin_button():
	game_mouse.click(70, 70)

def midas_use_button():
	game_mouse.click(350, 830)

def midas_exit_button():
	game_mouse.click(1800, 150)


######### daily sign in #########

def do_daily_sign_in():
	sign_in_button()
	sign_in_claim_button()
	sign_in_exit_button()

def sign_in_button():
	game_mouse.click(100, 200)

def sign_in_claim_button():
	game_mouse.click(1600, 950)

def sign_in_exit_button():
	game_mouse.click(1750, 100)