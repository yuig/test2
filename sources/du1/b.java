package du1;

import l82.h;

/* loaded from: classes4.dex */
public final class b implements h {

    /* renamed from: a, reason: collision with root package name */
    public final int f56277a;

    public b(int i13) {
        this.f56277a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f56277a == ((b) obj).f56277a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f56277a);
    }

    public final String toString() {
        return a.a.n(new StringBuilder("NavigateTo(target="), this.f56277a, ")");
    }
}
