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


package ca.uhn.hl7v2.model.v23.group;

import ca.uhn.hl7v2.model.v23.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a RDE_O01_ORDER group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: ORC (Common order segment) <b>  </b></li>
                         * <li>2: RDE_O01_ORDER_DETAIL (a Group object) <b>optional  </b></li>
                         * <li>3: RXE (Pharmacy encoded order segment) <b>  </b></li>
                         * <li>4: RXR (Pharmacy route segment) <b> repeating </b></li>
                         * <li>5: RXC (Pharmacy component order segment) <b>optional repeating </b></li>
                         * <li>6: RDE_O01_OBSERVATION (a Group object) <b> repeating </b></li>
                         * <li>7: CTI (Clinical Trial Identification) <b>optional  </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class RDE_O01_ORDER extends AbstractGroup {

    /** 
     * Creates a new RDE_O01_ORDER group
     */
    public RDE_O01_ORDER(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(ORC.class, true, false, false);
                                  this.add(RDE_O01_ORDER_DETAIL.class, false, false, false);
                                  this.add(RXE.class, true, false, false);
                                  this.add(RXR.class, true, true, false);
                                  this.add(RXC.class, false, true, false);
                                  this.add(RDE_O01_OBSERVATION.class, true, true, false);
                                  this.add(CTI.class, false, false, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating RDE_O01_ORDER - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.3"
     */
    public String getVersion() {
       return "2.3";
    }



    /**
     * Returns
     * ORC (Common order segment) - creates it if necessary
     */
    public ORC getORC() { 
       ORC retVal = getTyped("ORC", ORC.class);
       return retVal;
    }




    /**
     * Returns
     * ORDER_DETAIL (a Group object) - creates it if necessary
     */
    public RDE_O01_ORDER_DETAIL getORDER_DETAIL() { 
       RDE_O01_ORDER_DETAIL retVal = getTyped("ORDER_DETAIL", RDE_O01_ORDER_DETAIL.class);
       return retVal;
    }




    /**
     * Returns
     * RXE (Pharmacy encoded order segment) - creates it if necessary
     */
    public RXE getRXE() { 
       RXE retVal = getTyped("RXE", RXE.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * RXR (Pharmacy route segment) - creates it if necessary
     */
    public RXR getRXR() { 
       RXR retVal = getTyped("RXR", RXR.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * RXR (Pharmacy route segment) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public RXR getRXR(int rep) { 
       RXR retVal = getTyped("RXR", rep, RXR.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of RXR 
     */ 
    public int getRXRReps() {  
        return getReps("RXR");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of RXR.
     * <p>
     * <p>
     * Note that unlike {@link #getRXR()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<RXR> getRXRAll() throws HL7Exception {
    	return getAllAsList("RXR", RXR.class);
    } 

    /**
     * Inserts a specific repetition of RXR (Pharmacy route segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertRXR(RXR structure, int rep) throws HL7Exception { 
       super.insertRepetition("RXR", structure, rep);
    }


    /**
     * Inserts a specific repetition of RXR (Pharmacy route segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RXR insertRXR(int rep) throws HL7Exception { 
       return (RXR)super.insertRepetition("RXR", rep);
    }


    /**
     * Removes a specific repetition of RXR (Pharmacy route segment)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RXR removeRXR(int rep) throws HL7Exception { 
       return (RXR)super.removeRepetition("RXR", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * RXC (Pharmacy component order segment) - creates it if necessary
     */
    public RXC getRXC() { 
       RXC retVal = getTyped("RXC", RXC.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * RXC (Pharmacy component order segment) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public RXC getRXC(int rep) { 
       RXC retVal = getTyped("RXC", rep, RXC.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of RXC 
     */ 
    public int getRXCReps() {  
        return getReps("RXC");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of RXC.
     * <p>
     * <p>
     * Note that unlike {@link #getRXC()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<RXC> getRXCAll() throws HL7Exception {
    	return getAllAsList("RXC", RXC.class);
    } 

    /**
     * Inserts a specific repetition of RXC (Pharmacy component order segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertRXC(RXC structure, int rep) throws HL7Exception { 
       super.insertRepetition("RXC", structure, rep);
    }


    /**
     * Inserts a specific repetition of RXC (Pharmacy component order segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RXC insertRXC(int rep) throws HL7Exception { 
       return (RXC)super.insertRepetition("RXC", rep);
    }


    /**
     * Removes a specific repetition of RXC (Pharmacy component order segment)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RXC removeRXC(int rep) throws HL7Exception { 
       return (RXC)super.removeRepetition("RXC", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * OBSERVATION (a Group object) - creates it if necessary
     */
    public RDE_O01_OBSERVATION getOBSERVATION() { 
       RDE_O01_OBSERVATION retVal = getTyped("OBSERVATION", RDE_O01_OBSERVATION.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * OBSERVATION (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public RDE_O01_OBSERVATION getOBSERVATION(int rep) { 
       RDE_O01_OBSERVATION retVal = getTyped("OBSERVATION", rep, RDE_O01_OBSERVATION.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of OBSERVATION 
     */ 
    public int getOBSERVATIONReps() {  
        return getReps("OBSERVATION");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of OBSERVATION.
     * <p>
     * <p>
     * Note that unlike {@link #getOBSERVATION()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<RDE_O01_OBSERVATION> getOBSERVATIONAll() throws HL7Exception {
    	return getAllAsList("OBSERVATION", RDE_O01_OBSERVATION.class);
    } 

    /**
     * Inserts a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBSERVATION(RDE_O01_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBSERVATION", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RDE_O01_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
       return (RDE_O01_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
    }


    /**
     * Removes a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RDE_O01_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
       return (RDE_O01_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
    }



    /**
     * Returns
     * CTI (Clinical Trial Identification) - creates it if necessary
     */
    public CTI getCTI() { 
       CTI retVal = getTyped("CTI", CTI.class);
       return retVal;
    }




}

