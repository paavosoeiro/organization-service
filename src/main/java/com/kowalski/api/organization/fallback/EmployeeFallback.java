package com.kowalski.api.organization.fallback;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.kowalski.api.organization.client.EmployeeClient;
import com.kowalski.api.organization.model.Employee;

@Component
public class EmployeeFallback implements EmployeeClient {

	@Override
	public List<Employee> findByOrganization(Long organizationId) {
		List<Employee> emp = new ArrayList<>();
		return emp;
	}

}
