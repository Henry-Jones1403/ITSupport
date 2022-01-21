package com.company;

public class Device {

    protected String IdentificationCode;
    protected String MakeAndModel;
    protected String Owner;
    protected String problemDescription;
    protected String RepairNotes;
    protected int priority;

    public Device(String identificationCode, String makeAndModel, String owner, String problemDescription, String repairNotes, int priority) {
        this.IdentificationCode = identificationCode;
        this.MakeAndModel = makeAndModel;
        this.Owner = owner;
        this.problemDescription = problemDescription;
        this.RepairNotes = repairNotes;
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "Device{" +
                "IdentificationCode='" + IdentificationCode + '\'' +
                ", MakeAndModel='" + MakeAndModel + '\'' +
                ", Owner='" + Owner + '\'' +
                ", problemDescription='" + problemDescription + '\'' +
                ", RepairNotes='" + RepairNotes + '\'' +
                ", priority=" + priority +
                '}';
    }

    public String getIdentificationCode() {
        return IdentificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        IdentificationCode = identificationCode;
    }

    public String getMakeAndModel() {
        return MakeAndModel;
    }

    public void setMakeAndModel(String makeAndModel) {
        MakeAndModel = makeAndModel;
    }

    public String getOwner() {
        return Owner;
    }

    public void setOwner(String owner) {
        Owner = owner;
    }

    public String getProblemDescription() {
        return problemDescription;
    }

    public void setProblemDescription(String problemDescription) {
        this.problemDescription = problemDescription;
    }

    public String getRepairNotes() {
        return RepairNotes;
    }

    public void setRepairNotes(String repairNotes) {
        RepairNotes = repairNotes;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }
}
