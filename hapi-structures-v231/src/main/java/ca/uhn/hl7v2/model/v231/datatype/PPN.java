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
 * The Original Code is "PPN.java".  Description:
 * "Composite class PPN"
 * 
 * The Initial Developer of the Original Code is University Health Network. Copyright (C) 
 * 2013.  All Rights Reserved.
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

package ca.uhn.hl7v2.model.v231.datatype;

import ca.uhn.hl7v2.model.DataTypeException;
import ca.uhn.hl7v2.model.Message;
import ca.uhn.hl7v2.model.Type;
import ca.uhn.hl7v2.model.AbstractComposite;


/**
 * <p>Represents an HL7 PPN (performing person time stamp) data type. 
 * This type consists of the following components:</p>
 * <ul>
 * <li>ID number (ST) (ST)
 * <li>family+last name (FN)
 * <li>given name (ST)
 * <li>middle initial or name (ST)
 * <li>suffix (e.g., JR or III) (ST)
 * <li>prefix (e.g., DR) (ST)
 * <li>degree (e.g., MD) (IS)
 * <li>source table (IS)
 * <li>assigning authority (HD)
 * <li>name type code (ID)
 * <li>identifier check digit (ST)
 * <li>code identifying the check digit scheme employed (ID)
 * <li>identifier type code (IS)
 * <li>assigning facility (HD)
 * <li>Date/Time Action Performed (TS)
 * <li>Name Representation code (ID)
 * </ul>
 */
@SuppressWarnings("unused")
public class PPN extends AbstractComposite {

    private Type[] data;

    /** 
     * Creates a new PPN type
     */
    public PPN(Message message) {
        super(message);
        init();
    }

    private void init() {
        data = new Type[16];    
        data[0] = new ST(getMessage());
        data[1] = new FN(getMessage());
        data[2] = new ST(getMessage());
        data[3] = new ST(getMessage());
        data[4] = new ST(getMessage());
        data[5] = new ST(getMessage());
        data[6] = new IS(getMessage(), 0);
        data[7] = new IS(getMessage(), 0);
        data[8] = new HD(getMessage());
        data[9] = new ID(getMessage(), 0);
        data[10] = new ST(getMessage());
        data[11] = new ID(getMessage(), 0);
        data[12] = new IS(getMessage(), 0);
        data[13] = new HD(getMessage());
        data[14] = new TS(getMessage());
        data[15] = new ID(getMessage(), 0);
    }


    /**
     * Returns an array containing the data elements.
     */
    public Type[] getComponents() { 
        return this.data; 
    }

    /**
     * Returns an individual data component.
     *
     * @param number The component number (0-indexed)
     * @throws DataTypeException if the given element number is out of range.
     */
    public Type getComponent(int number) throws DataTypeException { 

        try { 
            return this.data[number]; 
        } catch (ArrayIndexOutOfBoundsException e) { 
            throw new DataTypeException("Element " + number + " doesn't exist (Type " + getClass().getName() + " has only " + this.data.length + " components)"); 
        } 
    } 


    /**
     * Returns ID number (ST) (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getIDNumber() {
       return getTyped(0, ST.class);
    }

    
    /**
     * Returns ID number (ST) (component 1).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn1_IDNumber() {
       return getTyped(0, ST.class);
    }


    /**
     * Returns family+last name (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public FN getFamilyLastName() {
       return getTyped(1, FN.class);
    }

    
    /**
     * Returns family+last name (component 2).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public FN getPpn2_FamilyLastName() {
       return getTyped(1, FN.class);
    }


    /**
     * Returns given name (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getGivenName() {
       return getTyped(2, ST.class);
    }

    
    /**
     * Returns given name (component 3).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn3_GivenName() {
       return getTyped(2, ST.class);
    }


    /**
     * Returns middle initial or name (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getMiddleInitialOrName() {
       return getTyped(3, ST.class);
    }

    
    /**
     * Returns middle initial or name (component 4).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn4_MiddleInitialOrName() {
       return getTyped(3, ST.class);
    }


    /**
     * Returns suffix (e.g., JR or III) (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getSuffixEgJRorIII() {
       return getTyped(4, ST.class);
    }

    
    /**
     * Returns suffix (e.g., JR or III) (component 5).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn5_SuffixEgJRorIII() {
       return getTyped(4, ST.class);
    }


    /**
     * Returns prefix (e.g., DR) (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPrefixEgDR() {
       return getTyped(5, ST.class);
    }

    
    /**
     * Returns prefix (e.g., DR) (component 6).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn6_PrefixEgDR() {
       return getTyped(5, ST.class);
    }


    /**
     * Returns degree (e.g., MD) (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getDegreeEgMD() {
       return getTyped(6, IS.class);
    }

    
    /**
     * Returns degree (e.g., MD) (component 7).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getPpn7_DegreeEgMD() {
       return getTyped(6, IS.class);
    }


    /**
     * Returns source table (component 8).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getSourceTable() {
       return getTyped(7, IS.class);
    }

    
    /**
     * Returns source table (component 8).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getPpn8_SourceTable() {
       return getTyped(7, IS.class);
    }


    /**
     * Returns assigning authority (component 9).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getAssigningAuthority() {
       return getTyped(8, HD.class);
    }

    
    /**
     * Returns assigning authority (component 9).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getPpn9_AssigningAuthority() {
       return getTyped(8, HD.class);
    }


    /**
     * Returns name type code (component 10).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getNameTypeCode() {
       return getTyped(9, ID.class);
    }

    
    /**
     * Returns name type code (component 10).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getPpn10_NameTypeCode() {
       return getTyped(9, ID.class);
    }


    /**
     * Returns identifier check digit (component 11).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getIdentifierCheckDigit() {
       return getTyped(10, ST.class);
    }

    
    /**
     * Returns identifier check digit (component 11).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ST getPpn11_IdentifierCheckDigit() {
       return getTyped(10, ST.class);
    }


    /**
     * Returns code identifying the check digit scheme employed (component 12).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getCodeIdentifyingTheCheckDigitSchemeEmployed() {
       return getTyped(11, ID.class);
    }

    
    /**
     * Returns code identifying the check digit scheme employed (component 12).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getPpn12_CodeIdentifyingTheCheckDigitSchemeEmployed() {
       return getTyped(11, ID.class);
    }


    /**
     * Returns identifier type code (component 13).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getIdentifierTypeCode() {
       return getTyped(12, IS.class);
    }

    
    /**
     * Returns identifier type code (component 13).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public IS getPpn13_IdentifierTypeCode() {
       return getTyped(12, IS.class);
    }


    /**
     * Returns assigning facility (component 14).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getAssigningFacility() {
       return getTyped(13, HD.class);
    }

    
    /**
     * Returns assigning facility (component 14).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public HD getPpn14_AssigningFacility() {
       return getTyped(13, HD.class);
    }


    /**
     * Returns Date/Time Action Performed (component 15).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public TS getDateTimeActionPerformed() {
       return getTyped(14, TS.class);
    }

    
    /**
     * Returns Date/Time Action Performed (component 15).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public TS getPpn15_DateTimeActionPerformed() {
       return getTyped(14, TS.class);
    }


    /**
     * Returns Name Representation code (component 16).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getNameRepresentationCode() {
       return getTyped(15, ID.class);
    }

    
    /**
     * Returns Name Representation code (component 16).  This is a convenience method that saves you from 
     * casting and handling an exception.
     */
    public ID getPpn16_NameRepresentationCode() {
       return getTyped(15, ID.class);
    }



}

