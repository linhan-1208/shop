package com.goods.pojo;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

@Table(name="tb_template")
@Data
public class Template implements Serializable {

	@Id
	private Integer id;//ID
	private String name;//模板名称
	private Integer specNum;//规格数量
	private Integer paraNum;//参数数量
}
