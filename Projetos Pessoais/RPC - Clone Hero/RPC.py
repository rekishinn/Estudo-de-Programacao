from pypresence import Presence
import time

musictime = 120
songname = "Engenheiros do Hawaii - Nunca Mais Poder"

client_id = "1001680490887123074"
RPC = Presence(client_id)
RPC.connect()


while True:
    RPC.update(
        state="Playing Song",
        details=songname,
        large_image="game",
        end=int(time.time()+musictime)
    )

    time.sleep(15)