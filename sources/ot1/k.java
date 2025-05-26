package ot1;

/* loaded from: classes4.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f97585a;

    public k(int i13) {
        this.f97585a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k) && this.f97585a == ((k) obj).f97585a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f97585a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("AvcLevelLimits(maxMacroBlocksPerFrame="), this.f97585a, ")");
    }
}
