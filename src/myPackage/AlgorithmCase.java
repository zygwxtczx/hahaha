/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package myPackage;
import hahaha.EthicsCase;

/**
 *
 * @author 350265287
 */
public class AlgorithmCase extends EthicsCase {
    private String biasType;

    public AlgorithmCase(String caseTitle, String description, String biasType) {
        super(caseTitle, description, "Algorithm");
        this.biasType = biasType;
    }

    public String getBiasType() {
        return biasType;
    }

    @Override
    public String toString() {
        return "AlgorithmCase" +"caseTitle=" + getCaseTitle() +", description=" + getCaseDescription()+", category=" + getCategory() +", biasType=" + biasType +", verdict=" + getVerdict();
    }
}

