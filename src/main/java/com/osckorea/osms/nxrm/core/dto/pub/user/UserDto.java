package com.osckorea.osms.nxrm.core.dto.pub.user;

import java.util.List;
import com.osckorea.osms.nxrm.core.model.pub.user.UserStatusType;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Singular;

@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public final class UserDto {
    private String userId;
    private String firstName;
    private String lastName;
    private String emailAddress;
    private String source;
    private String status;
    private List<String> roles;
    private List<String> externalRoles;

    public UserDto(
        final String userId,
        final String firstName,
        final String lastName,
        final String emailAddress,
        final String source,
        final UserStatusType status,
        @Singular final List<String> roles
    ) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.emailAddress = emailAddress;
        this.source = source;
        this.status = status.getStatus();
        this.roles = roles;
    }
}
