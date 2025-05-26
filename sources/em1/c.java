package em1;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class c extends gm1.c {

    /* renamed from: b, reason: collision with root package name */
    public final int f59596b;

    /* renamed from: c, reason: collision with root package name */
    public final b f59597c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i13, b lastCheckedState) {
        super(i13);
        Intrinsics.checkNotNullParameter(lastCheckedState, "lastCheckedState");
        this.f59596b = i13;
        this.f59597c = lastCheckedState;
    }

    public static c k(c cVar, b lastCheckedState) {
        int i13 = cVar.f59596b;
        cVar.getClass();
        Intrinsics.checkNotNullParameter(lastCheckedState, "lastCheckedState");
        return new c(i13, lastCheckedState);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f59596b == cVar.f59596b && this.f59597c == cVar.f59597c;
    }

    public final int hashCode() {
        return this.f59597c.hashCode() + (Integer.hashCode(this.f59596b) * 31);
    }

    @Override // gm1.c
    public final int j() {
        return this.f59596b;
    }

    public final String toString() {
        return "ClickEvent(id=" + this.f59596b + ", lastCheckedState=" + this.f59597c + ")";
    }
}
