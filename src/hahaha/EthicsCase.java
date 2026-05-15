/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hahaha;

/**
 *
 * @author 350265287
 */
public class EthicsCase {
    private String caseTitle;
    private String description;
    private String category;
    private Verdict verdict;

    public EthicsCase(String caseTitle, String description, String category) {
        this.caseTitle = caseTitle;
        this.description = description;
        this.category = category;
        this.verdict = new Verdict();
    }

    public String getCaseTitle() {
        return caseTitle;
    }

    public String getCaseDescription() {
        return description;
    }

    public String getCategory() {
        return category;
    }

    public Verdict getVerdict() {
        return verdict;
    }

    public void setVerdict(Verdict verdict) {
        this.verdict = verdict;
    }

    @Override
    public String toString() {
        return "EthicsCase" +"caseTitle=" + caseTitle +   ", description=" + description  +", category=" + category  +", verdict=" + verdict;
    }
}

