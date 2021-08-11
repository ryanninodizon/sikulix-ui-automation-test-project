package dragonary.dragonaryauto;

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
		
		//Buttons
		Pattern missionButton = new Pattern(imagePath + "/images/missions_btn");
		Pattern storyButton = new Pattern(imagePath + "/images/story_btn");
		Pattern mission7Button = new Pattern(imagePath + "/images/mission7_btn");
		Pattern playButton = new Pattern(imagePath + "/images/play_btn");
		
		//Inside Fight Buttons
		Pattern playInsideFightButton = new Pattern(imagePath + "/images/play_inside_btn");
		Pattern manualButton = new Pattern(imagePath + "/images/manual_btn");
		Pattern speedButton = new Pattern(imagePath + "/images/speed_btn");
		Pattern claimButton = new Pattern(imagePath + "/images/claim_btn");
		Pattern continueButton = new Pattern(imagePath + "/images/continue_btn");
		Pattern exitButton = new Pattern(imagePath + "/images/exit_btn");
		
		try {
			
			
			
			while(true) {
				screen.click(missionButton);
				screen.click(storyButton);
				screen.click(mission7Button);
				screen.click(playButton);
				
				screen.click(playInsideFightButton);
				screen.click(manualButton);
				screen.click(speedButton);
				screen.click(claimButton);
				screen.click(continueButton);
				screen.click(exitButton);
			}
			
			
			
		} catch (FindFailed e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
