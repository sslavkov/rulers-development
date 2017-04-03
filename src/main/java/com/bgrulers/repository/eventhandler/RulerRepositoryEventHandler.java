package com.bgrulers.repository.eventhandler;

import com.bgrulers.repository.RulerRepository;
import org.springframework.data.rest.core.annotation.RepositoryEventHandler;
import org.springframework.stereotype.Component;

// If need specific security per repo - use this format (instead of SecurityConfig)
@Component
@RepositoryEventHandler(RulerRepository.class)
public class RulerRepositoryEventHandler {

//	/**
//	 * Checks for required authority
//	 * before PUT PATCH
//	 * @param ruler
//	 */
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@HandleBeforeSave
//	public void checkPUTAndPATCHAuthority(Ruler ruler) {
//	}
//
//	/**
//	 * Checks for required authority
//	 * before POST
//	 * @param ruler
//	 */
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@HandleBeforeCreate
//	public void checkPOSTAuthority(Ruler ruler) {
//
//	}
//
//	/**
//	 * Checks for required authority
//	 * before DELETE
//	 * @param ruler
//	 */
//	@PreAuthorize("hasRole('ROLE_ADMIN')")
//	@HandleBeforeDelete
//	public void checkDELETEAuthority(Ruler ruler) {
//
//	}
}