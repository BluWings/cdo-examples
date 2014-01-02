package com.smbtec.cdo.examples.family.domain;

import java.util.Collection;

import com.buschmais.cdo.neo4j.api.annotation.Label;

@Label("Human")
public interface Human {

	String getName();

	void setName(String name);

	Collection<Human> getChildren();
}
