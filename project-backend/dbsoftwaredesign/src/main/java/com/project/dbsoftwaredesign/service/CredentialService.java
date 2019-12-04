package com.project.dbsoftwaredesign.service;

import com.project.dbsoftwaredesign.mapper.CredentialMapper;
import com.project.dbsoftwaredesign.model.Credentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CredentialService {
    private CredentialMapper credentialMapper;

    @Autowired
    public CredentialService(CredentialMapper credentialMapper) {
        this.credentialMapper = credentialMapper;
    }

    public void createCredentials(Credentials credentials){
        credentialMapper.createCredentials(credentials);
     }

    public void removeCredentials(Credentials credentials){
        credentialMapper.removeCredentials(credentials);
    }

    public Credentials checkCredentials(Credentials credentials){
        Credentials cred = credentialMapper.checkCredentials(credentials);
        if(cred != null) {
            if (cred.getPassword().equals(credentials.getPassword())) {
                cred.setLoginStatus("success");
                return cred;
            } else {
                cred.setLoginStatus("failure");
                return cred;
            }
        } else {
                cred.setLoginStatus("failure");
                return cred;
        }
    }
    public List<Credentials> allCrederntials(Credentials credentials){
        return credentialMapper.allCredentials(credentials);
    }
}
