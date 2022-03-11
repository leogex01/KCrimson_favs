/**
 * @authorchrisg - Cgeralds
 * CIS175-Fall2022
 * Mar 10, 2022
 */
package album.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import album.beans.Records;


	@Repository
	public interface RecordsRepository extends JpaRepository<Records,Long> { }
	
	


