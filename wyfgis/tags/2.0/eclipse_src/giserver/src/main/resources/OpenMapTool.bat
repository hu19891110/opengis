@echo off
start ../../../../../java/bin/javaw -Djava.ext.dirs=../lib -Xms64m -Xmx256m -Xss2m -XX:PermSize=64m -XX:MaxPermSize=256m -XX:NewSize=32m -XX:MaxNewSize=256m com.gi.desktop.maptool.MapToolApp