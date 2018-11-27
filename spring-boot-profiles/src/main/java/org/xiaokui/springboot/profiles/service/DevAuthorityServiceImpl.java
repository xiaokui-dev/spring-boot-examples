package org.xiaokui.springboot.profiles.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-24 23:01
 */
@Service
@Profile("dev")
public class DevAuthorityServiceImpl implements AuthorityService {

    @Override
    public boolean hasRole(String role) {
        return true;
    }
}
