from curses import keyname
from PySimpleGUI import PySimpleGUI as sg
nome = " "
profissao = " "
msg = " "
# layout
def janela_login():
    sg.theme("DarkPurple4")
    layout = [
        [sg.Text('Qual o teu nome?')],
        [sg.Input(key='nome')],
        [sg.Button('Continue')]
        
    ]

    return sg.Window('Login', layout, finalize=True)

def janela_profissao():
    sg.theme("DarkPurple4")
    layout = [
        [sg.Text("Selecione tua profissão.")],
        [sg.Button("Bartender")],
        [sg.Button("Jornalista")],
        [sg.Button("Lutador")],
    ]

    return sg.Window('Classe', layout, finalize=True)

def janela_boasvindas():
    sg.theme("DarkPurple4")
    layout = [
        [sg.Text(key="msg")],
    ]

    return sg.Window('boasvindas', layout, finalize=True)

# Janelas

janela1, janela2, janela3 = janela_login(), None, None

# Eventos

while True:
    window, event, values = sg.read_all_windows()
   
    # quando janela for fechada
    if event == sg.WIN_CLOSED:
        break
    # quando queremos ir pra proxima janela
    if window == janela1 and event == 'Continue':
        nome=values['nome']
        janela1.hide()
        janela2 = janela_profissao
    if window == janela2 and event == "Bartender":
            janela3 = janela_boasvindas
            janela3["msg"].update("Bem vindo a VA-11 Hall-A" + nome + "!" + "Você é um Bartender.")


