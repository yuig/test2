package com.pinterest.identity.core.error;

import com.pinterest.error.NetworkResponseError;
import gr1.j;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import nm.u;
import qr1.m;
import qz.d;
import sr1.g;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u000b\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u0082\u0001\n\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017¨\u0006\u0018"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "AuthCanceledError", "AuthServiceNotAvailableError", "AuthenticationError", "AutoLoginAuthenticationError", "nl/b", "GoogleCredentialKeychain", "LogoutCompositeError", "ThirdParty", "UnsupportedAuthOperation", "UserLookUpError", "UserLookUpRateLimitHit", "Lcom/pinterest/identity/core/error/UnauthException$AuthCanceledError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthServiceNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SocialConnectError;", "Lcom/pinterest/identity/core/error/UnauthException$AutoLoginAuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException$LogoutCompositeError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "Lcom/pinterest/identity/core/error/UnauthException$UnsupportedAuthOperation;", "Lcom/pinterest/identity/core/error/UnauthException$UserLookUpError;", "Lcom/pinterest/identity/core/error/UnauthException$UserLookUpRateLimitHit;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public abstract class UnauthException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthCanceledError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class AuthCanceledError extends UnauthException {
        public AuthCanceledError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthServiceNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class AuthServiceNotAvailableError extends UnauthException {

        /* renamed from: a, reason: collision with root package name */
        public final m f49830a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AuthServiceNotAvailableError(m authority) {
            super(null);
            Intrinsics.checkNotNullParameter(authority, "authority");
            this.f49830a = authority;
        }

        @Override // com.pinterest.identity.core.error.UnauthException
        public final void a(u tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            super.a(tags);
            tags.u("disabled_authority", this.f49830a.f105013a);
        }
    }

    @Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0018\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u0082\u0001\u001c\u001a\u001b\u001c\u001d\u001e\u001f !\"#$%&'()*+,-./012345¨\u00066"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException;", "AccountAlreadyLinkedError", "AgeRequiredForCountryError", "BadPasswordError", "FacebookAccountAlreadyLinkedError", "FacebookDeprecatedError", "GoogleAccountAlreadyLinkedError", "InstagramAccountAlreadyLinkedError", "LoginError", "LoginRateLimitError", "MagicLinkExpiredError", "MissingAccessTokenError", "MissingEmailError", "MissingLoggedUser", "NonExistentEmailError", "OverageSignupError", "Require2FAError", "SafeModeError", "SignupError", "SocialConnectError", "SuspendedAccountError", "UnderageSignupError", "UserNotFoundError", "Wrong2FACodeError", "WrongPasswordResetError", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$BusinessOrOwnerAccountError;", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$EmailAlreadyTakenError;", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$InvalidEmailAddress;", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$InvalidPasswordOrConfirmation;", "Lcom/pinterest/identity/core/error/AccountException$UnlinkAccountError$UserSettingsConstraintsError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$AccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$AgeRequiredForCountryError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$BadPasswordError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$FacebookAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$FacebookDeprecatedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$GoogleAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$InstagramAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$LoginError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$LoginRateLimitError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MagicLinkExpiredError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingAccessTokenError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingEmailError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingLoggedUser;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$NonExistentEmailError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$OverageSignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$Require2FAError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SafeModeError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SuspendedAccountError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$UnderageSignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$UserNotFoundError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$Wrong2FACodeError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$WrongPasswordResetError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class AuthenticationError extends UnauthException {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$AccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class AccountAlreadyLinkedError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final qr1.a f49831a;

            /* renamed from: b, reason: collision with root package name */
            public final j f49832b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AccountAlreadyLinkedError(NetworkResponseError networkResponseError, qr1.a aVar, j pendingSocialConnectData) {
                super(networkResponseError);
                Intrinsics.checkNotNullParameter(pendingSocialConnectData, "pendingSocialConnectData");
                this.f49831a = aVar;
                this.f49832b = pendingSocialConnectData;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$AgeRequiredForCountryError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class AgeRequiredForCountryError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final g f49833a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AgeRequiredForCountryError(g pendingSignupData, Throwable th3) {
                super(th3);
                Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
                this.f49833a = pendingSignupData;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$BadPasswordError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class BadPasswordError extends AuthenticationError {
            public BadPasswordError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$FacebookAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class FacebookAccountAlreadyLinkedError extends AuthenticationError {
            public FacebookAccountAlreadyLinkedError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$FacebookDeprecatedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class FacebookDeprecatedError extends AuthenticationError {
            public FacebookDeprecatedError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$GoogleAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class GoogleAccountAlreadyLinkedError extends AuthenticationError {
            public GoogleAccountAlreadyLinkedError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$InstagramAccountAlreadyLinkedError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class InstagramAccountAlreadyLinkedError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final String f49834a;

            public InstagramAccountAlreadyLinkedError(String str, NetworkResponseError networkResponseError) {
                super(networkResponseError);
                this.f49834a = str;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$LoginError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class LoginError extends AuthenticationError {
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$LoginRateLimitError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class LoginRateLimitError extends AuthenticationError {
            public LoginRateLimitError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MagicLinkExpiredError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class MagicLinkExpiredError extends AuthenticationError {
            public MagicLinkExpiredError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingAccessTokenError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class MissingAccessTokenError extends AuthenticationError {
            public MissingAccessTokenError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingEmailError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class MissingEmailError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final g f49835a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public MissingEmailError(g pendingSignupData, NetworkResponseError networkResponseError) {
                super(networkResponseError);
                Intrinsics.checkNotNullParameter(pendingSignupData, "pendingSignupData");
                this.f49835a = pendingSignupData;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$MissingLoggedUser;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class MissingLoggedUser extends AuthenticationError {
            public MissingLoggedUser() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$NonExistentEmailError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class NonExistentEmailError extends AuthenticationError {
            public NonExistentEmailError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$OverageSignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class OverageSignupError extends AuthenticationError {
            public OverageSignupError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$Require2FAError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class Require2FAError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final m f49836a;

            /* renamed from: b, reason: collision with root package name */
            public final String f49837b;

            /* renamed from: c, reason: collision with root package name */
            public final boolean f49838c;

            /* renamed from: d, reason: collision with root package name */
            public final HashMap f49839d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public Require2FAError(m authority, String phoneNumberEnd, boolean z13, HashMap loginParams, NetworkResponseError networkResponseError) {
                super(networkResponseError);
                Intrinsics.checkNotNullParameter(authority, "authority");
                Intrinsics.checkNotNullParameter(phoneNumberEnd, "phoneNumberEnd");
                Intrinsics.checkNotNullParameter(loginParams, "loginParams");
                this.f49836a = authority;
                this.f49837b = phoneNumberEnd;
                this.f49838c = z13;
                this.f49839d = loginParams;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SafeModeError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class SafeModeError extends AuthenticationError {
            public SafeModeError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class SignupError extends AuthenticationError {

            /* renamed from: a, reason: collision with root package name */
            public final d f49840a;

            public SignupError(Throwable th3, d dVar) {
                super(th3);
                this.f49840a = dVar;
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SocialConnectError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class SocialConnectError extends UnauthException {
            public SocialConnectError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$SuspendedAccountError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class SuspendedAccountError extends AuthenticationError {
            public SuspendedAccountError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$UnderageSignupError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class UnderageSignupError extends AuthenticationError {
            public UnderageSignupError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$UserNotFoundError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class UserNotFoundError extends AuthenticationError {
            public UserNotFoundError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$Wrong2FACodeError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class Wrong2FACodeError extends AuthenticationError {
            public Wrong2FACodeError() {
                super(null);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError$WrongPasswordResetError;", "Lcom/pinterest/identity/core/error/UnauthException$AuthenticationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static final class WrongPasswordResetError extends AuthenticationError {
            public WrongPasswordResetError() {
                super(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$AutoLoginAuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static final class AutoLoginAuthenticationError extends UnauthException {

        /* renamed from: a, reason: collision with root package name */
        public final List f49841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AutoLoginAuthenticationError(ArrayList errors) {
            super(null);
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f49841a = errors;
        }

        @Override // com.pinterest.identity.core.error.UnauthException
        public final void a(u tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            super.a(tags);
            tags.u("autologin_errors", CollectionsKt.Z(this.f49841a, "/", null, null, 0, null, a.f49843i, 30));
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$GoogleCredentialKeychain;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "SavePasswordError", "Lcom/pinterest/identity/core/error/UnauthException$GoogleCredentialKeychain$SavePasswordError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static abstract class GoogleCredentialKeychain extends ThirdParty {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$GoogleCredentialKeychain$SavePasswordError;", "Lcom/pinterest/identity/core/error/UnauthException$GoogleCredentialKeychain;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static final class SavePasswordError extends GoogleCredentialKeychain {
            public SavePasswordError() {
                super(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$LogoutCompositeError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class LogoutCompositeError extends UnauthException {

        /* renamed from: a, reason: collision with root package name */
        public final List f49842a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LogoutCompositeError(List errors) {
            super(null);
            Intrinsics.checkNotNullParameter(errors, "errors");
            this.f49842a = errors;
        }

        @Override // com.pinterest.identity.core.error.UnauthException
        public final void a(u tags) {
            Intrinsics.checkNotNullParameter(tags, "tags");
            super.a(tags);
            tags.u("logout_errors", CollectionsKt.Z(this.f49842a, "/", null, null, 0, null, b.f49844i, 30));
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0005\u0002\u0003\u0004\u0005\u0006\u0082\u0001\u0006\u0007\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "Lcom/pinterest/identity/core/error/UnauthException;", "Facebook", "Google", "GoogleOneTap", "Line", "SSO", "Lcom/pinterest/identity/core/error/UnauthException$GoogleCredentialKeychain;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    public static abstract class ThirdParty extends UnauthException {

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "FetchAccessTokenFailure", "LoginResultError", "LoginStatusFailure", "MissingAccessTokenError", "OutdatedError", "ProfileFailureError", "SdkInitializationError", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$FetchAccessTokenFailure;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$LoginResultError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$LoginStatusFailure;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$MissingAccessTokenError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$OutdatedError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$ProfileFailureError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$SdkInitializationError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static abstract class Facebook extends ThirdParty {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$FetchAccessTokenFailure;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            public static final class FetchAccessTokenFailure extends Facebook {
                public FetchAccessTokenFailure() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$LoginResultError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class LoginResultError extends Facebook {
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$LoginStatusFailure;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class LoginStatusFailure extends Facebook {
                public LoginStatusFailure() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$MissingAccessTokenError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class MissingAccessTokenError extends Facebook {
                public MissingAccessTokenError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$OutdatedError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class OutdatedError extends Facebook {
                public OutdatedError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$ProfileFailureError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class ProfileFailureError extends Facebook {
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook$SdkInitializationError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Facebook;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class SdkInitializationError extends Facebook {
                public SdkInitializationError() {
                    super(null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "PlayServicesNotAvailableError", "UnsupportedProviderError", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google$PlayServicesNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google$UnsupportedProviderError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static abstract class Google extends ThirdParty {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google$PlayServicesNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class PlayServicesNotAvailableError extends Google {
                public PlayServicesNotAvailableError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google$UnsupportedProviderError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Google;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class UnsupportedProviderError extends Google {
                public UnsupportedProviderError() {
                    super(null);
                }
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\u0002\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0006\b\t\n\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "GoogleIdCredentialRetrievalError", "NoCredentialFoundError", "PlayServicesNotAvailableError", "PlayServicesOutdatedError", "UnresolvableCredentialError", "UnsupportedAccountTypeError", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$GoogleIdCredentialRetrievalError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$NoCredentialFoundError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$PlayServicesNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$PlayServicesOutdatedError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$UnresolvableCredentialError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$UnsupportedAccountTypeError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        public static abstract class GoogleOneTap extends ThirdParty {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$GoogleIdCredentialRetrievalError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class GoogleIdCredentialRetrievalError extends GoogleOneTap {
                public GoogleIdCredentialRetrievalError() {
                    super(null);
                }

                public GoogleIdCredentialRetrievalError(Exception exc) {
                    super(exc);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$NoCredentialFoundError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            public static final class NoCredentialFoundError extends GoogleOneTap {
                public NoCredentialFoundError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$PlayServicesNotAvailableError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class PlayServicesNotAvailableError extends GoogleOneTap {
                public PlayServicesNotAvailableError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$PlayServicesOutdatedError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class PlayServicesOutdatedError extends GoogleOneTap {
                public PlayServicesOutdatedError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$UnresolvableCredentialError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            /* loaded from: classes4.dex */
            public static final class UnresolvableCredentialError extends GoogleOneTap {
                public UnresolvableCredentialError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap$UnsupportedAccountTypeError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$GoogleOneTap;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            /* loaded from: classes4.dex */
            public static final class UnsupportedAccountTypeError extends GoogleOneTap {
                public UnsupportedAccountTypeError() {
                    super(null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "LoginResultError", "MissingLineIdError", "MissingTokenError", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$LoginResultError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$MissingLineIdError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$MissingTokenError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static abstract class Line extends ThirdParty {

            @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$LoginResultError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
            public static final class LoginResultError extends Line {
                public LoginResultError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$MissingLineIdError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class MissingLineIdError extends Line {
                public MissingLineIdError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line$MissingTokenError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$Line;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class MissingTokenError extends Line {
                public MissingTokenError() {
                    super(null);
                }
            }
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty;", "MissingCallbackCodeError", "MissingIntentInfoError", "SSOAuthenticationError", "SSOCancelledError", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$MissingCallbackCodeError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$MissingIntentInfoError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$SSOAuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$SSOCancelledError;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
        /* loaded from: classes4.dex */
        public static abstract class SSO extends ThirdParty {

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$MissingCallbackCodeError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class MissingCallbackCodeError extends SSO {
                public MissingCallbackCodeError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$MissingIntentInfoError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class MissingIntentInfoError extends SSO {
                public MissingIntentInfoError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$SSOAuthenticationError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class SSOAuthenticationError extends SSO {
                public SSOAuthenticationError() {
                    super(null);
                }
            }

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO$SSOCancelledError;", "Lcom/pinterest/identity/core/error/UnauthException$ThirdParty$SSO;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final class SSOCancelledError extends SSO {
                public SSOCancelledError() {
                    super(null);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$UnsupportedAuthOperation;", "Lcom/pinterest/identity/core/error/UnauthException;", "()V", "identity-core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* loaded from: classes4.dex */
    public static final class UnsupportedAuthOperation extends UnauthException {
        public UnsupportedAuthOperation() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$UserLookUpError;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class UserLookUpError extends UnauthException {
        public UserLookUpError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/identity/core/error/UnauthException$UserLookUpRateLimitHit;", "Lcom/pinterest/identity/core/error/UnauthException;", "identity-core_release"}, k = 1, mv = {1, 9, 0})
    /* loaded from: classes4.dex */
    public static final class UserLookUpRateLimitHit extends UnauthException {
        public UserLookUpRateLimitHit() {
            super(null);
        }
    }

    public void a(u tags) {
        String message;
        Intrinsics.checkNotNullParameter(tags, "tags");
        Throwable cause = getCause();
        if (cause == null || (message = cause.getMessage()) == null) {
            return;
        }
        tags.u("error_message", message);
    }
}
