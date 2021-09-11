package com.myAPI.com.apisql;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;


import com.myAPI.com.apisql.controller.EmployeeController;
import com.myAPI.com.apisql.service.EmployeeService;



@WebMvcTest(controllers = EmployeeController.class)
public class EmployeeControllerTest {
	
	@Autowired
    private MockMvc mockMvc;
	@MockBean
	private EmployeeService employeeService;
    @Test
    public void testGetEmployees() throws Exception {
        mockMvc.perform(get("/employees"))
            .andExpect(status().isOk());
    }      

}
