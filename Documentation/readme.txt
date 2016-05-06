
README

In addition to this "Readme.txt" file please refer to folder "Documentation" (within the app structure) for the layout design (LayoutDesign.pdf)
 and folder "screenshotsOfApp" (outside of the app folder structure) for the screenshots of the app via the emulators.

Simple app developed as the project for the Android Study Jam.
The app presents to the user five places to visit in Washington State (year round, event, or seasonal).
There is a simple infinite animation through a series of images from the Blue Angle Air Show in 2015 to make the app look a little more interesting dynamically (animation time per image: 1 sec)
The ImageView for the tulip field is clickable which open the secondary activity to display the image in full screen retaining the aspect ratio.

The app use: ScrollView, LinearLayout, TextView, ImageView, and Button
Here is the link to the video clip where I show my simple app:
Places to see in Washington States: https://youtu.be/A6mk6yd3WUc

* Ideas for improvement given more time to study and investigate:
	- More places added
	- Link to Google Map and/or driving direction
	- Reduce the number of static data by increasing the number of dynamic data
	- Dynamically/semi-dynamically update dynamic data
	- User ratings
	- User feedbacks
	- User suggestions to the app
	- Improve styling
	- Localization
	- Performance (?)
	- User suggestion/input to add more places to the app
	

* Environment and tools used:
	- OS: 64-bit Windows 10 Professional
	- IDE: Android Studio 2.1
	- JRE: 1.8.0
	- Emulators:
		+ Genymotion with VirtualBox: (primary used)
			. Processor: 4
			. Basic memory: 4,096 MB
			. Predefined: 1080x1920 - 480dpi
			. Show Android navigation bar
			
		+ Android Virtual Device (AVD): (secondary)
			. Nexus 5 API 23
			. Nexus 5: 4.95" 1080x1920 xxhdpi
			. scale: auto
			. Graphics: Auto
			. Enable Device Frame
			. Multi-Core CPU: 2
			. RAM 1600 MB
			. VM heap: 256 MB
			. Internal storage: 800 MB
			. SD card: studio managed: 100 MB
			
The app is tested with Android emulator as I current do not own an android device.

It is thanks to the Seattle GDG - Android Study Jam and Udacity that introduces me to Android app development.
Thank you, Margaret Maynard-Reid, other co-organizer(s), and coaches.

Thanks,
Triet Huynh | triethuynh05@outlook.com
