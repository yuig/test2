package com.pinterest.encryption.dataEncryptionLibrary;

import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00060\u0001j\u0002`\u0002:\t\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014¨\u0006\u0015"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "DataDecryptionFailure", "DataEncryptionFailure", "ErrorCreatingMainKey", "ErrorGeneratingKeysetHandle", "ErrorRetrievingKeysetHandle", "FileCreationFailure", "MinSDKVersionReqNotMet", "PrimitiveRetrievalError", "TinkKeyEncryptionFailure", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$DataDecryptionFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$DataEncryptionFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorCreatingMainKey;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorGeneratingKeysetHandle;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorRetrievingKeysetHandle;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$FileCreationFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$MinSDKVersionReqNotMet;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$PrimitiveRetrievalError;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$TinkKeyEncryptionFailure;", "encryption_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public abstract class DataEncryptionException extends Exception {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$DataDecryptionFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class DataDecryptionFailure extends DataEncryptionException {
        public DataDecryptionFailure() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$DataEncryptionFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class DataEncryptionFailure extends DataEncryptionException {
        public DataEncryptionFailure() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorCreatingMainKey;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorCreatingMainKey extends DataEncryptionException {
        public ErrorCreatingMainKey() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorGeneratingKeysetHandle;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorGeneratingKeysetHandle extends DataEncryptionException {
        public ErrorGeneratingKeysetHandle() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$ErrorRetrievingKeysetHandle;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class ErrorRetrievingKeysetHandle extends DataEncryptionException {
        public ErrorRetrievingKeysetHandle() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$FileCreationFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class FileCreationFailure extends DataEncryptionException {
        public FileCreationFailure() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$MinSDKVersionReqNotMet;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class MinSDKVersionReqNotMet extends DataEncryptionException {
        public MinSDKVersionReqNotMet() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$PrimitiveRetrievalError;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class PrimitiveRetrievalError extends DataEncryptionException {
        public PrimitiveRetrievalError() {
            super(null);
        }
    }

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException$TinkKeyEncryptionFailure;", "Lcom/pinterest/encryption/dataEncryptionLibrary/DataEncryptionException;", "encryption_release"}, k = 1, mv = {1, 9, 0})
    public static final class TinkKeyEncryptionFailure extends DataEncryptionException {
        public TinkKeyEncryptionFailure() {
            super(null);
        }
    }
}
