package p30;

import kotlin.jvm.internal.Intrinsics;
import pc.i0;

/* loaded from: classes2.dex */
public final class u implements i0 {

    /* renamed from: a, reason: collision with root package name */
    public final t f98758a;

    public u(t tVar) {
        this.f98758a = tVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Intrinsics.d(this.f98758a, ((u) obj).f98758a);
    }

    public final int hashCode() {
        t tVar = this.f98758a;
        if (tVar == null) {
            return 0;
        }
        return tVar.hashCode();
    }

    public final String toString() {
        return "Data(v3RedeemInviteMutation=" + this.f98758a + ")";
    }
}
