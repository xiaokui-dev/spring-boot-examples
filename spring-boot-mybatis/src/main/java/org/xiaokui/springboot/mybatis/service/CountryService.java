package org.xiaokui.springboot.mybatis.service;

import org.xiaokui.springboot.mybatis.domain.Country;

import java.util.List;

/**
 * @author xiaokui
 * @Description:
 * @date 2018-04-03 17:39
 */
public interface CountryService {

    List<Country> getAll(Country country);

    Country getById(Long id);

    void deleteById(Long id);

    void save(Country country);

}
