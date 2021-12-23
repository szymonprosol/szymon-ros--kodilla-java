package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    private CompanyDao companyDao;
    private EmployeeDao employeeDao;

    public Facade(CompanyDao companyDao, EmployeeDao employeeDao) {
        this.companyDao = companyDao;
        this.employeeDao = employeeDao;
    }

    public List<Company> findCompaniesLike(String substringCompanyName) {
        LOGGER.info("Searching for companies like " + substringCompanyName);
        return companyDao.retrieveByCompanyName(substringCompanyName);
    }

    public List<Employee> findEmploiesLike(String substringEmployeeLastname) {
        LOGGER.info("Searching for emploies like " + substringEmployeeLastname);
        return employeeDao.retrieveByLastname(substringEmployeeLastname);
    }
}
