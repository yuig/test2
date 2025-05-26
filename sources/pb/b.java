package pb;

import a.cb;

/* loaded from: classes3.dex */
public final class b extends c {

    /* renamed from: a, reason: collision with root package name */
    public final int f99403a;

    public b(int i13) {
        this.f99403a = i13;
    }

    public final int a() {
        return this.f99403a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b) && this.f99403a == ((b) obj).f99403a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f99403a);
    }

    public final String toString() {
        return cb.l(new StringBuilder("ConstraintsNotMet(reason="), this.f99403a, ')');
    }
}
