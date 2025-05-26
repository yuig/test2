package androidx.credentials.exceptions;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/CreateCredentialInterruptedException;", "Landroidx/credentials/exceptions/CreateCredentialException;", "m4/i", "credentials_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CreateCredentialInterruptedException extends CreateCredentialException {
    public CreateCredentialInterruptedException() {
        this(null);
    }

    public CreateCredentialInterruptedException(CharSequence charSequence) {
        super(charSequence, "android.credentials.CreateCredentialException.TYPE_INTERRUPTED");
    }
}
