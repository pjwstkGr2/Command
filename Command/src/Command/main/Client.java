package Command.main;

import Command.CommandsToExecute.AirConditionerOn;
import Command.CommandsToExecute.LightOn;
import Command.Interface.CommandInterface;
import Command.Invoker.RemoteController;
import Command.Receiver.AirConditioner;
import Command.Receiver.Light;

public class Client {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RemoteController remote = new RemoteController();
		Light light = new Light();
		AirConditioner ac = new AirConditioner();

		CommandInterface command1 = new LightOn(light);
		CommandInterface command2 = new AirConditionerOn(ac);

		remote.setCommand(command1);
		remote.executeCommand(command1);

		remote.setCommand(command2);
		remote.executeCommand(command2);

	}
}
