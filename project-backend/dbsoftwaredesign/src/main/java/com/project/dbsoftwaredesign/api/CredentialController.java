package com.project.dbsoftwaredesign.api;

import com.project.dbsoftwaredesign.model.Credentials;
import com.project.dbsoftwaredesign.service.CredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RequestMapping("api/v1/credential")
@RestController
public class CredentialController {
    private final CredentialService credentialService;

    @Autowired
    public CredentialController(CredentialService credentialService) {
        this.credentialService = credentialService;
    }

    @PostMapping("/addadmin")
    @CrossOrigin(origins = "http://localhost:4200")
    public String createCredentialsToAdmin(@RequestBody Credentials credentials){
        credentialService.createCredentials(credentials);
        return credentials.getUsername().concat("  added successfully");
    }

    @PostMapping("/removeadmin")
    @CrossOrigin(origins = "http://localhost:4200")
    public String removeCredentialsToAdmin(@RequestBody Credentials credentials){
        credentialService.removeCredentials(credentials);
        return credentials.getUsername().concat("  removed successfully");
    }

    @PostMapping("/checkcredentials")
    @CrossOrigin(origins = "http://localhost:4200")
    public String checkCredentials(@RequestBody Credentials credentials){
        return credentialService.checkCredentials(credentials);
    }

    @PostMapping("/allcredentials")
    @CrossOrigin(origins = "http://localhost:4200")
    public List<Credentials> getAllCredentials(Credentials credentials){
        return credentialService.allCrederntials(credentials);
    }
}
