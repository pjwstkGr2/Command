package Command.Invoker;

import Command.Interface.CommandInterface;

public class RemoteController { //obiekt wywolujacy

	CommandInterface command;
	
	public void setCommand(CommandInterface command){
		this.command = command;
	}
	
	public void executeCommand(CommandInterface command){
		command.execute();
	}
}
