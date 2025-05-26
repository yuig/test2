package androidx.credentials.exceptions.publickeycredential;

import androidx.credentials.exceptions.GetCredentialException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v5.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/GetPublicKeyCredentialException;", "Landroidx/credentials/exceptions/GetCredentialException;", "v5/x", "credentials_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public class GetPublicKeyCredentialException extends GetCredentialException {

    /* renamed from: a, reason: collision with root package name */
    public static final x f18018a = new x(12, 0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPublicKeyCredentialException(CharSequence charSequence, String type) {
        super(charSequence, type);
        Intrinsics.checkNotNullParameter(type, "type");
        if (type.length() <= 0) {
            throw new IllegalArgumentException("type must not be empty".toString());
        }
    }
}
