package edu.arizona.sirls.etc.markupComparison.io;

import java.io.File;
import java.io.IOException;

import edu.arizona.sirls.etc.markupComparison.model.DescriptionsFileList;

public interface ITreatmentReader {

	public DescriptionsFileList read(File input) throws IOException;
	
}
