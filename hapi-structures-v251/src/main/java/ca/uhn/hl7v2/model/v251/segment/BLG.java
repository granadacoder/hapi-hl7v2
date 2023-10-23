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


package ca.uhn.hl7v2.model.v251.segment;

// import ca.uhn.hl7v2.model.v251.group.*;
import ca.uhn.hl7v2.model.v251.datatype.*;
import ca.uhn.hl7v2.HL7Exception;
import ca.uhn.hl7v2.parser.ModelClassFactory;
import ca.uhn.hl7v2.parser.DefaultModelClassFactory;
import ca.uhn.hl7v2.model.AbstractMessage;
import ca.uhn.hl7v2.model.Group;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractSegment;
import ca.uhn.hl7v2.model.Varies;


/**
 *<p>Represents an HL7 BLG message segment (Billing). 
 * This segment has the following fields:</p>
 * <ul>
     * <li>BLG-1: When to Charge (CCD) <b>optional </b>
     * <li>BLG-2: Charge Type (ID) <b>optional </b>
     * <li>BLG-3: Account ID (CX) <b>optional </b>
     * <li>BLG-4: Charge Type Reason (CWE) <b>optional </b>
 * </ul>
 */
@SuppressWarnings("unused")
public class BLG extends AbstractSegment {

    /** 
     * Creates a new BLG segment
     */
    public BLG(Group parent, ModelClassFactory factory) {
       super(parent, factory);
       init(factory);
    }

    private void init(ModelClassFactory factory) {
       try {
                                  this.add(CCD.class, false, 1, 40, new Object[]{ getMessage() }, "When to Charge");
                                              this.add(ID.class, false, 1, 50, new Object[]{ getMessage(), new Integer(122) }, "Charge Type");
                                  this.add(CX.class, false, 1, 100, new Object[]{ getMessage() }, "Account ID");
                                  this.add(CWE.class, false, 1, 60, new Object[]{ getMessage() }, "Charge Type Reason");
       } catch(HL7Exception e) {
          log.error("Unexpected error creating BLG - this is probably a bug in the source code generator.", e);
       }
    }



    /**
     * Returns
     * BLG-1: "When to Charge" - creates it if necessary
     */
    public CCD getWhenToCharge() { 
		CCD retVal = this.getTypedField(1, 0);
		return retVal;
    }
    
    /**
     * Returns
     * BLG-1: "When to Charge" - creates it if necessary
     */
    public CCD getBlg1_WhenToCharge() { 
		CCD retVal = this.getTypedField(1, 0);
		return retVal;
    }



    /**
     * Returns
     * BLG-2: "Charge Type" - creates it if necessary
     */
    public ID getChargeType() { 
		ID retVal = this.getTypedField(2, 0);
		return retVal;
    }
    
    /**
     * Returns
     * BLG-2: "Charge Type" - creates it if necessary
     */
    public ID getBlg2_ChargeType() { 
		ID retVal = this.getTypedField(2, 0);
		return retVal;
    }



    /**
     * Returns
     * BLG-3: "Account ID" - creates it if necessary
     */
    public CX getAccountID() { 
		CX retVal = this.getTypedField(3, 0);
		return retVal;
    }
    
    /**
     * Returns
     * BLG-3: "Account ID" - creates it if necessary
     */
    public CX getBlg3_AccountID() { 
		CX retVal = this.getTypedField(3, 0);
		return retVal;
    }



    /**
     * Returns
     * BLG-4: "Charge Type Reason" - creates it if necessary
     */
    public CWE getChargeTypeReason() { 
		CWE retVal = this.getTypedField(4, 0);
		return retVal;
    }
    
    /**
     * Returns
     * BLG-4: "Charge Type Reason" - creates it if necessary
     */
    public CWE getBlg4_ChargeTypeReason() { 
		CWE retVal = this.getTypedField(4, 0);
		return retVal;
    }





    /** {@inheritDoc} */   
    protected Type createNewTypeWithoutReflection(int field) {
       switch (field) {
          case 0: return new CCD(getMessage());
          case 1: return new ID(getMessage(), new Integer( 122 ));
          case 2: return new CX(getMessage());
          case 3: return new CWE(getMessage());
          default: return null;
       }
   }


}

