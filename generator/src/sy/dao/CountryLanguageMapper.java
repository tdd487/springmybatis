package sy.dao;

import sy.model.CountryLanguage;
import sy.model.CountryLanguageKey;

public interface CountryLanguageMapper {
    int deleteByPrimaryKey(CountryLanguageKey key);

    int insert(CountryLanguage record);

    int insertSelective(CountryLanguage record);

    CountryLanguage selectByPrimaryKey(CountryLanguageKey key);

    int updateByPrimaryKeySelective(CountryLanguage record);

    int updateByPrimaryKey(CountryLanguage record);
}