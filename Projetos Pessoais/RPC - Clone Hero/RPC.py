from pypresence import Presence
import time

musictime = 60
songname = "exemplo - exemplo"

client_id = ""
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