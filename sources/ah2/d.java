package ah2;

import a.cb;

/* loaded from: classes4.dex */
public final class d extends f {

    /* renamed from: c, reason: collision with root package name */
    public final int f15197c;

    public d(int i13) {
        super(false);
        this.f15197c = i13;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && this.f15197c == ((d) obj).f15197c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f15197c);
    }

    public final String toString() {
        return cb.l(new StringBuilder("Other(code="), this.f15197c, ')');
    }
}
