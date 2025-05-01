package com.divyan.porcoms_backend.Services;


import com.divyan.porcoms_backend.Models.Application;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ApplicationsService {

    List<Application> applications= Arrays.asList(
            new Application("APP001", "Electronics", "HS1001", "India", "USA", "50000", "Export", "Pending"),
            new Application("APP002", "Textiles", "HS1002", "India", "UK", "30000", "Export", "Approved"),
            new Application("APP003", "Machinery", "HS1003", "China", "Germany", "75000", "Import", "Rejected"),
            new Application("APP004", "Furniture", "HS1004", "Italy", "India", "45000", "Import", "Pending"),
            new Application("APP005", "Automobile Parts", "HS1005", "Japan", "India", "60000", "Import", "Approved"),
            new Application("APP006", "Pharmaceuticals", "HS1006", "India", "Australia", "35000", "Export", "Pending"),
            new Application("APP007", "Plastics", "HS1007", "South Korea", "India", "28000", "Import", "Approved"),
            new Application("APP008", "Toys", "HS1008", "China", "USA", "32000", "Export", "Rejected"),
            new Application("APP009", "Footwear", "HS1009", "Vietnam", "India", "22000", "Import", "Pending"),
            new Application("APP010", "Cosmetics", "HS1010", "France", "India", "27000", "Import", "Approved"),
            new Application("APP011", "Mobile Phones", "HS1011", "India", "UAE", "90000", "Export", "Pending"),
            new Application("APP012", "Chemicals", "HS1012", "Germany", "India", "64000", "Import", "Rejected"),
            new Application("APP013", "Books", "HS1013", "UK", "India", "13000", "Import", "Approved"),
            new Application("APP014", "Medical Equipment", "HS1014", "USA", "India", "80000", "Import", "Pending"),
            new Application("APP015", "Steel", "HS1015", "India", "Thailand", "71000", "Export", "Approved"),
            new Application("APP016", "Cement", "HS1016", "India", "Nepal", "36000", "Export", "Pending"),
            new Application("APP017", "Gold", "HS1017", "UAE", "India", "95000", "Import", "Rejected"),
            new Application("APP018", "Clothing", "HS1018", "India", "Canada", "29000", "Export", "Approved"),
            new Application("APP019", "Watches", "HS1019", "Switzerland", "India", "88000", "Import", "Pending"),
            new Application("APP020", "Software Licenses", "HS1020", "India", "USA", "67000", "Export", "Approved")
    );


    public List<Application> getAllApplication(){
        return applications;
    }

}
