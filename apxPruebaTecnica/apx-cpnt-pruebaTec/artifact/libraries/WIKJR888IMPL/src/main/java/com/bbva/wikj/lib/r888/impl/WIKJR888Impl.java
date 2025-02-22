package com.bbva.wikj.lib.r888.impl;

import com.bbva.apx.exception.db.NoResultException;
import com.bbva.wikj.dto.user.DtoIn;
import com.bbva.wikj.dto.user.DtoOut;

import java.util.HashMap;
import java.util.Map;


public class WIKJR888Impl extends WIKJR888Abstract {

	@Override
	public DtoOut execute(DtoIn dtoIn) {
		DtoOut dtoOut = new DtoOut();
		Map<String, Object> args = new HashMap<>();

		args.put("id", dtoIn.getId());
		args.put("nuip", dtoIn.getNuip());
		args.put("full_name", dtoIn.getFull_name());
		args.put("phone", dtoIn.getPhone());
		args.put("address", dtoIn.getAddress());

		Map<String, Object> response = new HashMap<>();
		try {
			 response = this.wikjR889.executeSelect(dtoIn.getNuip());
		} catch (NoResultException e) {
			int result = this.wikjR889.executeInsert(args);
			response = this.wikjR889.executeSelect(dtoIn.getNuip());

				if (response != null && !response.isEmpty()) {
					map(dtoOut, response);
				}
		} finally {
			map(dtoOut, response);
		}

		return dtoOut;
	}

	public DtoOut map(DtoOut dtoOut, Map<String, Object> in) {
		dtoOut.setId(in.get("id").toString());
		dtoOut.setNuip(in.get("nuip").toString());
		dtoOut.setFull_name(in.get("full_name").toString());
		dtoOut.setPhone(in.get("phone").toString());
		dtoOut.setAddress(in.get("address").toString());
		return dtoOut;
	}
}
