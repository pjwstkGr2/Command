package Command.CommandsToExecute;

import Command.Interface.CommandInterface;
import Command.Receiver.AirConditioner;

public class AirConditionerOff implements CommandInterface {

	AirConditioner ac;

	public AirConditionerOff(AirConditioner ac) {
		this.ac = ac;
	}

	@Override
	public void execute() {
		ac.turnOff();
		ac.decreaseTemp();
	}

}
