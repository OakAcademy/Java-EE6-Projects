package com.DI;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

interface ILogger {
	public void LogContext();
}

class HoldFileLog implements ILogger {

	@Override
	public void LogContext() {
		// TODO Auto-generated method stub

	}

}

class HoldDBLogs implements ILogger {
	@Override
	public void LogContext() {

	}
}

class ManageLogs {
	private ILogger _Ilogger;

	public ManageLogs(ILogger logger) {
		_Ilogger = logger;
	}

	public void LogContext() {
		_Ilogger.LogContext();
	}
}
