
package org.hl7.v3;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for REPC_MT000300UV01.Subject4 complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="REPC_MT000300UV01.Subject4">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;group ref="{urn:hl7-org:v3}InfrastructureRootElements"/>
 *         &lt;element name="priorityNumber" type="{urn:hl7-org:v3}INT" minOccurs="0"/>
 *         &lt;element name="conjunctionCode" type="{urn:hl7-org:v3}CS" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="actReference1" type="{urn:hl7-org:v3}REPC_MT000100UV01.ActReference"/>
 *           &lt;choice>
 *             &lt;element name="act" type="{urn:hl7-org:v3}REPC_MT000100UV01.Act"/>
 *             &lt;element name="encounter" type="{urn:hl7-org:v3}REPC_MT000100UV01.Encounter"/>
 *             &lt;element name="observation" type="{urn:hl7-org:v3}REPC_MT000100UV01.Observation"/>
 *             &lt;element name="organizer" type="{urn:hl7-org:v3}REPC_MT000100UV01.Organizer"/>
 *             &lt;element name="procedure" type="{urn:hl7-org:v3}REPC_MT000100UV01.Procedure"/>
 *             &lt;element name="substanceAdministration" type="{urn:hl7-org:v3}REPC_MT000100UV01.SubstanceAdministration"/>
 *             &lt;element name="supply" type="{urn:hl7-org:v3}REPC_MT000100UV01.Supply"/>
 *           &lt;/choice>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{urn:hl7-org:v3}InfrastructureRootAttributes"/>
 *       &lt;attribute name="nullFlavor" type="{urn:hl7-org:v3}NullFlavor" />
 *       &lt;attribute name="typeCode" type="{urn:hl7-org:v3}ActRelationshipType" fixed="SUBJ" />
 *       &lt;attribute name="contextControlCode" type="{urn:hl7-org:v3}ContextControl" default="AN" />
 *       &lt;attribute name="contextConductionInd" type="{urn:hl7-org:v3}bl" default="true" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "REPC_MT000300UV01.Subject4", propOrder = {
    "realmCode",
    "typeId",
    "templateId",
    "priorityNumber",
    "conjunctionCode",
    "actReference1",
    "act",
    "encounter",
    "observation",
    "organizer",
    "procedure",
    "substanceAdministration",
    "supply"
})
public class REPCMT000300UV01Subject4 {

    protected List<CS> realmCode;
    protected II typeId;
    protected List<II> templateId;
    protected INT priorityNumber;
    protected CS conjunctionCode;
    protected REPCMT000100UV01ActReference actReference1;
    protected REPCMT000100UV01Act act;
    protected REPCMT000100UV01Encounter encounter;
    protected REPCMT000100UV01Observation observation;
    protected REPCMT000100UV01Organizer organizer;
    protected REPCMT000100UV01Procedure procedure;
    protected REPCMT000100UV01SubstanceAdministration substanceAdministration;
    protected REPCMT000100UV01Supply supply;
    @XmlAttribute(name = "nullFlavor")
    protected List<String> nullFlavor;
    @XmlAttribute(name = "typeCode")
    protected List<String> typeCode;
    @XmlAttribute(name = "contextControlCode")
    protected String contextControlCode;
    @XmlAttribute(name = "contextConductionInd")
    protected Boolean contextConductionInd;

    /**
     * Gets the value of the realmCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the realmCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRealmCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CS }
     * 
     * 
     */
    public List<CS> getRealmCode() {
        if (realmCode == null) {
            realmCode = new ArrayList<CS>();
        }
        return this.realmCode;
    }

    /**
     * Gets the value of the typeId property.
     * 
     * @return
     *     possible object is
     *     {@link II }
     *     
     */
    public II getTypeId() {
        return typeId;
    }

    /**
     * Sets the value of the typeId property.
     * 
     * @param value
     *     allowed object is
     *     {@link II }
     *     
     */
    public void setTypeId(II value) {
        this.typeId = value;
    }

    /**
     * Gets the value of the templateId property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the templateId property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemplateId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link II }
     * 
     * 
     */
    public List<II> getTemplateId() {
        if (templateId == null) {
            templateId = new ArrayList<II>();
        }
        return this.templateId;
    }

    /**
     * Gets the value of the priorityNumber property.
     * 
     * @return
     *     possible object is
     *     {@link INT }
     *     
     */
    public INT getPriorityNumber() {
        return priorityNumber;
    }

