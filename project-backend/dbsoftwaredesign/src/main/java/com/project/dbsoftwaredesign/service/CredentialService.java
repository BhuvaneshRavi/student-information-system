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

    public String checkCredentials(Credentials credentials){
        Credentials cred = credentialMapper.checkCredentials(credentials);
        if(cred != null){
            if(cred.getPassword().equals(credentials.getPassword())){
                return "Success : Credential Check";
            } else {
                return "Failure : Credential Check";
            }
        }
        else {
            return "Failure : Credential Check";
        }
    }
    public List<Credentials> allCrederntials(Credentials credentials){
        return credentialMapper.allCredentials(credentials);
    }
}
