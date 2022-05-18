package com.kowalski.api.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.kowalski.api.organization.fallback.EmployeeFallback;
import com.kowalski.api.organization.model.Employee;

@FeignClient(name = "employee-service", fallback = EmployeeFallback.class)
public interface EmployeeClient {

	@GetMapping("/organization/{organizationId}")
	List<Employee> findByOrganization(@PathVariable("organizationId") Long organizationId);
}
