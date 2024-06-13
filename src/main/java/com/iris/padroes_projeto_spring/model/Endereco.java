package com.iris.padroes_projeto_spring.model;

import java.util.LinkedHashMap;
import java.util.Map;



import jakarta.persistence.Entity;
import jakarta.persistence.Id;


/***
 * 
 * @see https://www.jsonschema2pojo.org/
 * @see https://viacep.com.br/
 * 
 * @author iviturin
 */

@Entity
public class Endereco {
	
	@Id
	private String cep;
	private String logradouro;
	private String complemento;
	private String bairro;
	private String localidade;
	private String uf;
	private String ibge;
	private String gia;
	private String ddd;
	private String siafi;
	private Map<String, Object> additionalProperties = new LinkedHashMap<String, Object>();

	public String getCep() {
	return cep;
	}

	public void setCep(String cep) {
	this.cep = cep;
	}

	public String getLogradouro() {
	return logradouro;
	}

	public void setLogradouro(String logradouro) {
	this.logradouro = logradouro;
	}

	public String getComplemento() {
	return complemento;
	}

	public void setComplemento(String complemento) {
	this.complemento = complemento;
	}

	public String getBairro() {
	return bairro;
	}

	public void setBairro(String bairro) {
	this.bairro = bairro;
	}

	public String getLocalidade() {
	return localidade;
	}

	public void setLocalidade(String localidade) {
	this.localidade = localidade;
	}

	public String getUf() {
	return uf;
	}

	public void setUf(String uf) {
	this.uf = uf;
	}

	public String getIbge() {
	return ibge;
	}

	public void setIbge(String ibge) {
	this.ibge = ibge;
	}

	public String getGia() {
	return gia;
	}

	public void setGia(String gia) {
	this.gia = gia;
	}

	public String getDdd() {
	return ddd;
	}

	public void setDdd(String ddd) {
	this.ddd = ddd;
	}

	public String getSiafi() {
	return siafi;
	}

	public void setSiafi(String siafi) {
	this.siafi = siafi;
	}

	public Map<String, Object> getAdditionalProperties() {
	return this.additionalProperties;
	}

	public void setAdditionalProperty(String name, Object value) {
	this.additionalProperties.put(name, value);
	}

}
