package com.example.furamaweb.model.contract;

import javax.persistence.*;

@Entity
@Table(name = "Contract_Detail")
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "Contract_Id")
    private Contract contract;

    @ManyToOne
    @JoinColumn(name = "Attach_Facility_Id")
    private AttachFacility attachFacility;

    @Column(name = "Quantity")
    private Integer quantity;

    public ContractDetail() {
    }

    public ContractDetail(Integer id, Contract contract, AttachFacility attachFacility, Integer quantity) {
        this.id = id;
        this.contract = contract;
        this.attachFacility = attachFacility;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachFacility getAttachFacility() {
        return attachFacility;
    }

    public void setAttachFacility(AttachFacility attachFacility) {
        this.attachFacility = attachFacility;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}
