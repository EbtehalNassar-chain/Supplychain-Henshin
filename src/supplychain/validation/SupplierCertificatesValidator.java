/**
 *
 * $Id$
 */
package supplychain.validation;

import java.util.Date;

/**
 * A sample validator interface for {@link supplychain.SupplierCertificates}.
 * This doesn't really do anything, and it's not a real EMF artifact.
 * It was generated by the org.eclipse.emf.examples.generator.validator plug-in to illustrate how EMF's code generator can be extended.
 * This can be disabled with -vmargs -Dorg.eclipse.emf.examples.generator.validator=false.
 */
public interface SupplierCertificatesValidator {
	boolean validate();

	boolean validateCertificateId(String value);
	boolean validateIssuingDate(Date value);
	boolean validateExpiryDate(Date value);
}
