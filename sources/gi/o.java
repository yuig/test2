package gi;

import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters;

/* loaded from: classes3.dex */
public final class o extends n {

    /* renamed from: a, reason: collision with root package name */
    public final Object f65102a;

    public o(PublicKeyCredentialParameters publicKeyCredentialParameters) {
        this.f65102a = publicKeyCredentialParameters;
    }

    @Override // gi.n
    public final Object a() {
        return this.f65102a;
    }

    @Override // gi.n
    public final boolean b() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o) {
            return this.f65102a.equals(((o) obj).f65102a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f65102a.hashCode() + 1502476572;
    }

    public final String toString() {
        return a.a.k("Optional.of(", this.f65102a.toString(), ")");
    }
}
