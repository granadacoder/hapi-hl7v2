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
 * <p>Represents a SSU_U03 message structure (see chapter 13.3.3). This structure contains the 
 * following elements: </p>
 * <ul>
		                 * <li>1: MSH (Message Header) <b> </b> </li>
		                 * <li>2: SFT (Software Segment) <b>optional repeating</b> </li>
		                 * <li>3: UAC (User Authentication Credential Segment) <b>optional </b> </li>
		                 * <li>4: EQU (Equipment Detail) <b> </b> </li>
		                 * <li>5: SSU_U03_SPECIMEN_CONTAINER (a Group object) <b> repeating</b> </li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class SSU_U03 extends AbstractMessage  {

    /**
     * Creates a new SSU_U03 message with DefaultModelClassFactory. 
     */ 
    public SSU_U03() { 
       this(new DefaultModelClassFactory());
    }

    /** 
     * Creates a new SSU_U03 message with custom ModelClassFactory.
     */
    public SSU_U03(ModelClassFactory factory) {
       super(factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                          this.add(MSH.class, true, false);
	                          this.add(SFT.class, false, true);
	                          this.add(UAC.class, false, false);
	                          this.add(EQU.class, true, false);
	                          this.add(SSU_U03_SPECIMEN_CONTAINER.class, true, true);
	       } catch(HL7Exception e) {
          log.error("Unexpected error creating SSU_U03 - this is probably a bug in the source code generator.", e);
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
     * EQU (Equipment Detail) - creates it if necessary
     * </p>
     * 
     *
     */
    public EQU getEQU() { 
       return getTyped("EQU", EQU.class);
    }





    /**
     * <p>
     * Returns
     * the first repetition of 
     * SPECIMEN_CONTAINER (a Group object) - creates it if necessary
     * </p>
     * 
     *
     */
    public SSU_U03_SPECIMEN_CONTAINER getSPECIMEN_CONTAINER() { 
       return getTyped("SPECIMEN_CONTAINER", SSU_U03_SPECIMEN_CONTAINER.class);
    }


    /**
     * <p>
     * Returns a specific repetition of
     * SPECIMEN_CONTAINER (a Group object) - creates it if necessary
     * </p>
     * 
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public SSU_U03_SPECIMEN_CONTAINER getSPECIMEN_CONTAINER(int rep) { 
       return getTyped("SPECIMEN_CONTAINER", rep, SSU_U03_SPECIMEN_CONTAINER.class);
    }

    /** 
     * <p>
     * Returns the number of existing repetitions of SPECIMEN_CONTAINER 
     * </p>
     * 
     */ 
    public int getSPECIMEN_CONTAINERReps() { 
    	return getReps("SPECIMEN_CONTAINER");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of SPECIMEN_CONTAINER.
     * <p>
     * <p>
     * Note that unlike {@link #getSPECIMEN_CONTAINER()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     * 
     */ 
    public java.util.List<SSU_U03_SPECIMEN_CONTAINER> getSPECIMEN_CONTAINERAll() throws HL7Exception {
    	return getAllAsList("SPECIMEN_CONTAINER", SSU_U03_SPECIMEN_CONTAINER.class);
    } 

    /**
     * <p>
     * Inserts a specific repetition of SPECIMEN_CONTAINER (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertSPECIMEN_CONTAINER(SSU_U03_SPECIMEN_CONTAINER structure, int rep) throws HL7Exception { 
       super.insertRepetition( "SPECIMEN_CONTAINER", structure, rep);
    }


    /**
     * <p>
     * Inserts a specific repetition of SPECIMEN_CONTAINER (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public SSU_U03_SPECIMEN_CONTAINER insertSPECIMEN_CONTAINER(int rep) throws HL7Exception { 
       return (SSU_U03_SPECIMEN_CONTAINER)super.insertRepetition("SPECIMEN_CONTAINER", rep);
    }


    /**
     * <p>
     * Removes a specific repetition of SPECIMEN_CONTAINER (a Group object)
     * </p>
     * 
     *
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public SSU_U03_SPECIMEN_CONTAINER removeSPECIMEN_CONTAINER(int rep) throws HL7Exception { 
       return (SSU_U03_SPECIMEN_CONTAINER)super.removeRepetition("SPECIMEN_CONTAINER", rep);
    }



}

