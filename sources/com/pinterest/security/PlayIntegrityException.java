package com.pinterest.security;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0004\u0003\u0004\u0005\u0006\u0082\u0001\u0004\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/pinterest/security/PlayIntegrityException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "IntegrityServiceException", "MissingNonce", "TokenRetrievalError", "VerifyAuthSessionError", "Lcom/pinterest/security/PlayIntegrityException$IntegrityServiceException;", "Lcom/pinterest/security/PlayIntegrityException$MissingNonce;", "Lcom/pinterest/security/PlayIntegrityException$TokenRetrievalError;", "Lcom/pinterest/security/PlayIntegrityException$VerifyAuthSessionError;", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class PlayIntegrityException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/PlayIntegrityException$IntegrityServiceException;", "Lcom/pinterest/security/PlayIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class IntegrityServiceException extends PlayIntegrityException {
        public IntegrityServiceException() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/PlayIntegrityException$MissingNonce;", "Lcom/pinterest/security/PlayIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class MissingNonce extends PlayIntegrityException {
        public MissingNonce() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/PlayIntegrityException$TokenRetrievalError;", "Lcom/pinterest/security/PlayIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class TokenRetrievalError extends PlayIntegrityException {
        public TokenRetrievalError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/PlayIntegrityException$VerifyAuthSessionError;", "Lcom/pinterest/security/PlayIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class VerifyAuthSessionError extends PlayIntegrityException {
        public VerifyAuthSessionError() {
            super(null);
        }
    }
}
