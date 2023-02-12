from curses import keyname
from PySimpleGUI import PySimpleGUI as sg
nome = ' '
msg = ''
# layout
def janela_login():
    sg.theme('Reddit')
    layout = [
        [sg.Text('Nome')],
        [sg.Input(key='nome')],
        [sg.Button('Continuar')]
    ]

    return sg.Window('Login', layout, finalize=True)

def janela_mensagem():
    sg.theme('Reddit')
    layout = [
        [sg.Text(key='msg')],
    ] 
    return sg.Window('Mostrar', layout, finalize=True)

# Janelas

janela1, janela2 = janela_login(), None

# Eventos

while True:
    window, event,values = sg.read_all_windows()
   
    # quando janela for fechada
    if event == sg.WIN_CLOSED:
        break
    # quando queremos ir pra proxima janela
    if window == janela1 and event == 'Continuar':
        nome=values['nome']
        janela2 = janela_mensagem()
        janela2['msg'].update('Obrigado por tudo ' + nome)
        janela1.hide()