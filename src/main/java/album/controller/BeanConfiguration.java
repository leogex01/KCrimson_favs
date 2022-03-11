/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Mar 10, 2022
 */
package album.controller;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import album.beans.Records;

@Configuration
public class BeanConfiguration {
	@Bean
	public Records records() {
		Records bean = new Records();
		bean.setTitle("Indiscipline");
		bean.setReleaseDate(1983);
		bean.setRating(4.7);
		bean.setGuitarist("Belew");
		return bean;
	}
}
