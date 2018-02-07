package com.wsapi.docker.dockerspringbootwsapi.testcase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Version {
	
	public Integer major;
	
	public Integer minor;
	
	public Integer revision ;
	
	public Integer build;

	@Override
	public String toString() {
		return "Version [major=" + major + ", minor=" + minor + ", revision="
				+ revision + ", build=" + build + "]";
	}

	public Integer getMajor() {
		return major;
	}

	public void setMajor(Integer major) {
		this.major = major;
	}

	public Integer getMinor() {
		return minor;
	}

	public void setMinor(Integer minor) {
		this.minor = minor;
	}

	
	public Integer getRevision() {
		return revision;
	}

	public void setRevision(Integer revision) {
		this.revision = revision;
	}

	public Integer getBuild() {
		return build;
	}

	public void setBuild(Integer build) {
		this.build = build;
	}
	
	

}
