package com.attandance.service.api;

import java.io.File;

public interface AttandanceService {
	public void recordAttandance(String fileName);
	public File	caculateAttandance(String beginDate, String endDate);
}
