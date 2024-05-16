# SikuliX UI automation test project

This project is simply for testing and I have used the Dragonary game as my main example. But it can also work for other applications.

You can check this file for a sample usage.
> dragonaryauto/src/test/java/dragonary/dragonaryauto/DragonAuto.java

```java
import org.apache.tools.ant.types.resources.comparators.Exists;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class DragonAuto {
	
	public static void main(String[] args) {
		DragonAuto object = new DragonAuto();
		object.Play();		
	}
	
	private synchronized  void Play() {		
		Screen screen = new Screen();		
		String imagePath = System.getProperty("user.dir") + "\\";
		
		Pattern missionButton = new Pattern(imagePath + "/images/missions_btn");
		while(true) {
			try {
				screen.click(missionButton);
			} catch (FindFailed e) {
				e.printStackTrace();
			}			
		}
	}	
}
```

**Sikuli X dependency should be added:**
> dragonaryauto/pom.xml

```xml
<!-- https://mvnrepository.com/artifact/com.sikulix/sikulixapi -->
<dependency>
    <groupId>com.sikulix</groupId>
    <artifactId>sikulixapi</artifactId>
    <version>2.0.5</version>
</dependency>
```

# See these videos to see how I created and utilized it.
> I am still using Eclipse IDE in the video but I think this project can still work with VS code.

-  [AUTOPLAY using SikuliX Project (Part 1)](https://youtu.be/TUUWTE534wE).
-  [AUTOPLAY using SikuliX Project (Part 2)](https://youtu.be/DvJos-TVoDk).
