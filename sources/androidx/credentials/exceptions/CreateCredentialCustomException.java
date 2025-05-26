package androidx.credentials.exceptions;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialCustomException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "credentials_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CreateCredentialCustomException extends CreateCredentialException {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreateCredentialCustomException(CharSequence charSequence, String type) {
        super(charSequence, type);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }
}
