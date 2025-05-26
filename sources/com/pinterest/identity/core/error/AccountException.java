package com.pinterest.identity.core.error;

import com.pinterest.identity.core.error.UnauthException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0003\u0003\u0004\u0005\u0082\u0001\u0003\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "GenericAccountError", "InvalidUserNameOrEmailException", "UnlinkAccountError", "Lcom/pinterest/identity/core/error/AccountException$GenericAccountError;", "Lcom/pinterest/identity/core/error/AccountException$InvalidUserNameOrEmailException;", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class AccountException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$GenericAccountError;", "Lcom/pinterest/identity/core/error/AccountException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static final class GenericAccountError extends AccountException {
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$InvalidUserNameOrEmailException;", "Lcom/pinterest/identity/core/error/AccountException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static final class InvalidUserNameOrEmailException extends AccountException {
        public InvalidUserNameOrEmailException() {
            super(null);
        }

        public InvalidUserNameOrEmailException(int i13) {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError;", "Lcom/pinterest/identity/core/error/AccountException;", "BusinessOrOwnerAccountError", "EmailAlreadyTakenError", "InvalidEmailAddress", "InvalidPasswordOrConfirmation", "UserSettingsConstraintsError", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class UnlinkAccountError extends AccountException {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$BusinessOrOwnerAccountError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class BusinessOrOwnerAccountError extends UnauthException.AuthenticationError {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$EmailAlreadyTakenError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class EmailAlreadyTakenError extends UnauthException.AuthenticationError {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$InvalidEmailAddress;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class InvalidEmailAddress extends UnauthException.AuthenticationError {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$InvalidPasswordOrConfirmation;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class InvalidPasswordOrConfirmation extends UnauthException.AuthenticationError {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$UserSettingsConstraintsError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class UserSettingsConstraintsError extends UnauthException.AuthenticationError {
        }
    }
}
