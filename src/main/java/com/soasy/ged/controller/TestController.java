package com.soasy.ged.controller;

import com.soasy.ged.api.AuditApplicationsApi;
import com.soasy.ged.api.AuditApplicationsApiClient;
import com.soasy.ged.model.AuditAppPaging;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller()
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class TestController {
    private  final AuditApplicationsApiClient auditApplicationsApiClient;


    public TestController(AuditApplicationsApiClient auditApplicationsApiClient) {
        this.auditApplicationsApiClient = auditApplicationsApiClient;
    }

    @GetMapping("/test")
    public ResponseEntity<AuditAppPaging>test(){
        return this.auditApplicationsApiClient.listAuditApps(0,100,null);

    }
}
