package Command.CommandsToExecute;

import Command.Interface.CommandInterface;
import Command.Receiver.AirConditioner;

public class AirConditionerOn implements CommandInterface {
	AirConditioner ac;

	public AirConditionerOn(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOn();
		ac.increaseTemp();

	}

}
