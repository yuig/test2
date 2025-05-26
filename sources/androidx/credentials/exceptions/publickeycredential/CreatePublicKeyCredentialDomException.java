package androidx.credentials.exceptions.publickeycredential;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import v5.e;
import v5.x;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialDomException;", "Landroidx/credentials/exceptions/publickeycredential/CreatePublicKeyCredentialException;", "v5/x", "credentials_release"}, k = 1, mv = {1, 8, 0})
/* loaded from: classes3.dex */
public final class CreatePublicKeyCredentialDomException extends CreatePublicKeyCredentialException {

    /* renamed from: b, reason: collision with root package name */
    public static final x f18015b = new x(8, 0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CreatePublicKeyCredentialDomException(e domError, CharSequence charSequence) {
        super(charSequence, "androidx.credentials.TYPE_CREATE_PUBLIC_KEY_CREDENTIAL_DOM_EXCEPTION/" + domError.f124162a);
        Intrinsics.checkNotNullParameter(domError, "domError");
    }
}
