package b02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class k extends m {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f20782a;

    /* renamed from: b, reason: collision with root package name */
    public final qr1.a f20783b;

    /* renamed from: c, reason: collision with root package name */
    public final gr1.j f20784c;

    public k(boolean z13, qr1.a accountLinkedData, gr1.j pendingSocialConnectData) {
        Intrinsics.checkNotNullParameter(accountLinkedData, "accountLinkedData");
        Intrinsics.checkNotNullParameter(pendingSocialConnectData, "pendingSocialConnectData");
        this.f20782a = z13;
        this.f20783b = accountLinkedData;
        this.f20784c = pendingSocialConnectData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f20782a == kVar.f20782a && Intrinsics.d(this.f20783b, kVar.f20783b) && Intrinsics.d(this.f20784c, kVar.f20784c);
    }

    public final int hashCode() {
        return this.f20784c.hashCode() + ((this.f20783b.hashCode() + (Boolean.hashCode(this.f20782a) * 31)) * 31);
    }

    public final String toString() {
        return "StartAccountLinkedFlowEvent(forceRecommended=" + this.f20782a + ", accountLinkedData=" + this.f20783b + ", pendingSocialConnectData=" + this.f20784c + ")";
    }
}
