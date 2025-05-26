package ek1;

/* loaded from: classes2.dex */
public final class p implements q {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59311a;

    public p(boolean z13) {
        this.f59311a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof p) && this.f59311a == ((p) obj).f59311a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59311a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateDevToolsForImpressionStart(impressionIsStarting="), this.f59311a, ")");
    }
}
