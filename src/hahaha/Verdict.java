/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hahaha;

/**
 *
 * @author 350265287fg
 */
public class Verdict {
    private String caseName;
    private String studentVerdict;
    private String reason;

    public Verdict() {}

    public Verdict(String caseName, String studentVerdict, String reason) {
        this.caseName = caseName;
        this.studentVerdict = studentVerdict;
        this.reason = reason;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getStudentVerdict() {
        return studentVerdict;
    }

    public void setStudentVerdict(String studentVerdict) {
        this.studentVerdict = studentVerdict;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "Verdict: " + "caseName=" + caseName +", studentVerdict=" + studentVerdict +", reason=" + reason;
    }
}
