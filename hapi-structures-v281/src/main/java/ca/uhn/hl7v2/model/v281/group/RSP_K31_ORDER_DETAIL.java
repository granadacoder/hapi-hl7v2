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


package ca.uhn.hl7v2.model.v281.group;

import ca.uhn.hl7v2.model.v281.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a RSP_K31_ORDER_DETAIL group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: RXO (Pharmacy/Treatment Order) <b>  </b></li>
                         * <li>2: NTE (Notes and Comments) <b>optional repeating </b></li>
                         * <li>3: RXR (Pharmacy/Treatment Route) <b> repeating </b></li>
                         * <li>4: RSP_K31_COMPONENTS (a Group object) <b>optional repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class RSP_K31_ORDER_DETAIL extends AbstractGroup {

    /** 
     * Creates a new RSP_K31_ORDER_DETAIL group
     */
    public RSP_K31_ORDER_DETAIL(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(RXO.class, true, false, false);
                                  this.add(NTE.class, false, true, false);
                                  this.add(RXR.class, true, true, false);
                                  this.add(RSP_K31_COMPONENTS.class, false, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating RSP_K31_ORDER_DETAIL - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.8.1"
     */
    public String getVersion() {
       return "2.8.1";
    }



    /**
     * Returns
     * RXO (Pharmacy/Treatment Order) - creates it if necessary
     */
    public RXO getRXO() { 
       RXO retVal = getTyped("RXO", RXO.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * NTE (Notes and Comments) - creates it if necessary
     */
    public NTE getNTE() { 
       NTE retVal = getTyped("NTE", NTE.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * NTE (Notes and Comments) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public NTE getNTE(int rep) { 
       NTE retVal = getTyped("NTE", rep, NTE.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of NTE 
     */ 
    public int getNTEReps() {  
        return getReps("NTE");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of NTE.
     * <p>
     * <p>
     * Note that unlike {@link #getNTE()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<NTE> getNTEAll() throws HL7Exception {
    	return getAllAsList("NTE", NTE.class);
    } 

    /**
     * Inserts a specific repetition of NTE (Notes and Comments)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertNTE(NTE structure, int rep) throws HL7Exception { 
       super.insertRepetition("NTE", structure, rep);
    }


    /**
     * Inserts a specific repetition of NTE (Notes and Comments)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public NTE insertNTE(int rep) throws HL7Exception { 
       return (NTE)super.insertRepetition("NTE", rep);
    }


    /**
     * Removes a specific repetition of NTE (Notes and Comments)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public NTE removeNTE(int rep) throws HL7Exception { 
       return (NTE)super.removeRepetition("NTE", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * RXR (Pharmacy/Treatment Route) - creates it if necessary
     */
    public RXR getRXR() { 
       RXR retVal = getTyped("RXR", RXR.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * RXR (Pharmacy/Treatment Route) - creates it if necessary
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
     * Inserts a specific repetition of RXR (Pharmacy/Treatment Route)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertRXR(RXR structure, int rep) throws HL7Exception { 
       super.insertRepetition("RXR", structure, rep);
    }


    /**
     * Inserts a specific repetition of RXR (Pharmacy/Treatment Route)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RXR insertRXR(int rep) throws HL7Exception { 
       return (RXR)super.insertRepetition("RXR", rep);
    }


    /**
     * Removes a specific repetition of RXR (Pharmacy/Treatment Route)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RXR removeRXR(int rep) throws HL7Exception { 
       return (RXR)super.removeRepetition("RXR", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * COMPONENTS (a Group object) - creates it if necessary
     */
    public RSP_K31_COMPONENTS getCOMPONENTS() { 
       RSP_K31_COMPONENTS retVal = getTyped("COMPONENTS", RSP_K31_COMPONENTS.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * COMPONENTS (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public RSP_K31_COMPONENTS getCOMPONENTS(int rep) { 
       RSP_K31_COMPONENTS retVal = getTyped("COMPONENTS", rep, RSP_K31_COMPONENTS.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of COMPONENTS 
     */ 
    public int getCOMPONENTSReps() {  
        return getReps("COMPONENTS");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of COMPONENTS.
     * <p>
     * <p>
     * Note that unlike {@link #getCOMPONENTS()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<RSP_K31_COMPONENTS> getCOMPONENTSAll() throws HL7Exception {
    	return getAllAsList("COMPONENTS", RSP_K31_COMPONENTS.class);
    } 

    /**
     * Inserts a specific repetition of COMPONENTS (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertCOMPONENTS(RSP_K31_COMPONENTS structure, int rep) throws HL7Exception { 
       super.insertRepetition("COMPONENTS", structure, rep);
    }


    /**
     * Inserts a specific repetition of COMPONENTS (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public RSP_K31_COMPONENTS insertCOMPONENTS(int rep) throws HL7Exception { 
       return (RSP_K31_COMPONENTS)super.insertRepetition("COMPONENTS", rep);
    }


    /**
     * Removes a specific repetition of COMPONENTS (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public RSP_K31_COMPONENTS removeCOMPONENTS(int rep) throws HL7Exception { 
       return (RSP_K31_COMPONENTS)super.removeRepetition("COMPONENTS", rep);
    }



}

