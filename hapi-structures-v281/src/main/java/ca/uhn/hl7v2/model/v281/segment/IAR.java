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


package ca.uhn.hl7v2.model.v281.segment;

// import ca.uhn.hl7v2.model.v281.group.*;
import ca.uhn.hl7v2.model.v281.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 IAR message segment (allergy reaction). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>IAR-1: Allergy Reaction Code (CWE) <b> </b>
     * <li>IAR-2: Allergy Severity Code (CWE) <b> </b>
     * <li>IAR-3: Sensitivity to Causative Agent Code (CWE) <b>optional </b>
     * <li>IAR-4: Management (ST) <b>optional </b>
 * </ul>
 */
@SuppressWarnings("unused")
public class IAR extends AbstractSegment {

    /** 
     * Creates a new IAR segment
     */
    public IAR(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(CWE.class, true, 1, 0, new Object[]{ getMessage() }, "Allergy Reaction Code");
                                  this.add(CWE.class, true, 1, 0, new Object[]{ getMessage() }, "Allergy Severity Code");
                                  this.add(CWE.class, false, 1, 0, new Object[]{ getMessage() }, "Sensitivity to Causative Agent Code");
                                  this.add(ST.class, false, 1, 0, new Object[]{ getMessage() }, "Management");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating IAR - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * IAR-1: "Allergy Reaction Code" - creates it if necessary
     */
    public CWE getAllergyReactionCode() { 
		CWE retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * IAR-1: "Allergy Reaction Code" - creates it if necessary
     */
    public CWE getIar1_AllergyReactionCode() { 
		CWE retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * IAR-2: "Allergy Severity Code" - creates it if necessary
     */
    public CWE getAllergySeverityCode() { 
		CWE retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * IAR-2: "Allergy Severity Code" - creates it if necessary
     */
    public CWE getIar2_AllergySeverityCode() { 
		CWE retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * IAR-3: "Sensitivity to Causative Agent Code" - creates it if necessary
     */
    public CWE getSensitivityToCausativeAgentCode() { 
		CWE retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * IAR-3: "Sensitivity to Causative Agent Code" - creates it if necessary
     */
    public CWE getIar3_SensitivityToCausativeAgentCode() { 
		CWE retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * IAR-4: "Management" - creates it if necessary
     */
    public ST getManagement() { 
		ST retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * IAR-4: "Management" - creates it if necessary
     */
    public ST getIar4_Management() { 
		ST retVal = this.getTypedField(4, 0);
		return retVal;
    }





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new CWE(getMessage());
          case 1: return new CWE(getMessage());
          case 2: return new CWE(getMessage());
          case 3: return new ST(getMessage());
          default: return null;
       }
   }


}

