package kodlamaio.hrms.core.validations;

import kodlamaio.hrms.core.adapters.MernisDemo;
import kodlamaio.hrms.core.utilities.results.ErrorResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessResult;

public class IdentificationNumberValidator {

	public static Result isRealPerson(String tcno) {
		
		MernisDemo mernisDemo = new MernisDemo();
		
		if (mernisDemo.isValidNationalityIdentity(tcno)) {
			return new SuccessResult();
		}
		return new ErrorResult("Lütfen TC Kimlik Numaranizi giriniz!");
	}
}
