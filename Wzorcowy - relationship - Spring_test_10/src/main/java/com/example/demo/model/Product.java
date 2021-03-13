package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "t_product")
public class Product {

	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
	    private String name;
	    private String description;
	    private String path;
	    
	    ///
	    @Transient
	    private String portfolioName;
	    ////
	    
	    @ManyToOne
	    @JsonIgnore
	    private Portfolio portfolio;
	    
	    ///
	    public String getPortfolioName() {
	    	return getPortfolio().getName();
	    }
	    
	    public void setPortfolioName(String portfolioName) {
	    	this.portfolioName = portfolioName;
	    }
	    ///
	    
	    
		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getPath() {
			return path;
		}

		public void setPath(String path) {
			this.path = path;
		}

		public Portfolio getPortfolio() {
			return portfolio;
		}

		public void setPortfolio(Portfolio portfolio) {
			this.portfolio = portfolio;
		}
	    
	    
}
