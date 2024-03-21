package org.encore.apartment.community.domain.matchingCategory.service;

import java.util.List;
import java.util.Optional;


import org.encore.apartment.community.domain.matchingCategory.data.dto.ResponseMatchingCategoryDto;
import org.encore.apartment.community.domain.matchingCategory.data.dto.UpdateMatchingCategoryDto;
import org.encore.apartment.community.domain.matchingStatus.data.dto.RequestMatchingCategoryDto;

public interface MatchingCategoryService {

	public void insertMatchingCategoryInfo(RequestMatchingCategoryDto params);

	void insertMatchingCategoryInfo(org.encore.apartment.community.domain.matchingCategory.data.dto.RequestMatchingCategoryDto params);

	public Optional<ResponseMatchingCategoryDto> findMatchingCategoryInfo(Long id);

	public List<ResponseMatchingCategoryDto> findMatchingCategoryInfoList();

	public void updateMatchingCategoryInfoById(Long id, UpdateMatchingCategoryDto params);

	public void deleteMatchingCategoryInfo(Long id);
}
