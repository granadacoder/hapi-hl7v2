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


package ca.uhn.hl7v2.model.v231.message;

import ca.uhn.hl7v2.model.v231.group.*;
import ca.uhn.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a ADT_A07 message structure (see chapter ?). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (MSH - message header segment) <b> </b> </li>
		                 * <li>2: EVN (EVN - event type segment) <b> </b> </li>
		                 * <li>3: PID (PID - patient identification segment) <b> </b> </li>
		                 * <li>4: PD1 (PD1 - patient additional demographic segment) <b>optional </b> </li>
		                 * <li>5: MRG (MRG - merge patient information segment-) <b>optional </b> </li>
		                 * <li>6: NK1 (NK1 - next of kin / associated parties segment-) <b>optional repeating</b> </li>
		                 * <li>7: PV1 (PV1 - patient visit segment-) <b> </b> </li>
		                 * <li>8: PV2 (PV2 - patient visit - additional information segment) <b>optional </b> </li>
		                 * <li>9: DB1 (DB1 - Disability segment) <b>optional repeating</b> </li>
		                 * <li>10: OBX (OBX - observation/result segment) <b>optional repeating</b> </li>
		                 * <li>11: AL1 (AL1 - patient allergy information segment) <b>optional repeating</b> </li>
		                 * <li>12: DG1 (DG1 - diagnosis segment) <b>optional repeating</b> </li>
		                 * <li>13: DRG (DRG - diagnosis related group segment) <b>optional </b> </li>
		                 * <li>14: ADT_A07_PR1ROL (a Group object) <b>optional repeating</b> </li>
		                 * <li>15: GT1 (GT1 - guarantor segment) <b>optional repeating</b> </li>
		                 * <li>16: ADT_A07_IN1IN2IN3 (a Group object) <b>optional repeating</b> </li>
		                 * <li>17: ACC (ACC - accident segment) <b>optional </b> </li>
		                 * <li>18: UB1 (UB1 - UB82 data segment) <b>optional </b> </li>
		                 * <li>19: UB2 (UB2 - UB92 data segment) <b>optional </b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class ADT_A07 extends AbstractMessage  {

    /**
     * Creates a new ADT_A07 message with DefaultModelClassFactory. 
     */ 
    public ADT_A07() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new ADT_A07 message with custom ModelClassFactory.
     */
    public ADT_A07(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(EVN.class, true, false);
	                          this.add(PID.class, true, false);
	                          this.add(PD1.class, false, false);
	                          this.add(MRG.class, false, false);
	                          this.add(NK1.class, false, true);
	                          this.add(PV1.class, true, false);
	                          this.add(PV2.class, false, false);
	                          this.add(DB1.class, false, true);
	                          this.add(OBX.class, false, true);
	                          this.add(AL1.class, false, true);
	                          this.add(DG1.class, false, true);
	                          this.add(DRG.class, false, false);
	                          this.add(ADT_A07_PR1ROL.class, false, true);
	                          this.add(GT1.class, false, true);
	                          this.add(ADT_A07_IN1IN2IN3.class, false, true);
	                          this.add(ACC.class, false, false);
	                          this.add(UB1.class, false, false);
	                          this.add(UB2.class, false, false);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating ADT_A07 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.3.1"
     */
    public String getVersion() {
       return "2.3.1";
    }




    /**
     * <p>
     * Returns
     * MSH (MSH - message header segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public MSH getMSH() { 
       return getTyped("MSH", MSH.class);
    }





    /**
     * <p>
     * Returns
     * EVN (EVN - event type segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public EVN getEVN() { 
       return getTyped("EVN", EVN.class);
    }





    /**
     * <p>
     * Returns
     * PID (PID - patient identification segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public PID getPID() { 
       return getTyped("PID", PID.class);
    }





    /**
     * <p>
     * Returns
     * PD1 (PD1 - patient additional demographic segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public PD1 getPD1() { 
       return getTyped("PD1", PD1.class);
    }





    /**
     * <p>
     * Returns
     * MRG (MRG - merge patient information segment-) - creates it if necessary
     * </p>
     * 
     *
     */
    public MRG getMRG() { 
       return getTyped("MRG", MRG.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * NK1 (NK1 - next of kin / associated parties segment-) - creates it if necessary
     * </p>
     * 
     *
     */
    public NK1 getNK1() { 
       return getTyped("NK1", NK1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * NK1 (NK1 - next of kin / associated parties segment-) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public NK1 getNK1(int rep) { 
       return getTyped("NK1", rep, NK1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of NK1 
     * </p>
     * 
     */ 
    public int getNK1Reps() { 
    	return getReps("NK1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of NK1.
     * <p>
     * <p>
     * Note that unlike {@link #getNK1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<NK1> getNK1All() throws HL7Exception {
    	return getAllAsList("NK1", NK1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertNK1(NK1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "NK1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public NK1 insertNK1(int rep) throws HL7Exception { 
       return (NK1)super.insertRepetition("NK1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of NK1 (NK1 - next of kin / associated parties segment-)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public NK1 removeNK1(int rep) throws HL7Exception { 
       return (NK1)super.removeRepetition("NK1", rep);
    }




    /**
     * <p>
     * Returns
     * PV1 (PV1 - patient visit segment-) - creates it if necessary
     * </p>
     * 
     *
     */
    public PV1 getPV1() { 
       return getTyped("PV1", PV1.class);
    }





    /**
     * <p>
     * Returns
     * PV2 (PV2 - patient visit - additional information segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public PV2 getPV2() { 
       return getTyped("PV2", PV2.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * DB1 (DB1 - Disability segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public DB1 getDB1() { 
       return getTyped("DB1", DB1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * DB1 (DB1 - Disability segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public DB1 getDB1(int rep) { 
       return getTyped("DB1", rep, DB1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of DB1 
     * </p>
     * 
     */ 
    public int getDB1Reps() { 
    	return getReps("DB1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of DB1.
     * <p>
     * <p>
     * Note that unlike {@link #getDB1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<DB1> getDB1All() throws HL7Exception {
    	return getAllAsList("DB1", DB1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of DB1 (DB1 - Disability segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertDB1(DB1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "DB1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of DB1 (DB1 - Disability segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public DB1 insertDB1(int rep) throws HL7Exception { 
       return (DB1)super.insertRepetition("DB1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of DB1 (DB1 - Disability segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public DB1 removeDB1(int rep) throws HL7Exception { 
       return (DB1)super.removeRepetition("DB1", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * OBX (OBX - observation/result segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public OBX getOBX() { 
       return getTyped("OBX", OBX.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * OBX (OBX - observation/result segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OBX getOBX(int rep) { 
       return getTyped("OBX", rep, OBX.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of OBX 
     * </p>
     * 
     */ 
    public int getOBXReps() { 
    	return getReps("OBX");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of OBX.
     * <p>
     * <p>
     * Note that unlike {@link #getOBX()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<OBX> getOBXAll() throws HL7Exception {
    	return getAllAsList("OBX", OBX.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of OBX (OBX - observation/result segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBX(OBX structure, int rep) throws HL7Exception { 
       super.insertRepetition( "OBX", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of OBX (OBX - observation/result segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OBX insertOBX(int rep) throws HL7Exception { 
       return (OBX)super.insertRepetition("OBX", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of OBX (OBX - observation/result segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OBX removeOBX(int rep) throws HL7Exception { 
       return (OBX)super.removeRepetition("OBX", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * AL1 (AL1 - patient allergy information segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public AL1 getAL1() { 
       return getTyped("AL1", AL1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * AL1 (AL1 - patient allergy information segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public AL1 getAL1(int rep) { 
       return getTyped("AL1", rep, AL1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of AL1 
     * </p>
     * 
     */ 
    public int getAL1Reps() { 
    	return getReps("AL1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of AL1.
     * <p>
     * <p>
     * Note that unlike {@link #getAL1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<AL1> getAL1All() throws HL7Exception {
    	return getAllAsList("AL1", AL1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of AL1 (AL1 - patient allergy information segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertAL1(AL1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "AL1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of AL1 (AL1 - patient allergy information segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public AL1 insertAL1(int rep) throws HL7Exception { 
       return (AL1)super.insertRepetition("AL1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of AL1 (AL1 - patient allergy information segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public AL1 removeAL1(int rep) throws HL7Exception { 
       return (AL1)super.removeRepetition("AL1", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * DG1 (DG1 - diagnosis segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public DG1 getDG1() { 
       return getTyped("DG1", DG1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * DG1 (DG1 - diagnosis segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public DG1 getDG1(int rep) { 
       return getTyped("DG1", rep, DG1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of DG1 
     * </p>
     * 
     */ 
    public int getDG1Reps() { 
    	return getReps("DG1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of DG1.
     * <p>
     * <p>
     * Note that unlike {@link #getDG1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<DG1> getDG1All() throws HL7Exception {
    	return getAllAsList("DG1", DG1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of DG1 (DG1 - diagnosis segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertDG1(DG1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "DG1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of DG1 (DG1 - diagnosis segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public DG1 insertDG1(int rep) throws HL7Exception { 
       return (DG1)super.insertRepetition("DG1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of DG1 (DG1 - diagnosis segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public DG1 removeDG1(int rep) throws HL7Exception { 
       return (DG1)super.removeRepetition("DG1", rep);
    }




    /**
     * <p>
     * Returns
     * DRG (DRG - diagnosis related group segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public DRG getDRG() { 
       return getTyped("DRG", DRG.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * PR1ROL (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public ADT_A07_PR1ROL getPR1ROL() { 
       return getTyped("PR1ROL", ADT_A07_PR1ROL.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * PR1ROL (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ADT_A07_PR1ROL getPR1ROL(int rep) { 
       return getTyped("PR1ROL", rep, ADT_A07_PR1ROL.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of PR1ROL 
     * </p>
     * 
     */ 
    public int getPR1ROLReps() { 
    	return getReps("PR1ROL");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PR1ROL.
     * <p>
     * <p>
     * Note that unlike {@link #getPR1ROL()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ADT_A07_PR1ROL> getPR1ROLAll() throws HL7Exception {
    	return getAllAsList("PR1ROL", ADT_A07_PR1ROL.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of PR1ROL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPR1ROL(ADT_A07_PR1ROL structure, int rep) throws HL7Exception { 
       super.insertRepetition( "PR1ROL", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of PR1ROL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ADT_A07_PR1ROL insertPR1ROL(int rep) throws HL7Exception { 
       return (ADT_A07_PR1ROL)super.insertRepetition("PR1ROL", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of PR1ROL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ADT_A07_PR1ROL removePR1ROL(int rep) throws HL7Exception { 
       return (ADT_A07_PR1ROL)super.removeRepetition("PR1ROL", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * GT1 (GT1 - guarantor segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public GT1 getGT1() { 
       return getTyped("GT1", GT1.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * GT1 (GT1 - guarantor segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public GT1 getGT1(int rep) { 
       return getTyped("GT1", rep, GT1.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of GT1 
     * </p>
     * 
     */ 
    public int getGT1Reps() { 
    	return getReps("GT1");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of GT1.
     * <p>
     * <p>
     * Note that unlike {@link #getGT1()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<GT1> getGT1All() throws HL7Exception {
    	return getAllAsList("GT1", GT1.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of GT1 (GT1 - guarantor segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertGT1(GT1 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "GT1", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of GT1 (GT1 - guarantor segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public GT1 insertGT1(int rep) throws HL7Exception { 
       return (GT1)super.insertRepetition("GT1", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of GT1 (GT1 - guarantor segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public GT1 removeGT1(int rep) throws HL7Exception { 
       return (GT1)super.removeRepetition("GT1", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * IN1IN2IN3 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public ADT_A07_IN1IN2IN3 getIN1IN2IN3() { 
       return getTyped("IN1IN2IN3", ADT_A07_IN1IN2IN3.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * IN1IN2IN3 (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public ADT_A07_IN1IN2IN3 getIN1IN2IN3(int rep) { 
       return getTyped("IN1IN2IN3", rep, ADT_A07_IN1IN2IN3.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of IN1IN2IN3 
     * </p>
     * 
     */ 
    public int getIN1IN2IN3Reps() { 
    	return getReps("IN1IN2IN3");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of IN1IN2IN3.
     * <p>
     * <p>
     * Note that unlike {@link #getIN1IN2IN3()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<ADT_A07_IN1IN2IN3> getIN1IN2IN3All() throws HL7Exception {
    	return getAllAsList("IN1IN2IN3", ADT_A07_IN1IN2IN3.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertIN1IN2IN3(ADT_A07_IN1IN2IN3 structure, int rep) throws HL7Exception { 
       super.insertRepetition( "IN1IN2IN3", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public ADT_A07_IN1IN2IN3 insertIN1IN2IN3(int rep) throws HL7Exception { 
       return (ADT_A07_IN1IN2IN3)super.insertRepetition("IN1IN2IN3", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of IN1IN2IN3 (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public ADT_A07_IN1IN2IN3 removeIN1IN2IN3(int rep) throws HL7Exception { 
       return (ADT_A07_IN1IN2IN3)super.removeRepetition("IN1IN2IN3", rep);
    }




    /**
     * <p>
     * Returns
     * ACC (ACC - accident segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public ACC getACC() { 
       return getTyped("ACC", ACC.class);
    }





    /**
     * <p>
     * Returns
     * UB1 (UB1 - UB82 data segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public UB1 getUB1() { 
       return getTyped("UB1", UB1.class);
    }





    /**
     * <p>
     * Returns
     * UB2 (UB2 - UB92 data segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public UB2 getUB2() { 
       return getTyped("UB2", UB2.class);
    }




}

