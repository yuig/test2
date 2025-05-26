package ek1;

/* loaded from: classes5.dex */
public final class d0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f59226a;

    public d0(boolean z13) {
        this.f59226a = z13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d0) && this.f59226a == ((d0) obj).f59226a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f59226a);
    }

    public final String toString() {
        return a.a.r(new StringBuilder("UpdateAudioIndicatorVisibility(show="), this.f59226a, ")");
    }
}
