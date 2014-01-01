package com.smbtec.cdo.examples.family.domain;

import java.util.Collection;

import com.buschmais.cdo.neo4j.api.annotation.Label;
import com.buschmais.cdo.neo4j.api.annotation.Relation;
import com.buschmais.cdo.neo4j.api.annotation.Relation.Incoming;
import com.buschmais.cdo.neo4j.api.annotation.Relation.Outgoing;

@Label("Human")
public interface Human {

	String getFirstname();
	
	void setFirstname(String firstname);
	
	@Relation("PARENT_OF")
	@Incoming
	Human getParent();
	
	void setParent(Human parent);
	
	@Relation("PARENT_OF")
	@Outgoing
	Collection<Human> getChildren();
}
