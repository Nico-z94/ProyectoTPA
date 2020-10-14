package com.example.alumno.config;

import org.hibernate.envers.RevisionListener;
import com.example.alumno.entities.audit.Revision;

public class CustomRevisionListener implements RevisionListener {

    public void newRevision(Object revisionEntity) { final Revision revision = (Revision) revisionEntity; }
}
