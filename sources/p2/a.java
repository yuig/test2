package p2;

import a.cb;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f98684a;

    public final void a(int i13) {
        this.f98684a += i13;
    }

    public final void b(int i13) {
        this.f98684a = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f98684a == ((a) obj).f98684a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f98684a);
    }

    public final String toString() {
        return cb.l(new StringBuilder("DeltaCounter(count="), this.f98684a, ')');
    }
}