    /**
     * Sets the value of the priorityNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link INT }
     *     
     */
    public void setPriorityNumber(INT value) {
        this.priorityNumber = value;
    }

    /**
     * Gets the value of the conjunctionCode property.
     * 
     * @return
     *     possible object is
     *     {@link CS }
     *     
     */
    public CS getConjunctionCode() {
        return conjunctionCode;
    }

    /**
     * Sets the value of the conjunctionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CS }
     *     
     */
    public void setConjunctionCode(CS value) {
        this.conjunctionCode = value;
    }

    /**
     * Gets the value of the actReference1 property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01ActReference }
     *     
     */
    public REPCMT000100UV01ActReference getActReference1() {
        return actReference1;
    }

    /**
     * Sets the value of the actReference1 property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01ActReference }
     *     
     */
    public void setActReference1(REPCMT000100UV01ActReference value) {
        this.actReference1 = value;
    }

    /**
     * Gets the value of the act property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Act }
     *     
     */
    public REPCMT000100UV01Act getAct() {
        return act;
    }

    /**
     * Sets the value of the act property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Act }
     *     
     */
    public void setAct(REPCMT000100UV01Act value) {
        this.act = value;
    }

    /**
     * Gets the value of the encounter property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Encounter }
     *     
     */
    public REPCMT000100UV01Encounter getEncounter() {
        return encounter;
    }

    /**
     * Sets the value of the encounter property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Encounter }
     *     
     */
    public void setEncounter(REPCMT000100UV01Encounter value) {
        this.encounter = value;
    }

    /**
     * Gets the value of the observation property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Observation }
     *     
     */
    public REPCMT000100UV01Observation getObservation() {
        return observation;
    }

    /**
     * Sets the value of the observation property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Observation }
     *     
     */
    public void setObservation(REPCMT000100UV01Observation value) {
        this.observation = value;
    }

    /**
     * Gets the value of the organizer property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Organizer }
     *     
     */
    public REPCMT000100UV01Organizer getOrganizer() {
        return organizer;
    }

    /**
     * Sets the value of the organizer property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Organizer }
     *     
     */
    public void setOrganizer(REPCMT000100UV01Organizer value) {
        this.organizer = value;
    }

    /**
     * Gets the value of the procedure property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Procedure }
     *     
     */
    public REPCMT000100UV01Procedure getProcedure() {
        return procedure;
    }

    /**
     * Sets the value of the procedure property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Procedure }
     *     
     */
    public void setProcedure(REPCMT000100UV01Procedure value) {
        this.procedure = value;
    }

    /**
     * Gets the value of the substanceAdministration property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01SubstanceAdministration }
     *     
     */
    public REPCMT000100UV01SubstanceAdministration getSubstanceAdministration() {
        return substanceAdministration;
    }

    /**
     * Sets the value of the substanceAdministration property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01SubstanceAdministration }
     *     
     */
    public void setSubstanceAdministration(REPCMT000100UV01SubstanceAdministration value) {
        this.substanceAdministration = value;
    }

    /**
     * Gets the value of the supply property.
     * 
     * @return
     *     possible object is
     *     {@link REPCMT000100UV01Supply }
     *     
     */
    public REPCMT000100UV01Supply getSupply() {
        return supply;
    }

    /**
     * Sets the value of the supply property.
     * 
     * @param value
     *     allowed object is
     *     {@link REPCMT000100UV01Supply }
     *     
     */
    public void setSupply(REPCMT000100UV01Supply value) {
        this.supply = value;
    }

    /**
     * Gets the value of the nullFlavor property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nullFlavor property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNullFlavor().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNullFlavor() {
        if (nullFlavor == null) {
            nullFlavor = new ArrayList<String>();
        }
        return this.nullFlavor;
    }

    /**
     * Gets the value of the typeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the typeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getTypeCode() {
        if (typeCode == null) {
            typeCode = new ArrayList<String>();
        }
        return this.typeCode;
    }

    /**
     * Gets the value of the contextControlCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContextControlCode() {
        if (contextControlCode == null) {
            return "AN";
        } else {
            return contextControlCode;
        }
    }

    /**
     * Sets the value of the contextControlCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContextControlCode(String value) {
        this.contextControlCode = value;
    }

    /**
     * Gets the value of the contextConductionInd property.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isContextConductionInd() {
        if (contextConductionInd == null) {
            return true;
        } else {
            return contextConductionInd;
        }
    }

    /**
     * Sets the value of the contextConductionInd property.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setContextConductionInd(Boolean value) {
        this.contextConductionInd = value;
    }

}
