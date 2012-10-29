package Command.CommandsToExecute;

import Command.Interface.CommandInterface;
import Command.Receiver.Light;

public class LightOn implements CommandInterface {

	Light light;

	public LightOn(Light light) {
		this.light = light;
	}

	@Override
	public void execute() {
		light.on();

	}

}
