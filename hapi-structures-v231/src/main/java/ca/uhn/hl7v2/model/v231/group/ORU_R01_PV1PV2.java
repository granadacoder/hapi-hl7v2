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


package ca.uhn.hl7v2.model.v231.group;

import ca.uhn.hl7v2.model.v231.segment.*;

import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.model.*;

/**
 * <p>Represents a ORU_R01_PV1PV2 group structure (a Group object).
 * A Group is an ordered collection of message segments that can repeat together or be optionally in/excluded together.
 * This Group contains the following elements:  
 * </p>
 * <ul>
                         * <li>1: PV1 (PV1 - patient visit segment-) <b>  </b></li>
                         * <li>2: PV2 (PV2 - patient visit - additional information segment) <b>optional  </b></li>
 * </ul>
 */
//@SuppressWarnings("unused")
public class ORU_R01_PV1PV2 extends AbstractGroup {

    /** 
     * Creates a new ORU_R01_PV1PV2 group
     */
    public ORU_R01_PV1PV2(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(PV1.class, true, false, false);
                                  this.add(PV2.class, false, false, false);
       } catch(HL7Exception e) {
          log.error("Unexpected error creating ORU_R01_PV1PV2 - this is probably a bug in the source code generator.", e);
       }
    }

    /** 
     * Returns "2.3.1"
     */
    public String getVersion() {
       return "2.3.1";
    }



    /**
     * Returns
     * PV1 (PV1 - patient visit segment-) - creates it if necessary
     */
    public PV1 getPV1() { 
       PV1 retVal = getTyped("PV1", PV1.class);
       return retVal;
    }




    /**
     * Returns
     * PV2 (PV2 - patient visit - additional information segment) - creates it if necessary
     */
    public PV2 getPV2() { 
       PV2 retVal = getTyped("PV2", PV2.class);
       return retVal;
    }




}

