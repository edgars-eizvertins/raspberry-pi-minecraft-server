if ! screen -list | grep -q "minecraft"; then
  cd /home/pi/minecraft
  screen -S minecraft -d -m java -jar  -Xms512M -Xmx1008M spigot-1.13.2.jar nogui 
fi
