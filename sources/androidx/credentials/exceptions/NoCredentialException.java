package androidx.credentials.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/NoCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "e3/b", "credentials_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class NoCredentialException extends GetCredentialException {
    public NoCredentialException() {
        this(null);
    }

    public NoCredentialException(CharSequence charSequence) {
        super(charSequence, "android.credentials.GetCredentialException.TYPE_NO_CREDENTIAL");
    }
}
