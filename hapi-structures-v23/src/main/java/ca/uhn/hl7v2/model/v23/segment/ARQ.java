/*
 * This class is an auto-generated source file for a HAPI
 * HL7 v2.x standard structure class.
 *
 * For more information, visit: http://hl7api.sourceforge.net/
 * 
 * The contents of this file are subject to the Mozilla Public License Version 1.1 
 * (the "License"); you may not use this file except in compliance with the License. 
 * You may obtain a copy of the License at http://www.mozilla.org/MPL/ 
 * Software distributed under the License is distributed on an "AS IS" basis, 
 * WITHOUT WARRANTY OF ANY KIND, either express or implied. See the License for the 
 * specific language governing rights and limitations under the License. 
 * 
 * The Original Code is "[file_name]".  Description: 
 * "[one_line_description]" 
 * 
 * The Initial Developer of the Original Code is University Health Network. Copyright (C) 
 * 2012.  All Rights Reserved. 
 * 
 * Contributor(s): ______________________________________. 
 * 
 * Alternatively, the contents of this file may be used under the terms of the 
 * GNU General Public License (the  "GPL"), in which case the provisions of the GPL are 
 * applicable instead of those above.  If you wish to allow use of your version of this 
 * file only under the terms of the GPL and not to allow others to use your version 
 * of this file under the MPL, indicate your decision by deleting  the provisions above 
 * and replace  them with the notice and other provisions required by the GPL License.  
 * If you do not delete the provisions above, a recipient may use your version of 
 * this file under either the MPL or the GPL. 
 * 
 */


package ca.uhn.hl7v2.model.v23.segment;

// import ca.uhn.hl7v2.model.v23.group.*;
import ca.uhn.hl7v2.model.v23.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 ARQ message segment (Appointment Request). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>ARQ-1: Placer Appointment ID (EI) <b> </b>
     * <li>ARQ-2: Filler Appointment ID (EI) <b>optional </b>
     * <li>ARQ-3: Occurrence Number (NM) <b>optional </b>
     * <li>ARQ-4: Placer Group Number (EI) <b>optional </b>
     * <li>ARQ-5: Schedule ID (CE) <b>optional </b>
     * <li>ARQ-6: Request Event Reason (CE) <b>optional </b>
     * <li>ARQ-7: Appointment Reason (CE) <b>optional </b>
     * <li>ARQ-8: Appointment Type (CE) <b>optional </b>
     * <li>ARQ-9: Appointment Duration (NM) <b>optional </b>
     * <li>ARQ-10: Appointment Duration Units (CE) <b>optional </b>
     * <li>ARQ-11: Requested Start Date/Time Range (DR) <b>optional repeating</b>
     * <li>ARQ-12: Priority (ST) <b>optional </b>
     * <li>ARQ-13: Repeating Interval (RI) <b>optional </b>
     * <li>ARQ-14: Repeating Interval Duration (ST) <b>optional </b>
     * <li>ARQ-15: Placer Contact Person (XCN) <b>optional </b>
     * <li>ARQ-16: Placer Contact Phone Number (XTN) <b>optional </b>
     * <li>ARQ-17: Placer Contact Address (XAD) <b>optional </b>
     * <li>ARQ-18: Placer Contact Location (PL) <b>optional </b>
     * <li>ARQ-19: Entered By Person (XCN) <b> </b>
     * <li>ARQ-20: Entered By Phone Number (XTN) <b>optional repeating</b>
     * <li>ARQ-21: Entered By Location (PL) <b>optional </b>
     * <li>ARQ-22: Parent Placer Appointment ID (EI) <b>optional </b>
     * <li>ARQ-23: Parent Filler Appointment ID (EI) <b>optional </b>
 * </ul>
 */
@SuppressWarnings("unused")
public class ARQ extends AbstractSegment {

