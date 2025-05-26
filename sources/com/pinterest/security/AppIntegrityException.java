package com.pinterest.security;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0005\u0003\u0004\u0005\u0006\u0007\u0082\u0001\u0005\b\t\n\u000b\f¨\u0006\r"}, d2 = {"Lcom/pinterest/security/AppIntegrityException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "FingerprintRetrievalError", "IncompatibleApiVersion", "MalformedSignature", "MessageDigestAlgorithmError", "PackageInfoRetrievalError", "Lcom/pinterest/security/AppIntegrityException$FingerprintRetrievalError;", "Lcom/pinterest/security/AppIntegrityException$IncompatibleApiVersion;", "Lcom/pinterest/security/AppIntegrityException$MalformedSignature;", "Lcom/pinterest/security/AppIntegrityException$MessageDigestAlgorithmError;", "Lcom/pinterest/security/AppIntegrityException$PackageInfoRetrievalError;", "core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes4.dex */
public abstract class AppIntegrityException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/AppIntegrityException$FingerprintRetrievalError;", "Lcom/pinterest/security/AppIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class FingerprintRetrievalError extends AppIntegrityException {
        public FingerprintRetrievalError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/AppIntegrityException$IncompatibleApiVersion;", "Lcom/pinterest/security/AppIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class IncompatibleApiVersion extends AppIntegrityException {
        public IncompatibleApiVersion() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/AppIntegrityException$MalformedSignature;", "Lcom/pinterest/security/AppIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class MalformedSignature extends AppIntegrityException {
        public MalformedSignature() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/AppIntegrityException$MessageDigestAlgorithmError;", "Lcom/pinterest/security/AppIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class MessageDigestAlgorithmError extends AppIntegrityException {
        public MessageDigestAlgorithmError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/security/AppIntegrityException$PackageInfoRetrievalError;", "Lcom/pinterest/security/AppIntegrityException;", "core_release"}, k = 1, mv = {1, 9, 0})
    public static final class PackageInfoRetrievalError extends AppIntegrityException {
        public PackageInfoRetrievalError() {
            super(null);
        }
    }
}
