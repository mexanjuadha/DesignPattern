package com.icehousecorp.gof.strategypattern;

/**
 * Created by mexanjuadha on 4/8/16.
 */
public class SoftwareEngineer {

    private int experiences;

    private String name;

    private int skill;

    protected Code code;

    public int getExperiences() {
        return experiences;
    }

    public void setExperiences(int experiences) {
        this.experiences = experiences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSkill() {
        return skill;
    }

    public void setSkill(int skill) {
        this.skill = skill;
    }

    public void work() {
        code.doCoding();
    }

    private void setWorking(Code working) {
        code = working;
    }
}
