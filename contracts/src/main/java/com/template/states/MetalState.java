package com.template.states;

import com.template.contracts.MetalContract;
import com.template.contracts.TemplateContract;
import net.corda.core.contracts.BelongsToContract;
import net.corda.core.contracts.ContractState;
import net.corda.core.identity.AbstractParty;
import net.corda.core.identity.Party;

import java.util.Arrays;
import java.util.List;

// *********
// * State *
// *********
@BelongsToContract(MetalContract.class)
public class MetalState implements ContractState {

    private String metalName;
    private int weight;
    private Party issuer;
    private Party owner;

    public MetalState(String metalName, int weight, Party issuer, Party owner) {
        this.metalName = metalName;
        this.weight = weight;
        this.issuer = issuer;
        this.owner = owner;
    }

    @Override
    public List<AbstractParty> getParticipants() {
        return Arrays.asList(issuer, owner);
    }

    public String getMetalName() {return metalName;}
    public int getWeight() {return weight;}
    public Party getIssuer() {return issuer;}
    public Party getOwner() {return owner;}

}