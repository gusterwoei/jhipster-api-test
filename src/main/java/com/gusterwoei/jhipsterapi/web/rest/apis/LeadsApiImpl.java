package com.gusterwoei.jhipsterapi.web.rest.apis;

import com.gusterwoei.jhipsterapi.web.api.LeadsApiDelegate;
import com.gusterwoei.jhipsterapi.web.api.model.Lead;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LeadsApiImpl implements LeadsApiDelegate {

    @Override
    public ResponseEntity<Lead> getLeadDetail(String leadId) {
        return ResponseEntity.ok(new Lead());
    }

    @Override
    public ResponseEntity<List<Lead>> getLeads(String X_API_KEY, Integer limit, Integer page) {
        List<Lead> leads = new ArrayList<>();

        return ResponseEntity.ok(leads);
    }
}
