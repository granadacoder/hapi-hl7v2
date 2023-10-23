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


package ca.uhn.hl7v2.model.v28.group;

import ca.uhn.hl7v2.model.v28.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a MFN_M08_MF_TEST_NUMERIC group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: MFE (Master File Entry) <b>  </b></li>
                         * <li>2: OM1 (General Segment) <b>  </b></li>
                         * <li>3: PRT (Participation Information) <b>optional repeating </b></li>
                         * <li>4: OM2 (Numeric Observation) <b>optional  </b></li>
                         * <li>5: OM3 (Categorical Service/Test/Observation) <b>optional  </b></li>
                         * <li>6: OM4 (Observations that Require Specimens) <b>optional repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class MFN_M08_MF_TEST_NUMERIC extends AbstractGroup {

    /** 
     * Creates a new MFN_M08_MF_TEST_NUMERIC group
     */
    public MFN_M08_MF_TEST_NUMERIC(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(MFE.class, true, false, false);
                                  this.add(OM1.class, true, false, false);
                                  this.add(PRT.class, false, true, false);
                                  this.add(OM2.class, false, false, false);
                                  this.add(OM3.class, false, false, false);
                                  this.add(OM4.class, false, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating MFN_M08_MF_TEST_NUMERIC - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.8"
     */
    public String getVersion() {
       return "2.8";
    }



    /**
     * Returns
     * MFE (Master File Entry) - creates it if necessary
     */
    public MFE getMFE() { 
       MFE retVal = getTyped("MFE", MFE.class);
       return retVal;
    }




    /**
     * Returns
     * OM1 (General Segment) - creates it if necessary
     */
    public OM1 getOM1() { 
       OM1 retVal = getTyped("OM1", OM1.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * PRT (Participation Information) - creates it if necessary
     */
    public PRT getPRT() { 
       PRT retVal = getTyped("PRT", PRT.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PRT (Participation Information) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PRT getPRT(int rep) { 
       PRT retVal = getTyped("PRT", rep, PRT.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PRT 
     */ 
    public int getPRTReps() {  
        return getReps("PRT");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PRT.
     * <p>
     * <p>
     * Note that unlike {@link #getPRT()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PRT> getPRTAll() throws HL7Exception {
    	return getAllAsList("PRT", PRT.class);
    } 

    /**
     * Inserts a specific repetition of PRT (Participation Information)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPRT(PRT structure, int rep) throws HL7Exception { 
       super.insertRepetition("PRT", structure, rep);
    }


    /**
     * Inserts a specific repetition of PRT (Participation Information)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PRT insertPRT(int rep) throws HL7Exception { 
       return (PRT)super.insertRepetition("PRT", rep);
    }


    /**
     * Removes a specific repetition of PRT (Participation Information)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PRT removePRT(int rep) throws HL7Exception { 
       return (PRT)super.removeRepetition("PRT", rep);
    }



    /**
     * Returns
     * OM2 (Numeric Observation) - creates it if necessary
     */
    public OM2 getOM2() { 
       OM2 retVal = getTyped("OM2", OM2.class);
       return retVal;
    }




    /**
     * Returns
     * OM3 (Categorical Service/Test/Observation) - creates it if necessary
     */
    public OM3 getOM3() { 
       OM3 retVal = getTyped("OM3", OM3.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * OM4 (Observations that Require Specimens) - creates it if necessary
     */
    public OM4 getOM4() { 
       OM4 retVal = getTyped("OM4", OM4.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * OM4 (Observations that Require Specimens) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OM4 getOM4(int rep) { 
       OM4 retVal = getTyped("OM4", rep, OM4.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of OM4 
     */ 
    public int getOM4Reps() {  
        return getReps("OM4");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of OM4.
     * <p>
     * <p>
     * Note that unlike {@link #getOM4()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<OM4> getOM4All() throws HL7Exception {
    	return getAllAsList("OM4", OM4.class);
    } 

    /**
     * Inserts a specific repetition of OM4 (Observations that Require Specimens)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOM4(OM4 structure, int rep) throws HL7Exception { 
       super.insertRepetition("OM4", structure, rep);
    }


    /**
     * Inserts a specific repetition of OM4 (Observations that Require Specimens)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OM4 insertOM4(int rep) throws HL7Exception { 
       return (OM4)super.insertRepetition("OM4", rep);
    }


    /**
     * Removes a specific repetition of OM4 (Observations that Require Specimens)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OM4 removeOM4(int rep) throws HL7Exception { 
       return (OM4)super.removeRepetition("OM4", rep);
    }



}

