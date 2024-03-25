package org.encore.apartment.community.domain.user.info.data.dto.user;

import org.encore.apartment.community.domain.user.info.data.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Getter;

@Getter
public class UserRequestDto {

	@NotBlank
	private String userId;

	@NotBlank
	private String userPassword;

	@NotBlank
	private String userNickname;

	@Email
	private String userEmail;

	@NotBlank
	@Pattern(regexp = "^\\d{3}-\\d{4}-\\d{4}$", message = "전화번호는 010-XXXX-XXXX 형식이어야 합니다.")
	private String userMobile;

	@NotNull
	private Integer userBuildingNumber;

	@NotNull
	private Integer userHouseNumber;

	@NotNull
	private Boolean userHeadHouseHoldYn;

	private Long apartmentId;

	public static User toEntity(UserRequestDto userRequestDto, PasswordEncoder encoder) {
		return User.builder()
					.userId(userRequestDto.getUserId())
					.userPassword(encoder.encode(userRequestDto.getUserPassword()))
					.userNickname(userRequestDto.getUserNickname())
					.userEmail(userRequestDto.getUserEmail())
					.userMobile(userRequestDto.getUserMobile())
					.userBuildingNumber(userRequestDto.getUserBuildingNumber())
					.userHouseNumber(userRequestDto.getUserHouseNumber())
					.userHeadHouseHoldYn(userRequestDto.getUserHeadHouseHoldYn())
					.build();
	}
}
