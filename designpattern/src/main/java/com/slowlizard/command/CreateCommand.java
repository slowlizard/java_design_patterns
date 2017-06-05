package com.slowlizard.command;

public class CreateCommand implements Command {
	private Receiver receiver;

	public CreateCommand(Receiver receiver) {
		this.receiver = receiver;
	}

	public void create() {
		this.receiver.realExecute();

	}

	public void undo() {
		System.out.println("ondo");
	}

}
