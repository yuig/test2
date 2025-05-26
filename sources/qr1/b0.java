package qr1;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lqr1/b0;", "", "", "a", "Ljava/lang/String;", "getQrToken", "()Ljava/lang/String;", "qrToken", "identity-core_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final /* data */ class b0 {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @om.b("qr_token")
    @NotNull
    private final String qrToken;

    public b0(String qrToken) {
        Intrinsics.checkNotNullParameter(qrToken, "qrToken");
        this.qrToken = qrToken;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b0) && Intrinsics.d(this.qrToken, ((b0) obj).qrToken);
    }

    public final int hashCode() {
        return this.qrToken.hashCode();
    }

    public final String toString() {
        return a.a.k("QrCodeVerificationRequest(qrToken=", this.qrToken, ")");
    }
}
