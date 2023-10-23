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


package ca.uhn.hl7v2.model.v28.message;

import ca.uhn.hl7v2.model.v28.group.*;
import ca.uhn.hl7v2.model.v28.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.*;


/**
 * <p>Represents a OPU_R25 message structure (see chapter 7.3.11). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (Message Header) <b> </b> </li>
		                 * <li>2: SFT (Software Segment) <b>optional repeating</b> </li>
		                 * <li>3: UAC (User Authentication Credential Segment) <b>optional </b> </li>
		                 * <li>4: NTE (Notes and Comments) <b>optional </b> </li>
		                 * <li>5: PV1 (Patient Visit) <b> </b> </li>
		                 * <li>6: PV2 (Patient Visit - Additional Information) <b>optional </b> </li>
		                 * <li>7: PRT (Participation Information) <b>optional repeating</b> </li>
		                 * <li>8: OPU_R25_PATIENT_VISIT_OBSERVATION (a Group object) <b>optional repeating</b> </li>
		                 * <li>9: OPU_R25_ACCESSION_DETAIL (a Group object) <b> repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class OPU_R25 extends AbstractMessage  {

    /**
     * Creates a new OPU_R25 message with DefaultModelClassFactory. 
     */ 
    public OPU_R25() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new OPU_R25 message with custom ModelClassFactory.
     */
    public OPU_R25(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(SFT.class, false, true);
	                          this.add(UAC.class, false, false);
	                          this.add(NTE.class, false, false);
	                          this.add(PV1.class, true, false);
	                          this.add(PV2.class, false, false);
	                          this.add(PRT.class, false, true);
	                          this.add(OPU_R25_PATIENT_VISIT_OBSERVATION.class, false, true);
	                          this.add(OPU_R25_ACCESSION_DETAIL.class, true, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating OPU_R25 - this is probably a bug in the source code generator.", e);
       }
    }


    /** 
     * Returns "2.8"
     */
    public String getVersion() {
       return "2.8";
    }




    /**
     * <p>
     * Returns
     * MSH (Message Header) - creates it if necessary
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
     * the first repetition of 
     * SFT (Software Segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public SFT getSFT() { 
       return getTyped("SFT", SFT.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * SFT (Software Segment) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public SFT getSFT(int rep) { 
       return getTyped("SFT", rep, SFT.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of SFT 
     * </p>
     * 
     */ 
    public int getSFTReps() { 
    	return getReps("SFT");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SFT.
     * <p>
     * <p>
     * Note that unlike {@link #getSFT()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<SFT> getSFTAll() throws HL7Exception {
    	return getAllAsList("SFT", SFT.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSFT(SFT structure, int rep) throws HL7Exception { 
       super.insertRepetition( "SFT", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public SFT insertSFT(int rep) throws HL7Exception { 
       return (SFT)super.insertRepetition("SFT", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of SFT (Software Segment)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public SFT removeSFT(int rep) throws HL7Exception { 
       return (SFT)super.removeRepetition("SFT", rep);
    }




    /**
     * <p>
     * Returns
     * UAC (User Authentication Credential Segment) - creates it if necessary
     * </p>
     * 
     *
     */
    public UAC getUAC() { 
       return getTyped("UAC", UAC.class);
    }





    /**
     * <p>
     * Returns
     * NTE (Notes and Comments) - creates it if necessary
     * </p>
     * 
     *
     */
    public NTE getNTE() { 
       return getTyped("NTE", NTE.class);
    }





    /**
     * <p>
     * Returns
     * PV1 (Patient Visit) - creates it if necessary
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
     * PV2 (Patient Visit - Additional Information) - creates it if necessary
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
     * PRT (Participation Information) - creates it if necessary
     * </p>
     * 
     *
     */
    public PRT getPRT() { 
       return getTyped("PRT", PRT.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * PRT (Participation Information) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public PRT getPRT(int rep) { 
       return getTyped("PRT", rep, PRT.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of PRT 
     * </p>
     * 
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
     * 
     */ 
    public java.util.List<PRT> getPRTAll() throws HL7Exception {
    	return getAllAsList("PRT", PRT.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of PRT (Participation Information)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPRT(PRT structure, int rep) throws HL7Exception { 
       super.insertRepetition( "PRT", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of PRT (Participation Information)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public PRT insertPRT(int rep) throws HL7Exception { 
       return (PRT)super.insertRepetition("PRT", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of PRT (Participation Information)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public PRT removePRT(int rep) throws HL7Exception { 
       return (PRT)super.removeRepetition("PRT", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * PATIENT_VISIT_OBSERVATION (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public OPU_R25_PATIENT_VISIT_OBSERVATION getPATIENT_VISIT_OBSERVATION() { 
       return getTyped("PATIENT_VISIT_OBSERVATION", OPU_R25_PATIENT_VISIT_OBSERVATION.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * PATIENT_VISIT_OBSERVATION (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OPU_R25_PATIENT_VISIT_OBSERVATION getPATIENT_VISIT_OBSERVATION(int rep) { 
       return getTyped("PATIENT_VISIT_OBSERVATION", rep, OPU_R25_PATIENT_VISIT_OBSERVATION.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of PATIENT_VISIT_OBSERVATION 
     * </p>
     * 
     */ 
    public int getPATIENT_VISIT_OBSERVATIONReps() { 
    	return getReps("PATIENT_VISIT_OBSERVATION");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PATIENT_VISIT_OBSERVATION.
     * <p>
     * <p>
     * Note that unlike {@link #getPATIENT_VISIT_OBSERVATION()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<OPU_R25_PATIENT_VISIT_OBSERVATION> getPATIENT_VISIT_OBSERVATIONAll() throws HL7Exception {
    	return getAllAsList("PATIENT_VISIT_OBSERVATION", OPU_R25_PATIENT_VISIT_OBSERVATION.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of PATIENT_VISIT_OBSERVATION (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPATIENT_VISIT_OBSERVATION(OPU_R25_PATIENT_VISIT_OBSERVATION structure, int rep) throws HL7Exception { 
       super.insertRepetition( "PATIENT_VISIT_OBSERVATION", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of PATIENT_VISIT_OBSERVATION (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OPU_R25_PATIENT_VISIT_OBSERVATION insertPATIENT_VISIT_OBSERVATION(int rep) throws HL7Exception { 
       return (OPU_R25_PATIENT_VISIT_OBSERVATION)super.insertRepetition("PATIENT_VISIT_OBSERVATION", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of PATIENT_VISIT_OBSERVATION (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OPU_R25_PATIENT_VISIT_OBSERVATION removePATIENT_VISIT_OBSERVATION(int rep) throws HL7Exception { 
       return (OPU_R25_PATIENT_VISIT_OBSERVATION)super.removeRepetition("PATIENT_VISIT_OBSERVATION", rep);
    }




    /**
     * <p>
     * Returns
     * the first repetition of 
     * ACCESSION_DETAIL (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public OPU_R25_ACCESSION_DETAIL getACCESSION_DETAIL() { 
       return getTyped("ACCESSION_DETAIL", OPU_R25_ACCESSION_DETAIL.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * ACCESSION_DETAIL (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public OPU_R25_ACCESSION_DETAIL getACCESSION_DETAIL(int rep) { 
       return getTyped("ACCESSION_DETAIL", rep, OPU_R25_ACCESSION_DETAIL.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of ACCESSION_DETAIL 
     * </p>
     * 
     */ 
    public int getACCESSION_DETAILReps() { 
    	return getReps("ACCESSION_DETAIL");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of ACCESSION_DETAIL.
     * <p>
     * <p>
     * Note that unlike {@link #getACCESSION_DETAIL()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<OPU_R25_ACCESSION_DETAIL> getACCESSION_DETAILAll() throws HL7Exception {
    	return getAllAsList("ACCESSION_DETAIL", OPU_R25_ACCESSION_DETAIL.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of ACCESSION_DETAIL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertACCESSION_DETAIL(OPU_R25_ACCESSION_DETAIL structure, int rep) throws HL7Exception { 
       super.insertRepetition( "ACCESSION_DETAIL", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of ACCESSION_DETAIL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public OPU_R25_ACCESSION_DETAIL insertACCESSION_DETAIL(int rep) throws HL7Exception { 
       return (OPU_R25_ACCESSION_DETAIL)super.insertRepetition("ACCESSION_DETAIL", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of ACCESSION_DETAIL (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public OPU_R25_ACCESSION_DETAIL removeACCESSION_DETAIL(int rep) throws HL7Exception { 
       return (OPU_R25_ACCESSION_DETAIL)super.removeRepetition("ACCESSION_DETAIL", rep);
    }



}

