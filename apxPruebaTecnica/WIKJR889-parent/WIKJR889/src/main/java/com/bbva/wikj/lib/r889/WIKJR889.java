package com.bbva.wikj.lib.r889;

import java.util.Map;

public interface WIKJR889 {

	Map<String, Object> executeSelect(String nuip);
	int executeInsert(Map<String, Object> args);

}
