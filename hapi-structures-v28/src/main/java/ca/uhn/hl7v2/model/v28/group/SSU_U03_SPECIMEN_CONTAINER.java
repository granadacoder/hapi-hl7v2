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
 * <p>Represents a SSU_U03_SPECIMEN_CONTAINER group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: SAC (Specimen Container detail) <b>  </b></li>
                         * <li>2: OBX (Observation/Result) <b>optional repeating </b></li>
                         * <li>3: NTE (Notes and Comments) <b>optional repeating </b></li>
                         * <li>4: SSU_U03_SPECIMEN (a Group object) <b>optional repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class SSU_U03_SPECIMEN_CONTAINER extends AbstractGroup {

    /** 
     * Creates a new SSU_U03_SPECIMEN_CONTAINER group
     */
    public SSU_U03_SPECIMEN_CONTAINER(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(SAC.class, true, false, false);
                                  this.add(OBX.class, false, true, false);
                                  this.add(NTE.class, false, true, false);
                                  this.add(SSU_U03_SPECIMEN.class, false, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating SSU_U03_SPECIMEN_CONTAINER - this is probably a bug in the source code generator.", e);
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
     * SAC (Specimen Container detail) - creates it if necessary
     */
    public SAC getSAC() { 
       SAC retVal = getTyped("SAC", SAC.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * OBX (Observation/Result) - creates it if necessary
     */
    public OBX getOBX() { 
       OBX retVal = getTyped("OBX", OBX.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * OBX (Observation/Result) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OBX getOBX(int rep) { 
       OBX retVal = getTyped("OBX", rep, OBX.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of OBX 
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
     */ 
    public java.util.List<OBX> getOBXAll() throws HL7Exception {
    	return getAllAsList("OBX", OBX.class);
    } 

    /**
     * Inserts a specific repetition of OBX (Observation/Result)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBX(OBX structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBX", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBX (Observation/Result)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OBX insertOBX(int rep) throws HL7Exception { 
       return (OBX)super.insertRepetition("OBX", rep);
    }


    /**
     * Removes a specific repetition of OBX (Observation/Result)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OBX removeOBX(int rep) throws HL7Exception { 
       return (OBX)super.removeRepetition("OBX", rep);
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
     * SPECIMEN (a Group object) - creates it if necessary
     */
    public SSU_U03_SPECIMEN getSPECIMEN() { 
       SSU_U03_SPECIMEN retVal = getTyped("SPECIMEN", SSU_U03_SPECIMEN.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * SPECIMEN (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public SSU_U03_SPECIMEN getSPECIMEN(int rep) { 
       SSU_U03_SPECIMEN retVal = getTyped("SPECIMEN", rep, SSU_U03_SPECIMEN.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of SPECIMEN 
     */ 
    public int getSPECIMENReps() {  
        return getReps("SPECIMEN");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SPECIMEN.
     * <p>
     * <p>
     * Note that unlike {@link #getSPECIMEN()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<SSU_U03_SPECIMEN> getSPECIMENAll() throws HL7Exception {
    	return getAllAsList("SPECIMEN", SSU_U03_SPECIMEN.class);
    } 

    /**
     * Inserts a specific repetition of SPECIMEN (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSPECIMEN(SSU_U03_SPECIMEN structure, int rep) throws HL7Exception { 
       super.insertRepetition("SPECIMEN", structure, rep);
    }


    /**
     * Inserts a specific repetition of SPECIMEN (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public SSU_U03_SPECIMEN insertSPECIMEN(int rep) throws HL7Exception { 
       return (SSU_U03_SPECIMEN)super.insertRepetition("SPECIMEN", rep);
    }


    /**
     * Removes a specific repetition of SPECIMEN (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public SSU_U03_SPECIMEN removeSPECIMEN(int rep) throws HL7Exception { 
       return (SSU_U03_SPECIMEN)super.removeRepetition("SPECIMEN", rep);
    }



}
