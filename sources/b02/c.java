package b02;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class c extends m {

    /* renamed from: a, reason: collision with root package name */
    public final qr1.a f20772a;

    /* renamed from: b, reason: collision with root package name */
    public final gr1.j f20773b;

    public c(qr1.a accountLinkedData, gr1.j pendingSocialConnectData) {
        Intrinsics.checkNotNullParameter(accountLinkedData, "accountLinkedData");
        Intrinsics.checkNotNullParameter(pendingSocialConnectData, "pendingSocialConnectData");
        this.f20772a = accountLinkedData;
        this.f20773b = pendingSocialConnectData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return Intrinsics.d(this.f20772a, cVar.f20772a) && Intrinsics.d(this.f20773b, cVar.f20773b);
    }

    public final int hashCode() {
        return this.f20773b.hashCode() + (this.f20772a.hashCode() * 31);
    }

    public final String toString() {
        return "GoToAccountAlreadyLinkedEvent(accountLinkedData=" + this.f20772a + ", pendingSocialConnectData=" + this.f20773b + ")";
    }
}
