package a7;

import android.util.SparseBooleanArray;

/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final p f1197a;

    static {
        new SparseBooleanArray();
        bf.b.t(!false);
        d7.n0.Q(0);
    }

    public r0(p pVar) {
        this.f1197a = pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof r0) {
            return this.f1197a.equals(((r0) obj).f1197a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f1197a.hashCode();
    }
}
