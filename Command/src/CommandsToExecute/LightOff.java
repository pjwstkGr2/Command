package CommandsToExecute;

import Command.Interface.CommandInterface;
import Command.Receiver.Light;

public class LightOff implements CommandInterface {

	Light light;

	public LightOff(Light light) {
		this.light = light;

	}

	@Override
	public void execute() {
		light.off();

	}

}
