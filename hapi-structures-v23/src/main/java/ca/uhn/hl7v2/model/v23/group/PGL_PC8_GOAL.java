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
 * <p>Represents a PGL_PC8_GOAL group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: GOL (Goal Detail) <b>  </b></li>
                         * <li>2: NTE (Notes and comments segment) <b>optional repeating </b></li>
                         * <li>3: VAR (Variance) <b>optional repeating </b></li>
                         * <li>4: PGL_PC8_GOAL_ROLE (a Group object) <b>optional repeating </b></li>
                         * <li>5: PGL_PC8_PATHWAY (a Group object) <b>optional repeating </b></li>
                         * <li>6: PGL_PC8_OBSERVATION (a Group object) <b>optional repeating </b></li>
                         * <li>7: PGL_PC8_PROBLEM (a Group object) <b>optional repeating </b></li>
                         * <li>8: PGL_PC8_ORDER (a Group object) <b>optional repeating </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class PGL_PC8_GOAL extends AbstractGroup {

    /** 
     * Creates a new PGL_PC8_GOAL group
     */
    public PGL_PC8_GOAL(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(GOL.class, true, false, false);
                                  this.add(NTE.class, false, true, false);
                                  this.add(VAR.class, false, true, false);
                                  this.add(PGL_PC8_GOAL_ROLE.class, false, true, false);
                                  this.add(PGL_PC8_PATHWAY.class, false, true, false);
                                  this.add(PGL_PC8_OBSERVATION.class, false, true, false);
                                  this.add(PGL_PC8_PROBLEM.class, false, true, false);
                                  this.add(PGL_PC8_ORDER.class, false, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating PGL_PC8_GOAL - this is probably a bug in the source code generator.", e);
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
     * GOL (Goal Detail) - creates it if necessary
     */
    public GOL getGOL() { 
       GOL retVal = getTyped("GOL", GOL.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * NTE (Notes and comments segment) - creates it if necessary
     */
    public NTE getNTE() { 
       NTE retVal = getTyped("NTE", NTE.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * NTE (Notes and comments segment) - creates it if necessary
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
     * Inserts a specific repetition of NTE (Notes and comments segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertNTE(NTE structure, int rep) throws HL7Exception { 
       super.insertRepetition("NTE", structure, rep);
    }


    /**
     * Inserts a specific repetition of NTE (Notes and comments segment)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public NTE insertNTE(int rep) throws HL7Exception { 
       return (NTE)super.insertRepetition("NTE", rep);
    }


    /**
     * Removes a specific repetition of NTE (Notes and comments segment)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public NTE removeNTE(int rep) throws HL7Exception { 
       return (NTE)super.removeRepetition("NTE", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * VAR (Variance) - creates it if necessary
     */
    public VAR getVAR() { 
       VAR retVal = getTyped("VAR", VAR.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * VAR (Variance) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public VAR getVAR(int rep) { 
       VAR retVal = getTyped("VAR", rep, VAR.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of VAR 
     */ 
    public int getVARReps() {  
        return getReps("VAR");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of VAR.
     * <p>
     * <p>
     * Note that unlike {@link #getVAR()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<VAR> getVARAll() throws HL7Exception {
    	return getAllAsList("VAR", VAR.class);
    } 

    /**
     * Inserts a specific repetition of VAR (Variance)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertVAR(VAR structure, int rep) throws HL7Exception { 
       super.insertRepetition("VAR", structure, rep);
    }


    /**
     * Inserts a specific repetition of VAR (Variance)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public VAR insertVAR(int rep) throws HL7Exception { 
       return (VAR)super.insertRepetition("VAR", rep);
    }


    /**
     * Removes a specific repetition of VAR (Variance)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public VAR removeVAR(int rep) throws HL7Exception { 
       return (VAR)super.removeRepetition("VAR", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * GOAL_ROLE (a Group object) - creates it if necessary
     */
    public PGL_PC8_GOAL_ROLE getGOAL_ROLE() { 
       PGL_PC8_GOAL_ROLE retVal = getTyped("GOAL_ROLE", PGL_PC8_GOAL_ROLE.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * GOAL_ROLE (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PGL_PC8_GOAL_ROLE getGOAL_ROLE(int rep) { 
       PGL_PC8_GOAL_ROLE retVal = getTyped("GOAL_ROLE", rep, PGL_PC8_GOAL_ROLE.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of GOAL_ROLE 
     */ 
    public int getGOAL_ROLEReps() {  
        return getReps("GOAL_ROLE");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of GOAL_ROLE.
     * <p>
     * <p>
     * Note that unlike {@link #getGOAL_ROLE()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PGL_PC8_GOAL_ROLE> getGOAL_ROLEAll() throws HL7Exception {
    	return getAllAsList("GOAL_ROLE", PGL_PC8_GOAL_ROLE.class);
    } 

    /**
     * Inserts a specific repetition of GOAL_ROLE (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertGOAL_ROLE(PGL_PC8_GOAL_ROLE structure, int rep) throws HL7Exception { 
       super.insertRepetition("GOAL_ROLE", structure, rep);
    }


    /**
     * Inserts a specific repetition of GOAL_ROLE (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PGL_PC8_GOAL_ROLE insertGOAL_ROLE(int rep) throws HL7Exception { 
       return (PGL_PC8_GOAL_ROLE)super.insertRepetition("GOAL_ROLE", rep);
    }


    /**
     * Removes a specific repetition of GOAL_ROLE (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PGL_PC8_GOAL_ROLE removeGOAL_ROLE(int rep) throws HL7Exception { 
       return (PGL_PC8_GOAL_ROLE)super.removeRepetition("GOAL_ROLE", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * PATHWAY (a Group object) - creates it if necessary
     */
    public PGL_PC8_PATHWAY getPATHWAY() { 
       PGL_PC8_PATHWAY retVal = getTyped("PATHWAY", PGL_PC8_PATHWAY.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PATHWAY (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PGL_PC8_PATHWAY getPATHWAY(int rep) { 
       PGL_PC8_PATHWAY retVal = getTyped("PATHWAY", rep, PGL_PC8_PATHWAY.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PATHWAY 
     */ 
    public int getPATHWAYReps() {  
        return getReps("PATHWAY");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PATHWAY.
     * <p>
     * <p>
     * Note that unlike {@link #getPATHWAY()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PGL_PC8_PATHWAY> getPATHWAYAll() throws HL7Exception {
    	return getAllAsList("PATHWAY", PGL_PC8_PATHWAY.class);
    } 

    /**
     * Inserts a specific repetition of PATHWAY (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPATHWAY(PGL_PC8_PATHWAY structure, int rep) throws HL7Exception { 
       super.insertRepetition("PATHWAY", structure, rep);
    }


    /**
     * Inserts a specific repetition of PATHWAY (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PGL_PC8_PATHWAY insertPATHWAY(int rep) throws HL7Exception { 
       return (PGL_PC8_PATHWAY)super.insertRepetition("PATHWAY", rep);
    }


    /**
     * Removes a specific repetition of PATHWAY (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PGL_PC8_PATHWAY removePATHWAY(int rep) throws HL7Exception { 
       return (PGL_PC8_PATHWAY)super.removeRepetition("PATHWAY", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * OBSERVATION (a Group object) - creates it if necessary
     */
    public PGL_PC8_OBSERVATION getOBSERVATION() { 
       PGL_PC8_OBSERVATION retVal = getTyped("OBSERVATION", PGL_PC8_OBSERVATION.class);
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
    public PGL_PC8_OBSERVATION getOBSERVATION(int rep) { 
       PGL_PC8_OBSERVATION retVal = getTyped("OBSERVATION", rep, PGL_PC8_OBSERVATION.class);
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
    public java.util.List<PGL_PC8_OBSERVATION> getOBSERVATIONAll() throws HL7Exception {
    	return getAllAsList("OBSERVATION", PGL_PC8_OBSERVATION.class);
    } 

    /**
     * Inserts a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertOBSERVATION(PGL_PC8_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition("OBSERVATION", structure, rep);
    }


    /**
     * Inserts a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PGL_PC8_OBSERVATION insertOBSERVATION(int rep) throws HL7Exception { 
       return (PGL_PC8_OBSERVATION)super.insertRepetition("OBSERVATION", rep);
    }


    /**
     * Removes a specific repetition of OBSERVATION (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PGL_PC8_OBSERVATION removeOBSERVATION(int rep) throws HL7Exception { 
       return (PGL_PC8_OBSERVATION)super.removeRepetition("OBSERVATION", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * PROBLEM (a Group object) - creates it if necessary
     */
    public PGL_PC8_PROBLEM getPROBLEM() { 
       PGL_PC8_PROBLEM retVal = getTyped("PROBLEM", PGL_PC8_PROBLEM.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PROBLEM (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PGL_PC8_PROBLEM getPROBLEM(int rep) { 
       PGL_PC8_PROBLEM retVal = getTyped("PROBLEM", rep, PGL_PC8_PROBLEM.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PROBLEM 
     */ 
    public int getPROBLEMReps() {  
        return getReps("PROBLEM");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PROBLEM.
     * <p>
     * <p>
     * Note that unlike {@link #getPROBLEM()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PGL_PC8_PROBLEM> getPROBLEMAll() throws HL7Exception {
    	return getAllAsList("PROBLEM", PGL_PC8_PROBLEM.class);
    } 

    /**
     * Inserts a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPROBLEM(PGL_PC8_PROBLEM structure, int rep) throws HL7Exception { 
       super.insertRepetition("PROBLEM", structure, rep);
    }


    /**
     * Inserts a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PGL_PC8_PROBLEM insertPROBLEM(int rep) throws HL7Exception { 
       return (PGL_PC8_PROBLEM)super.insertRepetition("PROBLEM", rep);
    }


    /**
     * Removes a specific repetition of PROBLEM (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PGL_PC8_PROBLEM removePROBLEM(int rep) throws HL7Exception { 
       return (PGL_PC8_PROBLEM)super.removeRepetition("PROBLEM", rep);
    }



    /**
     * Returns
     * the first repetition of 
     * ORDER (a Group object) - creates it if necessary
     */
    public PGL_PC8_ORDER getORDER() { 
       PGL_PC8_ORDER retVal = getTyped("ORDER", PGL_PC8_ORDER.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * ORDER (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PGL_PC8_ORDER getORDER(int rep) { 
       PGL_PC8_ORDER retVal = getTyped("ORDER", rep, PGL_PC8_ORDER.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of ORDER 
     */ 
    public int getORDERReps() {  
        return getReps("ORDER");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ORDER.
     * <p>
     * <p>
     * Note that unlike {@link #getORDER()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<PGL_PC8_ORDER> getORDERAll() throws HL7Exception {
    	return getAllAsList("ORDER", PGL_PC8_ORDER.class);
    } 

    /**
     * Inserts a specific repetition of ORDER (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertORDER(PGL_PC8_ORDER structure, int rep) throws HL7Exception { 
       super.insertRepetition("ORDER", structure, rep);
    }


    /**
     * Inserts a specific repetition of ORDER (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PGL_PC8_ORDER insertORDER(int rep) throws HL7Exception { 
       return (PGL_PC8_ORDER)super.insertRepetition("ORDER", rep);
    }


    /**
     * Removes a specific repetition of ORDER (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PGL_PC8_ORDER removeORDER(int rep) throws HL7Exception { 
       return (PGL_PC8_ORDER)super.removeRepetition("ORDER", rep);
    }



}

