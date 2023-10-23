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
 * <p>Represents a EHC_E01_PRODUCT_SERVICE_SECTION group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: PSS (Product/Service Section) <b>  choice</b></li>
                         * <li>2: EHC_E01_PRODUCT_SERVICE_GROUP (a Group object) <b> repeating </b></li>
 * </ul>
 * <p>
 * Note that this structure has "choice" elements. This means that one of the 
 * structures above marked as "choice" must be present, but no more than one.
 * </p> 
 */
//@SuppressWarnings("unused")
public class EHC_E01_PRODUCT_SERVICE_SECTION extends AbstractGroup {

    /** 
     * Creates a new EHC_E01_PRODUCT_SERVICE_SECTION group
     */
    public EHC_E01_PRODUCT_SERVICE_SECTION(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(PSS.class, true, false, true);
                                  this.add(EHC_E01_PRODUCT_SERVICE_GROUP.class, true, true, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating EHC_E01_PRODUCT_SERVICE_SECTION - this is probably a bug in the source code generator.", e);
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
     * PSS (Product/Service Section) - creates it if necessary
     */
    public PSS getPSS() { 
       PSS retVal = getTyped("PSS", PSS.class);
       return retVal;
    }




    /**
     * Returns
     * the first repetition of 
     * PRODUCT_SERVICE_GROUP (a Group object) - creates it if necessary
     */
    public EHC_E01_PRODUCT_SERVICE_GROUP getPRODUCT_SERVICE_GROUP() { 
       EHC_E01_PRODUCT_SERVICE_GROUP retVal = getTyped("PRODUCT_SERVICE_GROUP", EHC_E01_PRODUCT_SERVICE_GROUP.class);
       return retVal;
    }


    /**
     * Returns a specific repetition of
     * PRODUCT_SERVICE_GROUP (a Group object) - creates it if necessary
     *
     * @param rep The repetition index (0-indexed, i.e. the first repetition is at index 0)
     * @throws HL7Exception if the repetition requested is more than one 
     *     greater than the number of existing repetitions.
     */
    public EHC_E01_PRODUCT_SERVICE_GROUP getPRODUCT_SERVICE_GROUP(int rep) { 
       EHC_E01_PRODUCT_SERVICE_GROUP retVal = getTyped("PRODUCT_SERVICE_GROUP", rep, EHC_E01_PRODUCT_SERVICE_GROUP.class);
       return retVal;
    }

    /** 
     * Returns the number of existing repetitions of PRODUCT_SERVICE_GROUP 
     */ 
    public int getPRODUCT_SERVICE_GROUPReps() {  
        return getReps("PRODUCT_SERVICE_GROUP");
    } 

    /** 
     * <p>
     * Returns a non-modifiable List containing all current existing repetitions of PRODUCT_SERVICE_GROUP.
     * <p>
     * <p>
     * Note that unlike {@link #getPRODUCT_SERVICE_GROUP()}, this method will not create any reps
     * if none are already present, so an empty list may be returned.
     * </p>
     */ 
    public java.util.List<EHC_E01_PRODUCT_SERVICE_GROUP> getPRODUCT_SERVICE_GROUPAll() throws HL7Exception {
    	return getAllAsList("PRODUCT_SERVICE_GROUP", EHC_E01_PRODUCT_SERVICE_GROUP.class);
    } 

    /**
     * Inserts a specific repetition of PRODUCT_SERVICE_GROUP (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public void insertPRODUCT_SERVICE_GROUP(EHC_E01_PRODUCT_SERVICE_GROUP structure, int rep) throws HL7Exception { 
       super.insertRepetition("PRODUCT_SERVICE_GROUP", structure, rep);
    }


    /**
     * Inserts a specific repetition of PRODUCT_SERVICE_GROUP (a Group object)
     * @see AbstractGroup#insertRepetition(Structure, int) 
     */
    public EHC_E01_PRODUCT_SERVICE_GROUP insertPRODUCT_SERVICE_GROUP(int rep) throws HL7Exception { 
       return (EHC_E01_PRODUCT_SERVICE_GROUP)super.insertRepetition("PRODUCT_SERVICE_GROUP", rep);
    }


    /**
     * Removes a specific repetition of PRODUCT_SERVICE_GROUP (a Group object)
     * @see AbstractGroup#removeRepetition(String, int) 
     */
    public EHC_E01_PRODUCT_SERVICE_GROUP removePRODUCT_SERVICE_GROUP(int rep) throws HL7Exception { 
       return (EHC_E01_PRODUCT_SERVICE_GROUP)super.removeRepetition("PRODUCT_SERVICE_GROUP", rep);
    }



}

