from pytube import Playlist
pl = Playlist("https://www.youtube.com/playlist?list=PLWsLEaXWWHvmpcbdOeEVMKtD1Yvjp2_UX")
pl.download_all()
