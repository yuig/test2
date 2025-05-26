package ek1;

/* loaded from: classes2.dex */
public final class c0 implements g0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f59222a;

    public c0(int i13) {
        this.f59222a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c0) && this.f59222a == ((c0) obj).f59222a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f59222a);
    }

    public final int j() {
        return this.f59222a;
    }

    public final String toString() {
        return a.a.n(new StringBuilder("OnPinChipIndexEvent(currentlyViewedChipIndex="), this.f59222a, ")");
    }
}
