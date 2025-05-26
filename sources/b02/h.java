package b02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class h extends m {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.a f20778a;

    /* renamed from: b, reason: collision with root package name */
    public final gr1.j f20779b;

    public h(qr1.a accountLinkedData, gr1.j pendingSocialConnectData) {
        Intrinsics.checkNotNullParameter(accountLinkedData, "accountLinkedData");
        Intrinsics.checkNotNullParameter(pendingSocialConnectData, "pendingSocialConnectData");
        this.f20778a = accountLinkedData;
        this.f20779b = pendingSocialConnectData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return Intrinsics.d(this.f20778a, hVar.f20778a) && Intrinsics.d(this.f20779b, hVar.f20779b);
    }

    public final int hashCode() {
        return this.f20779b.hashCode() + (this.f20778a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToMoveGoogleLinkEvent(accountLinkedData=" + this.f20778a + ", pendingSocialConnectData=" + this.f20779b + ")";
    }
}
