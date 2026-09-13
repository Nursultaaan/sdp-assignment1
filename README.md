Project Overview
This repository contains a Java Builder Design Pattern for a game character

Project Structure
Character.java - Product class and static inner Builder
CharacterDirector.java - Director class containing preset configurations (e.g., Mage)
Main.java - Client driver testing builder creation and director presets

The build() method guards against invalid state before instantiating the object
Every method does one thing 
Character fields are final and constructor is private
Builder provides default values
