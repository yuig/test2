package gj0;

import u50.o;

/* loaded from: classes5.dex */
public final class b implements o {

    /* renamed from: c, reason: collision with root package name */
    public static final b f65185c = new b(false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f65186a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f65187b;

    public b(boolean z13, boolean z14) {
        this.f65186a = z13;
        this.f65187b = z14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f65186a == bVar.f65186a && this.f65187b == bVar.f65187b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f65187b) + (Boolean.hashCode(this.f65186a) * 31);
    }

    public final String toString() {
        StringBuilder sb3 = new StringBuilder("BoardToolbarActionDisplayState(visible=");
        sb3.append(this.f65186a);
        sb3.append(", enabled=");
        return a.a.r(sb3, this.f65187b, ")");
    }
}
