package com.test.webapp.model;



import java.io.Serializable;

import java.util.Date;

import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.springframework.data.jpa.domain.AbstractPersistable;

/**
 * 2013-03-26
 * 
 * @author shanqiang.chen
 * 
 * @param <PK>
 */
@MappedSuperclass
public class CommonEntity<PK extends Serializable> extends AbstractPersistable<PK>
{
	private static final long serialVersionUID = 1L;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date createdDate = new Date();
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastModifiedDate;
	@Version
	private long version = 0;

	public Date getCreatedDate()
	{
		return createdDate;
	}

	public void setCreatedDate(Date createdDate)
	{
		this.createdDate = createdDate;
	}

	public Date getLastModifiedDate()
	{
		return lastModifiedDate;
	}

	public void setLastModifiedDate(Date lastModifiedDate)
	{
		this.lastModifiedDate = lastModifiedDate;
	}

	public long getVersion()
	{
		return version;
	}

	public void setVersion(long version)
	{
		this.version = version;
	}

}
