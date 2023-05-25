package com.test.hibernatedemo.entity;

import javax.persistence.Embeddable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 
 * @author Abhinav
 * Guardian Embeddable Class
 *
 */
@Embeddable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Guardian {

	private String guardianName;

	private String guardianEmail;

	private String guardianMobile;
}
