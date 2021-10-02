package datastructure.algorithms.OOD.manufactureExample.processes;

public abstract class GeneralManufacturingProcess {

    private String processName;

    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    public GeneralManufacturingProcess(String processName) {
        this.processName = processName;
    }

    // template method (defines the flow of the process)
    public void launchProcess() {
        if (this.processName != null && !this.processName.isEmpty()) {
            assembly();
            testing();
            packaging();
            storage();
        } else {
            System.out.println("No process name was specified");
        }

    }

    protected abstract void assembly(); // protected to only allow children access to these
    protected abstract void testing();
    protected abstract void packaging();
    protected abstract void storage();
}