    /** 
     * Creates a new ARQ segment
     */
    public ARQ(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(EI.class, true, 1, 22, new Object[]{ getMessage() }, "Placer Appointment ID");
                                  this.add(EI.class, false, 1, 22, new Object[]{ getMessage() }, "Filler Appointment ID");
                                  this.add(NM.class, false, 1, 5, new Object[]{ getMessage() }, "Occurrence Number");
                                  this.add(EI.class, false, 1, 37, new Object[]{ getMessage() }, "Placer Group Number");
                                  this.add(CE.class, false, 1, 200, new Object[]{ getMessage() }, "Schedule ID");
                                  this.add(CE.class, false, 1, 200, new Object[]{ getMessage() }, "Request Event Reason");
                                  this.add(CE.class, false, 1, 200, new Object[]{ getMessage() }, "Appointment Reason");
                                  this.add(CE.class, false, 1, 200, new Object[]{ getMessage() }, "Appointment Type");
                                  this.add(NM.class, false, 1, 20, new Object[]{ getMessage() }, "Appointment Duration");
                                  this.add(CE.class, false, 1, 200, new Object[]{ getMessage() }, "Appointment Duration Units");
                                  this.add(DR.class, false, 0, 53, new Object[]{ getMessage() }, "Requested Start Date/Time Range");
                                  this.add(ST.class, false, 1, 5, new Object[]{ getMessage() }, "Priority");
                                  this.add(RI.class, false, 1, 100, new Object[]{ getMessage() }, "Repeating Interval");
                                  this.add(ST.class, false, 1, 5, new Object[]{ getMessage() }, "Repeating Interval Duration");
                                  this.add(XCN.class, false, 1, 48, new Object[]{ getMessage() }, "Placer Contact Person");
                                  this.add(XTN.class, false, 1, 40, new Object[]{ getMessage() }, "Placer Contact Phone Number");
                                  this.add(XAD.class, false, 1, 106, new Object[]{ getMessage() }, "Placer Contact Address");
                                  this.add(PL.class, false, 1, 80, new Object[]{ getMessage() }, "Placer Contact Location");
                                  this.add(XCN.class, true, 1, 48, new Object[]{ getMessage() }, "Entered By Person");
                                  this.add(XTN.class, false, 0, 40, new Object[]{ getMessage() }, "Entered By Phone Number");
                                  this.add(PL.class, false, 1, 80, new Object[]{ getMessage() }, "Entered By Location");
                                  this.add(EI.class, false, 1, 75, new Object[]{ getMessage() }, "Parent Placer Appointment ID");
                                  this.add(EI.class, false, 1, 75, new Object[]{ getMessage() }, "Parent Filler Appointment ID");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating ARQ - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * ARQ-1: "Placer Appointment ID" - creates it if necessary
     */
    public EI getPlacerAppointmentID() { 
		EI retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-1: "Placer Appointment ID" - creates it if necessary
     */
    public EI getArq1_PlacerAppointmentID() { 
		EI retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-2: "Filler Appointment ID" - creates it if necessary
     */
    public EI getFillerAppointmentID() { 
		EI retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-2: "Filler Appointment ID" - creates it if necessary
     */
    public EI getArq2_FillerAppointmentID() { 
		EI retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-3: "Occurrence Number" - creates it if necessary
     */
    public NM getOccurrenceNumber() { 
		NM retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-3: "Occurrence Number" - creates it if necessary
     */
    public NM getArq3_OccurrenceNumber() { 
		NM retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-4: "Placer Group Number" - creates it if necessary
     */
    public EI getPlacerGroupNumber() { 
		EI retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-4: "Placer Group Number" - creates it if necessary
     */
    public EI getArq4_PlacerGroupNumber() { 
		EI retVal = this.getTypedField(4, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-5: "Schedule ID" - creates it if necessary
     */
    public CE getScheduleID() { 
		CE retVal = this.getTypedField(5, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-5: "Schedule ID" - creates it if necessary
     */
    public CE getArq5_ScheduleID() { 
		CE retVal = this.getTypedField(5, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-6: "Request Event Reason" - creates it if necessary
     */
    public CE getRequestEventReason() { 
		CE retVal = this.getTypedField(6, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-6: "Request Event Reason" - creates it if necessary
     */
    public CE getArq6_RequestEventReason() { 
		CE retVal = this.getTypedField(6, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-7: "Appointment Reason" - creates it if necessary
     */
    public CE getAppointmentReason() { 
		CE retVal = this.getTypedField(7, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-7: "Appointment Reason" - creates it if necessary
     */
    public CE getArq7_AppointmentReason() { 
		CE retVal = this.getTypedField(7, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-8: "Appointment Type" - creates it if necessary
     */
    public CE getAppointmentType() { 
		CE retVal = this.getTypedField(8, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-8: "Appointment Type" - creates it if necessary
     */
    public CE getArq8_AppointmentType() { 
		CE retVal = this.getTypedField(8, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-9: "Appointment Duration" - creates it if necessary
     */
    public NM getAppointmentDuration() { 
		NM retVal = this.getTypedField(9, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-9: "Appointment Duration" - creates it if necessary
     */
    public NM getArq9_AppointmentDuration() { 
		NM retVal = this.getTypedField(9, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-10: "Appointment Duration Units" - creates it if necessary
     */
    public CE getAppointmentDurationUnits() { 
		CE retVal = this.getTypedField(10, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-10: "Appointment Duration Units" - creates it if necessary
     */
    public CE getArq10_AppointmentDurationUnits() { 
		CE retVal = this.getTypedField(10, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Requested Start Date/Time Range (ARQ-11).
     */
    public DR[] getRequestedStartDateTimeRange() {
    	DR[] retVal = this.getTypedField(11, new DR[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Requested Start Date/Time Range (ARQ-11).
     */
    public DR[] getArq11_RequestedStartDateTimeRange() {
    	DR[] retVal = this.getTypedField(11, new DR[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Requested Start Date/Time Range (ARQ-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getRequestedStartDateTimeRangeReps() {
    	return this.getReps(11);
    }


    /**
     * Returns a specific repetition of
     * ARQ-11: "Requested Start Date/Time Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DR getRequestedStartDateTimeRange(int rep) { 
		DR retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * ARQ-11: "Requested Start Date/Time Range" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public DR getArq11_RequestedStartDateTimeRange(int rep) { 
		DR retVal = this.getTypedField(11, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Requested Start Date/Time Range (ARQ-11).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getArq11_RequestedStartDateTimeRangeReps() {
    	return this.getReps(11);
    }


    /**
     * Inserts a repetition of
     * ARQ-11: "Requested Start Date/Time Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DR insertRequestedStartDateTimeRange(int rep) throws HL7Exception { 
        return (DR) super.insertRepetition(11, rep);
    }


    /**
     * Inserts a repetition of
     * ARQ-11: "Requested Start Date/Time Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DR insertArq11_RequestedStartDateTimeRange(int rep) throws HL7Exception { 
        return (DR) super.insertRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * ARQ-11: "Requested Start Date/Time Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DR removeRequestedStartDateTimeRange(int rep) throws HL7Exception { 
        return (DR) super.removeRepetition(11, rep);
    }


    /**
     * Removes a repetition of
     * ARQ-11: "Requested Start Date/Time Range" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public DR removeArq11_RequestedStartDateTimeRange(int rep) throws HL7Exception { 
        return (DR) super.removeRepetition(11, rep);
    }




    /**
     * Returns
     * ARQ-12: "Priority" - creates it if necessary
     */
    public ST getPriority() { 
		ST retVal = this.getTypedField(12, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-12: "Priority" - creates it if necessary
     */
    public ST getArq12_Priority() { 
		ST retVal = this.getTypedField(12, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-13: "Repeating Interval" - creates it if necessary
     */
    public RI getRepeatingInterval() { 
		RI retVal = this.getTypedField(13, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-13: "Repeating Interval" - creates it if necessary
     */
    public RI getArq13_RepeatingInterval() { 
		RI retVal = this.getTypedField(13, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-14: "Repeating Interval Duration" - creates it if necessary
     */
    public ST getRepeatingIntervalDuration() { 
		ST retVal = this.getTypedField(14, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-14: "Repeating Interval Duration" - creates it if necessary
     */
    public ST getArq14_RepeatingIntervalDuration() { 
		ST retVal = this.getTypedField(14, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-15: "Placer Contact Person" - creates it if necessary
     */
    public XCN getPlacerContactPerson() { 
		XCN retVal = this.getTypedField(15, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-15: "Placer Contact Person" - creates it if necessary
     */
    public XCN getArq15_PlacerContactPerson() { 
		XCN retVal = this.getTypedField(15, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-16: "Placer Contact Phone Number" - creates it if necessary
     */
    public XTN getPlacerContactPhoneNumber() { 
		XTN retVal = this.getTypedField(16, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-16: "Placer Contact Phone Number" - creates it if necessary
     */
    public XTN getArq16_PlacerContactPhoneNumber() { 
		XTN retVal = this.getTypedField(16, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-17: "Placer Contact Address" - creates it if necessary
     */
    public XAD getPlacerContactAddress() { 
		XAD retVal = this.getTypedField(17, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-17: "Placer Contact Address" - creates it if necessary
     */
    public XAD getArq17_PlacerContactAddress() { 
		XAD retVal = this.getTypedField(17, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-18: "Placer Contact Location" - creates it if necessary
     */
    public PL getPlacerContactLocation() { 
		PL retVal = this.getTypedField(18, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-18: "Placer Contact Location" - creates it if necessary
     */
    public PL getArq18_PlacerContactLocation() { 
		PL retVal = this.getTypedField(18, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-19: "Entered By Person" - creates it if necessary
     */
    public XCN getEnteredByPerson() { 
		XCN retVal = this.getTypedField(19, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-19: "Entered By Person" - creates it if necessary
     */
    public XCN getArq19_EnteredByPerson() { 
		XCN retVal = this.getTypedField(19, 0);
		return retVal;
    }


    /**
     * Returns all repetitions of Entered By Phone Number (ARQ-20).
     */
    public XTN[] getEnteredByPhoneNumber() {
    	XTN[] retVal = this.getTypedField(20, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns all repetitions of Entered By Phone Number (ARQ-20).
     */
    public XTN[] getArq20_EnteredByPhoneNumber() {
    	XTN[] retVal = this.getTypedField(20, new XTN[0]);
    	return retVal;
    }


    /**
     * Returns a count of the current number of repetitions of Entered By Phone Number (ARQ-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getEnteredByPhoneNumberReps() {
    	return this.getReps(20);
    }


    /**
     * Returns a specific repetition of
     * ARQ-20: "Entered By Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getEnteredByPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a specific repetition of
     * ARQ-20: "Entered By Phone Number" - creates it if necessary
     *
     * @param rep The repetition index (0-indexed)
     */
    public XTN getArq20_EnteredByPhoneNumber(int rep) { 
		XTN retVal = this.getTypedField(20, rep);
		return retVal;
    }

    /**
     * Returns a count of the current number of repetitions of Entered By Phone Number (ARQ-20).
     * This method does not create a repetition, so if no repetitions have currently been defined or accessed,
     * it will return zero.
     */
    public int getArq20_EnteredByPhoneNumberReps() {
    	return this.getReps(20);
    }


    /**
     * Inserts a repetition of
     * ARQ-20: "Entered By Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertEnteredByPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(20, rep);
    }


    /**
     * Inserts a repetition of
     * ARQ-20: "Entered By Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN insertArq20_EnteredByPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.insertRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * ARQ-20: "Entered By Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeEnteredByPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(20, rep);
    }


    /**
     * Removes a repetition of
     * ARQ-20: "Entered By Phone Number" at a specific index
     *
     * @param rep The repetition index (0-indexed)
     * @throws HL7Exception If the rep is invalid (below 0, or too high for the allowable repetitions)
     */
    public XTN removeArq20_EnteredByPhoneNumber(int rep) throws HL7Exception { 
        return (XTN) super.removeRepetition(20, rep);
    }




    /**
     * Returns
     * ARQ-21: "Entered By Location" - creates it if necessary
     */
    public PL getEnteredByLocation() { 
		PL retVal = this.getTypedField(21, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-21: "Entered By Location" - creates it if necessary
     */
    public PL getArq21_EnteredByLocation() { 
		PL retVal = this.getTypedField(21, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-22: "Parent Placer Appointment ID" - creates it if necessary
     */
    public EI getParentPlacerAppointmentID() { 
		EI retVal = this.getTypedField(22, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-22: "Parent Placer Appointment ID" - creates it if necessary
     */
    public EI getArq22_ParentPlacerAppointmentID() { 
		EI retVal = this.getTypedField(22, 0);
		return retVal;
    }



    /**
     * Returns
     * ARQ-23: "Parent Filler Appointment ID" - creates it if necessary
     */
    public EI getParentFillerAppointmentID() { 
		EI retVal = this.getTypedField(23, 0);
		return retVal;
    }
    
    /**
     * Returns
     * ARQ-23: "Parent Filler Appointment ID" - creates it if necessary
     */
    public EI getArq23_ParentFillerAppointmentID() { 
		EI retVal = this.getTypedField(23, 0);
		return retVal;
    }





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new EI(getMessage());
          case 1: return new EI(getMessage());
          case 2: return new NM(getMessage());
          case 3: return new EI(getMessage());
          case 4: return new CE(getMessage());
          case 5: return new CE(getMessage());
          case 6: return new CE(getMessage());
          case 7: return new CE(getMessage());
          case 8: return new NM(getMessage());
          case 9: return new CE(getMessage());
          case 10: return new DR(getMessage());
          case 11: return new ST(getMessage());
          case 12: return new RI(getMessage());
          case 13: return new ST(getMessage());
          case 14: return new XCN(getMessage());
          case 15: return new XTN(getMessage());
          case 16: return new XAD(getMessage());
          case 17: return new PL(getMessage());
          case 18: return new XCN(getMessage());
          case 19: return new XTN(getMessage());
          case 20: return new PL(getMessage());
          case 21: return new EI(getMessage());
          case 22: return new EI(getMessage());
          default: return null;
       }
   }


}

